package fiddler.dao.entities.tag;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "tag_data", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class TagData implements Serializable {
	@Id
	@SequenceGenerator(name = "tag_data_seq", sequenceName = "tag_data_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_data_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@Column(name = "is_shared")
	@Getter
	@Setter
	private Boolean isShared;

	@Column(name = "integer_value")
	@Getter
	@Setter
	private Integer integerValue;

	@Column(name = "numeric_value")
	@Getter
	@Setter
	private BigDecimal numericValue;

	@Column(name = "string_value")
	@Getter
	@Setter
	private String stringValue;

	@Column(name = "date_time_value")
	@Getter
	@Setter
	private LocalDateTime dateTimeValue;

	@Column(name = "boolean_value")
	@Getter
	@Setter
	private Boolean booleanValue;

	@Column(name = "long_string_value")
	@Getter
	@Setter
	private String longStringValue;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

}
