//package fiddler.dao.generated;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "organisation_tag_display_order", schema = "public", catalog = "indoc")
//public class OrganisationTagDisplayOrder {
//    private int id;
//    private int organisationId;
//    private Integer organisationTagId;
//    private int displayOrder;
//    private Integer creatorid;
//    private LocalDateTime createdts;
//    private LocalDateTime modifiedts;
//    private Integer modifierid;
//
//    @Column(name = "id")
//    @Id
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "organisation_id")
//    public int getOrganisationId() {
//        return organisationId;
//    }
//
//    public void setOrganisationId(int organisationId) {
//        this.organisationId = organisationId;
//    }
//
//    @Basic
//    @Column(name = "organisation_tag_id")
//    public Integer getOrganisationTagId() {
//        return organisationTagId;
//    }
//
//    public void setOrganisationTagId(Integer organisationTagId) {
//        this.organisationTagId = organisationTagId;
//    }
//
//    @Basic
//    @Column(name = "display_order")
//    public int getDisplayOrder() {
//        return displayOrder;
//    }
//
//    public void setDisplayOrder(int displayOrder) {
//        this.displayOrder = displayOrder;
//    }
//
//    @Basic
//    @Column(name = "creatorid")
//    public Integer getCreatorid() {
//        return creatorid;
//    }
//
//    public void setCreatorid(Integer creatorid) {
//        this.creatorid = creatorid;
//    }
//
//    @Basic
//    @Column(name = "createdts")
//    public LocalDateTime getCreatedts() {
//        return createdts;
//    }
//
//    public void setCreatedts(LocalDateTime createdts) {
//        this.createdts = createdts;
//    }
//
//    @Basic
//    @Column(name = "modifiedts")
//    public LocalDateTime getModifiedts() {
//        return modifiedts;
//    }
//
//    public void setModifiedts(LocalDateTime modifiedts) {
//        this.modifiedts = modifiedts;
//    }
//
//    @Basic
//    @Column(name = "modifierid")
//    public Integer getModifierid() {
//        return modifierid;
//    }
//
//    public void setModifierid(Integer modifierid) {
//        this.modifierid = modifierid;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        OrganisationTagDisplayOrder that = (OrganisationTagDisplayOrder) object;
//
//        if (id != that.id) return false;
//        if (organisationId != that.organisationId) return false;
//        if (displayOrder != that.displayOrder) return false;
//        if (organisationTagId != null ? !organisationTagId.equals(that.organisationTagId) : that.organisationTagId != null) return false;
//        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
//        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
//        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
//        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + id;
//        result = 31 * result + organisationId;
//        result = 31 * result + (organisationTagId != null ? organisationTagId.hashCode() : 0);
//        result = 31 * result + displayOrder;
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
