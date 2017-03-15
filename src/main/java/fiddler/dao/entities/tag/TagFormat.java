package fiddler.dao.entities.tag;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.entities.Locale;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "tag_format", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class TagFormat {
	private static final Logger LOG = LoggerFactory.getLogger(TagFormat.class);
	@Id
	@SequenceGenerator(name = "tag_format_seq", sequenceName = "tag_format_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_format_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locale_id")
	@Getter
	@Setter
	private Locale locale;

	@Column(name = "name")
	@Getter
	@Setter
	private String name;

	@Column(name = "data_type")
	@Getter
	@Setter
	private String dataType;

	@Column(name = "mime_type")
	@Getter
	@Setter
	private String mimeType;

	@Column(name = "option_list")
	@Getter
	@Setter
	private String optionList;

	@Column(name = "default_string_value")
	@Getter
	@Setter
	private String defaultStringValue;

	@Column(name = "default_integer_value")
	@Getter
	@Setter
	private Integer defaultIntegerValue;

	@Column(name = "default_boolean_value")
	@Getter
	@Setter
	private String defaultBooleanValue;

	@Column(name = "default_numeric_value")
	@Getter
	@Setter
	private BigDecimal defaultNumericValue;

	@Column(name = "default_text_value")
	@Getter
	@Setter
	private String defaultTextValue;

	@Column(name = "default_date_time_value")
	@Getter
	@Setter
	private String defaultDateTimeValue;

	@Column(name = "display_format")
	@Getter
	@Setter
	private String displayFormat;

	@Column(name = "max_text_length")
	@Getter
	@Setter
	private Integer maxTextLength;

	@Column(name = "max_integer")
	@Getter
	@Setter
	private Integer maxInteger;

	@Column(name = "min_integer")
	@Getter
	@Setter
	private Integer minInteger;

	@Column(name = "max_numeric_value")
	@Getter
	@Setter
	private BigDecimal maxNumericValue;

	@Column(name = "min_numeric_value")
	@Getter
	@Setter
	private BigDecimal minNumericValue;

	@Column(name = "format_list")
	@Getter
	@Setter
	private String formatList;

	@Column(name = "default_blob_value")
	@Getter
	@Setter
	private byte[] defaultBlobValue;

	@Column(name = "regex_pattern")
	@Getter
	@Setter
	private String regexPattern;

	@Column(name = "force_caps")
	@Getter
	@Setter
	private String forceCaps;

	@Column(name = "private")
	@Getter
	@Setter
	private Boolean isPrivate;

	@Column(name = "rounding_mode")
	@Getter
	@Setter
	private Integer roundingMode;

	@Column(name = "scale")
	@Getter
	@Setter
	private Integer scale;

	@Column(name = "incremental_value")
	@Getter
	@Setter
	private BigInteger incrementalValue;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityOwner owningOrganisation;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

	public String getFormattedValue(TagData tagData) {
		switch (dataType) {
			case "HTML":
			case "OPTION_LIST":
			case "PASSWORD":
			case "STRING":
			case "TEXT":
			case "BLOB":
				return tagData.getStringValue();
			case "LONG_STRING":
				return tagData.getLongStringValue();
			case "BOOLEAN":
				return tagData.getBooleanValue().toString();
			case "DATE_TIME":
				return formatDateTime(tagData.getDateTimeValue(), displayFormat);
			case "INTEGER":
				return formatInteger(tagData.getIntegerValue(), displayFormat);
			case "NUMERIC":
				return formatNumeric(tagData.getNumericValue(), displayFormat);
		}
		return null;
	}

	private String formatDateTime(LocalDateTime localDateTime, String formatString) {
		if (localDateTime == null) {
			return null;
		} else if (formatString == null) {
			return localDateTime.toString();
		} else {
			return localDateTime.format(DateTimeFormatter.ofPattern(formatString));
		}
	}

	private String formatInteger(Integer integer, String formatString) {
		if (integer == null) {
			return null;
		} else if (formatString == null) {
			return integer.toString();
		} else {
			return new DecimalFormat(displayFormat).format(integer);
		}
	}

	private String formatNumeric(BigDecimal bigDecimal, String formatString) {
		if (bigDecimal == null) {
			return null;
		} else if (formatString == null) {
			return bigDecimal.toString();
		} else {
			if (displayFormat.endsWith("%")) {
				NumberFormat numberFormat = NumberFormat.getPercentInstance();
				numberFormat.setMinimumIntegerDigits(2);

				switch (displayFormat) {
					case "(*100;6=)#0.0000 %":
						numberFormat.setMinimumFractionDigits(4);
						bigDecimal = bigDecimal.multiply(new BigDecimal(100));
						break;
					case "(*100;4=)#0.00 %":
						numberFormat.setMinimumFractionDigits(2);
						bigDecimal = bigDecimal.multiply(new BigDecimal(100));
						break;
					case "#0.00 %":
						numberFormat.setMinimumFractionDigits(2);
						break;
				}
				return numberFormat.format(bigDecimal);
			}
		}
		return new DecimalFormat(displayFormat).format(bigDecimal);
	}
}

