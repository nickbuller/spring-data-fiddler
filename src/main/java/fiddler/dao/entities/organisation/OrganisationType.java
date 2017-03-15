package fiddler.dao.entities.organisation;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.base.EmbeddedEntityType;
import fiddler.dao.entities.Locale;
import fiddler.dao.entities.address.AddressType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "organisation_type", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class OrganisationType implements Serializable {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_id")
	@Getter
	@Setter
	AddressType addressType;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locale_id")
	@Getter
	@Setter
	Locale locale;
	@Embedded
	@Getter
	@Setter
	EmbeddedEntityType type;
	@Embedded
	@Getter
	@Setter
	EmbeddedEntityOwner owningOrganisation;
	@Embedded
	@Getter
	@Setter
	EmbeddedEntityCreator entityCreator;
	@Embedded
	@Getter
	@Setter
	EmbeddedEntityModifier entityModifier;
	@Id
    @SequenceGenerator(name = "organisation_type_seq", sequenceName = "organisation_type_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;
}
