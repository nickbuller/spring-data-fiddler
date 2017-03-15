package fiddler.dao.entities;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
@Table(name = "locale", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true, exclude = {"language", "countryCode", "countryName", "entityCreator", "entityModifier"})
public class Locale {
	@Column(name = "locale_code")
	@Getter
	@Setter
	String localeCode;
	@Column(name = "language")
	@Getter
	@Setter
	String language;
	@Column(name = "country_code")
	@Getter
	@Setter
	String countryCode;
	@Column(name = "country_name")
	@Getter
	@Setter
	String countryName;
	@Id
	@SequenceGenerator(name = "locale_seq", sequenceName = "locale_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locale_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;
	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
