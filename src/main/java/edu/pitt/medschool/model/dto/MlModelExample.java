package edu.pitt.medschool.model.dto;

import java.util.ArrayList;
import java.util.List;

public class MlModelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public MlModelExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIterationIsNull() {
            addCriterion("iteration is null");
            return (Criteria) this;
        }

        public Criteria andIterationIsNotNull() {
            addCriterion("iteration is not null");
            return (Criteria) this;
        }

        public Criteria andIterationEqualTo(Integer value) {
            addCriterion("iteration =", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationNotEqualTo(Integer value) {
            addCriterion("iteration <>", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationGreaterThan(Integer value) {
            addCriterion("iteration >", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationGreaterThanOrEqualTo(Integer value) {
            addCriterion("iteration >=", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationLessThan(Integer value) {
            addCriterion("iteration <", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationLessThanOrEqualTo(Integer value) {
            addCriterion("iteration <=", value, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationIn(List<Integer> values) {
            addCriterion("iteration in", values, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationNotIn(List<Integer> values) {
            addCriterion("iteration not in", values, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationBetween(Integer value1, Integer value2) {
            addCriterion("iteration between", value1, value2, "iteration");
            return (Criteria) this;
        }

        public Criteria andIterationNotBetween(Integer value1, Integer value2) {
            addCriterion("iteration not between", value1, value2, "iteration");
            return (Criteria) this;
        }

        public Criteria andPipelineNameIsNull() {
            addCriterion("pipeline_name is null");
            return (Criteria) this;
        }

        public Criteria andPipelineNameIsNotNull() {
            addCriterion("pipeline_name is not null");
            return (Criteria) this;
        }

        public Criteria andPipelineNameEqualTo(String value) {
            addCriterion("pipeline_name =", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameNotEqualTo(String value) {
            addCriterion("pipeline_name <>", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameGreaterThan(String value) {
            addCriterion("pipeline_name >", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameGreaterThanOrEqualTo(String value) {
            addCriterion("pipeline_name >=", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameLessThan(String value) {
            addCriterion("pipeline_name <", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameLessThanOrEqualTo(String value) {
            addCriterion("pipeline_name <=", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameLike(String value) {
            addCriterion("pipeline_name like", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameNotLike(String value) {
            addCriterion("pipeline_name not like", value, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameIn(List<String> values) {
            addCriterion("pipeline_name in", values, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameNotIn(List<String> values) {
            addCriterion("pipeline_name not in", values, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameBetween(String value1, String value2) {
            addCriterion("pipeline_name between", value1, value2, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andPipelineNameNotBetween(String value1, String value2) {
            addCriterion("pipeline_name not between", value1, value2, "pipelineName");
            return (Criteria) this;
        }

        public Criteria andMlMethodIsNull() {
            addCriterion("ml_method is null");
            return (Criteria) this;
        }

        public Criteria andMlMethodIsNotNull() {
            addCriterion("ml_method is not null");
            return (Criteria) this;
        }

        public Criteria andMlMethodEqualTo(String value) {
            addCriterion("ml_method =", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodNotEqualTo(String value) {
            addCriterion("ml_method <>", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodGreaterThan(String value) {
            addCriterion("ml_method >", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ml_method >=", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodLessThan(String value) {
            addCriterion("ml_method <", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodLessThanOrEqualTo(String value) {
            addCriterion("ml_method <=", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodLike(String value) {
            addCriterion("ml_method like", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodNotLike(String value) {
            addCriterion("ml_method not like", value, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodIn(List<String> values) {
            addCriterion("ml_method in", values, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodNotIn(List<String> values) {
            addCriterion("ml_method not in", values, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodBetween(String value1, String value2) {
            addCriterion("ml_method between", value1, value2, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andMlMethodNotBetween(String value1, String value2) {
            addCriterion("ml_method not between", value1, value2, "mlMethod");
            return (Criteria) this;
        }

        public Criteria andAggLevelIsNull() {
            addCriterion("agg_level is null");
            return (Criteria) this;
        }

        public Criteria andAggLevelIsNotNull() {
            addCriterion("agg_level is not null");
            return (Criteria) this;
        }

        public Criteria andAggLevelEqualTo(Integer value) {
            addCriterion("agg_level =", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelNotEqualTo(Integer value) {
            addCriterion("agg_level <>", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelGreaterThan(Integer value) {
            addCriterion("agg_level >", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("agg_level >=", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelLessThan(Integer value) {
            addCriterion("agg_level <", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelLessThanOrEqualTo(Integer value) {
            addCriterion("agg_level <=", value, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelIn(List<Integer> values) {
            addCriterion("agg_level in", values, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelNotIn(List<Integer> values) {
            addCriterion("agg_level not in", values, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelBetween(Integer value1, Integer value2) {
            addCriterion("agg_level between", value1, value2, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("agg_level not between", value1, value2, "aggLevel");
            return (Criteria) this;
        }

        public Criteria andAggMethodIsNull() {
            addCriterion("agg_method is null");
            return (Criteria) this;
        }

        public Criteria andAggMethodIsNotNull() {
            addCriterion("agg_method is not null");
            return (Criteria) this;
        }

        public Criteria andAggMethodEqualTo(String value) {
            addCriterion("agg_method =", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodNotEqualTo(String value) {
            addCriterion("agg_method <>", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodGreaterThan(String value) {
            addCriterion("agg_method >", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodGreaterThanOrEqualTo(String value) {
            addCriterion("agg_method >=", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodLessThan(String value) {
            addCriterion("agg_method <", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodLessThanOrEqualTo(String value) {
            addCriterion("agg_method <=", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodLike(String value) {
            addCriterion("agg_method like", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodNotLike(String value) {
            addCriterion("agg_method not like", value, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodIn(List<String> values) {
            addCriterion("agg_method in", values, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodNotIn(List<String> values) {
            addCriterion("agg_method not in", values, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodBetween(String value1, String value2) {
            addCriterion("agg_method between", value1, value2, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodNotBetween(String value1, String value2) {
            addCriterion("agg_method not between", value1, value2, "aggMethod");
            return (Criteria) this;
        }

        public Criteria andFeatureSetIsNull() {
            addCriterion("feature_set is null");
            return (Criteria) this;
        }

        public Criteria andFeatureSetIsNotNull() {
            addCriterion("feature_set is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureSetEqualTo(String value) {
            addCriterion("feature_set =", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetNotEqualTo(String value) {
            addCriterion("feature_set <>", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetGreaterThan(String value) {
            addCriterion("feature_set >", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetGreaterThanOrEqualTo(String value) {
            addCriterion("feature_set >=", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetLessThan(String value) {
            addCriterion("feature_set <", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetLessThanOrEqualTo(String value) {
            addCriterion("feature_set <=", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetLike(String value) {
            addCriterion("feature_set like", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetNotLike(String value) {
            addCriterion("feature_set not like", value, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetIn(List<String> values) {
            addCriterion("feature_set in", values, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetNotIn(List<String> values) {
            addCriterion("feature_set not in", values, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetBetween(String value1, String value2) {
            addCriterion("feature_set between", value1, value2, "featureSet");
            return (Criteria) this;
        }

        public Criteria andFeatureSetNotBetween(String value1, String value2) {
            addCriterion("feature_set not between", value1, value2, "featureSet");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreIsNull() {
            addCriterion("accuracy_score is null");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreIsNotNull() {
            addCriterion("accuracy_score is not null");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreEqualTo(Double value) {
            addCriterion("accuracy_score =", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreNotEqualTo(Double value) {
            addCriterion("accuracy_score <>", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreGreaterThan(Double value) {
            addCriterion("accuracy_score >", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("accuracy_score >=", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreLessThan(Double value) {
            addCriterion("accuracy_score <", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreLessThanOrEqualTo(Double value) {
            addCriterion("accuracy_score <=", value, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreIn(List<Double> values) {
            addCriterion("accuracy_score in", values, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreNotIn(List<Double> values) {
            addCriterion("accuracy_score not in", values, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreBetween(Double value1, Double value2) {
            addCriterion("accuracy_score between", value1, value2, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andAccuracyScoreNotBetween(Double value1, Double value2) {
            addCriterion("accuracy_score not between", value1, value2, "accuracyScore");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNull() {
            addCriterion("threshold is null");
            return (Criteria) this;
        }

        public Criteria andThresholdIsNotNull() {
            addCriterion("threshold is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdEqualTo(Double value) {
            addCriterion("threshold =", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotEqualTo(Double value) {
            addCriterion("threshold <>", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThan(Double value) {
            addCriterion("threshold >", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdGreaterThanOrEqualTo(Double value) {
            addCriterion("threshold >=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThan(Double value) {
            addCriterion("threshold <", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdLessThanOrEqualTo(Double value) {
            addCriterion("threshold <=", value, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdIn(List<Double> values) {
            addCriterion("threshold in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotIn(List<Double> values) {
            addCriterion("threshold not in", values, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdBetween(Double value1, Double value2) {
            addCriterion("threshold between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdNotBetween(Double value1, Double value2) {
            addCriterion("threshold not between", value1, value2, "threshold");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardIsNull() {
            addCriterion("threshold_standard is null");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardIsNotNull() {
            addCriterion("threshold_standard is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardEqualTo(Double value) {
            addCriterion("threshold_standard =", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardNotEqualTo(Double value) {
            addCriterion("threshold_standard <>", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardGreaterThan(Double value) {
            addCriterion("threshold_standard >", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardGreaterThanOrEqualTo(Double value) {
            addCriterion("threshold_standard >=", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardLessThan(Double value) {
            addCriterion("threshold_standard <", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardLessThanOrEqualTo(Double value) {
            addCriterion("threshold_standard <=", value, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardIn(List<Double> values) {
            addCriterion("threshold_standard in", values, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardNotIn(List<Double> values) {
            addCriterion("threshold_standard not in", values, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardBetween(Double value1, Double value2) {
            addCriterion("threshold_standard between", value1, value2, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andThresholdStandardNotBetween(Double value1, Double value2) {
            addCriterion("threshold_standard not between", value1, value2, "thresholdStandard");
            return (Criteria) this;
        }

        public Criteria andPipelineNameLikeInsensitive(String value) {
            addCriterion("upper(pipeline_name) like", value.toUpperCase(), "pipelineName");
            return (Criteria) this;
        }

        public Criteria andMlMethodLikeInsensitive(String value) {
            addCriterion("upper(ml_method) like", value.toUpperCase(), "mlMethod");
            return (Criteria) this;
        }

        public Criteria andAggMethodLikeInsensitive(String value) {
            addCriterion("upper(agg_method) like", value.toUpperCase(), "aggMethod");
            return (Criteria) this;
        }

        public Criteria andFeatureSetLikeInsensitive(String value) {
            addCriterion("upper(feature_set) like", value.toUpperCase(), "featureSet");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ml_model
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ml_model
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}