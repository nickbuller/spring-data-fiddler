package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "event_registration", schema = "public", catalog = "indoc")
public class EventRegistration {
    private int id;
    private int eventId;
    private int channelId;
    private int personId;
    private Integer eventPersonId;
    private Integer eventContentId;
    private Integer eventContainerId;
    private Integer eventOrganisationId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;
    private Integer organisationId;
    private Integer eventAccountId;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "event_id")
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
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
    @Column(name = "person_id")
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "event_person_id")
    public Integer getEventPersonId() {
        return eventPersonId;
    }

    public void setEventPersonId(Integer eventPersonId) {
        this.eventPersonId = eventPersonId;
    }

    @Basic
    @Column(name = "event_content_id")
    public Integer getEventContentId() {
        return eventContentId;
    }

    public void setEventContentId(Integer eventContentId) {
        this.eventContentId = eventContentId;
    }

    @Basic
    @Column(name = "event_container_id")
    public Integer getEventContainerId() {
        return eventContainerId;
    }

    public void setEventContainerId(Integer eventContainerId) {
        this.eventContainerId = eventContainerId;
    }

    @Basic
    @Column(name = "event_organisation_id")
    public Integer getEventOrganisationId() {
        return eventOrganisationId;
    }

    public void setEventOrganisationId(Integer eventOrganisationId) {
        this.eventOrganisationId = eventOrganisationId;
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
    @Column(name = "organisation_id")
    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    @Basic
    @Column(name = "event_account_id")
    public Integer getEventAccountId() {
        return eventAccountId;
    }

    public void setEventAccountId(Integer eventAccountId) {
        this.eventAccountId = eventAccountId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        EventRegistration that = (EventRegistration) object;

        if (id != that.id) return false;
        if (eventId != that.eventId) return false;
        if (channelId != that.channelId) return false;
        if (personId != that.personId) return false;
        if (eventPersonId != null ? !eventPersonId.equals(that.eventPersonId) : that.eventPersonId != null) return false;
        if (eventContentId != null ? !eventContentId.equals(that.eventContentId) : that.eventContentId != null) return false;
        if (eventContainerId != null ? !eventContainerId.equals(that.eventContainerId) : that.eventContainerId != null) return false;
        if (eventOrganisationId != null ? !eventOrganisationId.equals(that.eventOrganisationId) : that.eventOrganisationId != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (organisationId != null ? !organisationId.equals(that.organisationId) : that.organisationId != null) return false;
        if (eventAccountId != null ? !eventAccountId.equals(that.eventAccountId) : that.eventAccountId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + eventId;
        result = 31 * result + channelId;
        result = 31 * result + personId;
        result = 31 * result + (eventPersonId != null ? eventPersonId.hashCode() : 0);
        result = 31 * result + (eventContentId != null ? eventContentId.hashCode() : 0);
        result = 31 * result + (eventContainerId != null ? eventContainerId.hashCode() : 0);
        result = 31 * result + (eventOrganisationId != null ? eventOrganisationId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (organisationId != null ? organisationId.hashCode() : 0);
        result = 31 * result + (eventAccountId != null ? eventAccountId.hashCode() : 0);
        return result;
    }
}
