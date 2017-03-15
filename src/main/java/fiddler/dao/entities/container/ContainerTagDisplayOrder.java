package fiddler.dao.entities.container;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "container_tag_display_order", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ContainerTagDisplayOrder {
    @Id
	@SequenceGenerator(name = "container_tag_display_order_seq", sequenceName = "container_tag_display_order_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_tag_display_order_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "container_id")
	@Getter
	@Setter
	private Container container;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "container_tag_id")
	@Getter
	@Setter
	private ContainerTag containerTag;

    @Column(name = "display_order")
	@Getter
	@Setter
	private Integer displayOrder;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
