//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import java.time.LocalDateTime;
//
//@Entity
//public class Container {
//    private int id;
//    private String name;
//    private String status;
//    private Integer stateId;
//    private String scope;
//    private Integer containerTypeId;
//    private Integer owningOrganisationId;
//    private Integer templateId;
//    private Integer contentRbacTemplateId;
//    private String digest;
//    private Integer creatorid;
//    private LocalDateTime createdts;
//    private LocalDateTime modifiedts;
//    private Integer modifierid;
//    private Boolean locked;
//    private Integer lockOwnerId;
//    private Long lockKey;
//    private String memberContainers;
//    private String ownerContainers;
//    private String creditRating;
//    private Integer securityRating;
//    private String loanRef;
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
//    @Column(name = "container_type_id")
//    public Integer getContainerTypeId() {
//        return containerTypeId;
//    }
//
//    public void setContainerTypeId(Integer containerTypeId) {
//        this.containerTypeId = containerTypeId;
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
//    @Column(name = "template_id")
//    public Integer getTemplateId() {
//        return templateId;
//    }
//
//    public void setTemplateId(Integer templateId) {
//        this.templateId = templateId;
//    }
//
//    @Basic
//    @Column(name = "content_rbac_template_id")
//    public Integer getContentRbacTemplateId() {
//        return contentRbacTemplateId;
//    }
//
//    public void setContentRbacTemplateId(Integer contentRbacTemplateId) {
//        this.contentRbacTemplateId = contentRbacTemplateId;
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
//    @Column(name = "lock_key")
//    public Long getLockKey() {
//        return lockKey;
//    }
//
//    public void setLockKey(Long lockKey) {
//        this.lockKey = lockKey;
//    }
//
//    @Basic
//    @Column(name = "member_containers")
//    public String getMemberContainers() {
//        return memberContainers;
//    }
//
//    public void setMemberContainers(String memberContainers) {
//        this.memberContainers = memberContainers;
//    }
//
//    @Basic
//    @Column(name = "owner_containers")
//    public String getOwnerContainers() {
//        return ownerContainers;
//    }
//
//    public void setOwnerContainers(String ownerContainers) {
//        this.ownerContainers = ownerContainers;
//    }
//
//    @Basic
//    @Column(name = "credit_rating")
//    public String getCreditRating() {
//        return creditRating;
//    }
//
//    public void setCreditRating(String creditRating) {
//        this.creditRating = creditRating;
//    }
//
//    @Basic
//    @Column(name = "security_rating")
//    public Integer getSecurityRating() {
//        return securityRating;
//    }
//
//    public void setSecurityRating(Integer securityRating) {
//        this.securityRating = securityRating;
//    }
//
//    @Basic
//    @Column(name = "loan_ref")
//    public String getLoanRef() {
//        return loanRef;
//    }
//
//    public void setLoanRef(String loanRef) {
//        this.loanRef = loanRef;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Container container = (Container) object;
//
//        if (id != container.id) return false;
//        if (name != null ? !name.equals(container.name) : container.name != null) return false;
//        if (status != null ? !status.equals(container.status) : container.status != null) return false;
//        if (stateId != null ? !stateId.equals(container.stateId) : container.stateId != null) return false;
//        if (scope != null ? !scope.equals(container.scope) : container.scope != null) return false;
//        if (containerTypeId != null ? !containerTypeId.equals(container.containerTypeId) : container.containerTypeId != null) return false;
//        if (owningOrganisationId != null ? !owningOrganisationId.equals(container.owningOrganisationId) : container.owningOrganisationId != null) return false;
//        if (templateId != null ? !templateId.equals(container.templateId) : container.templateId != null) return false;
//        if (contentRbacTemplateId != null ? !contentRbacTemplateId.equals(container.contentRbacTemplateId) : container.contentRbacTemplateId != null) return false;
//        if (digest != null ? !digest.equals(container.digest) : container.digest != null) return false;
//        if (creatorid != null ? !creatorid.equals(container.creatorid) : container.creatorid != null) return false;
//        if (createdts != null ? !createdts.equals(container.createdts) : container.createdts != null) return false;
//        if (modifiedts != null ? !modifiedts.equals(container.modifiedts) : container.modifiedts != null) return false;
//        if (modifierid != null ? !modifierid.equals(container.modifierid) : container.modifierid != null) return false;
//        if (locked != null ? !locked.equals(container.locked) : container.locked != null) return false;
//        if (lockOwnerId != null ? !lockOwnerId.equals(container.lockOwnerId) : container.lockOwnerId != null) return false;
//        if (lockKey != null ? !lockKey.equals(container.lockKey) : container.lockKey != null) return false;
//        if (memberContainers != null ? !memberContainers.equals(container.memberContainers) : container.memberContainers != null) return false;
//        if (ownerContainers != null ? !ownerContainers.equals(container.ownerContainers) : container.ownerContainers != null) return false;
//        if (creditRating != null ? !creditRating.equals(container.creditRating) : container.creditRating != null) return false;
//        if (securityRating != null ? !securityRating.equals(container.securityRating) : container.securityRating != null) return false;
//        if (loanRef != null ? !loanRef.equals(container.loanRef) : container.loanRef != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (status != null ? status.hashCode() : 0);
//        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
//        result = 31 * result + (scope != null ? scope.hashCode() : 0);
//        result = 31 * result + (containerTypeId != null ? containerTypeId.hashCode() : 0);
//        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
//        result = 31 * result + (templateId != null ? templateId.hashCode() : 0);
//        result = 31 * result + (contentRbacTemplateId != null ? contentRbacTemplateId.hashCode() : 0);
//        result = 31 * result + (digest != null ? digest.hashCode() : 0);
//        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
//        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
//        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
//        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
//        result = 31 * result + (locked != null ? locked.hashCode() : 0);
//        result = 31 * result + (lockOwnerId != null ? lockOwnerId.hashCode() : 0);
//        result = 31 * result + (lockKey != null ? lockKey.hashCode() : 0);
//        result = 31 * result + (memberContainers != null ? memberContainers.hashCode() : 0);
//        result = 31 * result + (ownerContainers != null ? ownerContainers.hashCode() : 0);
//        result = 31 * result + (creditRating != null ? creditRating.hashCode() : 0);
//        result = 31 * result + (securityRating != null ? securityRating.hashCode() : 0);
//        result = 31 * result + (loanRef != null ? loanRef.hashCode() : 0);
//        return result;
//    }
//}
