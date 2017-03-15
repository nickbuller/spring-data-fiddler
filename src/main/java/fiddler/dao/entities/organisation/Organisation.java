package fiddler.dao.entities.organisation;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.entities.Locale;
import fiddler.dao.entities.UserGroup;
import fiddler.dao.entities.account.Account;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"template"})
@ToString(doNotUseGetters = true, exclude = {"template"})
public class Organisation implements Serializable {
	@Column(name = "status")
	@Getter
	@Setter
	String status;
	@Column(name = "scope")
	@Getter
	@Setter
	String scope;
	@Column(name = "digest")
	@Getter
	@Setter
	String digest;
	@Column(name = "alias")
	@Getter
	@Setter
	String alias;
	@Column(name = "thirdparty_ref")
	@Getter
	@Setter
	String thirdPartyReference;
    @Id
    @SequenceGenerator(name = "organisation_seq", sequenceName = "organisation_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organisation_type_id")
    private OrganisationType organisationType;
	@Column(name = "name")
	@Getter
	@Setter
	private String name;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_id")
	@Getter
	@Setter
	private Organisation template;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_user_group_id")
	@Getter
	@Setter
	private UserGroup userGroup;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_locale_id")
	@Getter
	@Setter
	private Locale locale;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "root_account_id")
	@Getter
	@Setter
	private Account account;
	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Organisation)) return false;
//
//        Organisation that = (Organisation) o;
//
//        return id != null ? id.equals(that.id) : that.id == null;
//    }
//
//    @Override
//    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
//    }
}
