package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.AggregationDatabaseExample.Criteria;
import edu.pitt.medschool.model.dto.AggregationDatabaseExample.Criterion;
import edu.pitt.medschool.model.dto.AggregationDatabaseExample;
import edu.pitt.medschool.model.dto.AggregationDatabaseWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AggregationDatabaseSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String countByExample(AggregationDatabaseExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("aggregation_database");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String deleteByExample(AggregationDatabaseExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("aggregation_database");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String insertSelective(AggregationDatabaseWithBLOBs record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("aggregation_database");
		if (record.getDbName() != null) {
			sql.VALUES("db_name", "#{dbName,jdbcType=VARCHAR}");
		}
		if (record.getVersion() != null) {
			sql.VALUES("version", "#{version,jdbcType=INTEGER}");
		}
		if (record.getAggregateTime() != null) {
			sql.VALUES("aggregate_time", "#{aggregateTime,jdbcType=INTEGER}");
		}
		if (record.getCreateTime() != null) {
			sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
		}
		if (record.getMean() != null) {
			sql.VALUES("mean", "#{mean,jdbcType=BIT}");
		}
		if (record.getMax() != null) {
			sql.VALUES("max", "#{max,jdbcType=BIT}");
		}
		if (record.getMin() != null) {
			sql.VALUES("min", "#{min,jdbcType=BIT}");
		}
		if (record.getSd() != null) {
			sql.VALUES("sd", "#{sd,jdbcType=BIT}");
		}
		if (record.getMedian() != null) {
			sql.VALUES("median", "#{median,jdbcType=BIT}");
		}
		if (record.getQ1() != null) {
			sql.VALUES("q1", "#{q1,jdbcType=BIT}");
		}
		if (record.getQ3() != null) {
			sql.VALUES("q3", "#{q3,jdbcType=BIT}");
		}
		if (record.getSum() != null) {
			sql.VALUES("sum", "#{sum,jdbcType=BIT}");
		}
		if (record.getStatus() != null) {
			sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
		}
		if (record.getTotal() != null) {
			sql.VALUES("total", "#{total,jdbcType=INTEGER}");
		}
		if (record.getFinished() != null) {
			sql.VALUES("finished", "#{finished,jdbcType=INTEGER}");
		}
		if (record.getAutoUpdate() != null) {
			sql.VALUES("auto_update", "#{autoUpdate,jdbcType=BIT}");
		}
		if (record.getArtype() != null) {
			sql.VALUES("arType", "#{artype,jdbcType=BIT}");
		}
		if (record.getFromDb() != null) {
			sql.VALUES("from_db", "#{fromDb,jdbcType=VARCHAR}");
		}
		if (record.getTimeCost() != null) {
			sql.VALUES("time_cost", "#{timeCost,jdbcType=VARCHAR}");
		}
		if (record.getThreads() != null) {
			sql.VALUES("threads", "#{threads,jdbcType=INTEGER}");
		}
		if (record.getParts() != null) {
			sql.VALUES("parts", "#{parts,jdbcType=INTEGER}");
		}
		if (record.getNday() != null) {
			sql.VALUES("nday", "#{nday,jdbcType=INTEGER}");
		}
		if (record.getPidList() != null) {
			sql.VALUES("pid_list", "#{pidList,jdbcType=LONGVARCHAR}");
		}
		if (record.getColumns() != null) {
			sql.VALUES("columns", "#{columns,jdbcType=LONGVARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String selectByExampleWithBLOBs(AggregationDatabaseExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("db_name");
		sql.SELECT("version");
		sql.SELECT("aggregate_time");
		sql.SELECT("create_time");
		sql.SELECT("mean");
		sql.SELECT("max");
		sql.SELECT("min");
		sql.SELECT("sd");
		sql.SELECT("median");
		sql.SELECT("q1");
		sql.SELECT("q3");
		sql.SELECT("sum");
		sql.SELECT("status");
		sql.SELECT("total");
		sql.SELECT("finished");
		sql.SELECT("auto_update");
		sql.SELECT("arType");
		sql.SELECT("from_db");
		sql.SELECT("time_cost");
		sql.SELECT("threads");
		sql.SELECT("parts");
		sql.SELECT("nday");
		sql.SELECT("pid_list");
		sql.SELECT("columns");
		sql.FROM("aggregation_database");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String selectByExample(AggregationDatabaseExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("db_name");
		sql.SELECT("version");
		sql.SELECT("aggregate_time");
		sql.SELECT("create_time");
		sql.SELECT("mean");
		sql.SELECT("max");
		sql.SELECT("min");
		sql.SELECT("sd");
		sql.SELECT("median");
		sql.SELECT("q1");
		sql.SELECT("q3");
		sql.SELECT("sum");
		sql.SELECT("status");
		sql.SELECT("total");
		sql.SELECT("finished");
		sql.SELECT("auto_update");
		sql.SELECT("arType");
		sql.SELECT("from_db");
		sql.SELECT("time_cost");
		sql.SELECT("threads");
		sql.SELECT("parts");
		sql.SELECT("nday");
		sql.FROM("aggregation_database");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		AggregationDatabaseWithBLOBs record = (AggregationDatabaseWithBLOBs) parameter.get("record");
		AggregationDatabaseExample example = (AggregationDatabaseExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("aggregation_database");
		if (record.getId() != null) {
			sql.SET("id = #{record.id,jdbcType=INTEGER}");
		}
		if (record.getDbName() != null) {
			sql.SET("db_name = #{record.dbName,jdbcType=VARCHAR}");
		}
		if (record.getVersion() != null) {
			sql.SET("version = #{record.version,jdbcType=INTEGER}");
		}
		if (record.getAggregateTime() != null) {
			sql.SET("aggregate_time = #{record.aggregateTime,jdbcType=INTEGER}");
		}
		if (record.getCreateTime() != null) {
			sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
		}
		if (record.getMean() != null) {
			sql.SET("mean = #{record.mean,jdbcType=BIT}");
		}
		if (record.getMax() != null) {
			sql.SET("max = #{record.max,jdbcType=BIT}");
		}
		if (record.getMin() != null) {
			sql.SET("min = #{record.min,jdbcType=BIT}");
		}
		if (record.getSd() != null) {
			sql.SET("sd = #{record.sd,jdbcType=BIT}");
		}
		if (record.getMedian() != null) {
			sql.SET("median = #{record.median,jdbcType=BIT}");
		}
		if (record.getQ1() != null) {
			sql.SET("q1 = #{record.q1,jdbcType=BIT}");
		}
		if (record.getQ3() != null) {
			sql.SET("q3 = #{record.q3,jdbcType=BIT}");
		}
		if (record.getSum() != null) {
			sql.SET("sum = #{record.sum,jdbcType=BIT}");
		}
		if (record.getStatus() != null) {
			sql.SET("status = #{record.status,jdbcType=VARCHAR}");
		}
		if (record.getTotal() != null) {
			sql.SET("total = #{record.total,jdbcType=INTEGER}");
		}
		if (record.getFinished() != null) {
			sql.SET("finished = #{record.finished,jdbcType=INTEGER}");
		}
		if (record.getAutoUpdate() != null) {
			sql.SET("auto_update = #{record.autoUpdate,jdbcType=BIT}");
		}
		if (record.getArtype() != null) {
			sql.SET("arType = #{record.artype,jdbcType=BIT}");
		}
		if (record.getFromDb() != null) {
			sql.SET("from_db = #{record.fromDb,jdbcType=VARCHAR}");
		}
		if (record.getTimeCost() != null) {
			sql.SET("time_cost = #{record.timeCost,jdbcType=VARCHAR}");
		}
		if (record.getThreads() != null) {
			sql.SET("threads = #{record.threads,jdbcType=INTEGER}");
		}
		if (record.getParts() != null) {
			sql.SET("parts = #{record.parts,jdbcType=INTEGER}");
		}
		if (record.getNday() != null) {
			sql.SET("nday = #{record.nday,jdbcType=INTEGER}");
		}
		if (record.getPidList() != null) {
			sql.SET("pid_list = #{record.pidList,jdbcType=LONGVARCHAR}");
		}
		if (record.getColumns() != null) {
			sql.SET("columns = #{record.columns,jdbcType=LONGVARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("aggregation_database");
		sql.SET("id = #{record.id,jdbcType=INTEGER}");
		sql.SET("db_name = #{record.dbName,jdbcType=VARCHAR}");
		sql.SET("version = #{record.version,jdbcType=INTEGER}");
		sql.SET("aggregate_time = #{record.aggregateTime,jdbcType=INTEGER}");
		sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
		sql.SET("mean = #{record.mean,jdbcType=BIT}");
		sql.SET("max = #{record.max,jdbcType=BIT}");
		sql.SET("min = #{record.min,jdbcType=BIT}");
		sql.SET("sd = #{record.sd,jdbcType=BIT}");
		sql.SET("median = #{record.median,jdbcType=BIT}");
		sql.SET("q1 = #{record.q1,jdbcType=BIT}");
		sql.SET("q3 = #{record.q3,jdbcType=BIT}");
		sql.SET("sum = #{record.sum,jdbcType=BIT}");
		sql.SET("status = #{record.status,jdbcType=VARCHAR}");
		sql.SET("total = #{record.total,jdbcType=INTEGER}");
		sql.SET("finished = #{record.finished,jdbcType=INTEGER}");
		sql.SET("auto_update = #{record.autoUpdate,jdbcType=BIT}");
		sql.SET("arType = #{record.artype,jdbcType=BIT}");
		sql.SET("from_db = #{record.fromDb,jdbcType=VARCHAR}");
		sql.SET("time_cost = #{record.timeCost,jdbcType=VARCHAR}");
		sql.SET("threads = #{record.threads,jdbcType=INTEGER}");
		sql.SET("parts = #{record.parts,jdbcType=INTEGER}");
		sql.SET("nday = #{record.nday,jdbcType=INTEGER}");
		sql.SET("pid_list = #{record.pidList,jdbcType=LONGVARCHAR}");
		sql.SET("columns = #{record.columns,jdbcType=LONGVARCHAR}");
		AggregationDatabaseExample example = (AggregationDatabaseExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("aggregation_database");
		sql.SET("id = #{record.id,jdbcType=INTEGER}");
		sql.SET("db_name = #{record.dbName,jdbcType=VARCHAR}");
		sql.SET("version = #{record.version,jdbcType=INTEGER}");
		sql.SET("aggregate_time = #{record.aggregateTime,jdbcType=INTEGER}");
		sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
		sql.SET("mean = #{record.mean,jdbcType=BIT}");
		sql.SET("max = #{record.max,jdbcType=BIT}");
		sql.SET("min = #{record.min,jdbcType=BIT}");
		sql.SET("sd = #{record.sd,jdbcType=BIT}");
		sql.SET("median = #{record.median,jdbcType=BIT}");
		sql.SET("q1 = #{record.q1,jdbcType=BIT}");
		sql.SET("q3 = #{record.q3,jdbcType=BIT}");
		sql.SET("sum = #{record.sum,jdbcType=BIT}");
		sql.SET("status = #{record.status,jdbcType=VARCHAR}");
		sql.SET("total = #{record.total,jdbcType=INTEGER}");
		sql.SET("finished = #{record.finished,jdbcType=INTEGER}");
		sql.SET("auto_update = #{record.autoUpdate,jdbcType=BIT}");
		sql.SET("arType = #{record.artype,jdbcType=BIT}");
		sql.SET("from_db = #{record.fromDb,jdbcType=VARCHAR}");
		sql.SET("time_cost = #{record.timeCost,jdbcType=VARCHAR}");
		sql.SET("threads = #{record.threads,jdbcType=INTEGER}");
		sql.SET("parts = #{record.parts,jdbcType=INTEGER}");
		sql.SET("nday = #{record.nday,jdbcType=INTEGER}");
		AggregationDatabaseExample example = (AggregationDatabaseExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	public String updateByPrimaryKeySelective(AggregationDatabaseWithBLOBs record) {
		SQL sql = new SQL();
		sql.UPDATE("aggregation_database");
		if (record.getDbName() != null) {
			sql.SET("db_name = #{dbName,jdbcType=VARCHAR}");
		}
		if (record.getVersion() != null) {
			sql.SET("version = #{version,jdbcType=INTEGER}");
		}
		if (record.getAggregateTime() != null) {
			sql.SET("aggregate_time = #{aggregateTime,jdbcType=INTEGER}");
		}
		if (record.getCreateTime() != null) {
			sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
		}
		if (record.getMean() != null) {
			sql.SET("mean = #{mean,jdbcType=BIT}");
		}
		if (record.getMax() != null) {
			sql.SET("max = #{max,jdbcType=BIT}");
		}
		if (record.getMin() != null) {
			sql.SET("min = #{min,jdbcType=BIT}");
		}
		if (record.getSd() != null) {
			sql.SET("sd = #{sd,jdbcType=BIT}");
		}
		if (record.getMedian() != null) {
			sql.SET("median = #{median,jdbcType=BIT}");
		}
		if (record.getQ1() != null) {
			sql.SET("q1 = #{q1,jdbcType=BIT}");
		}
		if (record.getQ3() != null) {
			sql.SET("q3 = #{q3,jdbcType=BIT}");
		}
		if (record.getSum() != null) {
			sql.SET("sum = #{sum,jdbcType=BIT}");
		}
		if (record.getStatus() != null) {
			sql.SET("status = #{status,jdbcType=VARCHAR}");
		}
		if (record.getTotal() != null) {
			sql.SET("total = #{total,jdbcType=INTEGER}");
		}
		if (record.getFinished() != null) {
			sql.SET("finished = #{finished,jdbcType=INTEGER}");
		}
		if (record.getAutoUpdate() != null) {
			sql.SET("auto_update = #{autoUpdate,jdbcType=BIT}");
		}
		if (record.getArtype() != null) {
			sql.SET("arType = #{artype,jdbcType=BIT}");
		}
		if (record.getFromDb() != null) {
			sql.SET("from_db = #{fromDb,jdbcType=VARCHAR}");
		}
		if (record.getTimeCost() != null) {
			sql.SET("time_cost = #{timeCost,jdbcType=VARCHAR}");
		}
		if (record.getThreads() != null) {
			sql.SET("threads = #{threads,jdbcType=INTEGER}");
		}
		if (record.getParts() != null) {
			sql.SET("parts = #{parts,jdbcType=INTEGER}");
		}
		if (record.getNday() != null) {
			sql.SET("nday = #{nday,jdbcType=INTEGER}");
		}
		if (record.getPidList() != null) {
			sql.SET("pid_list = #{pidList,jdbcType=LONGVARCHAR}");
		}
		if (record.getColumns() != null) {
			sql.SET("columns = #{columns,jdbcType=LONGVARCHAR}");
		}
		sql.WHERE("id = #{id,jdbcType=INTEGER}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_database
	 * @mbg.generated
	 */
	protected void applyWhere(SQL sql, AggregationDatabaseExample example, boolean includeExamplePhrase) {
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
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
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