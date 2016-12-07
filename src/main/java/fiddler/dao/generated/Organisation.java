package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Organisation {
    private int id;
    private Integer organisationTypeId;
    private String name;
    private String status;
    private String scope;
    private String digest;
    private Integer templateId;
    private Integer defaultUserGroupId;
    private Integer defaultLocaleId;
    private int creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String alias;
    private Integer rootAccountId;
    private String thirdpartyRef;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "organisation_type_id")
    public Integer getOrganisationTypeId() {
        return organisationTypeId;
    }

    public void setOrganisationTypeId(Integer organisationTypeId) {
        this.organisationTypeId = organisationTypeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "template_id")
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "default_user_group_id")
    public Integer getDefaultUserGroupId() {
        return defaultUserGroupId;
    }

    public void setDefaultUserGroupId(Integer defaultUserGroupId) {
        this.defaultUserGroupId = defaultUserGroupId;
    }

    @Basic
    @Column(name = "default_locale_id")
    public Integer getDefaultLocaleId() {
        return defaultLocaleId;
    }

    public void setDefaultLocaleId(Integer defaultLocaleId) {
        this.defaultLocaleId = defaultLocaleId;
    }

    @Basic
    @Column(name = "creatorid")
    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    @Basic
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Basic
    @Column(name = "root_account_id")
    public Integer getRootAccountId() {
        return rootAccountId;
    }

    public void setRootAccountId(Integer rootAccountId) {
        this.rootAccountId = rootAccountId;
    }

    @Basic
    @Column(name = "thirdparty_ref")
    public String getThirdpartyRef() {
        return thirdpartyRef;
    }

    public void setThirdpartyRef(String thirdpartyRef) {
        this.thirdpartyRef = thirdpartyRef;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Organisation that = (Organisation) object;

        if (id != that.id) return false;
        if (creatorid != that.creatorid) return false;
        if (organisationTypeId != null ? !organisationTypeId.equals(that.organisationTypeId) : that.organisationTypeId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (digest != null ? !digest.equals(that.digest) : that.digest != null) return false;
        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (defaultUserGroupId != null ? !defaultUserGroupId.equals(that.defaultUserGroupId) : that.defaultUserGroupId != null) return false;
        if (defaultLocaleId != null ? !defaultLocaleId.equals(that.defaultLocaleId) : that.defaultLocaleId != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
        if (rootAccountId != null ? !rootAccountId.equals(that.rootAccountId) : that.rootAccountId != null) return false;
        if (thirdpartyRef != null ? !thirdpartyRef.equals(that.thirdpartyRef) : that.thirdpartyRef != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (organisationTypeId != null ? organisationTypeId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
        result = 31 * result + (defaultUserGroupId != null ? defaultUserGroupId.hashCode() : 0);
        result = 31 * result + (defaultLocaleId != null ? defaultLocaleId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        result = 31 * result + (rootAccountId != null ? rootAccountId.hashCode() : 0);
        result = 31 * result + (thirdpartyRef != null ? thirdpartyRef.hashCode() : 0);
        return result;
    }
}
