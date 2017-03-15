package fiddler.dao.entities.container;

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
@Table(name = "container_type_tag", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ContainerTypeTag implements Serializable {
	@Id
	@SequenceGenerator(name = "container_type_tag_seq", sequenceName = "container_type_tag_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_type_tag_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "container_type_id")
	@Getter
	@Setter
	private ContainerType containerType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "container_tag_id")
	@Getter
	@Setter
	private ContainerTag containerTag;

    @Column(name = "can_inherit")
	@Getter
	@Setter
	private String canInherit;

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
