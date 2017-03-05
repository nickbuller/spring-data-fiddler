package fiddler.dao.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
@Table(name = "account")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class Account {
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

    @Column(name = "currency_id")
    @Getter
    @Setter
    private Integer currencyId;

    @Column(name = "default_tax_code_id")
    @Getter
    @Setter
    private Integer defaultTaxCodeId;

    @Column(name = "state_id")
    @Getter
    @Setter
    private Integer stateId;

    @Column(name = "scope")
    @Getter
    @Setter
    private String scope;

    @Column(name = "account_type_id")
    @Getter
    @Setter
    private Integer accountTypeId;

    @Column(name = "owning_organisation_id")
    @Getter
    @Setter
    private Integer owningOrganisationId;

    @Column(name = "private")
    @Getter
    @Setter
    private Boolean isPrivate;

    @Column(name = "parent_id")
    @Getter
    @Setter
    private Integer parentId;

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

    @Column(name = "creatorid")
    @Getter
    @Setter
    private Integer creatorid;

    @Column(name = "createdts")
    @Getter
    @Setter
    private LocalDateTime createdts;

    @Column(name = "modifiedts")
    @Getter
    @Setter
    private LocalDateTime modifiedts;

    @Column(name = "modifierid")
    @Getter
    @Setter
    private Integer modifierid;

    @Column(name = "digest")
    @Getter
    @Setter
    private String digest;

    @Column(name = "chart_root_account_id")
    @Getter
    @Setter
    private Integer chartRootAccountId;

    @Column(name = "lock_key")
    @Getter
    @Setter
    private Long lockKey;
}
