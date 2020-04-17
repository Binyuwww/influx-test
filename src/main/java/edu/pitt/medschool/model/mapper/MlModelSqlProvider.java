package edu.pitt.medschool.model.mapper;

import edu.pitt.medschool.model.dto.MlModel;
import edu.pitt.medschool.model.dto.MlModelExample.Criteria;
import edu.pitt.medschool.model.dto.MlModelExample.Criterion;
import edu.pitt.medschool.model.dto.MlModelExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MlModelSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String countByExample(MlModelExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("ml_model");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String deleteByExample(MlModelExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("ml_model");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String insertSelective(MlModel record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("ml_model");
		if (record.getIndex() != null) {
			sql.VALUES("index_", "#{index,jdbcType=INTEGER}");
		}
		if (record.getIteration() != null) {
			sql.VALUES("iteration", "#{iteration,jdbcType=INTEGER}");
		}
		if (record.getPipelineName() != null) {
			sql.VALUES("pipeline_name", "#{pipelineName,jdbcType=VARCHAR}");
		}
		if (record.getMlMethod() != null) {
			sql.VALUES("ml_method", "#{mlMethod,jdbcType=VARCHAR}");
		}
		if (record.getAggLevel() != null) {
			sql.VALUES("agg_level", "#{aggLevel,jdbcType=INTEGER}");
		}
		if (record.getAggMethod() != null) {
			sql.VALUES("agg_method", "#{aggMethod,jdbcType=VARCHAR}");
		}
		if (record.getFeatureSet() != null) {
			sql.VALUES("feature_set", "#{featureSet,jdbcType=VARCHAR}");
		}
		if (record.getAccuracyScore() != null) {
			sql.VALUES("accuracy_score", "#{accuracyScore,jdbcType=DOUBLE}");
		}
		if (record.getThreshold() != null) {
			sql.VALUES("threshold", "#{threshold,jdbcType=DOUBLE}");
		}
		if (record.getThresholdStandard() != null) {
			sql.VALUES("threshold_standard", "#{thresholdStandard,jdbcType=DOUBLE}");
		}
		if (record.getPipeline() != null) {
			sql.VALUES("pipeline", "#{pipeline,jdbcType=LONGVARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String selectByExampleWithBLOBs(MlModelExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("index_");
		sql.SELECT("iteration");
		sql.SELECT("pipeline_name");
		sql.SELECT("ml_method");
		sql.SELECT("agg_level");
		sql.SELECT("agg_method");
		sql.SELECT("feature_set");
		sql.SELECT("accuracy_score");
		sql.SELECT("threshold");
		sql.SELECT("threshold_standard");
		sql.SELECT("pipeline");
		sql.FROM("ml_model");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String selectByExample(MlModelExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id");
		} else {
			sql.SELECT("id");
		}
		sql.SELECT("index_");
		sql.SELECT("iteration");
		sql.SELECT("pipeline_name");
		sql.SELECT("ml_method");
		sql.SELECT("agg_level");
		sql.SELECT("agg_method");
		sql.SELECT("feature_set");
		sql.SELECT("accuracy_score");
		sql.SELECT("threshold");
		sql.SELECT("threshold_standard");
		sql.FROM("ml_model");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		MlModel record = (MlModel) parameter.get("record");
		MlModelExample example = (MlModelExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("ml_model");
		if (record.getId() != null) {
			sql.SET("id = #{record.id,jdbcType=INTEGER}");
		}
		if (record.getIndex() != null) {
			sql.SET("index_ = #{record.index,jdbcType=INTEGER}");
		}
		if (record.getIteration() != null) {
			sql.SET("iteration = #{record.iteration,jdbcType=INTEGER}");
		}
		if (record.getPipelineName() != null) {
			sql.SET("pipeline_name = #{record.pipelineName,jdbcType=VARCHAR}");
		}
		if (record.getMlMethod() != null) {
			sql.SET("ml_method = #{record.mlMethod,jdbcType=VARCHAR}");
		}
		if (record.getAggLevel() != null) {
			sql.SET("agg_level = #{record.aggLevel,jdbcType=INTEGER}");
		}
		if (record.getAggMethod() != null) {
			sql.SET("agg_method = #{record.aggMethod,jdbcType=VARCHAR}");
		}
		if (record.getFeatureSet() != null) {
			sql.SET("feature_set = #{record.featureSet,jdbcType=VARCHAR}");
		}
		if (record.getAccuracyScore() != null) {
			sql.SET("accuracy_score = #{record.accuracyScore,jdbcType=DOUBLE}");
		}
		if (record.getThreshold() != null) {
			sql.SET("threshold = #{record.threshold,jdbcType=DOUBLE}");
		}
		if (record.getThresholdStandard() != null) {
			sql.SET("threshold_standard = #{record.thresholdStandard,jdbcType=DOUBLE}");
		}
		if (record.getPipeline() != null) {
			sql.SET("pipeline = #{record.pipeline,jdbcType=LONGVARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("ml_model");
		sql.SET("id = #{record.id,jdbcType=INTEGER}");
		sql.SET("index_ = #{record.index,jdbcType=INTEGER}");
		sql.SET("iteration = #{record.iteration,jdbcType=INTEGER}");
		sql.SET("pipeline_name = #{record.pipelineName,jdbcType=VARCHAR}");
		sql.SET("ml_method = #{record.mlMethod,jdbcType=VARCHAR}");
		sql.SET("agg_level = #{record.aggLevel,jdbcType=INTEGER}");
		sql.SET("agg_method = #{record.aggMethod,jdbcType=VARCHAR}");
		sql.SET("feature_set = #{record.featureSet,jdbcType=VARCHAR}");
		sql.SET("accuracy_score = #{record.accuracyScore,jdbcType=DOUBLE}");
		sql.SET("threshold = #{record.threshold,jdbcType=DOUBLE}");
		sql.SET("threshold_standard = #{record.thresholdStandard,jdbcType=DOUBLE}");
		sql.SET("pipeline = #{record.pipeline,jdbcType=LONGVARCHAR}");
		MlModelExample example = (MlModelExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("ml_model");
		sql.SET("id = #{record.id,jdbcType=INTEGER}");
		sql.SET("index_ = #{record.index,jdbcType=INTEGER}");
		sql.SET("iteration = #{record.iteration,jdbcType=INTEGER}");
		sql.SET("pipeline_name = #{record.pipelineName,jdbcType=VARCHAR}");
		sql.SET("ml_method = #{record.mlMethod,jdbcType=VARCHAR}");
		sql.SET("agg_level = #{record.aggLevel,jdbcType=INTEGER}");
		sql.SET("agg_method = #{record.aggMethod,jdbcType=VARCHAR}");
		sql.SET("feature_set = #{record.featureSet,jdbcType=VARCHAR}");
		sql.SET("accuracy_score = #{record.accuracyScore,jdbcType=DOUBLE}");
		sql.SET("threshold = #{record.threshold,jdbcType=DOUBLE}");
		sql.SET("threshold_standard = #{record.thresholdStandard,jdbcType=DOUBLE}");
		MlModelExample example = (MlModelExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ml_model
	 * @mbg.generated
	 */
	protected void applyWhere(SQL sql, MlModelExample example, boolean includeExamplePhrase) {
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