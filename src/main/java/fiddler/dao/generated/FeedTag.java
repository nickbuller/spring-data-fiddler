package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "feed_tag", schema = "public", catalog = "indoc")
public class FeedTag {
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private int id;
    private boolean isPrivate;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private Integer owningOrganisationId;
    private Integer tagformatid;

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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "private")
    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
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
    @Column(name = "tagformatid")
    public Integer getTagformatid() {
        return tagformatid;
    }

    public void setTagformatid(Integer tagformatid) {
        this.tagformatid = tagformatid;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        FeedTag feedTag = (FeedTag) object;

        if (id != feedTag.id) return false;
        if (isPrivate != feedTag.isPrivate) return false;
        if (createdts != null ? !createdts.equals(feedTag.createdts) : feedTag.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(feedTag.creatorid) : feedTag.creatorid != null) return false;
        if (description != null ? !description.equals(feedTag.description) : feedTag.description != null) return false;
        if (modifiedts != null ? !modifiedts.equals(feedTag.modifiedts) : feedTag.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(feedTag.modifierid) : feedTag.modifierid != null) return false;
        if (name != null ? !name.equals(feedTag.name) : feedTag.name != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(feedTag.owningOrganisationId) : feedTag.owningOrganisationId != null) return false;
        if (tagformatid != null ? !tagformatid.equals(feedTag.tagformatid) : feedTag.tagformatid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (isPrivate ? 1 : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (tagformatid != null ? tagformatid.hashCode() : 0);
        return result;
    }
}
