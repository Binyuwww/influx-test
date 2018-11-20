package edu.pitt.medschool.service;

import com.opencsv.CSVWriter;
import edu.pitt.medschool.config.DBConfiguration;
import edu.pitt.medschool.config.InfluxappConfig;
import edu.pitt.medschool.framework.influxdb.InfluxUtil;
import edu.pitt.medschool.framework.influxdb.ResultTable;
import edu.pitt.medschool.model.DataTimeSpanBean;
import edu.pitt.medschool.model.dao.AnalysisUtil;
import edu.pitt.medschool.model.dao.ImportedFileDao;
import okhttp3.OkHttpClient;
import org.apache.commons.io.FileUtils;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static edu.pitt.medschool.framework.influxdb.InfluxUtil.queryResultToTable;

@Service
public class TrajSqnTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    private final static String dbName = DBConfiguration.Data.DBNAME;

    private final ImportedFileDao importedFileDao;

    private final String interestRawCols = " ((I213_1 + I214_1 + I215_1 + I216_1 + I217_1 + I218_1 + I219_1 + I220_1 + I221_1 + I222_1 + I223_1 + I224_1 + I225_1 + I226_1 + I227_1 + I228_1 + I229_1 + I230_1) / 18) AS aggrm ";

    @Autowired
    public TrajSqnTest(ImportedFileDao importedFileDao) {
        this.importedFileDao = importedFileDao;
    }

    private final int duration = 36 * 3600;

    public void mainProcess(int cores) throws IOException {
        // 60/5*60/15*60/30*60/3600/3600*2/3600*4/3600*8   -- 3600*6/3600*12
        int[] periods = {60, 5 * 60, 15 * 60, 30 * 60, 3600, 3600 * 2, 3600 * 4, 3600 * 8};
        String[] dsMethods = {"mean(aggrm)", "min(aggrm)", "max(aggrm)", "median(aggrm)", "PERCENTILE(aggrm,25)", "PERCENTILE(aggrm,75)", "stddev(aggrm)"};
        List<String> patientIDs = Files.readAllLines(Paths.get("good.txt"));
        ExecutorService scheduler = Executors.newFixedThreadPool(cores > 0 ? cores : 1);
        int dsSize = dsMethods.length;
        int pSize = periods.length;
        InfluxDB idb = generateIdbClient(true);
        ConcurrentHashMap<Integer, BufferedWriter> metas = new ConcurrentHashMap<>(dsSize * pSize);
        ConcurrentHashMap<Integer, CSVWriter> datas = new ConcurrentHashMap<>(dsSize * pSize);

        // Init writers
        for (int i = 0; i < periods.length; i++) {
            int period = periods[i];
            int totalBins = duration / period;
            for (int j = 0; j < dsSize; j++) {
                String dsMethod = dsMethods[j];
                int id = dsSize * i + j;
                String dataPath = String.format(InfluxappConfig.OUTPUT_DIRECTORY + "special_trj/B/data_%d.csv", id);
                String metaPath = String.format(InfluxappConfig.OUTPUT_DIRECTORY + "special_trj/B/meta_%d.csv", id);
                try {
                    FileUtils.forceMkdirParent(new File(dataPath));
                    datas.put(id, new CSVWriter(new BufferedWriter(new FileWriter(dataPath))));
                    metas.put(id, new BufferedWriter(new FileWriter(metaPath)));
                    String[] header = new String[2 + totalBins * 2];
                    header[0] = "PID";
                    header[1] = "StartTime";
                    for (int k = 0; k < totalBins; k++) {
                        header[2 + k] = "sr" + (k + 1);
                        header[2 + k + totalBins] = "ot" + (k + 1);
                    }
                    datas.get(id).writeNext(header);
                    writeNewLine(metas.get(id), String.format("36hr (Using SQN)\tCores: %d\t\tMin: 6hr\tAggr: Mean\tDs: %s\tperiod: %ds", cores, dsMethod, period));
                    metas.get(id).newLine();
                    metas.get(id).newLine();
                    writeNewLine(metas.get(id), "PID,Operation_Time");
                    metas.get(id).flush();
                    datas.get(id).flush();
                } catch (IOException e) {
                    logger.error("Initial failed <{}>, {}", id, e);
                }
            }
        }

        Instant totalStart = Instant.now();
        // Actual process
        for (int i = 0; i < periods.length; i++) {
            int period = periods[i];
            int totalBins = duration / period;
            for (int j = 0; j < dsSize; j++) {
                String dsMethod = dsMethods[j];
                int id = dsSize * i + j;
                for (String pid : patientIDs) {
                    scheduler.submit(() -> {
                        String[] dataTmp = new String[2 + totalBins * 2];
                        BufferedWriter meta = metas.get(id);
                        CSVWriter data = datas.get(id);
                        // Logic here
                        Instant oneStart = Instant.now();
                        try {
                            Instant oneS = Instant.now();
                            Instant firstAvailData = Instant.MAX; // Immutable once set
                            Instant lastAvailData = Instant.MIN; // Immutable once set
                            List<DataTimeSpanBean> dtsb = AnalysisUtil.getPatientAllDataSpan(idb, logger, pid);
                            if (dtsb == null) {
                                System.err.println("NULL");
                                return;
                            }
                            for (DataTimeSpanBean d : dtsb) {
                                if (d.getArStat() == DataTimeSpanBean.ArStatus.NoArOnly) continue;
                                Instant tmpS = d.getStart(), tmpE = d.getEnd();
                                if (tmpS.compareTo(firstAvailData) < 0) firstAvailData = tmpS;
                                if (tmpE.compareTo(lastAvailData) > 0) lastAvailData = tmpE;
                            }
                            ResultTable[] testOffset = InfluxUtil.justQueryData(idb, true, String.format(
                                    "SELECT time, count(Time) From \"%s\" WHERE (arType='%s') GROUP BY time(%ds) ORDER BY time ASC LIMIT 1",
                                    pid, "ar", period));
                            int offset = calcOffsetInSeconds(Instant.parse((String) testOffset[0].getDataByColAndRow(0, 0)), firstAvailData);

                            String resQuery = "SELECT " + dsMethod + " AS C FROM " +
                                    "\"%s_1s_ar_mean\" WHERE (time >= '%s' AND time < '%s') GROUP BY time(%ds,%ds) ORDER BY time ASC";
                            String finalQs = String.format(resQuery, pid, firstAvailData, lastAvailData, period, offset);
                            ResultTable[] fRes = queryResultToTable(idb.query(new Query(finalQs, "sqn_tmp"))).toArray(new ResultTable[0]);

                            if (fRes.length != 1) {
                                System.err.println(pid + " length err: " + finalQs);
                                return;
                            }
                            ResultTable r = fRes[0];
                            int dataRows = r.getRowCount();

                            // Prep data buffer
                            dataTmp[0] = pid;
                            dataTmp[1] = firstAvailData.toString();
                            for (int k = 0; k < totalBins; k++) {
                                int idx = 2 + k;
                                if (dataRows > k) {
                                    List<Object> row = r.getDatalistByRow(k);
                                    // Only 1 col
                                    Object finalData = row.get(1);
                                    if (finalData == null) {
                                        dataTmp[idx] = "N/A";
                                    } else {
                                        dataTmp[idx] = finalData.toString();
                                    }
                                } else {
                                    dataTmp[idx] = "N/A";
                                }
                                dataTmp[idx + totalBins] = String.format("%.1f", -0.1 * totalBins / 2 + 0.1 * (k + 1));
                            }

                        } catch (Exception e) {
                            logger.error("Process <{}> error, reason: {}", pid, e);
                        }
                        // Finalize
                        Instant oneEnd = Instant.now();
                        try {
                            data.writeNext(dataTmp);
                            writeNewLine(meta, String.format("%s,%s", pid, Duration.between(oneStart, oneEnd).toString().toLowerCase().replace("pt", "")));
                        } catch (IOException e) {
                            logger.error("Write final <{}> failed: {}", pid, e);
                        }
                    });
                }
            }
        }

        scheduler.shutdown();
        try {
            scheduler.awaitTermination(48, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        Instant totalEnd = Instant.now();
        for (int i : metas.keySet()) {
            metas.get(i).close();
        }
        for (int i : datas.keySet()) {
            datas.get(i).close();
        }
        idb.close();
        System.err.println("Total process time: " + Duration.between(totalStart, totalEnd).toString().toLowerCase());
    }

    public static void main(String[] args) throws Exception {
        TrajSqnTest t = new TrajSqnTest(null);
        t.mainProcess(21);
    }

    public static synchronized void writeNewLine(BufferedWriter w, String s) throws IOException {
        w.write(s);
        w.newLine();
    }

    private int calcOffsetInSeconds(Instant fakeStartTime, Instant queryStartTime) {
        LocalDateTime fakeStart = LocalDateTime.ofInstant(fakeStartTime, ZoneOffset.UTC);
        LocalDateTime acutalStart = LocalDateTime.ofInstant(queryStartTime, ZoneOffset.UTC);
        return (acutalStart.getMinute() - fakeStart.getMinute()) * 60 +
                (acutalStart.getSecond() - fakeStart.getSecond());
    }

    private static InfluxDB generateIdbClient(boolean needGzip) {
        InfluxDB idb = InfluxDBFactory.connect(InfluxappConfig.IFX_ADDR, InfluxappConfig.IFX_USERNAME,
                InfluxappConfig.IFX_PASSWD, new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS)
                        .readTimeout(90, TimeUnit.MINUTES).writeTimeout(120, TimeUnit.SECONDS));
        if (needGzip) {
            idb.enableGzip();
        } else {
            idb.disableGzip();
        }
        return idb;
    }

}
