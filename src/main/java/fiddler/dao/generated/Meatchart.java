package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Meatchart {
    private LocalDateTime createdts;
    private Integer creatorId;
    private int feedId;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierId;
    private String name;
    private int recipeXmlAttachmentId;
    private Integer stateId;

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    @Basic
    @Column(name = "creator_id")
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    @Basic
    @Column(name = "feed_id")
    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
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
    @Column(name = "modifier_id")
    public Integer getModifierId() {
        return modifierId;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
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
    @Column(name = "recipe_xml_attachment_id")
    public int getRecipeXmlAttachmentId() {
        return recipeXmlAttachmentId;
    }

    public void setRecipeXmlAttachmentId(int recipeXmlAttachmentId) {
        this.recipeXmlAttachmentId = recipeXmlAttachmentId;
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

        Meatchart meatchart = (Meatchart) object;

        if (feedId != meatchart.feedId) return false;
        if (id != meatchart.id) return false;
        if (recipeXmlAttachmentId != meatchart.recipeXmlAttachmentId) return false;
        if (createdts != null ? !createdts.equals(meatchart.createdts) : meatchart.createdts != null) return false;
        if (creatorId != null ? !creatorId.equals(meatchart.creatorId) : meatchart.creatorId != null) return false;
        if (modifiedts != null ? !modifiedts.equals(meatchart.modifiedts) : meatchart.modifiedts != null) return false;
        if (modifierId != null ? !modifierId.equals(meatchart.modifierId) : meatchart.modifierId != null) return false;
        if (name != null ? !name.equals(meatchart.name) : meatchart.name != null) return false;
        if (stateId != null ? !stateId.equals(meatchart.stateId) : meatchart.stateId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorId != null ? creatorId.hashCode() : 0);
        result = 31 * result + feedId;
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierId != null ? modifierId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + recipeXmlAttachmentId;
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        return result;
    }
}
