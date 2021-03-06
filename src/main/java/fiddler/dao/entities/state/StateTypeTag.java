package fiddler.dao.entities.state;

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
@Table(name = "state_type_tag", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class StateTypeTag implements Serializable {
	@Id
	@SequenceGenerator(name = "state_type_seq", sequenceName = "state_type_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_type_id")
	@Getter
	@Setter
	private StateType stateType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_tag_id")
	@Getter
	@Setter
	private StateTag stateTag;

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
