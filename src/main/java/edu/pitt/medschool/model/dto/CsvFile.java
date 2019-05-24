package edu.pitt.medschool.model.dto;

import java.time.LocalDateTime;

public class CsvFile {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.pid
	 * @mbg.generated
	 */
	private String pid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.filename
	 * @mbg.generated
	 */
	private String filename;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.start_time
	 * @mbg.generated
	 */
	private LocalDateTime startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.end_time
	 * @mbg.generated
	 */
	private LocalDateTime endTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.length
	 * @mbg.generated
	 */
	private Integer length;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.density
	 * @mbg.generated
	 */
	private Double density;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.machine
	 * @mbg.generated
	 */
	private String machine;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.ar
	 * @mbg.generated
	 */
	private Boolean ar;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.path
	 * @mbg.generated
	 */
	private String path;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.size
	 * @mbg.generated
	 */
	private Long size;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.uuid
	 * @mbg.generated
	 */
	private String uuid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.header_time
	 * @mbg.generated
	 */
	private LocalDateTime headerTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.deleted
	 * @mbg.generated
	 */
	private Boolean deleted;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.delete_time
	 * @mbg.generated
	 */
	private LocalDateTime deleteTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.conflict_resolved
	 * @mbg.generated
	 */
	private Boolean conflictResolved;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.status
	 * @mbg.generated
	 */
	private Boolean status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..csv_file.comment
	 * @mbg.generated
	 */
	private String comment;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.id
	 * @return  the value of upmc..csv_file.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.id
	 * @param id  the value for upmc..csv_file.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.pid
	 * @return  the value of upmc..csv_file.pid
	 * @mbg.generated
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.pid
	 * @param pid  the value for upmc..csv_file.pid
	 * @mbg.generated
	 */
	public void setPid(String pid) {
		this.pid = pid == null ? null : pid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.filename
	 * @return  the value of upmc..csv_file.filename
	 * @mbg.generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.filename
	 * @param filename  the value for upmc..csv_file.filename
	 * @mbg.generated
	 */
	public void setFilename(String filename) {
		this.filename = filename == null ? null : filename.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.start_time
	 * @return  the value of upmc..csv_file.start_time
	 * @mbg.generated
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.start_time
	 * @param startTime  the value for upmc..csv_file.start_time
	 * @mbg.generated
	 */
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.end_time
	 * @return  the value of upmc..csv_file.end_time
	 * @mbg.generated
	 */
	public LocalDateTime getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.end_time
	 * @param endTime  the value for upmc..csv_file.end_time
	 * @mbg.generated
	 */
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.length
	 * @return  the value of upmc..csv_file.length
	 * @mbg.generated
	 */
	public Integer getLength() {
		return length;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.length
	 * @param length  the value for upmc..csv_file.length
	 * @mbg.generated
	 */
	public void setLength(Integer length) {
		this.length = length;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.density
	 * @return  the value of upmc..csv_file.density
	 * @mbg.generated
	 */
	public Double getDensity() {
		return density;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.density
	 * @param density  the value for upmc..csv_file.density
	 * @mbg.generated
	 */
	public void setDensity(Double density) {
		this.density = density;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.machine
	 * @return  the value of upmc..csv_file.machine
	 * @mbg.generated
	 */
	public String getMachine() {
		return machine;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.machine
	 * @param machine  the value for upmc..csv_file.machine
	 * @mbg.generated
	 */
	public void setMachine(String machine) {
		this.machine = machine == null ? null : machine.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.ar
	 * @return  the value of upmc..csv_file.ar
	 * @mbg.generated
	 */
	public Boolean getAr() {
		return ar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.ar
	 * @param ar  the value for upmc..csv_file.ar
	 * @mbg.generated
	 */
	public void setAr(Boolean ar) {
		this.ar = ar;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.path
	 * @return  the value of upmc..csv_file.path
	 * @mbg.generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.path
	 * @param path  the value for upmc..csv_file.path
	 * @mbg.generated
	 */
	public void setPath(String path) {
		this.path = path == null ? null : path.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.size
	 * @return  the value of upmc..csv_file.size
	 * @mbg.generated
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.size
	 * @param size  the value for upmc..csv_file.size
	 * @mbg.generated
	 */
	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.uuid
	 * @return  the value of upmc..csv_file.uuid
	 * @mbg.generated
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.uuid
	 * @param uuid  the value for upmc..csv_file.uuid
	 * @mbg.generated
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid == null ? null : uuid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.header_time
	 * @return  the value of upmc..csv_file.header_time
	 * @mbg.generated
	 */
	public LocalDateTime getHeaderTime() {
		return headerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.header_time
	 * @param headerTime  the value for upmc..csv_file.header_time
	 * @mbg.generated
	 */
	public void setHeaderTime(LocalDateTime headerTime) {
		this.headerTime = headerTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.deleted
	 * @return  the value of upmc..csv_file.deleted
	 * @mbg.generated
	 */
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.deleted
	 * @param deleted  the value for upmc..csv_file.deleted
	 * @mbg.generated
	 */
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.delete_time
	 * @return  the value of upmc..csv_file.delete_time
	 * @mbg.generated
	 */
	public LocalDateTime getDeleteTime() {
		return deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.delete_time
	 * @param deleteTime  the value for upmc..csv_file.delete_time
	 * @mbg.generated
	 */
	public void setDeleteTime(LocalDateTime deleteTime) {
		this.deleteTime = deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.conflict_resolved
	 * @return  the value of upmc..csv_file.conflict_resolved
	 * @mbg.generated
	 */
	public Boolean getConflictResolved() {
		return conflictResolved;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.conflict_resolved
	 * @param conflictResolved  the value for upmc..csv_file.conflict_resolved
	 * @mbg.generated
	 */
	public void setConflictResolved(Boolean conflictResolved) {
		this.conflictResolved = conflictResolved;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.status
	 * @return  the value of upmc..csv_file.status
	 * @mbg.generated
	 */
	public Boolean getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.status
	 * @param status  the value for upmc..csv_file.status
	 * @mbg.generated
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..csv_file.comment
	 * @return  the value of upmc..csv_file.comment
	 * @mbg.generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..csv_file.comment
	 * @param comment  the value for upmc..csv_file.comment
	 * @mbg.generated
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
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
		CsvFile other = (CsvFile) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
				&& (this.getFilename() == null ? other.getFilename() == null
						: this.getFilename().equals(other.getFilename()))
				&& (this.getStartTime() == null ? other.getStartTime() == null
						: this.getStartTime().equals(other.getStartTime()))
				&& (this.getEndTime() == null ? other.getEndTime() == null
						: this.getEndTime().equals(other.getEndTime()))
				&& (this.getLength() == null ? other.getLength() == null : this.getLength().equals(other.getLength()))
				&& (this.getDensity() == null ? other.getDensity() == null
						: this.getDensity().equals(other.getDensity()))
				&& (this.getMachine() == null ? other.getMachine() == null
						: this.getMachine().equals(other.getMachine()))
				&& (this.getAr() == null ? other.getAr() == null : this.getAr().equals(other.getAr()))
				&& (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
				&& (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
				&& (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
				&& (this.getHeaderTime() == null ? other.getHeaderTime() == null
						: this.getHeaderTime().equals(other.getHeaderTime()))
				&& (this.getDeleted() == null ? other.getDeleted() == null
						: this.getDeleted().equals(other.getDeleted()))
				&& (this.getDeleteTime() == null ? other.getDeleteTime() == null
						: this.getDeleteTime().equals(other.getDeleteTime()))
				&& (this.getConflictResolved() == null ? other.getConflictResolved() == null
						: this.getConflictResolved().equals(other.getConflictResolved()))
				&& (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
				&& (this.getComment() == null ? other.getComment() == null
						: this.getComment().equals(other.getComment()));
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..csv_file
	 * @mbg.generated
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
		result = prime * result + ((getFilename() == null) ? 0 : getFilename().hashCode());
		result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
		result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
		result = prime * result + ((getLength() == null) ? 0 : getLength().hashCode());
		result = prime * result + ((getDensity() == null) ? 0 : getDensity().hashCode());
		result = prime * result + ((getMachine() == null) ? 0 : getMachine().hashCode());
		result = prime * result + ((getAr() == null) ? 0 : getAr().hashCode());
		result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
		result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
		result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
		result = prime * result + ((getHeaderTime() == null) ? 0 : getHeaderTime().hashCode());
		result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
		result = prime * result + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
		result = prime * result + ((getConflictResolved() == null) ? 0 : getConflictResolved().hashCode());
		result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
		result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
		return result;
	}
}