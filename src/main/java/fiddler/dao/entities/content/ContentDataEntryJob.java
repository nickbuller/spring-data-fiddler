package fiddler.dao.entities.content;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "content_data_entry_job", schema = "public", catalog = "indoc")
public class ContentDataEntryJob {
    private int id;
    private int dataEntryJobId;
    private int contentId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "data_entry_job_id")
    public int getDataEntryJobId() {
        return dataEntryJobId;
    }

    public void setDataEntryJobId(int dataEntryJobId) {
        this.dataEntryJobId = dataEntryJobId;
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

        ContentDataEntryJob that = (ContentDataEntryJob) object;

        if (id != that.id) return false;
        if (dataEntryJobId != that.dataEntryJobId) return false;
        if (contentId != that.contentId) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
		return modifierid != null ? modifierid.equals(that.modifierid) : that.modifierid == null;
	}

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + dataEntryJobId;
        result = 31 * result + contentId;
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
