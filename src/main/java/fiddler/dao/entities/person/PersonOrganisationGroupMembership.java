//package fiddler.dao.entities.person;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "person_organisation_group_membership", schema = "public", catalog = "indoc")
//public class PersonOrganisationGroupMembership {
//    private int id;
//    private int userId;
//    private int groupId;
//    private int organisationId;
//    private String status;
//    private LocalDateTime validfrom;
//    private LocalDateTime validto;
//    private Integer creatorid;
//    private LocalDateTime createdts;
//    private Integer modifierid;
//    private LocalDateTime modifiedts;
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
//    @Column(name = "user_id")
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    @Basic
//    @Column(name = "group_id")
//    public int getGroupId() {
//        return groupId;
//    }
//
//    public void setGroupId(int groupId) {
//        this.groupId = groupId;
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
//    @Column(name = "status")
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    @Basic
//    @Column(name = "validfrom")
//    public LocalDateTime getValidfrom() {
//        return validfrom;
//    }
//
//    public void setValidfrom(LocalDateTime validfrom) {
//        this.validfrom = validfrom;
//    }
//
//    @Basic
//    @Column(name = "validto")
//    public LocalDateTime getValidto() {
//        return validto;
//    }
//
//    public void setValidto(LocalDateTime validto) {
//        this.validto = validto;
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
//    @Column(name = "modifierid")
//    public Integer getModifierid() {
//        return modifierid;
//    }
//
//    public void setModifierid(Integer modifierid) {
//        this.modifierid = modifierid;
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
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        PersonOrganisationGroupMembership that = (PersonOrganisationGroupMembership) object;
//
//        if (id != that.id) return false;
//        if (userId != that.userId) return false;
//        if (groupId != that.groupId) return false;
//        if (organisationId != that.organisationId) return false;
//        if (status != null ? !status.equals(that.status) : that.status != null) return false;
//        if (validfrom != null ? !validfrom.equals(that.validfrom) : that.validfrom != null) return false;
//        if (validto != null ? !validto.equals(that.validto) : that.validto != null) return false;
//        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
//        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
//        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
//        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + id;
//        result = 31 * result + userId;
//        result = 31 * result + groupId;
//        result = 31 * result + organisationId;
//        result = 31 * result + (status != null ? status.hashCode() : 0);
//        result = 31 * result + (validfrom != null ? validfrom.hashCode() : 0);
//        result = 31 * result + (validto != null ? validto.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        return result;
//    }
//}
