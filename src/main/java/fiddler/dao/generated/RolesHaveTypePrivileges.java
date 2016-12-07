package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles_have_type_privileges", schema = "public", catalog = "indoc")
public class RolesHaveTypePrivileges {
    private int id;
    private String scope;
    private int roleId;
    private int privilegeId;
    private Integer personTypeId;
    private Integer addressTypeId;
    private Integer organisationTypeId;
    private Integer documentTypeId;
    private Integer containerTypeId;
    private Integer contentTypeId;
    private Integer stateTypeId;
    private Integer channelTypeId;
    private Integer workflowTypeId;
    private String isAllowed;
    private Integer creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;
    private Integer eventTypeId;
    private Integer accountTypeId;
    private Integer transactionTypeId;
    private Integer articleTypeId;
    private Integer campaignTypeId;
    private Integer feedTypeId;
    private Integer ontologyTypeId;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "privilege_id")
    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Basic
    @Column(name = "person_type_id")
    public Integer getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Integer personTypeId) {
        this.personTypeId = personTypeId;
    }

    @Basic
    @Column(name = "address_type_id")
    public Integer getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    @Basic
    @Column(name = "organisation_type_id")
    public Integer getOrganisationTypeId() {
        return organisationTypeId;
    }

    public void setOrganisationTypeId(Integer organisationTypeId) {
        this.organisationTypeId = organisationTypeId;
    }

    @Basic
    @Column(name = "document_type_id")
    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    @Basic
    @Column(name = "container_type_id")
    public Integer getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(Integer containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    @Basic
    @Column(name = "content_type_id")
    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    @Basic
    @Column(name = "state_type_id")
    public Integer getStateTypeId() {
        return stateTypeId;
    }

    public void setStateTypeId(Integer stateTypeId) {
        this.stateTypeId = stateTypeId;
    }

    @Basic
    @Column(name = "channel_type_id")
    public Integer getChannelTypeId() {
        return channelTypeId;
    }

    public void setChannelTypeId(Integer channelTypeId) {
        this.channelTypeId = channelTypeId;
    }

    @Basic
    @Column(name = "workflow_type_id")
    public Integer getWorkflowTypeId() {
        return workflowTypeId;
    }

    public void setWorkflowTypeId(Integer workflowTypeId) {
        this.workflowTypeId = workflowTypeId;
    }

    @Basic
    @Column(name = "is_allowed")
    public String getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(String isAllowed) {
        this.isAllowed = isAllowed;
    }

    @Basic
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    @Basic
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    @Basic
    @Column(name = "event_type_id")
    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    @Basic
    @Column(name = "account_type_id")
    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Basic
    @Column(name = "transaction_type_id")
    public Integer getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(Integer transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    @Basic
    @Column(name = "article_type_id")
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    @Basic
    @Column(name = "campaign_type_id")
    public Integer getCampaignTypeId() {
        return campaignTypeId;
    }

    public void setCampaignTypeId(Integer campaignTypeId) {
        this.campaignTypeId = campaignTypeId;
    }

    @Basic
    @Column(name = "feed_type_id")
    public Integer getFeedTypeId() {
        return feedTypeId;
    }

    public void setFeedTypeId(Integer feedTypeId) {
        this.feedTypeId = feedTypeId;
    }

    @Basic
    @Column(name = "ontology_type_id")
    public Integer getOntologyTypeId() {
        return ontologyTypeId;
    }

    public void setOntologyTypeId(Integer ontologyTypeId) {
        this.ontologyTypeId = ontologyTypeId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        RolesHaveTypePrivileges that = (RolesHaveTypePrivileges) object;

        if (id != that.id) return false;
        if (roleId != that.roleId) return false;
        if (privilegeId != that.privilegeId) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (personTypeId != null ? !personTypeId.equals(that.personTypeId) : that.personTypeId != null) return false;
        if (addressTypeId != null ? !addressTypeId.equals(that.addressTypeId) : that.addressTypeId != null) return false;
        if (organisationTypeId != null ? !organisationTypeId.equals(that.organisationTypeId) : that.organisationTypeId != null) return false;
        if (documentTypeId != null ? !documentTypeId.equals(that.documentTypeId) : that.documentTypeId != null) return false;
        if (containerTypeId != null ? !containerTypeId.equals(that.containerTypeId) : that.containerTypeId != null) return false;
        if (contentTypeId != null ? !contentTypeId.equals(that.contentTypeId) : that.contentTypeId != null) return false;
        if (stateTypeId != null ? !stateTypeId.equals(that.stateTypeId) : that.stateTypeId != null) return false;
        if (channelTypeId != null ? !channelTypeId.equals(that.channelTypeId) : that.channelTypeId != null) return false;
        if (workflowTypeId != null ? !workflowTypeId.equals(that.workflowTypeId) : that.workflowTypeId != null) return false;
        if (isAllowed != null ? !isAllowed.equals(that.isAllowed) : that.isAllowed != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (eventTypeId != null ? !eventTypeId.equals(that.eventTypeId) : that.eventTypeId != null) return false;
        if (accountTypeId != null ? !accountTypeId.equals(that.accountTypeId) : that.accountTypeId != null) return false;
        if (transactionTypeId != null ? !transactionTypeId.equals(that.transactionTypeId) : that.transactionTypeId != null) return false;
        if (articleTypeId != null ? !articleTypeId.equals(that.articleTypeId) : that.articleTypeId != null) return false;
        if (campaignTypeId != null ? !campaignTypeId.equals(that.campaignTypeId) : that.campaignTypeId != null) return false;
        if (feedTypeId != null ? !feedTypeId.equals(that.feedTypeId) : that.feedTypeId != null) return false;
        if (ontologyTypeId != null ? !ontologyTypeId.equals(that.ontologyTypeId) : that.ontologyTypeId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + roleId;
        result = 31 * result + privilegeId;
        result = 31 * result + (personTypeId != null ? personTypeId.hashCode() : 0);
        result = 31 * result + (addressTypeId != null ? addressTypeId.hashCode() : 0);
        result = 31 * result + (organisationTypeId != null ? organisationTypeId.hashCode() : 0);
        result = 31 * result + (documentTypeId != null ? documentTypeId.hashCode() : 0);
        result = 31 * result + (containerTypeId != null ? containerTypeId.hashCode() : 0);
        result = 31 * result + (contentTypeId != null ? contentTypeId.hashCode() : 0);
        result = 31 * result + (stateTypeId != null ? stateTypeId.hashCode() : 0);
        result = 31 * result + (channelTypeId != null ? channelTypeId.hashCode() : 0);
        result = 31 * result + (workflowTypeId != null ? workflowTypeId.hashCode() : 0);
        result = 31 * result + (isAllowed != null ? isAllowed.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (eventTypeId != null ? eventTypeId.hashCode() : 0);
        result = 31 * result + (accountTypeId != null ? accountTypeId.hashCode() : 0);
        result = 31 * result + (transactionTypeId != null ? transactionTypeId.hashCode() : 0);
        result = 31 * result + (articleTypeId != null ? articleTypeId.hashCode() : 0);
        result = 31 * result + (campaignTypeId != null ? campaignTypeId.hashCode() : 0);
        result = 31 * result + (feedTypeId != null ? feedTypeId.hashCode() : 0);
        result = 31 * result + (ontologyTypeId != null ? ontologyTypeId.hashCode() : 0);
        return result;
    }
}
