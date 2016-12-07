package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "organisation_type_tag", schema = "public", catalog = "indoc")
public class OrganisationTypeTag {
    private int id;
    private Integer organisationTypeId;
    private int organisationTagId;
    private String mandatory;
    private String canInherit;
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
    @Column(name = "organisation_type_id")
    public Integer getOrganisationTypeId() {
        return organisationTypeId;
    }

    public void setOrganisationTypeId(Integer organisationTypeId) {
        this.organisationTypeId = organisationTypeId;
    }

    @Basic
    @Column(name = "organisation_tag_id")
    public int getOrganisationTagId() {
        return organisationTagId;
    }

    public void setOrganisationTagId(int organisationTagId) {
        this.organisationTagId = organisationTagId;
    }

    @Basic
    @Column(name = "mandatory")
    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }

    @Basic
    @Column(name = "can_inherit")
    public String getCanInherit() {
        return canInherit;
    }

    public void setCanInherit(String canInherit) {
        this.canInherit = canInherit;
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

        OrganisationTypeTag that = (OrganisationTypeTag) object;

        if (id != that.id) return false;
        if (organisationTagId != that.organisationTagId) return false;
        if (organisationTypeId != null ? !organisationTypeId.equals(that.organisationTypeId) : that.organisationTypeId != null) return false;
        if (mandatory != null ? !mandatory.equals(that.mandatory) : that.mandatory != null) return false;
        if (canInherit != null ? !canInherit.equals(that.canInherit) : that.canInherit != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (organisationTypeId != null ? organisationTypeId.hashCode() : 0);
        result = 31 * result + organisationTagId;
        result = 31 * result + (mandatory != null ? mandatory.hashCode() : 0);
        result = 31 * result + (canInherit != null ? canInherit.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
