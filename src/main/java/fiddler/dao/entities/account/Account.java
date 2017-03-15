package fiddler.dao.entities.account;


import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.entities.Currency;
import fiddler.dao.entities.TaxCode;
import fiddler.dao.entities.state.State;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
@Table(name = "account", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"parent", "chartRootAccount"})
//@ToString(doNotUseGetters = true, exclude = {"parent", "chartRootAccount"})
public class Account implements Serializable {
	@Id
    @SequenceGenerator(name = "account_seq", sequenceName = "account_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq")
    @Getter
    @Setter
    private Long id;

    @Column(name = "name")
    @Getter
    @Setter
    private String name;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	@Getter
    @Setter
	private Currency currency;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "default_tax_code_id")
	@Getter
    @Setter
	private TaxCode defaultTaxCode;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	@Getter
    @Setter
	private State state;

    @Column(name = "scope")
    @Getter
    @Setter
    private String scope;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account_type_id")
	@Getter
    @Setter
	private AccountType accountType;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityOwner owningOrganisation;

    @Column(name = "private")
    @Getter
    @Setter
    private Boolean isPrivate;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	@Getter
    @Setter
	private Account parent;

    @Column(name = "locked")
    @Getter
    @Setter
    private Boolean locked;

    @Column(name = "lock_owner_id")
    @Getter
    @Setter
    private Integer lockOwnerId;

    @Column(name = "pick_context")
    @Getter
    @Setter
    private String pickContext;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityModifier entityModifier;

    @Column(name = "digest")
    @Getter
    @Setter
    private String digest;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chart_root_account_id")
	@Getter
    @Setter
	private Account chartRootAccount;

    @Column(name = "lock_key")
    @Getter
    @Setter
    private Long lockKey;


	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
			.append("accountType", accountType)
			.toString();
	}
}
