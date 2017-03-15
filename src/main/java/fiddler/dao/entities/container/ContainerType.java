package fiddler.dao.entities.container;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.base.EmbeddedEntityType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "container_type", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ContainerType implements Serializable {
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
	@SequenceGenerator(name = "container_type_seq", sequenceName = "container_type_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;
}