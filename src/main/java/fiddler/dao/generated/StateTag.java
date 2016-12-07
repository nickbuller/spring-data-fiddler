package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "state_tag", schema = "public", catalog = "indoc")
public class StateTag {
    private int id;
    private Integer tagFormatId;
    private String name;
    private String description;
    private Boolean isPrivate;
    private Integer owningOrganisationId;
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
    @Column(name = "tag_format_id")
    public Integer getTagFormatId() {
        return tagFormatId;
    }

    public void setTagFormatId(Integer tagFormatId) {
        this.tagFormatId = tagFormatId;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "private")
    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
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

        StateTag stateTag = (StateTag) object;

        if (id != stateTag.id) return false;
        if (tagFormatId != null ? !tagFormatId.equals(stateTag.tagFormatId) : stateTag.tagFormatId != null) return false;
        if (name != null ? !name.equals(stateTag.name) : stateTag.name != null) return false;
        if (description != null ? !description.equals(stateTag.description) : stateTag.description != null) return false;
        if (isPrivate != null ? !isPrivate.equals(stateTag.isPrivate) : stateTag.isPrivate != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(stateTag.owningOrganisationId) : stateTag.owningOrganisationId != null) return false;
        if (creatorid != null ? !creatorid.equals(stateTag.creatorid) : stateTag.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(stateTag.createdts) : stateTag.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(stateTag.modifiedts) : stateTag.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(stateTag.modifierid) : stateTag.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (tagFormatId != null ? tagFormatId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
