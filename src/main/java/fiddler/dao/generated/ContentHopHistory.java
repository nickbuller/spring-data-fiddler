package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "content_hop_history", schema = "public", catalog = "indoc")
public class ContentHopHistory {
    private int id;
    private int hopId;
    private int contentId;
    private Integer contentSnapshotId;
    private Integer creatorid;
    private LocalDateTime createdts;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "hop_id")
    public int getHopId() {
        return hopId;
    }

    public void setHopId(int hopId) {
        this.hopId = hopId;
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
    @Column(name = "content_snapshot_id")
    public Integer getContentSnapshotId() {
        return contentSnapshotId;
    }

    public void setContentSnapshotId(Integer contentSnapshotId) {
        this.contentSnapshotId = contentSnapshotId;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        ContentHopHistory that = (ContentHopHistory) object;

        if (id != that.id) return false;
        if (hopId != that.hopId) return false;
        if (contentId != that.contentId) return false;
        if (contentSnapshotId != null ? !contentSnapshotId.equals(that.contentSnapshotId) : that.contentSnapshotId != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + hopId;
        result = 31 * result + contentId;
        result = 31 * result + (contentSnapshotId != null ? contentSnapshotId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        return result;
    }
}
