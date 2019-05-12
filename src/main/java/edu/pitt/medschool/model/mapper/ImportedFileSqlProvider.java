package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.ImportedFile;
import edu.pitt.medschool.model.dto.ImportedFileExample.Criteria;
import edu.pitt.medschool.model.dto.ImportedFileExample.Criterion;
import edu.pitt.medschool.model.dto.ImportedFileExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class ImportedFileSqlProvider {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String countByExample(ImportedFileExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("imported_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String deleteByExample(ImportedFileExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("imported_file");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String insertSelective(ImportedFile record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("imported_file");
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        if (record.getFilepath() != null) {
            sql.VALUES("filepath", "#{filepath,jdbcType=VARCHAR}");
        }
        if (record.getFilename() != null) {
            sql.VALUES("filename", "#{filename,jdbcType=VARCHAR}");
        }
        if (record.getFilelines() != null) {
            sql.VALUES("filelines", "#{filelines,jdbcType=INTEGER}");
        }
        if (record.getFilesize() != null) {
            sql.VALUES("filesize", "#{filesize,jdbcType=BIGINT}");
        }
        if (record.getPid() != null) {
            sql.VALUES("PID", "#{pid,jdbcType=VARCHAR}");
        }
        if (record.getIsar() != null) {
            sql.VALUES("isAr", "#{isar,jdbcType=BIT}");
        }
        if (record.getTimestamp() != null) {
            sql.VALUES("timestamp", "#{timestamp,jdbcType=TIMESTAMP}");
        }
        if (record.getUuid() != null) {
            sql.VALUES("uuid", "#{uuid,jdbcType=VARCHAR}");
        }
        if (record.getDeleted() != null) {
            sql.VALUES("deleted", "#{deleted,jdbcType=BIT}");
        }
        if (record.getDeleteTime() != null) {
            sql.VALUES("delete_time", "#{deleteTime,jdbcType=TIMESTAMP}");
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String selectByExample(ImportedFileExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("filepath");
        sql.SELECT("filename");
        sql.SELECT("filelines");
        sql.SELECT("filesize");
        sql.SELECT("PID");
        sql.SELECT("isAr");
        sql.SELECT("timestamp");
        sql.SELECT("uuid");
        sql.SELECT("deleted");
        sql.SELECT("delete_time");
        sql.FROM("imported_file");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        ImportedFile record = (ImportedFile) parameter.get("record");
        ImportedFileExample example = (ImportedFileExample) parameter.get("example");
        SQL sql = new SQL();
        sql.UPDATE("imported_file");
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        if (record.getFilepath() != null) {
            sql.SET("filepath = #{record.filepath,jdbcType=VARCHAR}");
        }
        if (record.getFilename() != null) {
            sql.SET("filename = #{record.filename,jdbcType=VARCHAR}");
        }
        if (record.getFilelines() != null) {
            sql.SET("filelines = #{record.filelines,jdbcType=INTEGER}");
        }
        if (record.getFilesize() != null) {
            sql.SET("filesize = #{record.filesize,jdbcType=BIGINT}");
        }
        if (record.getPid() != null) {
            sql.SET("PID = #{record.pid,jdbcType=VARCHAR}");
        }
        if (record.getIsar() != null) {
            sql.SET("isAr = #{record.isar,jdbcType=BIT}");
        }
        if (record.getTimestamp() != null) {
            sql.SET("timestamp = #{record.timestamp,jdbcType=TIMESTAMP}");
        }
        if (record.getUuid() != null) {
            sql.SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        }
        if (record.getDeleted() != null) {
            sql.SET("deleted = #{record.deleted,jdbcType=BIT}");
        }
        if (record.getDeleteTime() != null) {
            sql.SET("delete_time = #{record.deleteTime,jdbcType=TIMESTAMP}");
        }
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("imported_file");
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("filepath = #{record.filepath,jdbcType=VARCHAR}");
        sql.SET("filename = #{record.filename,jdbcType=VARCHAR}");
        sql.SET("filelines = #{record.filelines,jdbcType=INTEGER}");
        sql.SET("filesize = #{record.filesize,jdbcType=BIGINT}");
        sql.SET("PID = #{record.pid,jdbcType=VARCHAR}");
        sql.SET("isAr = #{record.isar,jdbcType=BIT}");
        sql.SET("timestamp = #{record.timestamp,jdbcType=TIMESTAMP}");
        sql.SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        sql.SET("deleted = #{record.deleted,jdbcType=BIT}");
        sql.SET("delete_time = #{record.deleteTime,jdbcType=TIMESTAMP}");
        ImportedFileExample example = (ImportedFileExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(ImportedFile record) {
        SQL sql = new SQL();
        sql.UPDATE("imported_file");
        if (record.getFilepath() != null) {
            sql.SET("filepath = #{filepath,jdbcType=VARCHAR}");
        }
        if (record.getFilename() != null) {
            sql.SET("filename = #{filename,jdbcType=VARCHAR}");
        }
        if (record.getFilelines() != null) {
            sql.SET("filelines = #{filelines,jdbcType=INTEGER}");
        }
        if (record.getFilesize() != null) {
            sql.SET("filesize = #{filesize,jdbcType=BIGINT}");
        }
        if (record.getPid() != null) {
            sql.SET("PID = #{pid,jdbcType=VARCHAR}");
        }
        if (record.getIsar() != null) {
            sql.SET("isAr = #{isar,jdbcType=BIT}");
        }
        if (record.getTimestamp() != null) {
            sql.SET("timestamp = #{timestamp,jdbcType=TIMESTAMP}");
        }
        if (record.getUuid() != null) {
            sql.SET("uuid = #{uuid,jdbcType=VARCHAR}");
        }
        if (record.getDeleted() != null) {
            sql.SET("deleted = #{deleted,jdbcType=BIT}");
        }
        if (record.getDeleteTime() != null) {
            sql.SET("delete_time = #{deleteTime,jdbcType=TIMESTAMP}");
        }
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table imported_file
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, ImportedFileExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(
                                    String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(),
                                    i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}