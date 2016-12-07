package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "creatable_type", schema = "public", catalog = "indoc")
public class CreatableType {
    private int id;
    private String scope;
    private int organisationId;
    private Integer organisationTypeId;
    private Integer containerTypeId;
    private Integer personTypeId;
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
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "organisation_id")
    public int getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(int organisationId) {
        this.organisationId = organisationId;
    }

    @Basic
    @Column(name = "organisation_type_id")
    public Integer getOrganisationTypeId() {
        return organisationTypeId;
    }

    public void setOrganisationTypeId(Integer organisationTypeId) {
        this.organisationTypeId = organisationTypeId;
    }

    @Basic
    @Column(name = "container_type_id")
    public Integer getContainerTypeId() {
        return containerTypeId;
    }

    public void setContainerTypeId(Integer containerTypeId) {
        this.containerTypeId = containerTypeId;
    }

    @Basic
    @Column(name = "person_type_id")
    public Integer getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Integer personTypeId) {
        this.personTypeId = personTypeId;
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

        CreatableType that = (CreatableType) object;

        if (id != that.id) return false;
        if (organisationId != that.organisationId) return false;
        if (creatorid != that.creatorid) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (organisationTypeId != null ? !organisationTypeId.equals(that.organisationTypeId) : that.organisationTypeId != null) return false;
        if (containerTypeId != null ? !containerTypeId.equals(that.containerTypeId) : that.containerTypeId != null) return false;
        if (personTypeId != null ? !personTypeId.equals(that.personTypeId) : that.personTypeId != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + organisationId;
        result = 31 * result + (organisationTypeId != null ? organisationTypeId.hashCode() : 0);
        result = 31 * result + (containerTypeId != null ? containerTypeId.hashCode() : 0);
        result = 31 * result + (personTypeId != null ? personTypeId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
