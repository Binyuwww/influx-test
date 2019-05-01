package edu.pitt.medschool.model.dto;

import java.util.Date;
import java.time.LocalDateTime;

public class MedicalDownsampleGroup {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.query_id
	 * @mbg.generated
	 */
	private Integer queryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.label
	 * @mbg.generated
	 */
	private String label;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.downsample
	 * @mbg.generated
	 */
	private String downsample;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.aggregation
	 * @mbg.generated
	 */
	private String aggregation;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.create_time
	 * @mbg.generated
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.update_time
	 * @mbg.generated
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.deleted
	 * @mbg.generated
	 */
	private Boolean deleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column medical_downsample_group.columns
	 * @mbg.generated
	 */
	private String columns;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.id
	 * @return  the value of medical_downsample_group.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.id
	 * @param id  the value for medical_downsample_group.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.query_id
	 * @return  the value of medical_downsample_group.query_id
	 * @mbg.generated
	 */
	public Integer getQueryId() {
		return queryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.query_id
	 * @param queryId  the value for medical_downsample_group.query_id
	 * @mbg.generated
	 */
	public void setQueryId(Integer queryId) {
		this.queryId = queryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.label
	 * @return  the value of medical_downsample_group.label
	 * @mbg.generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.label
	 * @param label  the value for medical_downsample_group.label
	 * @mbg.generated
	 */
	public void setLabel(String label) {
		this.label = label == null ? null : label.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.downsample
	 * @return  the value of medical_downsample_group.downsample
	 * @mbg.generated
	 */
	public String getDownsample() {
		return downsample;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.downsample
	 * @param downsample  the value for medical_downsample_group.downsample
	 * @mbg.generated
	 */
	public void setDownsample(String downsample) {
		this.downsample = downsample == null ? null : downsample.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.aggregation
	 * @return  the value of medical_downsample_group.aggregation
	 * @mbg.generated
	 */
	public String getAggregation() {
		return aggregation;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.aggregation
	 * @param aggregation  the value for medical_downsample_group.aggregation
	 * @mbg.generated
	 */
	public void setAggregation(String aggregation) {
		this.aggregation = aggregation == null ? null : aggregation.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.create_time
	 * @return  the value of medical_downsample_group.create_time
	 * @mbg.generated
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.create_time
	 * @param createTime  the value for medical_downsample_group.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.update_time
	 * @return  the value of medical_downsample_group.update_time
	 * @mbg.generated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.update_time
	 * @param updateTime  the value for medical_downsample_group.update_time
	 * @mbg.generated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.deleted
	 * @return  the value of medical_downsample_group.deleted
	 * @mbg.generated
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.deleted
	 * @param deleted  the value for medical_downsample_group.deleted
	 * @mbg.generated
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column medical_downsample_group.columns
	 * @return  the value of medical_downsample_group.columns
	 * @mbg.generated
	 */
	public String getColumns() {
		return columns;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column medical_downsample_group.columns
	 * @param columns  the value for medical_downsample_group.columns
	 * @mbg.generated
	 */
	public void setColumns(String columns) {
		this.columns = columns == null ? null : columns.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample_group
	 * @mbg.generated
	 */
	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		MedicalDownsampleGroup other = (MedicalDownsampleGroup) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getQueryId() == null ? other.getQueryId() == null
						: this.getQueryId().equals(other.getQueryId()))
				&& (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
				&& (this.getDownsample() == null ? other.getDownsample() == null
						: this.getDownsample().equals(other.getDownsample()))
				&& (this.getAggregation() == null ? other.getAggregation() == null
						: this.getAggregation().equals(other.getAggregation()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getUpdateTime() == null ? other.getUpdateTime() == null
						: this.getUpdateTime().equals(other.getUpdateTime()))
				&& (this.getDeleted() == null ? other.getDeleted() == null
						: this.getDeleted().equals(other.getDeleted()))
				&& (this.getColumns() == null ? other.getColumns() == null
						: this.getColumns().equals(other.getColumns()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table medical_downsample_group
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getQueryId() == null) ? 0 : getQueryId().hashCode());
		result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
		result = prime * result + ((getDownsample() == null) ? 0 : getDownsample().hashCode());
		result = prime * result + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
		result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
		result = prime * result + ((getColumns() == null) ? 0 : getColumns().hashCode());
		return result;
	}
}