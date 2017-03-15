package fiddler.dao.entities.container;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedTagData;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "container_tag_value", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ContainerTagValue {
    @Id
	@SequenceGenerator(name = "container_tag_value_seq", sequenceName = "container_tag_value_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_tag_value_seq")
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

    @Column(name = "children_can_inherit")
	@Getter
	@Setter
	private Boolean childrenCanInherit;

    @Column(name = "children_can_change")
	@Getter
	@Setter
	private Boolean childrenCanChange;

    @Column(name = "is_inherited")
	@Getter
	@Setter
	private Boolean isInherited;

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

	public String getFormattedValue() {
		return this.containerTag.getTag().getTagFormat().getFormattedValue(this.value.getTagData());
	}

	public String getTagName() {
		return this.containerTag.getTag().getName();
	}

	public String getDebugString() {
		return String.format("EmbeddedTag {%s} Value {%s}", getTagName(), getFormattedValue());
	}
}
