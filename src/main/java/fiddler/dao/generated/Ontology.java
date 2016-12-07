package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;


@Entity
public class Ontology {
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private String digest;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private int ontologyTypeId;
    private Integer owningOrganisationId;
    private int stateId;

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
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
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
    @Column(name = "ontology_type_id")
    public int getOntologyTypeId() {
        return ontologyTypeId;
    }

    public void setOntologyTypeId(int ontologyTypeId) {
        this.ontologyTypeId = ontologyTypeId;
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
    @Column(name = "state_id")
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Ontology ontology = (Ontology) object;

        if (id != ontology.id) return false;
        if (ontologyTypeId != ontology.ontologyTypeId) return false;
        if (stateId != ontology.stateId) return false;
        if (createdts != null ? !createdts.equals(ontology.createdts) : ontology.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(ontology.creatorid) : ontology.creatorid != null) return false;
        if (description != null ? !description.equals(ontology.description) : ontology.description != null) return false;
        if (digest != null ? !digest.equals(ontology.digest) : ontology.digest != null) return false;
        if (modifiedts != null ? !modifiedts.equals(ontology.modifiedts) : ontology.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(ontology.modifierid) : ontology.modifierid != null) return false;
        if (name != null ? !name.equals(ontology.name) : ontology.name != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(ontology.owningOrganisationId) : ontology.owningOrganisationId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + ontologyTypeId;
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + stateId;
        return result;
    }
}
