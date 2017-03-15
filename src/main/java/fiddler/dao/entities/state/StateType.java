package fiddler.dao.entities.state;

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
@Table(name = "state_type", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class StateType implements Serializable {
	@Id
	@SequenceGenerator(name = "state_type_seq", sequenceName = "state_type_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

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