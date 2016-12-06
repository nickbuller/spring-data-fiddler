package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
public class Organisation {
    String status;
    String scope;
    String digest;
    @Column(name = "thirdparty_ref")
    String thirdPartyReference;
    @Id
    @SequenceGenerator(name = "organisation_seq", sequenceName = "organisation_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_seq")
    private Long id;
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    private Organisation creator;

    @Column(name = "createdts")
    private LocalDateTime createdts;

    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Organisation modifier;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organisation_type_id")
    private OrganisationType organisationType;

    //    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="template_id") private Organisation template;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_user_group_id")
    private UserGroup userGroup;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_locale_id")
    private Locale locale;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "root_account_id")
    private Account account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organisation getCreatorId() {
        return creator;
    }

    public void setCreatorId(Organisation creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    public Organisation getModifierId() {
        return modifier;
    }

    public void setModifierId(Organisation modifier) {
        this.modifier = modifier;
    }

    public OrganisationType getOrganisationType() {
        return organisationType;
    }

    public void setOrganisationType(OrganisationType organisationType) {
        this.organisationType = organisationType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getThirdPartyReference() {
        return thirdPartyReference;
    }

    public void setThirdPartyReference(String thirdPartyReference) {
        this.thirdPartyReference = thirdPartyReference;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Organisation{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", creatorId=").append(creator.getId());
        sb.append(", createdts=").append(createdts);
        sb.append(", modifiedTs=").append(modifiedTs);
        sb.append(", modifierId=").append(modifier.getId());
        sb.append(", organisationType=").append(organisationType.getId());
        sb.append(", status='").append(status).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", digest='").append(digest).append('\'');
        sb.append(", userGroup=").append(userGroup);
        sb.append(", locale=").append(locale);
        sb.append(", account=").append(account);
        sb.append(", thirdPartyReference='").append(thirdPartyReference).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
