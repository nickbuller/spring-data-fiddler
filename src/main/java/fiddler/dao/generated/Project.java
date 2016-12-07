package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Project {
    private int id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
    private int rootContainerId;
    private int indexingContainerId;
    private String counterpartyRef;
    private int owningOrganisationId;
    private Integer counterpartyOrganisationId;
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
    @Column(name = "start_date")
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "end_date")
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "root_container_id")
    public int getRootContainerId() {
        return rootContainerId;
    }

    public void setRootContainerId(int rootContainerId) {
        this.rootContainerId = rootContainerId;
    }

    @Basic
    @Column(name = "indexing_container_id")
    public int getIndexingContainerId() {
        return indexingContainerId;
    }

    public void setIndexingContainerId(int indexingContainerId) {
        this.indexingContainerId = indexingContainerId;
    }

    @Basic
    @Column(name = "counterparty_ref")
    public String getCounterpartyRef() {
        return counterpartyRef;
    }

    public void setCounterpartyRef(String counterpartyRef) {
        this.counterpartyRef = counterpartyRef;
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
    @Column(name = "counterparty_organisation_id")
    public Integer getCounterpartyOrganisationId() {
        return counterpartyOrganisationId;
    }

    public void setCounterpartyOrganisationId(Integer counterpartyOrganisationId) {
        this.counterpartyOrganisationId = counterpartyOrganisationId;
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

        Project project = (Project) object;

        if (id != project.id) return false;
        if (rootContainerId != project.rootContainerId) return false;
        if (indexingContainerId != project.indexingContainerId) return false;
        if (owningOrganisationId != project.owningOrganisationId) return false;
        if (creatorid != project.creatorid) return false;
        if (name != null ? !name.equals(project.name) : project.name != null) return false;
        if (description != null ? !description.equals(project.description) : project.description != null) return false;
        if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
        if (endDate != null ? !endDate.equals(project.endDate) : project.endDate != null) return false;
        if (status != null ? !status.equals(project.status) : project.status != null) return false;
        if (counterpartyRef != null ? !counterpartyRef.equals(project.counterpartyRef) : project.counterpartyRef != null) return false;
        if (counterpartyOrganisationId != null ? !counterpartyOrganisationId.equals(project.counterpartyOrganisationId) : project.counterpartyOrganisationId != null) return false;
        if (createdts != null ? !createdts.equals(project.createdts) : project.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(project.modifiedts) : project.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(project.modifierid) : project.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + rootContainerId;
        result = 31 * result + indexingContainerId;
        result = 31 * result + (counterpartyRef != null ? counterpartyRef.hashCode() : 0);
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (counterpartyOrganisationId != null ? counterpartyOrganisationId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
