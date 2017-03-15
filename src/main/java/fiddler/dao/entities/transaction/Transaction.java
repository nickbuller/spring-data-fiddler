//package fiddler.dao.entities.transaction;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.math.BigInteger;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//
//@Entity
//public class Transaction {
//    private int id;
//    private long reference;
//    private String counterpartyReference;
//    private String name;
//    private LocalDate accountingDate;
//    private Integer currencyId;
//    private BigInteger netAmount;
//    private BigInteger taxAmount;
//    private BigInteger grossAmount;
//    private Integer stateId;
//    private Integer transactionTypeId;
//    private Integer owningOrganisationId;
//    private Integer counterpartyOrganisationId;
//    private Integer creatorid;
//    private LocalDateTime createdts;
//    private LocalDateTime modifiedts;
//    private Integer modifierid;
//    private Integer containerId;
//    private Integer contentId;
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
//    @Column(name = "reference")
//    public long getReference() {
//        return reference;
//    }
//
//    public void setReference(long reference) {
//        this.reference = reference;
//    }
//
//    @Basic
//    @Column(name = "counterparty_reference")
//    public String getCounterpartyReference() {
//        return counterpartyReference;
//    }
//
//    public void setCounterpartyReference(String counterpartyReference) {
//        this.counterpartyReference = counterpartyReference;
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
//    @Column(name = "accounting_date")
//    public LocalDate getAccountingDate() {
//        return accountingDate;
//    }
//
//    public void setAccountingDate(LocalDate accountingDate) {
//        this.accountingDate = accountingDate;
//    }
//
//    @Basic
//    @Column(name = "currency_id")
//    public Integer getCurrencyId() {
//        return currencyId;
//    }
//
//    public void setCurrencyId(Integer currencyId) {
//        this.currencyId = currencyId;
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
//    @Column(name = "state_id")
//    public Integer getStateId() {
//        return stateId;
//    }
//
//    public void setStateId(Integer stateId) {
//        this.stateId = stateId;
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
//    @Column(name = "counterparty_organisation_id")
//    public Integer getCounterpartyOrganisationId() {
//        return counterpartyOrganisationId;
//    }
//
//    public void setCounterpartyOrganisationId(Integer counterpartyOrganisationId) {
//        this.counterpartyOrganisationId = counterpartyOrganisationId;
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
//    @Basic
//    @Column(name = "container_id")
//    public Integer getContainerId() {
//        return containerId;
//    }
//
//    public void setContainerId(Integer containerId) {
//        this.containerId = containerId;
//    }
//
//    @Basic
//    @Column(name = "content_id")
//    public Integer getContentId() {
//        return contentId;
//    }
//
//    public void setContentId(Integer contentId) {
//        this.contentId = contentId;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Transaction that = (Transaction) object;
//
//        if (id != that.id) return false;
//        if (reference != that.reference) return false;
//        if (counterpartyReference != null ? !counterpartyReference.equals(that.counterpartyReference) : that.counterpartyReference != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (accountingDate != null ? !accountingDate.equals(that.accountingDate) : that.accountingDate != null) return false;
//        if (currencyId != null ? !currencyId.equals(that.currencyId) : that.currencyId != null) return false;
//        if (netAmount != null ? !netAmount.equals(that.netAmount) : that.netAmount != null) return false;
//        if (taxAmount != null ? !taxAmount.equals(that.taxAmount) : that.taxAmount != null) return false;
//        if (grossAmount != null ? !grossAmount.equals(that.grossAmount) : that.grossAmount != null) return false;
//        if (stateId != null ? !stateId.equals(that.stateId) : that.stateId != null) return false;
//        if (transactionTypeId != null ? !transactionTypeId.equals(that.transactionTypeId) : that.transactionTypeId != null) return false;
//        if (owningOrganisationId != null ? !owningOrganisationId.equals(that.owningOrganisationId) : that.owningOrganisationId != null) return false;
//        if (counterpartyOrganisationId != null ? !counterpartyOrganisationId.equals(that.counterpartyOrganisationId) : that.counterpartyOrganisationId != null) return false;
//        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
//        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
//        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
//        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
//        if (containerId != null ? !containerId.equals(that.containerId) : that.containerId != null) return false;
//        if (contentId != null ? !contentId.equals(that.contentId) : that.contentId != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + id;
//        result = 31 * result + (int) (reference ^ (reference >>> 32));
//        result = 31 * result + (counterpartyReference != null ? counterpartyReference.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (accountingDate != null ? accountingDate.hashCode() : 0);
//        result = 31 * result + (currencyId != null ? currencyId.hashCode() : 0);
//        result = 31 * result + (netAmount != null ? netAmount.hashCode() : 0);
//        result = 31 * result + (taxAmount != null ? taxAmount.hashCode() : 0);
//        result = 31 * result + (grossAmount != null ? grossAmount.hashCode() : 0);
//        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
//        result = 31 * result + (transactionTypeId != null ? transactionTypeId.hashCode() : 0);
//        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
//        result = 31 * result + (counterpartyOrganisationId != null ? counterpartyOrganisationId.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (containerId != null ? containerId.hashCode() : 0);
//        result = 31 * result + (contentId != null ? contentId.hashCode() : 0);
//        return result;
//    }
//}
