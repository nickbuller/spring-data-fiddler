//package fiddler.dao.entities.transaction;
//
//import javax.persistence.*;
//import java.math.BigInteger;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "transaction_line", schema = "public", catalog = "indoc")
//public class TransactionLine {
//    private int id;
//    private int transactionId;
//    private int transactionposition;
//    private Integer taxCodeId;
//    private String narrative;
//    private BigInteger grossAmount;
//    private BigInteger taxAmount;
//    private BigInteger netAmount;
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
//    public int getTransactionId() {
//        return transactionId;
//    }
//
//    public void setTransactionId(int transactionId) {
//        this.transactionId = transactionId;
//    }
//
//    @Basic
//    @Column(name = "transactionposition")
//    public int getTransactionposition() {
//        return transactionposition;
//    }
//
//    public void setTransactionposition(int transactionposition) {
//        this.transactionposition = transactionposition;
//    }
//
//    @Basic
//    @Column(name = "tax_code_id")
//    public Integer getTaxCodeId() {
//        return taxCodeId;
//    }
//
//    public void setTaxCodeId(Integer taxCodeId) {
//        this.taxCodeId = taxCodeId;
//    }
//
//    @Basic
//    @Column(name = "narrative")
//    public String getNarrative() {
//        return narrative;
//    }
//
//    public void setNarrative(String narrative) {
//        this.narrative = narrative;
//    }
//
//    @Basic
//    @Column(name = "gross_amount")
//    public java.math.BigInteger getGrossAmount() {
//        return grossAmount;
//    }
//
//    public void setGrossAmount(java.math.BigInteger grossAmount) {
//        this.grossAmount = grossAmount;
//    }
//
//    @Basic
//    @Column(name = "tax_amount")
//    public java.math.BigInteger getTaxAmount() {
//        return taxAmount;
//    }
//
//    public void setTaxAmount(java.math.BigInteger taxAmount) {
//        this.taxAmount = taxAmount;
//    }
//
//    @Basic
//    @Column(name = "net_amount")
//    public java.math.BigInteger getNetAmount() {
//        return netAmount;
//    }
//
//    public void setNetAmount(java.math.BigInteger netAmount) {
//        this.netAmount = netAmount;
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
//        TransactionLine that = (TransactionLine) object;
//
//        if (id != that.id) return false;
//        if (transactionId != that.transactionId) return false;
//        if (transactionposition != that.transactionposition) return false;
//        if (taxCodeId != null ? !taxCodeId.equals(that.taxCodeId) : that.taxCodeId != null) return false;
//        if (narrative != null ? !narrative.equals(that.narrative) : that.narrative != null) return false;
//        if (grossAmount != null ? !grossAmount.equals(that.grossAmount) : that.grossAmount != null) return false;
//        if (taxAmount != null ? !taxAmount.equals(that.taxAmount) : that.taxAmount != null) return false;
//        if (netAmount != null ? !netAmount.equals(that.netAmount) : that.netAmount != null) return false;
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
//        result = 31 * result + transactionId;
//        result = 31 * result + transactionposition;
//        result = 31 * result + (taxCodeId != null ? taxCodeId.hashCode() : 0);
//        result = 31 * result + (narrative != null ? narrative.hashCode() : 0);
//        result = 31 * result + (grossAmount != null ? grossAmount.hashCode() : 0);
//        result = 31 * result + (taxAmount != null ? taxAmount.hashCode() : 0);
//        result = 31 * result + (netAmount != null ? netAmount.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        return result;
//    }
//}
