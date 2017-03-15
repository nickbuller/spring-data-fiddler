package fiddler.dao.entities.state;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedTagData;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "state_tag_value", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class StateTagValue {
    @Id
	@SequenceGenerator(name = "state_tag_value_seq", sequenceName = "state_tag_value_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_tag_value_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	@Getter
	@Setter
	private State state;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_tag_id")
	@Getter
	@Setter
	private StateTag stateTag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedTagData value;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
