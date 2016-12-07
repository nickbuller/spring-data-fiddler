package fiddler.dao.generated;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "tag_data", schema = "public", catalog = "indoc")
public class TagData {
    private int id;
    private Boolean isShared;
    private Integer integerValue;
    private BigInteger numericValue;
    private String stringValue;
    private LocalDateTime dateTimeValue;
    private Boolean booleanValue;
    private String longStringValue;
    private Integer creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "is_shared")
    public Boolean getShared() {
        return isShared;
    }

    public void setShared(Boolean shared) {
        isShared = shared;
    }

    @Basic
    @Column(name = "integer_value")
    public Integer getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    @Basic
    @Column(name = "numeric_value")
    public java.math.BigInteger getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(java.math.BigInteger numericValue) {
        this.numericValue = numericValue;
    }

    @Basic
    @Column(name = "string_value")
    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Basic
    @Column(name = "date_time_value")
    public LocalDateTime getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(LocalDateTime dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }

    @Basic
    @Column(name = "boolean_value")
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    @Basic
    @Column(name = "long_string_value")
    public String getLongStringValue() {
        return longStringValue;
    }

    public void setLongStringValue(String longStringValue) {
        this.longStringValue = longStringValue;
    }

    @Basic
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    @Basic
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TagData tagData = (TagData) object;

        if (id != tagData.id) return false;
        if (isShared != null ? !isShared.equals(tagData.isShared) : tagData.isShared != null) return false;
        if (integerValue != null ? !integerValue.equals(tagData.integerValue) : tagData.integerValue != null) return false;
        if (numericValue != null ? !numericValue.equals(tagData.numericValue) : tagData.numericValue != null) return false;
        if (stringValue != null ? !stringValue.equals(tagData.stringValue) : tagData.stringValue != null) return false;
        if (dateTimeValue != null ? !dateTimeValue.equals(tagData.dateTimeValue) : tagData.dateTimeValue != null) return false;
        if (booleanValue != null ? !booleanValue.equals(tagData.booleanValue) : tagData.booleanValue != null) return false;
        if (longStringValue != null ? !longStringValue.equals(tagData.longStringValue) : tagData.longStringValue != null) return false;
        if (creatorid != null ? !creatorid.equals(tagData.creatorid) : tagData.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(tagData.createdts) : tagData.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(tagData.modifiedts) : tagData.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(tagData.modifierid) : tagData.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (isShared != null ? isShared.hashCode() : 0);
        result = 31 * result + (integerValue != null ? integerValue.hashCode() : 0);
        result = 31 * result + (numericValue != null ? numericValue.hashCode() : 0);
        result = 31 * result + (stringValue != null ? stringValue.hashCode() : 0);
        result = 31 * result + (dateTimeValue != null ? dateTimeValue.hashCode() : 0);
        result = 31 * result + (booleanValue != null ? booleanValue.hashCode() : 0);
        result = 31 * result + (longStringValue != null ? longStringValue.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
