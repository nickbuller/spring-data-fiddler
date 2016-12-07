package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Privilege {
    private int id;
    private String name;
    private String description;
    private Integer organisationId;
    private String canInherit;
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
    @Column(name = "organisation_id")
    public Integer getOrganisationId() {
        return organisationId;
    }

    public void setOrganisationId(Integer organisationId) {
        this.organisationId = organisationId;
    }

    @Basic
    @Column(name = "can_inherit")
    public String getCanInherit() {
        return canInherit;
    }

    public void setCanInherit(String canInherit) {
        this.canInherit = canInherit;
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

        Privilege privilege = (Privilege) object;

        if (id != privilege.id) return false;
        if (name != null ? !name.equals(privilege.name) : privilege.name != null) return false;
        if (description != null ? !description.equals(privilege.description) : privilege.description != null) return false;
        if (organisationId != null ? !organisationId.equals(privilege.organisationId) : privilege.organisationId != null) return false;
        if (canInherit != null ? !canInherit.equals(privilege.canInherit) : privilege.canInherit != null) return false;
        if (creatorid != null ? !creatorid.equals(privilege.creatorid) : privilege.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(privilege.createdts) : privilege.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(privilege.modifiedts) : privilege.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(privilege.modifierid) : privilege.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (organisationId != null ? organisationId.hashCode() : 0);
        result = 31 * result + (canInherit != null ? canInherit.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
