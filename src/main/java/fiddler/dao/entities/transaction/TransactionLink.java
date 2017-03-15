//package fiddler.dao.entities.transaction;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transaction_link", schema = "public", catalog = "indoc")
//public class TransactionLink {
//    private int id;
//    private int childTransactionId;
//    private int parentTransactionId;
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
//    @Column(name = "child_transaction_id")
//    public int getChildTransactionId() {
//        return childTransactionId;
//    }
//
//    public void setChildTransactionId(int childTransactionId) {
//        this.childTransactionId = childTransactionId;
//    }
//
//    @Basic
//    @Column(name = "parent_transaction_id")
//    public int getParentTransactionId() {
//        return parentTransactionId;
//    }
//
//    public void setParentTransactionId(int parentTransactionId) {
//        this.parentTransactionId = parentTransactionId;
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
//        TransactionLink that = (TransactionLink) object;
//
//        if (id != that.id) return false;
//        if (childTransactionId != that.childTransactionId) return false;
//        if (parentTransactionId != that.parentTransactionId) return false;
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
//        result = 31 * result + childTransactionId;
//        result = 31 * result + parentTransactionId;
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        return result;
//    }
//}
