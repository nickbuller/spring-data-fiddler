package fiddler.dao.entities.address;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedTypeTag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address_type_tag", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AddressTypeTag implements Serializable {
	@Id
	@SequenceGenerator(name = "address_type_tag_seq", sequenceName = "address_type_tag_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_type_tag_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_type_id")
	@Getter
	@Setter
	private AddressType addressType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_tag_id")
	@Getter
	@Setter
	private AddressTag addressTag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedTypeTag typeTag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
