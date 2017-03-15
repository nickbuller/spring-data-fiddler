package fiddler.dao.entities.account;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedTagData;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account_tag_value", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"account"})
@ToString(doNotUseGetters = true)
public class AccountTagValue implements Serializable {
	@Id
	@SequenceGenerator(name = "account_tag_value_seq", sequenceName = "account_tag_value_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_tag_value_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id")
	@Getter
	@Setter
	private Account account;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_tag_id")
	@Getter
	@Setter
	private AccountTag accountTag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedTagData value;

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
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
