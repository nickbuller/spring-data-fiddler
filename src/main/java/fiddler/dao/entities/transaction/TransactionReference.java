//package fiddler.dao.entities.transaction;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transaction_reference", schema = "public", catalog = "indoc")
//public class TransactionReference {
//    private int id;
//    private Integer organisationId;
//    private Integer transactionTypeId;
//    private Integer lastValue;
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
//    @Column(name = "organisation_id")
//    public Integer getOrganisationId() {
//        return organisationId;
//    }
//
//    public void setOrganisationId(Integer organisationId) {
//        this.organisationId = organisationId;
//    }
//
//    @Basic
//    @Column(name = "transaction_type_id")
//    public Integer getTransactionTypeId() {
//        return transactionTypeId;
//    }
//
//    public void setTransactionTypeId(Integer transactionTypeId) {
//        this.transactionTypeId = transactionTypeId;
//    }
//
//    @Basic
//    @Column(name = "last_value")
//    public Integer getLastValue() {
//        return lastValue;
//    }
//
//    public void setLastValue(Integer lastValue) {
//        this.lastValue = lastValue;
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
//        TransactionReference that = (TransactionReference) object;
//
//        if (id != that.id) return false;
//        if (organisationId != null ? !organisationId.equals(that.organisationId) : that.organisationId != null) return false;
//        if (transactionTypeId != null ? !transactionTypeId.equals(that.transactionTypeId) : that.transactionTypeId != null) return false;
//        if (lastValue != null ? !lastValue.equals(that.lastValue) : that.lastValue != null) return false;
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
//        result = 31 * result + (organisationId != null ? organisationId.hashCode() : 0);
//        result = 31 * result + (transactionTypeId != null ? transactionTypeId.hashCode() : 0);
//        result = 31 * result + (lastValue != null ? lastValue.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        return result;
//    }
//}
