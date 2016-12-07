package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Section {
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private Integer erAttachmentId;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private String colourCode;
    private Integer owningOrganisationId;
    private Integer parentSectionId;
    private String scope;
    private Boolean synched;
    private Boolean enabled;

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

    @Basic
    @Column(name = "er_attachment_id")
    public Integer getErAttachmentId() {
        return erAttachmentId;
    }

    public void setErAttachmentId(Integer erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
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
    @Column(name = "colour_code")
    public String getColourCode() {
        return colourCode;
    }

    public void setColourCode(String colourCode) {
        this.colourCode = colourCode;
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
    @Column(name = "parent_section_id")
    public Integer getParentSectionId() {
        return parentSectionId;
    }

    public void setParentSectionId(Integer parentSectionId) {
        this.parentSectionId = parentSectionId;
    }

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "synched")
    public Boolean getSynched() {
        return synched;
    }

    public void setSynched(Boolean synched) {
        this.synched = synched;
    }

    @Basic
    @Column(name = "enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Section section = (Section) object;

        if (id != section.id) return false;
        if (createdts != null ? !createdts.equals(section.createdts) : section.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(section.creatorid) : section.creatorid != null) return false;
        if (description != null ? !description.equals(section.description) : section.description != null) return false;
        if (erAttachmentId != null ? !erAttachmentId.equals(section.erAttachmentId) : section.erAttachmentId != null) return false;
        if (modifiedts != null ? !modifiedts.equals(section.modifiedts) : section.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(section.modifierid) : section.modifierid != null) return false;
        if (name != null ? !name.equals(section.name) : section.name != null) return false;
        if (colourCode != null ? !colourCode.equals(section.colourCode) : section.colourCode != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(section.owningOrganisationId) : section.owningOrganisationId != null) return false;
        if (parentSectionId != null ? !parentSectionId.equals(section.parentSectionId) : section.parentSectionId != null) return false;
        if (scope != null ? !scope.equals(section.scope) : section.scope != null) return false;
        if (synched != null ? !synched.equals(section.synched) : section.synched != null) return false;
        if (enabled != null ? !enabled.equals(section.enabled) : section.enabled != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (erAttachmentId != null ? erAttachmentId.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (colourCode != null ? colourCode.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (parentSectionId != null ? parentSectionId.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (synched != null ? synched.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        return result;
    }
}
