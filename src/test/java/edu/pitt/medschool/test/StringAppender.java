/**
 * 
 */
package edu.pitt.medschool.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isolachine
 *
 */
public class StringAppender {
    public static void main(String[] args) {

        System.out.println(query());
        System.out.println();

        List<String> list = new ArrayList<>();
        // for (int i = 194; i < 231; i++) {
        // list.add("\"I" + i + "_1" + "\"");
        // }
        // String line = String.join(" + ", list);
        // line = "(" + line + ") / " + list.size();
        // System.out.println(line);
        //
        list = new ArrayList<>();
        for (int i = 64; i <= 81; i++) {
            // list.add("\"I" + i + "_1" + "\"");
            // list.add("\"I" + i + "_2" + "\"");
            list.add("\"I" + i + "_3" + "\"");
            // list.add("\"I" + i + "_4" + "\"");
            // list.add("\"I" + i + "_5" + "\"");
        }
        String line = String.join(" + ", list);
        line = "(" + line + ") / " + list.size();
        System.out.println(line);
        //
        // String ll = "2010-06-20T17:15:01Z";
        // String template = "select median(SR) as SR, median(aEEG) as aEEG, median(SZProb) as SZProb from (select (\"I194_1\" + \"I195_1\" +
        // \"I196_1\" + \"I197_1\" + \"I198_1\" + \"I199_1\" + \"I200_1\" + \"I201_1\" +
        // \"I202_1\" + \"I203_1\" + \"I204_1\" + \"I205_1\" + \"I206_1\" + \"I207_1\" + \"I208_1\" + \"I209_1\" + \"I210_1\" + \"I211_1\" +
        // \"I212_1\" + \"I213_1\" + \"I214_1\" + \"I215_1\" + \"I216_1\" + \"I217_1\" +
        // \"I218_1\" + \"I219_1\" + \"I220_1\" + \"I221_1\" + \"I222_1\" + \"I223_1\" + \"I224_1\" + \"I225_1\" + \"I226_1\" + \"I227_1\" +
        // \"I228_1\" + \"I229_1\" + \"I230_1\") / 37 as SR, (\"I43_1\" + \"I43_2\" +
        // \"I43_3\" + \"I43_4\" + \"I43_5\" + \"I44_1\" + \"I44_2\" + \"I44_3\" + \"I44_4\" + \"I44_5\" + \"I45_1\" + \"I45_2\" + \"I45_3\" +
        // \"I45_4\" + \"I45_5\" + \"I46_1\" + \"I46_2\" + \"I46_3\" + \"I46_4\" +
        // \"I46_5\" + \"I47_1\" + \"I47_2\" + \"I47_3\" + \"I47_4\" + \"I47_5\" + \"I48_1\" + \"I48_2\" + \"I48_3\" + \"I48_4\" + \"I48_5\" +
        // \"I49_1\" + \"I49_2\" + \"I49_3\" + \"I49_4\" + \"I49_5\" + \"I50_1\" +
        // \"I50_2\" + \"I50_3\" + \"I50_4\" + \"I50_5\" + \"I51_1\" + \"I51_2\" + \"I51_3\" + \"I51_4\" + \"I51_5\" + \"I52_1\" + \"I52_2\" +
        // \"I52_3\" + \"I52_4\" + \"I52_5\" + \"I53_1\" + \"I53_2\" + \"I53_3\" +
        // \"I53_4\" + \"I53_5\" + \"I54_1\" + \"I54_2\" + \"I54_3\" + \"I54_4\" + \"I54_5\" + \"I55_1\" + \"I55_2\" + \"I55_3\" + \"I55_4\" +
        // \"I55_5\" + \"I56_1\" + \"I56_2\" + \"I56_3\" + \"I56_4\" + \"I56_5\" +
        // \"I57_1\" + \"I57_2\" + \"I57_3\" + \"I57_4\" + \"I57_5\" + \"I58_1\" + \"I58_2\" + \"I58_3\" + \"I58_4\" + \"I58_5\" + \"I59_1\" +
        // \"I59_2\" + \"I59_3\" + \"I59_4\" + \"I59_5\" + \"I60_1\" + \"I60_2\" +
        // \"I60_3\" + \"I60_4\" + \"I60_5\" + \"I61_1\" + \"I61_2\" + \"I61_3\" + \"I61_4\" + \"I61_5\" + \"I62_1\" + \"I62_2\" + \"I62_3\" +
        // \"I62_4\" + \"I62_5\" + \"I63_1\" + \"I63_2\" + \"I63_3\" + \"I63_4\" +
        // \"I63_5\" + \"I64_1\" + \"I64_2\" + \"I64_3\" + \"I64_4\" + \"I64_5\" + \"I65_1\" + \"I65_2\" + \"I65_3\" + \"I65_4\" + \"I65_5\" +
        // \"I66_1\" + \"I66_2\" + \"I66_3\" + \"I66_4\" + \"I66_5\" + \"I67_1\" +
        // \"I67_2\" + \"I67_3\" + \"I67_4\" + \"I67_5\" + \"I68_1\" + \"I68_2\" + \"I68_3\" + \"I68_4\" + \"I68_5\" + \"I69_1\" + \"I69_2\" +
        // \"I69_3\" + \"I69_4\" + \"I69_5\" + \"I70_1\" + \"I70_2\" + \"I70_3\" +
        // \"I70_4\" + \"I70_5\" + \"I71_1\" + \"I71_2\" + \"I71_3\" + \"I71_4\" + \"I71_5\" + \"I72_1\" + \"I72_2\" + \"I72_3\" + \"I72_4\" +
        // \"I72_5\" + \"I73_1\" + \"I73_2\" + \"I73_3\" + \"I73_4\" + \"I73_5\" +
        // \"I74_1\" + \"I74_2\" + \"I74_3\" + \"I74_4\" + \"I74_5\" + \"I75_1\" + \"I75_2\" + \"I75_3\" + \"I75_4\" + \"I75_5\" + \"I76_1\" +
        // \"I76_2\" + \"I76_3\" + \"I76_4\" + \"I76_5\" + \"I77_1\" + \"I77_2\" +
        // \"I77_3\" + \"I77_4\" + \"I77_5\" + \"I78_1\" + \"I78_2\" + \"I78_3\" + \"I78_4\" + \"I78_5\" + \"I79_1\" + \"I79_2\" + \"I79_3\" +
        // \"I79_4\" + \"I79_5\" + \"I80_1\" + \"I80_2\" + \"I80_3\" + \"I80_4\" +
        // \"I80_5\" + \"I81_1\" + \"I81_2\" + \"I81_3\" + \"I81_4\" + \"I81_5\") / 195 as aEEG, \"I3_1\" as SZProb from \"%s\" LIMIT 172800) group by
        // time(1h, %ss) fill(none)";
        //
        // String firstRecordTimeQuery = "select \"I1_1\" from \"" + "PUH-2010-033" + "\" limit 1";
        //
        // int offset = Integer.valueOf(ll.substring(14, 16)) * 60 + Integer.valueOf(ll.substring(17, 19));
        //
        // String queryString = String.format(template, "PUH-2010-033", offset);
        // System.out.println(queryString);

        StringBuffer sb = new StringBuffer("\"ID\",");
        String[] cols = new String[] { "SR", "aEEG", "SZProb" };
        for (String col : cols) {
            for (int i = 1; i <= 48; i++) {
                sb.append('"').append(col).append(i).append('"').append(',');
            }
        }
        System.out.println(sb.toString());
    }

    public static String query() {
        String template = "select median(avg) as MEDIAN, count(avg) as COUNT from (select "
                + "(\"I64_3\" + \"I65_3\" + \"I66_3\" + \"I67_3\" + \"I68_3\" + \"I69_3\" + \"I70_3\""
                + " + \"I71_3\" + \"I72_3\" + \"I73_3\" + \"I74_3\" + \"I75_3\" + \"I76_3\" + \"I77_3\""
                + " + \"I78_3\" + \"I79_3\" + \"I80_3\" + \"I81_3\") / 18 as avg from \"%s\" "
                + "where arType = 'ar' LIMIT 172800) where time >= '%s' and time < '%s' + 48h and avg > 2 group by time(1h, %ss)";
        return template;
    }
}
