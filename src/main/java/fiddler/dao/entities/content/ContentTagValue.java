package fiddler.dao.entities.content;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "content_tag_value", schema = "public", catalog = "indoc")
public class ContentTagValue {
    private int id;
    private Integer contentId;
    private Integer contentTagId;
    private Integer tagDataId;
    private Integer erAttachmentId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content_id")
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "content_tag_id")
    public Integer getContentTagId() {
        return contentTagId;
    }

    public void setContentTagId(Integer contentTagId) {
        this.contentTagId = contentTagId;
    }

    @Basic
    @Column(name = "tag_data_id")
    public Integer getTagDataId() {
        return tagDataId;
    }

    public void setTagDataId(Integer tagDataId) {
        this.tagDataId = tagDataId;
    }

    @Basic
    @Column(name = "er_attachment_id")
    public Integer getErAttachmentId() {
        return erAttachmentId;
    }

    public void setErAttachmentId(Integer erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        ContentTagValue that = (ContentTagValue) object;

        if (id != that.id) return false;
        if (contentId != null ? !contentId.equals(that.contentId) : that.contentId != null) return false;
        if (contentTagId != null ? !contentTagId.equals(that.contentTagId) : that.contentTagId != null) return false;
        if (tagDataId != null ? !tagDataId.equals(that.tagDataId) : that.tagDataId != null) return false;
        if (erAttachmentId != null ? !erAttachmentId.equals(that.erAttachmentId) : that.erAttachmentId != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
		return modifierid != null ? modifierid.equals(that.modifierid) : that.modifierid == null;
	}

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (contentId != null ? contentId.hashCode() : 0);
        result = 31 * result + (contentTagId != null ? contentTagId.hashCode() : 0);
        result = 31 * result + (tagDataId != null ? tagDataId.hashCode() : 0);
        result = 31 * result + (erAttachmentId != null ? erAttachmentId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
