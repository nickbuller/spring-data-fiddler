package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Container {
    @Id
    private Long id;
    private String name;
    private String status;
    private Long state_id;
    private String scope;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "container_type_id")
    private ContainerType containerType;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Organisation owningOrganisation;
    private Long templateId;
    private Long contentRbacTemplateId;
    private String digest;
    @Column(name = "creatorid")
    private Long creatorId;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    @Column(name = "modifierid")
    private Long modifierId;
    private Boolean locked;
    private Long lockOwnerId;
    private Long lockKey;
    private String creditRating;
    private String securityRating;
    private String loanRef;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getState_id() {
        return state_id;
    }

    public void setState_id(Long state_id) {
        this.state_id = state_id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType;
    }

    public Organisation getOwningOrganisation() {
        return owningOrganisation;
    }

    public void setOwningOrganisation(Organisation owningOrganisation) {
        this.owningOrganisation = owningOrganisation;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public Long getContentRbacTemplateId() {
        return contentRbacTemplateId;
    }

    public void setContentRbacTemplateId(Long contentRbacTemplateId) {
        this.contentRbacTemplateId = contentRbacTemplateId;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Long getLockOwnerId() {
        return lockOwnerId;
    }

    public void setLockOwnerId(Long lockOwnerId) {
        this.lockOwnerId = lockOwnerId;
    }

    public Long getLockKey() {
        return lockKey;
    }

    public void setLockKey(Long lockKey) {
        this.lockKey = lockKey;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getSecurityRating() {
        return securityRating;
    }

    public void setSecurityRating(String securityRating) {
        this.securityRating = securityRating;
    }

    public String getLoanRef() {
        return loanRef;
    }

    public void setLoanRef(String loanRef) {
        this.loanRef = loanRef;
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", state_id=" + state_id +
                ", scope='" + scope + '\'' +
                ", containerType=" + containerType +
                ", owningOrganisation=" + owningOrganisation +
                ", templateId=" + templateId +
                ", contentRbacTemplateId=" + contentRbacTemplateId +
                ", digest='" + digest + '\'' +
                ", creatorId=" + creatorId +
                ", createdts=" + createdts +
                ", modifiedts=" + modifiedts +
                ", modifierId=" + modifierId +
                ", locked=" + locked +
                ", lockOwnerId=" + lockOwnerId +
                ", lockKey=" + lockKey +
                ", creditRating='" + creditRating + '\'' +
                ", securityRating='" + securityRating + '\'' +
                ", loanRef='" + loanRef + '\'' +
                '}';
    }
}


