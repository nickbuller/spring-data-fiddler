package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_preference_tag_value", schema = "public", catalog = "indoc")
public class UserPreferenceTagValue {
    private int id;
    private Integer userPreferenceId;
    private Integer userPreferenceTagId;
    private Integer tagDataId;
    private int creatorid;
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
    @Column(name = "user_preference_id")
    public Integer getUserPreferenceId() {
        return userPreferenceId;
    }

    public void setUserPreferenceId(Integer userPreferenceId) {
        this.userPreferenceId = userPreferenceId;
    }

    @Basic
    @Column(name = "user_preference_tag_id")
    public Integer getUserPreferenceTagId() {
        return userPreferenceTagId;
    }

    public void setUserPreferenceTagId(Integer userPreferenceTagId) {
        this.userPreferenceTagId = userPreferenceTagId;
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
    @Column(name = "creatorid")
    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
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

        UserPreferenceTagValue that = (UserPreferenceTagValue) object;

        if (id != that.id) return false;
        if (creatorid != that.creatorid) return false;
        if (userPreferenceId != null ? !userPreferenceId.equals(that.userPreferenceId) : that.userPreferenceId != null) return false;
        if (userPreferenceTagId != null ? !userPreferenceTagId.equals(that.userPreferenceTagId) : that.userPreferenceTagId != null) return false;
        if (tagDataId != null ? !tagDataId.equals(that.tagDataId) : that.tagDataId != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (userPreferenceId != null ? userPreferenceId.hashCode() : 0);
        result = 31 * result + (userPreferenceTagId != null ? userPreferenceTagId.hashCode() : 0);
        result = 31 * result + (tagDataId != null ? tagDataId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
