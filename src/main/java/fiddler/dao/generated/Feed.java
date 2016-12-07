package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Feed {
    private LocalDateTime lastSync;
    private LocalDateTime createdts;
    private Integer creatorid;
    private String digest;
    private String feedPath;
    private String feedTags;
    private int feedTypeId;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private Integer owningOrganisationId;
    private String publisher;
    private String publisherUrl;
    private Integer stateId;

    @Basic
    @Column(name = "last_sync")
    public LocalDateTime getLastSync() {
        return lastSync;
    }

    public void setLastSync(LocalDateTime lastSync) {
        this.lastSync = lastSync;
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
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
    }

    @Basic
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "feed_path")
    public String getFeedPath() {
        return feedPath;
    }

    public void setFeedPath(String feedPath) {
        this.feedPath = feedPath;
    }

    @Basic
    @Column(name = "feed_tags")
    public String getFeedTags() {
        return feedTags;
    }

    public void setFeedTags(String feedTags) {
        this.feedTags = feedTags;
    }

    @Basic
    @Column(name = "feed_type_id")
    public int getFeedTypeId() {
        return feedTypeId;
    }

    public void setFeedTypeId(int feedTypeId) {
        this.feedTypeId = feedTypeId;
    }

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "owning_organisation_id")
    public Integer getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(Integer owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
    }

    @Basic
    @Column(name = "publisher")
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Basic
    @Column(name = "publisher_url")
    public String getPublisherUrl() {
        return publisherUrl;
    }

    public void setPublisherUrl(String publisherUrl) {
        this.publisherUrl = publisherUrl;
    }

    @Basic
    @Column(name = "state_id")
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Feed feed = (Feed) object;

        if (feedTypeId != feed.feedTypeId) return false;
        if (id != feed.id) return false;
        if (lastSync != null ? !lastSync.equals(feed.lastSync) : feed.lastSync != null) return false;
        if (createdts != null ? !createdts.equals(feed.createdts) : feed.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(feed.creatorid) : feed.creatorid != null) return false;
        if (digest != null ? !digest.equals(feed.digest) : feed.digest != null) return false;
        if (feedPath != null ? !feedPath.equals(feed.feedPath) : feed.feedPath != null) return false;
        if (feedTags != null ? !feedTags.equals(feed.feedTags) : feed.feedTags != null) return false;
        if (modifiedts != null ? !modifiedts.equals(feed.modifiedts) : feed.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(feed.modifierid) : feed.modifierid != null) return false;
        if (name != null ? !name.equals(feed.name) : feed.name != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(feed.owningOrganisationId) : feed.owningOrganisationId != null) return false;
        if (publisher != null ? !publisher.equals(feed.publisher) : feed.publisher != null) return false;
        if (publisherUrl != null ? !publisherUrl.equals(feed.publisherUrl) : feed.publisherUrl != null) return false;
        if (stateId != null ? !stateId.equals(feed.stateId) : feed.stateId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lastSync != null ? lastSync.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (feedPath != null ? feedPath.hashCode() : 0);
        result = 31 * result + (feedTags != null ? feedTags.hashCode() : 0);
        result = 31 * result + feedTypeId;
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (publisherUrl != null ? publisherUrl.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        return result;
    }
}
