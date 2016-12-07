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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "container_type_id")
    private ContainerType containerType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Organisation owningOrganisation;

    private Long templateId;

    private Long contentRbacTemplateId;

    private String digest;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    private Person creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Person modifier;

    @Column(name = "createdts")
    private LocalDateTime createdTs;

    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

    private Boolean locked;
    private Long lockOwnerId;
    private Long lockKey;
    private String creditRating;
    private String securityRating;
    private String loanRef;

//    @OneToOne(fetch = FetchType.LAZY, mappedBy = "value.owner_container")
//    private InterContainerMembership ownerContainer;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "member_container")
//    private Set<InterContainerMembership> memberContainers;

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

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(LocalDateTime createdts) {
        this.createdTs = createdts;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedts) {
        this.modifiedTs = modifiedts;
    }

    public Person getModifier() {
        return modifier;
    }

    public void setModifier(Person modifier) {
        this.modifier = modifier;
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

//    public InterContainerMembership getOwnerContainer() {
//        return ownerContainer;
//    }
//
//    public void setOwnerContainer(InterContainerMembership ownerContainer) {
//        this.ownerContainer = ownerContainer;
//    }

//    public Set<InterContainerMembership> getMemberContainers() {
//        return memberContainers;
//    }
//
//    public void setMemberContainers(Set<InterContainerMembership> memberContainers) {
//        this.memberContainers = memberContainers;
//    }

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
                ", creatorId=" + creator.getId() +
                ", createdts=" + createdTs +
                ", modifiedts=" + modifiedTs +
                ", modifierId=" + (modifier == null ? null : modifier.getId()) +
                ", locked=" + locked +
                ", lockOwnerId=" + lockOwnerId +
                ", lockKey=" + lockKey +
                ", creditRating='" + creditRating + '\'' +
                ", securityRating='" + securityRating + '\'' +
                ", loanRef='" + loanRef + '\'' +
//                ", ownerContainer=" + ownerContainer +
//                ", memberContainers=" + memberContainers +
                '}';
    }
}


