package fiddler.dao.generated;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
@Table(name = "tag_format", schema = "public", catalog = "indoc")
public class TagFormat {
    private int id;
    private Integer localeId;
    private String name;
    private String dataType;
    private String mimeType;
    private String optionList;
    private String defaultStringValue;
    private Integer defaultIntegerValue;
    private String defaultBooleanValue;
    private BigInteger defaultNumericValue;
    private String defaultTextValue;
    private String defaultDateTimeValue;
    private String displayFormat;
    private Integer maxTextLength;
    private Integer maxInteger;
    private Integer minInteger;
    private BigInteger maxNumericValue;
    private BigInteger minNumericValue;
    private String formatList;
    private byte[] defaultBlobValue;
    private String regexPattern;
    private String forceCaps;
    private Boolean isPrivate;
    private Integer owningOrganisationId;
    private int creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private Integer roundingMode;
    private Integer scale;
    private BigInteger incrementalValue;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "locale_id")
    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "data_type")
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Basic
    @Column(name = "mime_type")
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    @Basic
    @Column(name = "option_list")
    public String getOptionList() {
        return optionList;
    }

    public void setOptionList(String optionList) {
        this.optionList = optionList;
    }

    @Basic
    @Column(name = "default_string_value")
    public String getDefaultStringValue() {
        return defaultStringValue;
    }

    public void setDefaultStringValue(String defaultStringValue) {
        this.defaultStringValue = defaultStringValue;
    }

    @Basic
    @Column(name = "default_integer_value")
    public Integer getDefaultIntegerValue() {
        return defaultIntegerValue;
    }

    public void setDefaultIntegerValue(Integer defaultIntegerValue) {
        this.defaultIntegerValue = defaultIntegerValue;
    }

    @Basic
    @Column(name = "default_boolean_value")
    public String getDefaultBooleanValue() {
        return defaultBooleanValue;
    }

    public void setDefaultBooleanValue(String defaultBooleanValue) {
        this.defaultBooleanValue = defaultBooleanValue;
    }

    @Basic
    @Column(name = "default_numeric_value")
    public java.math.BigInteger getDefaultNumericValue() {
        return defaultNumericValue;
    }

    public void setDefaultNumericValue(java.math.BigInteger defaultNumericValue) {
        this.defaultNumericValue = defaultNumericValue;
    }

    @Basic
    @Column(name = "default_text_value")
    public String getDefaultTextValue() {
        return defaultTextValue;
    }

    public void setDefaultTextValue(String defaultTextValue) {
        this.defaultTextValue = defaultTextValue;
    }

    @Basic
    @Column(name = "default_date_time_value")
    public String getDefaultDateTimeValue() {
        return defaultDateTimeValue;
    }

    public void setDefaultDateTimeValue(String defaultDateTimeValue) {
        this.defaultDateTimeValue = defaultDateTimeValue;
    }

    @Basic
    @Column(name = "display_format")
    public String getDisplayFormat() {
        return displayFormat;
    }

    public void setDisplayFormat(String displayFormat) {
        this.displayFormat = displayFormat;
    }

    @Basic
    @Column(name = "max_text_length")
    public Integer getMaxTextLength() {
        return maxTextLength;
    }

    public void setMaxTextLength(Integer maxTextLength) {
        this.maxTextLength = maxTextLength;
    }

    @Basic
    @Column(name = "max_integer")
    public Integer getMaxInteger() {
        return maxInteger;
    }

    public void setMaxInteger(Integer maxInteger) {
        this.maxInteger = maxInteger;
    }

    @Basic
    @Column(name = "min_integer")
    public Integer getMinInteger() {
        return minInteger;
    }

    public void setMinInteger(Integer minInteger) {
        this.minInteger = minInteger;
    }

    @Basic
    @Column(name = "max_numeric_value")
    public java.math.BigInteger getMaxNumericValue() {
        return maxNumericValue;
    }

    public void setMaxNumericValue(java.math.BigInteger maxNumericValue) {
        this.maxNumericValue = maxNumericValue;
    }

    @Basic
    @Column(name = "min_numeric_value")
    public java.math.BigInteger getMinNumericValue() {
        return minNumericValue;
    }

    public void setMinNumericValue(java.math.BigInteger minNumericValue) {
        this.minNumericValue = minNumericValue;
    }

    @Basic
    @Column(name = "format_list")
    public String getFormatList() {
        return formatList;
    }

    public void setFormatList(String formatList) {
        this.formatList = formatList;
    }

    @Basic
    @Column(name = "default_blob_value")
    public byte[] getDefaultBlobValue() {
        return defaultBlobValue;
    }

    public void setDefaultBlobValue(byte[] defaultBlobValue) {
        this.defaultBlobValue = defaultBlobValue;
    }

    @Basic
    @Column(name = "regex_pattern")
    public String getRegexPattern() {
        return regexPattern;
    }

    public void setRegexPattern(String regexPattern) {
        this.regexPattern = regexPattern;
    }

    @Basic
    @Column(name = "force_caps")
    public String getForceCaps() {
        return forceCaps;
    }

    public void setForceCaps(String forceCaps) {
        this.forceCaps = forceCaps;
    }

    @Basic
    @Column(name = "private")
    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    @Basic
    @Column(name = "owning_organisation_id")
    public Integer getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(Integer owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
    }

    @Basic
    @Column(name = "creatorid")
    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
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

    @Basic
    @Column(name = "rounding_mode")
    public Integer getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(Integer roundingMode) {
        this.roundingMode = roundingMode;
    }

    @Basic
    @Column(name = "scale")
    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @Basic
    @Column(name = "incremental_value")
    public java.math.BigInteger getIncrementalValue() {
        return incrementalValue;
    }

    public void setIncrementalValue(java.math.BigInteger incrementalValue) {
        this.incrementalValue = incrementalValue;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TagFormat tagFormat = (TagFormat) object;

        if (id != tagFormat.id) return false;
        if (creatorid != tagFormat.creatorid) return false;
        if (localeId != null ? !localeId.equals(tagFormat.localeId) : tagFormat.localeId != null) return false;
        if (name != null ? !name.equals(tagFormat.name) : tagFormat.name != null) return false;
        if (dataType != null ? !dataType.equals(tagFormat.dataType) : tagFormat.dataType != null) return false;
        if (mimeType != null ? !mimeType.equals(tagFormat.mimeType) : tagFormat.mimeType != null) return false;
        if (optionList != null ? !optionList.equals(tagFormat.optionList) : tagFormat.optionList != null) return false;
        if (defaultStringValue != null ? !defaultStringValue.equals(tagFormat.defaultStringValue) : tagFormat.defaultStringValue != null) return false;
        if (defaultIntegerValue != null ? !defaultIntegerValue.equals(tagFormat.defaultIntegerValue) : tagFormat.defaultIntegerValue != null) return false;
        if (defaultBooleanValue != null ? !defaultBooleanValue.equals(tagFormat.defaultBooleanValue) : tagFormat.defaultBooleanValue != null) return false;
        if (defaultNumericValue != null ? !defaultNumericValue.equals(tagFormat.defaultNumericValue) : tagFormat.defaultNumericValue != null) return false;
        if (defaultTextValue != null ? !defaultTextValue.equals(tagFormat.defaultTextValue) : tagFormat.defaultTextValue != null) return false;
        if (defaultDateTimeValue != null ? !defaultDateTimeValue.equals(tagFormat.defaultDateTimeValue) : tagFormat.defaultDateTimeValue != null) return false;
        if (displayFormat != null ? !displayFormat.equals(tagFormat.displayFormat) : tagFormat.displayFormat != null) return false;
        if (maxTextLength != null ? !maxTextLength.equals(tagFormat.maxTextLength) : tagFormat.maxTextLength != null) return false;
        if (maxInteger != null ? !maxInteger.equals(tagFormat.maxInteger) : tagFormat.maxInteger != null) return false;
        if (minInteger != null ? !minInteger.equals(tagFormat.minInteger) : tagFormat.minInteger != null) return false;
        if (maxNumericValue != null ? !maxNumericValue.equals(tagFormat.maxNumericValue) : tagFormat.maxNumericValue != null) return false;
        if (minNumericValue != null ? !minNumericValue.equals(tagFormat.minNumericValue) : tagFormat.minNumericValue != null) return false;
        if (formatList != null ? !formatList.equals(tagFormat.formatList) : tagFormat.formatList != null) return false;
        if (!java.util.Arrays.equals(defaultBlobValue, tagFormat.defaultBlobValue)) return false;
        if (regexPattern != null ? !regexPattern.equals(tagFormat.regexPattern) : tagFormat.regexPattern != null) return false;
        if (forceCaps != null ? !forceCaps.equals(tagFormat.forceCaps) : tagFormat.forceCaps != null) return false;
        if (isPrivate != null ? !isPrivate.equals(tagFormat.isPrivate) : tagFormat.isPrivate != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(tagFormat.owningOrganisationId) : tagFormat.owningOrganisationId != null) return false;
        if (createdts != null ? !createdts.equals(tagFormat.createdts) : tagFormat.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(tagFormat.modifiedts) : tagFormat.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(tagFormat.modifierid) : tagFormat.modifierid != null) return false;
        if (roundingMode != null ? !roundingMode.equals(tagFormat.roundingMode) : tagFormat.roundingMode != null) return false;
        if (scale != null ? !scale.equals(tagFormat.scale) : tagFormat.scale != null) return false;
        if (incrementalValue != null ? !incrementalValue.equals(tagFormat.incrementalValue) : tagFormat.incrementalValue != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (localeId != null ? localeId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dataType != null ? dataType.hashCode() : 0);
        result = 31 * result + (mimeType != null ? mimeType.hashCode() : 0);
        result = 31 * result + (optionList != null ? optionList.hashCode() : 0);
        result = 31 * result + (defaultStringValue != null ? defaultStringValue.hashCode() : 0);
        result = 31 * result + (defaultIntegerValue != null ? defaultIntegerValue.hashCode() : 0);
        result = 31 * result + (defaultBooleanValue != null ? defaultBooleanValue.hashCode() : 0);
        result = 31 * result + (defaultNumericValue != null ? defaultNumericValue.hashCode() : 0);
        result = 31 * result + (defaultTextValue != null ? defaultTextValue.hashCode() : 0);
        result = 31 * result + (defaultDateTimeValue != null ? defaultDateTimeValue.hashCode() : 0);
        result = 31 * result + (displayFormat != null ? displayFormat.hashCode() : 0);
        result = 31 * result + (maxTextLength != null ? maxTextLength.hashCode() : 0);
        result = 31 * result + (maxInteger != null ? maxInteger.hashCode() : 0);
        result = 31 * result + (minInteger != null ? minInteger.hashCode() : 0);
        result = 31 * result + (maxNumericValue != null ? maxNumericValue.hashCode() : 0);
        result = 31 * result + (minNumericValue != null ? minNumericValue.hashCode() : 0);
        result = 31 * result + (formatList != null ? formatList.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(defaultBlobValue);
        result = 31 * result + (regexPattern != null ? regexPattern.hashCode() : 0);
        result = 31 * result + (forceCaps != null ? forceCaps.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (roundingMode != null ? roundingMode.hashCode() : 0);
        result = 31 * result + (scale != null ? scale.hashCode() : 0);
        result = 31 * result + (incrementalValue != null ? incrementalValue.hashCode() : 0);
        return result;
    }
}
