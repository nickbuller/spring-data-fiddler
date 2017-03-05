package fiddler.dao.entities;

import org.apache.commons.lang3.builder.ToStringBuilder;

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
    private Person creator;

    @Column(name = "createdts")
    private LocalDateTime createdts;

    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Person modifier;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organisation_type_id")
    private OrganisationType organisationType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_id")
    private Organisation template;

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

    public Person getCreatorId() {
        return creator;
    }

    public void setCreatorId(Person creator) {
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

    public Person getModifierId() {
        return modifier;
    }

    public void setModifierId(Person modifier) {
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
        return new ToStringBuilder(this)
                .append("id", id)
//                .append("status", status)
//                .append("scope", scope)
//                .append("digest", digest)
//                .append("thirdPartyReference", thirdPartyReference)
//                .append("name", name)
//                .append("creatorId", creator == null ? null : creator.getId())
//                .append("createdts", createdts)
//                .append("modifiedTs", modifiedTs)
//                .append("modifierId", modifier == null ? null : modifier.getId())
//                .append("organisationType", organisationType)
//                .append("template", template)
//                .append("userGroup", userGroup)
//                .append("locale", locale)
//                .append("account", account)
                .toString();
    }
}
