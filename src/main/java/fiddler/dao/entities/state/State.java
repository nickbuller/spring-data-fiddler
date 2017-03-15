package fiddler.dao.entities.state;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "state", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class State implements Serializable {
	@Id
	@SequenceGenerator(name = "state_seq", sequenceName = "state_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

    @Column(name = "name")
	@Getter
	@Setter
	private String name;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_type_id")
	@Getter
	@Setter
	private StateType stateType;

    @Column(name = "digest")
	@Getter
	@Setter
	private String digest;

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
