//package fiddler.dao.entities.transaction;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transaction_tag_value", schema = "public", catalog = "indoc")
//public class TransactionTagValue {
//    private int id;
//    private Integer transactionId;
//    private Integer transactionTagId;
//    private Integer tagDataId;
//    private Integer erAttachmentId;
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
//    @Column(name = "transaction_id")
//    public Integer getTransactionId() {
//        return transactionId;
//    }
//
//    public void setTransactionId(Integer transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    @Basic
//    @Column(name = "transaction_tag_id")
//    public Integer getTransactionTagId() {
//        return transactionTagId;
//    }
//
//    public void setTransactionTagId(Integer transactionTagId) {
//        this.transactionTagId = transactionTagId;
//    }
//
//    @Basic
//    @Column(name = "tag_data_id")
//    public Integer getTagDataId() {
//        return tagDataId;
//    }
//
//    public void setTagDataId(Integer tagDataId) {
//        this.tagDataId = tagDataId;
//    }
//
//    @Basic
//    @Column(name = "er_attachment_id")
//    public Integer getErAttachmentId() {
//        return erAttachmentId;
//    }
//
//    public void setErAttachmentId(Integer erAttachmentId) {
//        this.erAttachmentId = erAttachmentId;
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
//        TransactionTagValue that = (TransactionTagValue) object;
//
//        if (id != that.id) return false;
//        if (transactionId != null ? !transactionId.equals(that.transactionId) : that.transactionId != null) return false;
//        if (transactionTagId != null ? !transactionTagId.equals(that.transactionTagId) : that.transactionTagId != null) return false;
//        if (tagDataId != null ? !tagDataId.equals(that.tagDataId) : that.tagDataId != null) return false;
//        if (erAttachmentId != null ? !erAttachmentId.equals(that.erAttachmentId) : that.erAttachmentId != null) return false;
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
//        result = 31 * result + (transactionId != null ? transactionId.hashCode() : 0);
//        result = 31 * result + (transactionTagId != null ? transactionTagId.hashCode() : 0);
//        result = 31 * result + (tagDataId != null ? tagDataId.hashCode() : 0);
//        result = 31 * result + (erAttachmentId != null ? erAttachmentId.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
