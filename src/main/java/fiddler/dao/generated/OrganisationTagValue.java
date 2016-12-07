package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "organisation_tag_value", schema = "public", catalog = "indoc")
public class OrganisationTagValue {
    private int id;
    private Integer organisationId;
    private Integer organisationTagId;
    private Boolean childrenCanInherit;
    private Boolean childrenCanChange;
    private Boolean isInherited;
    private Integer tagDataId;
    private Integer erAttachmentId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "organisation_tag_id")
    public Integer getOrganisationTagId() {
        return organisationTagId;
    }

    public void setOrganisationTagId(Integer organisationTagId) {
        this.organisationTagId = organisationTagId;
    }

    @Basic
    @Column(name = "children_can_inherit")
    public Boolean getChildrenCanInherit() {
        return childrenCanInherit;
    }

    public void setChildrenCanInherit(Boolean childrenCanInherit) {
        this.childrenCanInherit = childrenCanInherit;
    }

    @Basic
    @Column(name = "children_can_change")
    public Boolean getChildrenCanChange() {
        return childrenCanChange;
    }

    public void setChildrenCanChange(Boolean childrenCanChange) {
        this.childrenCanChange = childrenCanChange;
    }

    @Basic
    @Column(name = "is_inherited")
    public Boolean getInherited() {
        return isInherited;
    }

    public void setInherited(Boolean inherited) {
        isInherited = inherited;
    }

    @Basic
    @Column(name = "tag_data_id")
    public Integer getTagDataId() {
        return tagDataId;
    }

    public void setTagDataId(Integer tagDataId) {
        this.tagDataId = tagDataId;
    }

    @Basic
    @Column(name = "er_attachment_id")
    public Integer getErAttachmentId() {
        return erAttachmentId;
    }

    public void setErAttachmentId(Integer erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        OrganisationTagValue that = (OrganisationTagValue) object;

        if (id != that.id) return false;
        if (organisationId != null ? !organisationId.equals(that.organisationId) : that.organisationId != null) return false;
        if (organisationTagId != null ? !organisationTagId.equals(that.organisationTagId) : that.organisationTagId != null) return false;
        if (childrenCanInherit != null ? !childrenCanInherit.equals(that.childrenCanInherit) : that.childrenCanInherit != null) return false;
        if (childrenCanChange != null ? !childrenCanChange.equals(that.childrenCanChange) : that.childrenCanChange != null) return false;
        if (isInherited != null ? !isInherited.equals(that.isInherited) : that.isInherited != null) return false;
        if (tagDataId != null ? !tagDataId.equals(that.tagDataId) : that.tagDataId != null) return false;
        if (erAttachmentId != null ? !erAttachmentId.equals(that.erAttachmentId) : that.erAttachmentId != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (organisationId != null ? organisationId.hashCode() : 0);
        result = 31 * result + (organisationTagId != null ? organisationTagId.hashCode() : 0);
        result = 31 * result + (childrenCanInherit != null ? childrenCanInherit.hashCode() : 0);
        result = 31 * result + (childrenCanChange != null ? childrenCanChange.hashCode() : 0);
        result = 31 * result + (isInherited != null ? isInherited.hashCode() : 0);
        result = 31 * result + (tagDataId != null ? tagDataId.hashCode() : 0);
        result = 31 * result + (erAttachmentId != null ? erAttachmentId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
