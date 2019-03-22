package edu.pitt.medschool.model.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalDownsampleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public MedicalDownsampleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table medical_downsample
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

		public Criteria andAliasIsNull() {
			addCriterion("alias is null");
			return (Criteria) this;
		}

		public Criteria andAliasIsNotNull() {
			addCriterion("alias is not null");
			return (Criteria) this;
		}

		public Criteria andAliasEqualTo(String value) {
			addCriterion("alias =", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotEqualTo(String value) {
			addCriterion("alias <>", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasGreaterThan(String value) {
			addCriterion("alias >", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasGreaterThanOrEqualTo(String value) {
			addCriterion("alias >=", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLessThan(String value) {
			addCriterion("alias <", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLessThanOrEqualTo(String value) {
			addCriterion("alias <=", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasLike(String value) {
			addCriterion("alias like", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotLike(String value) {
			addCriterion("alias not like", value, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasIn(List<String> values) {
			addCriterion("alias in", values, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotIn(List<String> values) {
			addCriterion("alias not in", values, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasBetween(String value1, String value2) {
			addCriterion("alias between", value1, value2, "alias");
			return (Criteria) this;
		}

		public Criteria andAliasNotBetween(String value1, String value2) {
			addCriterion("alias not between", value1, value2, "alias");
			return (Criteria) this;
		}

		public Criteria andMedicineIsNull() {
			addCriterion("medicine is null");
			return (Criteria) this;
		}

		public Criteria andMedicineIsNotNull() {
			addCriterion("medicine is not null");
			return (Criteria) this;
		}

		public Criteria andMedicineEqualTo(String value) {
			addCriterion("medicine =", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineNotEqualTo(String value) {
			addCriterion("medicine <>", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineGreaterThan(String value) {
			addCriterion("medicine >", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineGreaterThanOrEqualTo(String value) {
			addCriterion("medicine >=", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineLessThan(String value) {
			addCriterion("medicine <", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineLessThanOrEqualTo(String value) {
			addCriterion("medicine <=", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineLike(String value) {
			addCriterion("medicine like", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineNotLike(String value) {
			addCriterion("medicine not like", value, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineIn(List<String> values) {
			addCriterion("medicine in", values, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineNotIn(List<String> values) {
			addCriterion("medicine not in", values, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineBetween(String value1, String value2) {
			addCriterion("medicine between", value1, value2, "medicine");
			return (Criteria) this;
		}

		public Criteria andMedicineNotBetween(String value1, String value2) {
			addCriterion("medicine not between", value1, value2, "medicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineIsNull() {
			addCriterion("before_medicine is null");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineIsNotNull() {
			addCriterion("before_medicine is not null");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineEqualTo(Integer value) {
			addCriterion("before_medicine =", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineNotEqualTo(Integer value) {
			addCriterion("before_medicine <>", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineGreaterThan(Integer value) {
			addCriterion("before_medicine >", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineGreaterThanOrEqualTo(Integer value) {
			addCriterion("before_medicine >=", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineLessThan(Integer value) {
			addCriterion("before_medicine <", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineLessThanOrEqualTo(Integer value) {
			addCriterion("before_medicine <=", value, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineIn(List<Integer> values) {
			addCriterion("before_medicine in", values, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineNotIn(List<Integer> values) {
			addCriterion("before_medicine not in", values, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineBetween(Integer value1, Integer value2) {
			addCriterion("before_medicine between", value1, value2, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andBeforeMedicineNotBetween(Integer value1, Integer value2) {
			addCriterion("before_medicine not between", value1, value2, "beforeMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineIsNull() {
			addCriterion("after_medicine is null");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineIsNotNull() {
			addCriterion("after_medicine is not null");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineEqualTo(Integer value) {
			addCriterion("after_medicine =", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineNotEqualTo(Integer value) {
			addCriterion("after_medicine <>", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineGreaterThan(Integer value) {
			addCriterion("after_medicine >", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineGreaterThanOrEqualTo(Integer value) {
			addCriterion("after_medicine >=", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineLessThan(Integer value) {
			addCriterion("after_medicine <", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineLessThanOrEqualTo(Integer value) {
			addCriterion("after_medicine <=", value, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineIn(List<Integer> values) {
			addCriterion("after_medicine in", values, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineNotIn(List<Integer> values) {
			addCriterion("after_medicine not in", values, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineBetween(Integer value1, Integer value2) {
			addCriterion("after_medicine between", value1, value2, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andAfterMedicineNotBetween(Integer value1, Integer value2) {
			addCriterion("after_medicine not between", value1, value2, "afterMedicine");
			return (Criteria) this;
		}

		public Criteria andPeriodIsNull() {
			addCriterion("period is null");
			return (Criteria) this;
		}

		public Criteria andPeriodIsNotNull() {
			addCriterion("period is not null");
			return (Criteria) this;
		}

		public Criteria andPeriodEqualTo(Integer value) {
			addCriterion("period =", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotEqualTo(Integer value) {
			addCriterion("period <>", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodGreaterThan(Integer value) {
			addCriterion("period >", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
			addCriterion("period >=", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodLessThan(Integer value) {
			addCriterion("period <", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodLessThanOrEqualTo(Integer value) {
			addCriterion("period <=", value, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodIn(List<Integer> values) {
			addCriterion("period in", values, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotIn(List<Integer> values) {
			addCriterion("period not in", values, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodBetween(Integer value1, Integer value2) {
			addCriterion("period between", value1, value2, "period");
			return (Criteria) this;
		}

		public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
			addCriterion("period not between", value1, value2, "period");
			return (Criteria) this;
		}

		public Criteria andMinBinIsNull() {
			addCriterion("min_bin is null");
			return (Criteria) this;
		}

		public Criteria andMinBinIsNotNull() {
			addCriterion("min_bin is not null");
			return (Criteria) this;
		}

		public Criteria andMinBinEqualTo(Integer value) {
			addCriterion("min_bin =", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinNotEqualTo(Integer value) {
			addCriterion("min_bin <>", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinGreaterThan(Integer value) {
			addCriterion("min_bin >", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinGreaterThanOrEqualTo(Integer value) {
			addCriterion("min_bin >=", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinLessThan(Integer value) {
			addCriterion("min_bin <", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinLessThanOrEqualTo(Integer value) {
			addCriterion("min_bin <=", value, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinIn(List<Integer> values) {
			addCriterion("min_bin in", values, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinNotIn(List<Integer> values) {
			addCriterion("min_bin not in", values, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinBetween(Integer value1, Integer value2) {
			addCriterion("min_bin between", value1, value2, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinNotBetween(Integer value1, Integer value2) {
			addCriterion("min_bin not between", value1, value2, "minBin");
			return (Criteria) this;
		}

		public Criteria andMinBinRowIsNull() {
			addCriterion("min_bin_row is null");
			return (Criteria) this;
		}

		public Criteria andMinBinRowIsNotNull() {
			addCriterion("min_bin_row is not null");
			return (Criteria) this;
		}

		public Criteria andMinBinRowEqualTo(Integer value) {
			addCriterion("min_bin_row =", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowNotEqualTo(Integer value) {
			addCriterion("min_bin_row <>", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowGreaterThan(Integer value) {
			addCriterion("min_bin_row >", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowGreaterThanOrEqualTo(Integer value) {
			addCriterion("min_bin_row >=", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowLessThan(Integer value) {
			addCriterion("min_bin_row <", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowLessThanOrEqualTo(Integer value) {
			addCriterion("min_bin_row <=", value, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowIn(List<Integer> values) {
			addCriterion("min_bin_row in", values, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowNotIn(List<Integer> values) {
			addCriterion("min_bin_row not in", values, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowBetween(Integer value1, Integer value2) {
			addCriterion("min_bin_row between", value1, value2, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andMinBinRowNotBetween(Integer value1, Integer value2) {
			addCriterion("min_bin_row not between", value1, value2, "minBinRow");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstIsNull() {
			addCriterion("downsample_first is null");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstIsNotNull() {
			addCriterion("downsample_first is not null");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstEqualTo(Boolean value) {
			addCriterion("downsample_first =", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstNotEqualTo(Boolean value) {
			addCriterion("downsample_first <>", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstGreaterThan(Boolean value) {
			addCriterion("downsample_first >", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstGreaterThanOrEqualTo(Boolean value) {
			addCriterion("downsample_first >=", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstLessThan(Boolean value) {
			addCriterion("downsample_first <", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstLessThanOrEqualTo(Boolean value) {
			addCriterion("downsample_first <=", value, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstIn(List<Boolean> values) {
			addCriterion("downsample_first in", values, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstNotIn(List<Boolean> values) {
			addCriterion("downsample_first not in", values, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstBetween(Boolean value1, Boolean value2) {
			addCriterion("downsample_first between", value1, value2, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andDownsampleFirstNotBetween(Boolean value1, Boolean value2) {
			addCriterion("downsample_first not between", value1, value2, "downsampleFirst");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("update_time is null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("update_time is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<Date> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<Date> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterion("update_time not between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNull() {
			addCriterion("deleted is null");
			return (Criteria) this;
		}

		public Criteria andDeletedIsNotNull() {
			addCriterion("deleted is not null");
			return (Criteria) this;
		}

		public Criteria andDeletedEqualTo(Boolean value) {
			addCriterion("deleted =", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotEqualTo(Boolean value) {
			addCriterion("deleted <>", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThan(Boolean value) {
			addCriterion("deleted >", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
			addCriterion("deleted >=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThan(Boolean value) {
			addCriterion("deleted <", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
			addCriterion("deleted <=", value, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedIn(List<Boolean> values) {
			addCriterion("deleted in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotIn(List<Boolean> values) {
			addCriterion("deleted not in", values, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
			addCriterion("deleted between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
			addCriterion("deleted not between", value1, value2, "deleted");
			return (Criteria) this;
		}

		public Criteria andAliasLikeInsensitive(String value) {
			addCriterion("upper(alias) like", value.toUpperCase(), "alias");
			return (Criteria) this;
		}

		public Criteria andMedicineLikeInsensitive(String value) {
			addCriterion("upper(medicine) like", value.toUpperCase(), "medicine");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table medical_downsample
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
     * This class corresponds to the database table medical_downsample
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}