//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.time.LocalDateTime;
//
//@Entity
//public class Account {
//    private Long id;
//    private String name;
//    private Integer currencyId;
//    private Integer defaultTaxCodeId;
//    private Integer stateId;
//    private String scope;
//    private Integer accountTypeId;
//    private Integer owningOrganisationId;
//    private Boolean isPrivate;
//    private Integer parentId;
//    private Boolean locked;
//    private Integer lockOwnerId;
//    private String pickContext;
//    private Integer creatorid;
//    private LocalDateTime createdts;
//    private LocalDateTime modifiedts;
//    private Integer modifierid;
//    private String digest;
//    private Integer chartRootAccountId;
//    private Long lockKey;
//
//    @Column(name = "id")
//    @Id
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
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
//    @Column(name = "default_tax_code_id")
//    public Integer getDefaultTaxCodeId() {
//        return defaultTaxCodeId;
//    }
//
//    public void setDefaultTaxCodeId(Integer defaultTaxCodeId) {
//        this.defaultTaxCodeId = defaultTaxCodeId;
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
//    @Column(name = "scope")
//    public String getScope() {
//        return scope;
//    }
//
//    public void setScope(String scope) {
//        this.scope = scope;
//    }
//
//    @Basic
//    @Column(name = "account_type_id")
//    public Integer getAccountTypeId() {
//        return accountTypeId;
//    }
//
//    public void setAccountTypeId(Integer accountTypeId) {
//        this.accountTypeId = accountTypeId;
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
//    @Column(name = "parent_id")
//    public Integer getParentId() {
//        return parentId;
//    }
//
//    public void setParentId(Integer parentId) {
//        this.parentId = parentId;
//    }
//
//    @Basic
//    @Column(name = "locked")
//    public Boolean getLocked() {
//        return locked;
//    }
//
//    public void setLocked(Boolean locked) {
//        this.locked = locked;
//    }
//
//    @Basic
//    @Column(name = "lock_owner_id")
//    public Integer getLockOwnerId() {
//        return lockOwnerId;
//    }
//
//    public void setLockOwnerId(Integer lockOwnerId) {
//        this.lockOwnerId = lockOwnerId;
//    }
//
//    @Basic
//    @Column(name = "pick_context")
//    public String getPickContext() {
//        return pickContext;
//    }
//
//    public void setPickContext(String pickContext) {
//        this.pickContext = pickContext;
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
//    @Column(name = "digest")
//    public String getDigest() {
//        return digest;
//    }
//
//    public void setDigest(String digest) {
//        this.digest = digest;
//    }
//
//    @Basic
//    @Column(name = "chart_root_account_id")
//    public Integer getChartRootAccountId() {
//        return chartRootAccountId;
//    }
//
//    public void setChartRootAccountId(Integer chartRootAccountId) {
//        this.chartRootAccountId = chartRootAccountId;
//    }
//
//    @Basic
//    @Column(name = "lock_key")
//    public Long getLockKey() {
//        return lockKey;
//    }
//
//    public void setLockKey(Long lockKey) {
//        this.lockKey = lockKey;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Account account = (Account) object;
//
//        if (id != account.id) return false;
//        if (name != null ? !name.equals(account.name) : account.name != null) return false;
//        if (currencyId != null ? !currencyId.equals(account.currencyId) : account.currencyId != null) return false;
//        if (defaultTaxCodeId != null ? !defaultTaxCodeId.equals(account.defaultTaxCodeId) : account.defaultTaxCodeId != null) return false;
//        if (stateId != null ? !stateId.equals(account.stateId) : account.stateId != null) return false;
//        if (scope != null ? !scope.equals(account.scope) : account.scope != null) return false;
//        if (accountTypeId != null ? !accountTypeId.equals(account.accountTypeId) : account.accountTypeId != null) return false;
//        if (owningOrganisationId != null ? !owningOrganisationId.equals(account.owningOrganisationId) : account.owningOrganisationId != null) return false;
//        if (isPrivate != null ? !isPrivate.equals(account.isPrivate) : account.isPrivate != null) return false;
//        if (parentId != null ? !parentId.equals(account.parentId) : account.parentId != null) return false;
//        if (locked != null ? !locked.equals(account.locked) : account.locked != null) return false;
//        if (lockOwnerId != null ? !lockOwnerId.equals(account.lockOwnerId) : account.lockOwnerId != null) return false;
//        if (pickContext != null ? !pickContext.equals(account.pickContext) : account.pickContext != null) return false;
//        if (creatorid != null ? !creatorid.equals(account.creatorid) : account.creatorid != null) return false;
//        if (createdts != null ? !createdts.equals(account.createdts) : account.createdts != null) return false;
//        if (modifiedts != null ? !modifiedts.equals(account.modifiedts) : account.modifiedts != null) return false;
//        if (modifierid != null ? !modifierid.equals(account.modifierid) : account.modifierid != null) return false;
//        if (digest != null ? !digest.equals(account.digest) : account.digest != null) return false;
//        if (chartRootAccountId != null ? !chartRootAccountId.equals(account.chartRootAccountId) : account.chartRootAccountId != null) return false;
//        if (lockKey != null ? !lockKey.equals(account.lockKey) : account.lockKey != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + id.hashCode();
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (currencyId != null ? currencyId.hashCode() : 0);
//        result = 31 * result + (defaultTaxCodeId != null ? defaultTaxCodeId.hashCode() : 0);
//        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
//        result = 31 * result + (scope != null ? scope.hashCode() : 0);
//        result = 31 * result + (accountTypeId != null ? accountTypeId.hashCode() : 0);
//        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
//        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
//        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
//        result = 31 * result + (locked != null ? locked.hashCode() : 0);
//        result = 31 * result + (lockOwnerId != null ? lockOwnerId.hashCode() : 0);
//        result = 31 * result + (pickContext != null ? pickContext.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (digest != null ? digest.hashCode() : 0);
//        result = 31 * result + (chartRootAccountId != null ? chartRootAccountId.hashCode() : 0);
//        result = 31 * result + (lockKey != null ? lockKey.hashCode() : 0);
//        return result;
//    }
//}
