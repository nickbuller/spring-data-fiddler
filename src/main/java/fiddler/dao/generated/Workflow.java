package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Workflow {
    private int id;
    private String name;
    private String description;
    private String digest;
    private int workflowTypeId;
    private int owningOrganisationId;
    private boolean recordSnapshots;
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
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "workflow_type_id")
    public int getWorkflowTypeId() {
        return workflowTypeId;
    }

    public void setWorkflowTypeId(int workflowTypeId) {
        this.workflowTypeId = workflowTypeId;
    }

    @Basic
    @Column(name = "owning_organisation_id")
    public int getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(int owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
    }

    @Basic
    @Column(name = "record_snapshots")
    public boolean isRecordSnapshots() {
        return recordSnapshots;
    }

    public void setRecordSnapshots(boolean recordSnapshots) {
        this.recordSnapshots = recordSnapshots;
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

        Workflow workflow = (Workflow) object;

        if (id != workflow.id) return false;
        if (workflowTypeId != workflow.workflowTypeId) return false;
        if (owningOrganisationId != workflow.owningOrganisationId) return false;
        if (recordSnapshots != workflow.recordSnapshots) return false;
        if (name != null ? !name.equals(workflow.name) : workflow.name != null) return false;
        if (description != null ? !description.equals(workflow.description) : workflow.description != null) return false;
        if (digest != null ? !digest.equals(workflow.digest) : workflow.digest != null) return false;
        if (creatorid != null ? !creatorid.equals(workflow.creatorid) : workflow.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(workflow.createdts) : workflow.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(workflow.modifiedts) : workflow.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(workflow.modifierid) : workflow.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + workflowTypeId;
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (recordSnapshots ? 1 : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
