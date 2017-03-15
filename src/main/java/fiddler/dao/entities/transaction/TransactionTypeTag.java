//package fiddler.dao.entities.transaction;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transaction_type_tag", schema = "public", catalog = "indoc")
//public class TransactionTypeTag {
//    private int id;
//    private int transactionTypeId;
//    private int transactionTagId;
//    private Integer displayOrder;
//    private String mandatory;
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
//    @Column(name = "transaction_type_id")
//    public int getTransactionTypeId() {
//        return transactionTypeId;
//    }
//
//    public void setTransactionTypeId(int transactionTypeId) {
//        this.transactionTypeId = transactionTypeId;
//    }
//
//    @Basic
//    @Column(name = "transaction_tag_id")
//    public int getTransactionTagId() {
//        return transactionTagId;
//    }
//
//    public void setTransactionTagId(int transactionTagId) {
//        this.transactionTagId = transactionTagId;
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
//        TransactionTypeTag that = (TransactionTypeTag) object;
//
//        if (id != that.id) return false;
//        if (transactionTypeId != that.transactionTypeId) return false;
//        if (transactionTagId != that.transactionTagId) return false;
//        if (displayOrder != null ? !displayOrder.equals(that.displayOrder) : that.displayOrder != null) return false;
//        if (mandatory != null ? !mandatory.equals(that.mandatory) : that.mandatory != null) return false;
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
//        result = 31 * result + transactionTypeId;
//        result = 31 * result + transactionTagId;
//        result = 31 * result + (displayOrder != null ? displayOrder.hashCode() : 0);
//        result = 31 * result + (mandatory != null ? mandatory.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
