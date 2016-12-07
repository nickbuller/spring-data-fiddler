package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "message_context", schema = "public", catalog = "indoc")
public class MessageContext {
    private int id;
    private Integer senderPersonId;
    private int contentId;
    private int channelId;
    private String status;
    private String statusString;
    private String externalRecipients;
    private Integer creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;
    private Integer senderOrganisationId;
    private Integer replyToMessageId;
    private String allRecipients;
    private Integer imThreadId;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sender_person_id")
    public Integer getSenderPersonId() {
        return senderPersonId;
    }

    public void setSenderPersonId(Integer senderPersonId) {
        this.senderPersonId = senderPersonId;
    }

    @Basic
    @Column(name = "content_id")
    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "channel_id")
    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "status_string")
    public String getStatusString() {
        return statusString;
    }

    public void setStatusString(String statusString) {
        this.statusString = statusString;
    }

    @Basic
    @Column(name = "external_recipients")
    public String getExternalRecipients() {
        return externalRecipients;
    }

    public void setExternalRecipients(String externalRecipients) {
        this.externalRecipients = externalRecipients;
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
    @Column(name = "sender_organisation_id")
    public Integer getSenderOrganisationId() {
        return senderOrganisationId;
    }

    public void setSenderOrganisationId(Integer senderOrganisationId) {
        this.senderOrganisationId = senderOrganisationId;
    }

    @Basic
    @Column(name = "reply_to_message_id")
    public Integer getReplyToMessageId() {
        return replyToMessageId;
    }

    public void setReplyToMessageId(Integer replyToMessageId) {
        this.replyToMessageId = replyToMessageId;
    }

    @Basic
    @Column(name = "all_recipients")
    public String getAllRecipients() {
        return allRecipients;
    }

    public void setAllRecipients(String allRecipients) {
        this.allRecipients = allRecipients;
    }

    @Basic
    @Column(name = "im_thread_id")
    public Integer getImThreadId() {
        return imThreadId;
    }

    public void setImThreadId(Integer imThreadId) {
        this.imThreadId = imThreadId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        MessageContext that = (MessageContext) object;

        if (id != that.id) return false;
        if (contentId != that.contentId) return false;
        if (channelId != that.channelId) return false;
        if (senderPersonId != null ? !senderPersonId.equals(that.senderPersonId) : that.senderPersonId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (statusString != null ? !statusString.equals(that.statusString) : that.statusString != null) return false;
        if (externalRecipients != null ? !externalRecipients.equals(that.externalRecipients) : that.externalRecipients != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (senderOrganisationId != null ? !senderOrganisationId.equals(that.senderOrganisationId) : that.senderOrganisationId != null) return false;
        if (replyToMessageId != null ? !replyToMessageId.equals(that.replyToMessageId) : that.replyToMessageId != null) return false;
        if (allRecipients != null ? !allRecipients.equals(that.allRecipients) : that.allRecipients != null) return false;
        if (imThreadId != null ? !imThreadId.equals(that.imThreadId) : that.imThreadId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (senderPersonId != null ? senderPersonId.hashCode() : 0);
        result = 31 * result + contentId;
        result = 31 * result + channelId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (statusString != null ? statusString.hashCode() : 0);
        result = 31 * result + (externalRecipients != null ? externalRecipients.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (senderOrganisationId != null ? senderOrganisationId.hashCode() : 0);
        result = 31 * result + (replyToMessageId != null ? replyToMessageId.hashCode() : 0);
        result = 31 * result + (allRecipients != null ? allRecipients.hashCode() : 0);
        result = 31 * result + (imThreadId != null ? imThreadId.hashCode() : 0);
        return result;
    }
}
