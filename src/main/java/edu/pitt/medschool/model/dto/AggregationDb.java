package edu.pitt.medschool.model.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class AggregationDb {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.version
	 * @mbg.generated
	 */
	private Integer version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.create_time
	 * @mbg.generated
	 */
	private LocalDateTime createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.status
	 * @mbg.generated
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.total
	 * @mbg.generated
	 */
	private Integer total;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.finished
	 * @mbg.generated
	 */
	private Integer finished;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.arType
	 * @mbg.generated
	 */
	private Boolean artype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.time_cost
	 * @mbg.generated
	 */
	private String timeCost;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.nday
	 * @mbg.generated
	 */
	private Integer nday;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aggregation_db.pid_list
	 * @mbg.generated
	 */
	private String pidList;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.id
	 * @return  the value of aggregation_db.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.id
	 * @param id  the value for aggregation_db.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.version
	 * @return  the value of aggregation_db.version
	 * @mbg.generated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.version
	 * @param version  the value for aggregation_db.version
	 * @mbg.generated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.create_time
	 * @return  the value of aggregation_db.create_time
	 * @mbg.generated
	 */
	public LocalDateTime getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.create_time
	 * @param localDateTime  the value for aggregation_db.create_time
	 * @mbg.generated
	 */
	public void setCreateTime(LocalDateTime localDateTime) {
		this.createTime = localDateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.status
	 * @return  the value of aggregation_db.status
	 * @mbg.generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.status
	 * @param status  the value for aggregation_db.status
	 * @mbg.generated
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.total
	 * @return  the value of aggregation_db.total
	 * @mbg.generated
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.total
	 * @param total  the value for aggregation_db.total
	 * @mbg.generated
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.finished
	 * @return  the value of aggregation_db.finished
	 * @mbg.generated
	 */
	public Integer getFinished() {
		return finished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.finished
	 * @param finished  the value for aggregation_db.finished
	 * @mbg.generated
	 */
	public void setFinished(Integer finished) {
		this.finished = finished;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.arType
	 * @return  the value of aggregation_db.arType
	 * @mbg.generated
	 */
	public Boolean getArtype() {
		return artype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.arType
	 * @param artype  the value for aggregation_db.arType
	 * @mbg.generated
	 */
	public void setArtype(Boolean artype) {
		this.artype = artype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.time_cost
	 * @return  the value of aggregation_db.time_cost
	 * @mbg.generated
	 */
	public String getTimeCost() {
		return timeCost;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.time_cost
	 * @param timeCost  the value for aggregation_db.time_cost
	 * @mbg.generated
	 */
	public void setTimeCost(String timeCost) {
		this.timeCost = timeCost == null ? null : timeCost.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.nday
	 * @return  the value of aggregation_db.nday
	 * @mbg.generated
	 */
	public Integer getNday() {
		return nday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.nday
	 * @param nday  the value for aggregation_db.nday
	 * @mbg.generated
	 */
	public void setNday(Integer nday) {
		this.nday = nday;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aggregation_db.pid_list
	 * @return  the value of aggregation_db.pid_list
	 * @mbg.generated
	 */
	public String getPidList() {
		return pidList;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aggregation_db.pid_list
	 * @param pidList  the value for aggregation_db.pid_list
	 * @mbg.generated
	 */
	public void setPidList(String pidList) {
		this.pidList = pidList == null ? null : pidList.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_db
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
		AggregationDb other = (AggregationDb) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getVersion() == null ? other.getVersion() == null
						: this.getVersion().equals(other.getVersion()))
				&& (this.getCreateTime() == null ? other.getCreateTime() == null
						: this.getCreateTime().equals(other.getCreateTime()))
				&& (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
				&& (this.getTotal() == null ? other.getTotal() == null : this.getTotal().equals(other.getTotal()))
				&& (this.getFinished() == null ? other.getFinished() == null
						: this.getFinished().equals(other.getFinished()))
				&& (this.getArtype() == null ? other.getArtype() == null : this.getArtype().equals(other.getArtype()))
				&& (this.getTimeCost() == null ? other.getTimeCost() == null
						: this.getTimeCost().equals(other.getTimeCost()))
				&& (this.getNday() == null ? other.getNday() == null : this.getNday().equals(other.getNday()))
				&& (this.getPidList() == null ? other.getPidList() == null
						: this.getPidList().equals(other.getPidList()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aggregation_db
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
		result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getTotal() == null) ? 0 : getTotal().hashCode());
		result = prime * result + ((getFinished() == null) ? 0 : getFinished().hashCode());
		result = prime * result + ((getArtype() == null) ? 0 : getArtype().hashCode());
		result = prime * result + ((getTimeCost() == null) ? 0 : getTimeCost().hashCode());
		result = prime * result + ((getNday() == null) ? 0 : getNday().hashCode());
		result = prime * result + ((getPidList() == null) ? 0 : getPidList().hashCode());
		return result;
	}
}