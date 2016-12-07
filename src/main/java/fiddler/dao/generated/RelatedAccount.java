package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "related_account", schema = "public", catalog = "indoc")
public class RelatedAccount {
    private int id;
    private String relationshipKey;
    private Integer organisationId;
    private Integer containerId;
    private int accountId;
    private Integer relatedAccountId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "relationship_key")
    public String getRelationshipKey() {
        return relationshipKey;
    }

    public void setRelationshipKey(String relationshipKey) {
        this.relationshipKey = relationshipKey;
    }

    @Basic
    @Column(name = "organisation_id")
    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    @Basic
    @Column(name = "container_id")
    public Integer getContainerId() {
        return containerId;
    }

    public void setContainerId(Integer containerId) {
        this.containerId = containerId;
    }

    @Basic
    @Column(name = "account_id")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "related_account_id")
    public Integer getRelatedAccountId() {
        return relatedAccountId;
    }

    public void setRelatedAccountId(Integer relatedAccountId) {
        this.relatedAccountId = relatedAccountId;
    }

    @Basic
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
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
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        RelatedAccount that = (RelatedAccount) object;

        if (id != that.id) return false;
        if (accountId != that.accountId) return false;
        if (relationshipKey != null ? !relationshipKey.equals(that.relationshipKey) : that.relationshipKey != null) return false;
        if (organisationId != null ? !organisationId.equals(that.organisationId) : that.organisationId != null) return false;
        if (containerId != null ? !containerId.equals(that.containerId) : that.containerId != null) return false;
        if (relatedAccountId != null ? !relatedAccountId.equals(that.relatedAccountId) : that.relatedAccountId != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (relationshipKey != null ? relationshipKey.hashCode() : 0);
        result = 31 * result + (organisationId != null ? organisationId.hashCode() : 0);
        result = 31 * result + (containerId != null ? containerId.hashCode() : 0);
        result = 31 * result + accountId;
        result = 31 * result + (relatedAccountId != null ? relatedAccountId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        return result;
    }
}
