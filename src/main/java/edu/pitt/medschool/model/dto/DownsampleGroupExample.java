package edu.pitt.medschool.model.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

public class DownsampleGroupExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public DownsampleGroupExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table downsample_group
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

		public Criteria andQueryIdIsNull() {
			addCriterion("query_id is null");
			return (Criteria) this;
		}

		public Criteria andQueryIdIsNotNull() {
			addCriterion("query_id is not null");
			return (Criteria) this;
		}

		public Criteria andQueryIdEqualTo(Integer value) {
			addCriterion("query_id =", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdNotEqualTo(Integer value) {
			addCriterion("query_id <>", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdGreaterThan(Integer value) {
			addCriterion("query_id >", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("query_id >=", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdLessThan(Integer value) {
			addCriterion("query_id <", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdLessThanOrEqualTo(Integer value) {
			addCriterion("query_id <=", value, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdIn(List<Integer> values) {
			addCriterion("query_id in", values, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdNotIn(List<Integer> values) {
			addCriterion("query_id not in", values, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdBetween(Integer value1, Integer value2) {
			addCriterion("query_id between", value1, value2, "queryId");
			return (Criteria) this;
		}

		public Criteria andQueryIdNotBetween(Integer value1, Integer value2) {
			addCriterion("query_id not between", value1, value2, "queryId");
			return (Criteria) this;
		}

		public Criteria andLabelIsNull() {
			addCriterion("label is null");
			return (Criteria) this;
		}

		public Criteria andLabelIsNotNull() {
			addCriterion("label is not null");
			return (Criteria) this;
		}

		public Criteria andLabelEqualTo(String value) {
			addCriterion("label =", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotEqualTo(String value) {
			addCriterion("label <>", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelGreaterThan(String value) {
			addCriterion("label >", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelGreaterThanOrEqualTo(String value) {
			addCriterion("label >=", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLessThan(String value) {
			addCriterion("label <", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLessThanOrEqualTo(String value) {
			addCriterion("label <=", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelLike(String value) {
			addCriterion("label like", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotLike(String value) {
			addCriterion("label not like", value, "label");
			return (Criteria) this;
		}

		public Criteria andLabelIn(List<String> values) {
			addCriterion("label in", values, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotIn(List<String> values) {
			addCriterion("label not in", values, "label");
			return (Criteria) this;
		}

		public Criteria andLabelBetween(String value1, String value2) {
			addCriterion("label between", value1, value2, "label");
			return (Criteria) this;
		}

		public Criteria andLabelNotBetween(String value1, String value2) {
			addCriterion("label not between", value1, value2, "label");
			return (Criteria) this;
		}

		public Criteria andDownsampleIsNull() {
			addCriterion("downsample is null");
			return (Criteria) this;
		}

		public Criteria andDownsampleIsNotNull() {
			addCriterion("downsample is not null");
			return (Criteria) this;
		}

		public Criteria andDownsampleEqualTo(String value) {
			addCriterion("downsample =", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleNotEqualTo(String value) {
			addCriterion("downsample <>", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleGreaterThan(String value) {
			addCriterion("downsample >", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleGreaterThanOrEqualTo(String value) {
			addCriterion("downsample >=", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleLessThan(String value) {
			addCriterion("downsample <", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleLessThanOrEqualTo(String value) {
			addCriterion("downsample <=", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleLike(String value) {
			addCriterion("downsample like", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleNotLike(String value) {
			addCriterion("downsample not like", value, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleIn(List<String> values) {
			addCriterion("downsample in", values, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleNotIn(List<String> values) {
			addCriterion("downsample not in", values, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleBetween(String value1, String value2) {
			addCriterion("downsample between", value1, value2, "downsample");
			return (Criteria) this;
		}

		public Criteria andDownsampleNotBetween(String value1, String value2) {
			addCriterion("downsample not between", value1, value2, "downsample");
			return (Criteria) this;
		}

		public Criteria andAggregationIsNull() {
			addCriterion("aggregation is null");
			return (Criteria) this;
		}

		public Criteria andAggregationIsNotNull() {
			addCriterion("aggregation is not null");
			return (Criteria) this;
		}

		public Criteria andAggregationEqualTo(String value) {
			addCriterion("aggregation =", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationNotEqualTo(String value) {
			addCriterion("aggregation <>", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationGreaterThan(String value) {
			addCriterion("aggregation >", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationGreaterThanOrEqualTo(String value) {
			addCriterion("aggregation >=", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationLessThan(String value) {
			addCriterion("aggregation <", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationLessThanOrEqualTo(String value) {
			addCriterion("aggregation <=", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationLike(String value) {
			addCriterion("aggregation like", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationNotLike(String value) {
			addCriterion("aggregation not like", value, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationIn(List<String> values) {
			addCriterion("aggregation in", values, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationNotIn(List<String> values) {
			addCriterion("aggregation not in", values, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationBetween(String value1, String value2) {
			addCriterion("aggregation between", value1, value2, "aggregation");
			return (Criteria) this;
		}

		public Criteria andAggregationNotBetween(String value1, String value2) {
			addCriterion("aggregation not between", value1, value2, "aggregation");
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

		public Criteria andCreateTimeEqualTo(LocalDateTime value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(LocalDateTime value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<LocalDateTime> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
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

		public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
			addCriterion("update_time =", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
			addCriterion("update_time <>", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
			addCriterion("update_time >", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("update_time >=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThan(LocalDateTime value) {
			addCriterion("update_time <", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("update_time <=", value, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
			addCriterion("update_time in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
			addCriterion("update_time not in", values, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("update_time between", value1, value2, "updateTime");
			return (Criteria) this;
		}

		public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
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

		public Criteria andLabelLikeInsensitive(String value) {
			addCriterion("upper(label) like", value.toUpperCase(), "label");
			return (Criteria) this;
		}

		public Criteria andDownsampleLikeInsensitive(String value) {
			addCriterion("upper(downsample) like", value.toUpperCase(), "downsample");
			return (Criteria) this;
		}

		public Criteria andAggregationLikeInsensitive(String value) {
			addCriterion("upper(aggregation) like", value.toUpperCase(), "aggregation");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table downsample_group
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
     * This class corresponds to the database table downsample_group
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}