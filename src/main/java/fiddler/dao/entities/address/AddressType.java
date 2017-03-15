package fiddler.dao.entities.address;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.base.EmbeddedEntityType;
import fiddler.dao.entities.Locale;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "address_type", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AddressType implements Serializable {
	@Id
	@SequenceGenerator(name = "address_type_seq", sequenceName = "address_type_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locale_id")
	@Getter
	@Setter
	private Locale locale;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityType type;

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
}
