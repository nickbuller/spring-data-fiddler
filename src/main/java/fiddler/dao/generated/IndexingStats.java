package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "indexing_stats", schema = "public", catalog = "indoc")
public class IndexingStats {
    private int id;
    private int projectId;
    private int dataEntryJobId;
    private int indexerId;
    private Boolean indexed;
    private Integer indexingTime;
    private Integer charactersRecorded;
    private Integer tagsRecorded;
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
    @Column(name = "project_id")
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
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
    @Column(name = "indexer_id")
    public int getIndexerId() {
        return indexerId;
    }

    public void setIndexerId(int indexerId) {
        this.indexerId = indexerId;
    }

    @Basic
    @Column(name = "indexed")
    public Boolean getIndexed() {
        return indexed;
    }

    public void setIndexed(Boolean indexed) {
        this.indexed = indexed;
    }

    @Basic
    @Column(name = "indexing_time")
    public Integer getIndexingTime() {
        return indexingTime;
    }

    public void setIndexingTime(Integer indexingTime) {
        this.indexingTime = indexingTime;
    }

    @Basic
    @Column(name = "characters_recorded")
    public Integer getCharactersRecorded() {
        return charactersRecorded;
    }

    public void setCharactersRecorded(Integer charactersRecorded) {
        this.charactersRecorded = charactersRecorded;
    }

    @Basic
    @Column(name = "tags_recorded")
    public Integer getTagsRecorded() {
        return tagsRecorded;
    }

    public void setTagsRecorded(Integer tagsRecorded) {
        this.tagsRecorded = tagsRecorded;
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

        IndexingStats that = (IndexingStats) object;

        if (id != that.id) return false;
        if (projectId != that.projectId) return false;
        if (dataEntryJobId != that.dataEntryJobId) return false;
        if (indexerId != that.indexerId) return false;
        if (indexed != null ? !indexed.equals(that.indexed) : that.indexed != null) return false;
        if (indexingTime != null ? !indexingTime.equals(that.indexingTime) : that.indexingTime != null) return false;
        if (charactersRecorded != null ? !charactersRecorded.equals(that.charactersRecorded) : that.charactersRecorded != null) return false;
        if (tagsRecorded != null ? !tagsRecorded.equals(that.tagsRecorded) : that.tagsRecorded != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + projectId;
        result = 31 * result + dataEntryJobId;
        result = 31 * result + indexerId;
        result = 31 * result + (indexed != null ? indexed.hashCode() : 0);
        result = 31 * result + (indexingTime != null ? indexingTime.hashCode() : 0);
        result = 31 * result + (charactersRecorded != null ? charactersRecorded.hashCode() : 0);
        result = 31 * result + (tagsRecorded != null ? tagsRecorded.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
