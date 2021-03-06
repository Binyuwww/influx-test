package edu.pitt.medschool.model.dto;

public class Feature extends FeatureKey {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.type
     * @mbg.generated
     */
    private String type;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.electrode
     * @mbg.generated
     */
    private String electrode;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.freq_low
     * @mbg.generated
     */
    private Double freqLow;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.freq_high
     * @mbg.generated
     */
    private Double freqHigh;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.brain_location
     * @mbg.generated
     */
    private String brainLocation;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.notes
     * @mbg.generated
     */
    private String notes;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.csv_name
     * @mbg.generated
     */
    private String csvName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column upmc..feature.csv_id
     * @mbg.generated
     */
    private Integer csvId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.type
     * @return  the value of upmc..feature.type
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.type
     * @param type  the value for upmc..feature.type
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.electrode
     * @return  the value of upmc..feature.electrode
     * @mbg.generated
     */
    public String getElectrode() {
        return electrode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.electrode
     * @param electrode  the value for upmc..feature.electrode
     * @mbg.generated
     */
    public void setElectrode(String electrode) {
        this.electrode = electrode == null ? null : electrode.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.freq_low
     * @return  the value of upmc..feature.freq_low
     * @mbg.generated
     */
    public Double getFreqLow() {
        return freqLow;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.freq_low
     * @param freqLow  the value for upmc..feature.freq_low
     * @mbg.generated
     */
    public void setFreqLow(Double freqLow) {
        this.freqLow = freqLow;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.freq_high
     * @return  the value of upmc..feature.freq_high
     * @mbg.generated
     */
    public Double getFreqHigh() {
        return freqHigh;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.freq_high
     * @param freqHigh  the value for upmc..feature.freq_high
     * @mbg.generated
     */
    public void setFreqHigh(Double freqHigh) {
        this.freqHigh = freqHigh;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.brain_location
     * @return  the value of upmc..feature.brain_location
     * @mbg.generated
     */
    public String getBrainLocation() {
        return brainLocation;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.brain_location
     * @param brainLocation  the value for upmc..feature.brain_location
     * @mbg.generated
     */
    public void setBrainLocation(String brainLocation) {
        this.brainLocation = brainLocation == null ? null : brainLocation.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.notes
     * @return  the value of upmc..feature.notes
     * @mbg.generated
     */
    public String getNotes() {
        return notes;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.notes
     * @param notes  the value for upmc..feature.notes
     * @mbg.generated
     */
    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.csv_name
     * @return  the value of upmc..feature.csv_name
     * @mbg.generated
     */
    public String getCsvName() {
        return csvName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.csv_name
     * @param csvName  the value for upmc..feature.csv_name
     * @mbg.generated
     */
    public void setCsvName(String csvName) {
        this.csvName = csvName == null ? null : csvName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column upmc..feature.csv_id
     * @return  the value of upmc..feature.csv_id
     * @mbg.generated
     */
    public Integer getCsvId() {
        return csvId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column upmc..feature.csv_id
     * @param csvId  the value for upmc..feature.csv_id
     * @mbg.generated
     */
    public void setCsvId(Integer csvId) {
        this.csvId = csvId;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
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
        Feature other = (Feature) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
                && (this.getSidCount() == null ? other.getSidCount() == null : this.getSidCount().equals(other.getSidCount()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getElectrode() == null ? other.getElectrode() == null
                        : this.getElectrode().equals(other.getElectrode()))
                && (this.getFreqLow() == null ? other.getFreqLow() == null : this.getFreqLow().equals(other.getFreqLow()))
                && (this.getFreqHigh() == null ? other.getFreqHigh() == null : this.getFreqHigh().equals(other.getFreqHigh()))
                && (this.getBrainLocation() == null ? other.getBrainLocation() == null
                        : this.getBrainLocation().equals(other.getBrainLocation()))
                && (this.getNotes() == null ? other.getNotes() == null : this.getNotes().equals(other.getNotes()))
                && (this.getCsvName() == null ? other.getCsvName() == null : this.getCsvName().equals(other.getCsvName()))
                && (this.getCsvId() == null ? other.getCsvId() == null : this.getCsvId().equals(other.getCsvId()));
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table upmc..feature
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSidCount() == null) ? 0 : getSidCount().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getElectrode() == null) ? 0 : getElectrode().hashCode());
        result = prime * result + ((getFreqLow() == null) ? 0 : getFreqLow().hashCode());
        result = prime * result + ((getFreqHigh() == null) ? 0 : getFreqHigh().hashCode());
        result = prime * result + ((getBrainLocation() == null) ? 0 : getBrainLocation().hashCode());
        result = prime * result + ((getNotes() == null) ? 0 : getNotes().hashCode());
        result = prime * result + ((getCsvName() == null) ? 0 : getCsvName().hashCode());
        result = prime * result + ((getCsvId() == null) ? 0 : getCsvId().hashCode());
        return result;
    }
}