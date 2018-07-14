package edu.pitt.medschool.model.dto;

public class DownsampleGroupColumn {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column downsample_group_column.id
     * @mbg.generated
     */
    private Integer id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column downsample_group_column.query_group_id
     * @mbg.generated
     */
    private Integer queryGroupId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column downsample_group_column.column_name
     * @mbg.generated
     */
    private String columnName;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column downsample_group_column.id
     * @return  the value of downsample_group_column.id
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column downsample_group_column.id
     * @param id  the value for downsample_group_column.id
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column downsample_group_column.query_group_id
     * @return  the value of downsample_group_column.query_group_id
     * @mbg.generated
     */
    public Integer getQueryGroupId() {
        return queryGroupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column downsample_group_column.query_group_id
     * @param queryGroupId  the value for downsample_group_column.query_group_id
     * @mbg.generated
     */
    public void setQueryGroupId(Integer queryGroupId) {
        this.queryGroupId = queryGroupId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column downsample_group_column.column_name
     * @return  the value of downsample_group_column.column_name
     * @mbg.generated
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column downsample_group_column.column_name
     * @param columnName  the value for downsample_group_column.column_name
     * @mbg.generated
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group_column
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
        DownsampleGroupColumn other = (DownsampleGroupColumn) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getQueryGroupId() == null ? other.getQueryGroupId() == null : this.getQueryGroupId().equals(other.getQueryGroupId()))
                && (this.getColumnName() == null ? other.getColumnName() == null : this.getColumnName().equals(other.getColumnName()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table downsample_group_column
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQueryGroupId() == null) ? 0 : getQueryGroupId().hashCode());
        result = prime * result + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        return result;
    }
}