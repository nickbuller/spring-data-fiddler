//package fiddler.dao.entities.person;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "person_type_tag", schema = "public", catalog = "indoc")
//public class PersonTypeTag {
//    private int id;
//    private int personTypeId;
//    private int personTagId;
//    private Integer displayOrder;
//    private String mandatory;
//    private int creatorid;
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
//    @Column(name = "person_type_id")
//    public int getPersonTypeId() {
//        return personTypeId;
//    }
//
//    public void setPersonTypeId(int personTypeId) {
//        this.personTypeId = personTypeId;
//    }
//
//    @Basic
//    @Column(name = "person_tag_id")
//    public int getPersonTagId() {
//        return personTagId;
//    }
//
//    public void setPersonTagId(int personTagId) {
//        this.personTagId = personTagId;
//    }
//
//    @Basic
//    @Column(name = "display_order")
//    public Integer getDisplayOrder() {
//        return displayOrder;
//    }
//
//    public void setDisplayOrder(Integer displayOrder) {
//        this.displayOrder = displayOrder;
//    }
//
//    @Basic
//    @Column(name = "mandatory")
//    public String getMandatory() {
//        return mandatory;
//    }
//
//    public void setMandatory(String mandatory) {
//        this.mandatory = mandatory;
//    }
//
//    @Basic
//    @Column(name = "creatorid")
//    public int getCreatorid() {
//        return creatorid;
//    }
//
//    public void setCreatorid(int creatorid) {
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
//        PersonTypeTag that = (PersonTypeTag) object;
//
//        if (id != that.id) return false;
//        if (personTypeId != that.personTypeId) return false;
//        if (personTagId != that.personTagId) return false;
//        if (creatorid != that.creatorid) return false;
//        if (displayOrder != null ? !displayOrder.equals(that.displayOrder) : that.displayOrder != null) return false;
//        if (mandatory != null ? !mandatory.equals(that.mandatory) : that.mandatory != null) return false;
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
//        result = 31 * result + personTypeId;
//        result = 31 * result + personTagId;
//        result = 31 * result + (displayOrder != null ? displayOrder.hashCode() : 0);
//        result = 31 * result + (mandatory != null ? mandatory.hashCode() : 0);
//        result = 31 * result + creatorid;
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
