//package fiddler.dao.entities.person;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "person_type", schema = "public", catalog = "indoc")
//public class PersonType {
//    private int id;
//    private Integer localeId;
//    private String name;
//    private String description;
//    private Boolean isPrivate;
//    private Integer owningOrganisationId;
//    private Integer addressTypeId;
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
//    @Column(name = "locale_id")
//    public Integer getLocaleId() {
//        return localeId;
//    }
//
//    public void setLocaleId(Integer localeId) {
//        this.localeId = localeId;
//    }
//
//    @Basic
//    @Column(name = "name")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Basic
//    @Column(name = "description")
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Basic
//    @Column(name = "private")
//    public Boolean getPrivate() {
//        return isPrivate;
//    }
//
//    public void setPrivate(Boolean aPrivate) {
//        isPrivate = aPrivate;
//    }
//
//    @Basic
//    @Column(name = "owning_organisation_id")
//    public Integer getOwningOrganisationId() {
//        return owningOrganisationId;
//    }
//
//    public void setOwningOrganisationId(Integer owningOrganisationId) {
//        this.owningOrganisationId = owningOrganisationId;
//    }
//
//    @Basic
//    @Column(name = "address_type_id")
//    public Integer getAddressTypeId() {
//        return addressTypeId;
//    }
//
//    public void setAddressTypeId(Integer addressTypeId) {
//        this.addressTypeId = addressTypeId;
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
//        PersonType that = (PersonType) object;
//
//        if (id != that.id) return false;
//        if (localeId != null ? !localeId.equals(that.localeId) : that.localeId != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (description != null ? !description.equals(that.description) : that.description != null) return false;
//        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
//        if (owningOrganisationId != null ? !owningOrganisationId.equals(that.owningOrganisationId) : that.owningOrganisationId != null) return false;
//        if (addressTypeId != null ? !addressTypeId.equals(that.addressTypeId) : that.addressTypeId != null) return false;
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
//        result = 31 * result + (localeId != null ? localeId.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (description != null ? description.hashCode() : 0);
//        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
//        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
//        result = 31 * result + (addressTypeId != null ? addressTypeId.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
