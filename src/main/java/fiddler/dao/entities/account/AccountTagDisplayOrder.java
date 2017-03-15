package fiddler.dao.entities.account;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "account_tag_display_order", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"account"})
@ToString(doNotUseGetters = true)
public class AccountTagDisplayOrder {
    @Id
	@SequenceGenerator(name = "account_tag_display_order_seq", sequenceName = "account_tag_display_order_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_tag_display_order_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_id")
	@Getter
	@Setter
	private Account account;

    @Basic
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_tag_id")
	@Getter
	@Setter
	private AccountTag accountTag;

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
