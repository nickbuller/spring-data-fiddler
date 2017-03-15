package fiddler.dao.entities.account;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedTypeTag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "account_type_tag", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AccountTypeTag {
	@Id
	@SequenceGenerator(name = "state_type_seq", sequenceName = "state_type_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_type_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "account_type_id")
//    @Getter
//    @Setter
//    private AccountType accountType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_tag_id")
	@Getter
	@Setter
	private AccountTag accountTag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedTypeTag typeTag;

	@Column(name = "can_inherit")
	@Getter
	@Setter
	private String canInherit;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
