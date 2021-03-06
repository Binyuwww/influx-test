package edu.pitt.medschool.model.dto;

import java.util.ArrayList;
import java.util.List;

public class FeatureExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table upmc..feature
     * @mbg.generated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table upmc..feature
     * @mbg.generated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table upmc..feature
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public FeatureExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table upmc..feature
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("SID like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("SID not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("SID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidCountIsNull() {
            addCriterion("SID_Count is null");
            return (Criteria) this;
        }

        public Criteria andSidCountIsNotNull() {
            addCriterion("SID_Count is not null");
            return (Criteria) this;
        }

        public Criteria andSidCountEqualTo(Integer value) {
            addCriterion("SID_Count =", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountNotEqualTo(Integer value) {
            addCriterion("SID_Count <>", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountGreaterThan(Integer value) {
            addCriterion("SID_Count >", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SID_Count >=", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountLessThan(Integer value) {
            addCriterion("SID_Count <", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountLessThanOrEqualTo(Integer value) {
            addCriterion("SID_Count <=", value, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountIn(List<Integer> values) {
            addCriterion("SID_Count in", values, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountNotIn(List<Integer> values) {
            addCriterion("SID_Count not in", values, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountBetween(Integer value1, Integer value2) {
            addCriterion("SID_Count between", value1, value2, "sidCount");
            return (Criteria) this;
        }

        public Criteria andSidCountNotBetween(Integer value1, Integer value2) {
            addCriterion("SID_Count not between", value1, value2, "sidCount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andElectrodeIsNull() {
            addCriterion("electrode is null");
            return (Criteria) this;
        }

        public Criteria andElectrodeIsNotNull() {
            addCriterion("electrode is not null");
            return (Criteria) this;
        }

        public Criteria andElectrodeEqualTo(String value) {
            addCriterion("electrode =", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeNotEqualTo(String value) {
            addCriterion("electrode <>", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeGreaterThan(String value) {
            addCriterion("electrode >", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeGreaterThanOrEqualTo(String value) {
            addCriterion("electrode >=", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeLessThan(String value) {
            addCriterion("electrode <", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeLessThanOrEqualTo(String value) {
            addCriterion("electrode <=", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeLike(String value) {
            addCriterion("electrode like", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeNotLike(String value) {
            addCriterion("electrode not like", value, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeIn(List<String> values) {
            addCriterion("electrode in", values, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeNotIn(List<String> values) {
            addCriterion("electrode not in", values, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeBetween(String value1, String value2) {
            addCriterion("electrode between", value1, value2, "electrode");
            return (Criteria) this;
        }

        public Criteria andElectrodeNotBetween(String value1, String value2) {
            addCriterion("electrode not between", value1, value2, "electrode");
            return (Criteria) this;
        }

        public Criteria andFreqLowIsNull() {
            addCriterion("freq_low is null");
            return (Criteria) this;
        }

        public Criteria andFreqLowIsNotNull() {
            addCriterion("freq_low is not null");
            return (Criteria) this;
        }

        public Criteria andFreqLowEqualTo(Double value) {
            addCriterion("freq_low =", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowNotEqualTo(Double value) {
            addCriterion("freq_low <>", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowGreaterThan(Double value) {
            addCriterion("freq_low >", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowGreaterThanOrEqualTo(Double value) {
            addCriterion("freq_low >=", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowLessThan(Double value) {
            addCriterion("freq_low <", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowLessThanOrEqualTo(Double value) {
            addCriterion("freq_low <=", value, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowIn(List<Double> values) {
            addCriterion("freq_low in", values, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowNotIn(List<Double> values) {
            addCriterion("freq_low not in", values, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowBetween(Double value1, Double value2) {
            addCriterion("freq_low between", value1, value2, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqLowNotBetween(Double value1, Double value2) {
            addCriterion("freq_low not between", value1, value2, "freqLow");
            return (Criteria) this;
        }

        public Criteria andFreqHighIsNull() {
            addCriterion("freq_high is null");
            return (Criteria) this;
        }

        public Criteria andFreqHighIsNotNull() {
            addCriterion("freq_high is not null");
            return (Criteria) this;
        }

        public Criteria andFreqHighEqualTo(Double value) {
            addCriterion("freq_high =", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighNotEqualTo(Double value) {
            addCriterion("freq_high <>", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighGreaterThan(Double value) {
            addCriterion("freq_high >", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighGreaterThanOrEqualTo(Double value) {
            addCriterion("freq_high >=", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighLessThan(Double value) {
            addCriterion("freq_high <", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighLessThanOrEqualTo(Double value) {
            addCriterion("freq_high <=", value, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighIn(List<Double> values) {
            addCriterion("freq_high in", values, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighNotIn(List<Double> values) {
            addCriterion("freq_high not in", values, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighBetween(Double value1, Double value2) {
            addCriterion("freq_high between", value1, value2, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andFreqHighNotBetween(Double value1, Double value2) {
            addCriterion("freq_high not between", value1, value2, "freqHigh");
            return (Criteria) this;
        }

        public Criteria andBrainLocationIsNull() {
            addCriterion("brain_location is null");
            return (Criteria) this;
        }

        public Criteria andBrainLocationIsNotNull() {
            addCriterion("brain_location is not null");
            return (Criteria) this;
        }

        public Criteria andBrainLocationEqualTo(String value) {
            addCriterion("brain_location =", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationNotEqualTo(String value) {
            addCriterion("brain_location <>", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationGreaterThan(String value) {
            addCriterion("brain_location >", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationGreaterThanOrEqualTo(String value) {
            addCriterion("brain_location >=", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationLessThan(String value) {
            addCriterion("brain_location <", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationLessThanOrEqualTo(String value) {
            addCriterion("brain_location <=", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationLike(String value) {
            addCriterion("brain_location like", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationNotLike(String value) {
            addCriterion("brain_location not like", value, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationIn(List<String> values) {
            addCriterion("brain_location in", values, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationNotIn(List<String> values) {
            addCriterion("brain_location not in", values, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationBetween(String value1, String value2) {
            addCriterion("brain_location between", value1, value2, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andBrainLocationNotBetween(String value1, String value2) {
            addCriterion("brain_location not between", value1, value2, "brainLocation");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andCsvNameIsNull() {
            addCriterion("csv_name is null");
            return (Criteria) this;
        }

        public Criteria andCsvNameIsNotNull() {
            addCriterion("csv_name is not null");
            return (Criteria) this;
        }

        public Criteria andCsvNameEqualTo(String value) {
            addCriterion("csv_name =", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameNotEqualTo(String value) {
            addCriterion("csv_name <>", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameGreaterThan(String value) {
            addCriterion("csv_name >", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameGreaterThanOrEqualTo(String value) {
            addCriterion("csv_name >=", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameLessThan(String value) {
            addCriterion("csv_name <", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameLessThanOrEqualTo(String value) {
            addCriterion("csv_name <=", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameLike(String value) {
            addCriterion("csv_name like", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameNotLike(String value) {
            addCriterion("csv_name not like", value, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameIn(List<String> values) {
            addCriterion("csv_name in", values, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameNotIn(List<String> values) {
            addCriterion("csv_name not in", values, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameBetween(String value1, String value2) {
            addCriterion("csv_name between", value1, value2, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvNameNotBetween(String value1, String value2) {
            addCriterion("csv_name not between", value1, value2, "csvName");
            return (Criteria) this;
        }

        public Criteria andCsvIdIsNull() {
            addCriterion("csv_id is null");
            return (Criteria) this;
        }

        public Criteria andCsvIdIsNotNull() {
            addCriterion("csv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsvIdEqualTo(Integer value) {
            addCriterion("csv_id =", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotEqualTo(Integer value) {
            addCriterion("csv_id <>", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdGreaterThan(Integer value) {
            addCriterion("csv_id >", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_id >=", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdLessThan(Integer value) {
            addCriterion("csv_id <", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdLessThanOrEqualTo(Integer value) {
            addCriterion("csv_id <=", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdIn(List<Integer> values) {
            addCriterion("csv_id in", values, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotIn(List<Integer> values) {
            addCriterion("csv_id not in", values, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdBetween(Integer value1, Integer value2) {
            addCriterion("csv_id between", value1, value2, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_id not between", value1, value2, "csvId");
            return (Criteria) this;
        }

        public Criteria andSidLikeInsensitive(String value) {
            addCriterion("upper(SID) like", value.toUpperCase(), "sid");
            return (Criteria) this;
        }

        public Criteria andTypeLikeInsensitive(String value) {
            addCriterion("upper(type) like", value.toUpperCase(), "type");
            return (Criteria) this;
        }

        public Criteria andElectrodeLikeInsensitive(String value) {
            addCriterion("upper(electrode) like", value.toUpperCase(), "electrode");
            return (Criteria) this;
        }

        public Criteria andBrainLocationLikeInsensitive(String value) {
            addCriterion("upper(brain_location) like", value.toUpperCase(), "brainLocation");
            return (Criteria) this;
        }

        public Criteria andNotesLikeInsensitive(String value) {
            addCriterion("upper(notes) like", value.toUpperCase(), "notes");
            return (Criteria) this;
        }

        public Criteria andCsvNameLikeInsensitive(String value) {
            addCriterion("upper(csv_name) like", value.toUpperCase(), "csvName");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table upmc..feature
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

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table feature
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
        
        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        
    }
}