package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Role {
    private int id;
    private String name;
    private String description;
    private int importance;
    private int owningOrganisationId;
    private String canInherit;
    private Integer modifierid;
    private LocalDateTime modifiedts;
    private Integer creatorid;
    private LocalDateTime createdts;

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
    @Column(name = "importance")
    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
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
    @Column(name = "can_inherit")
    public String getCanInherit() {
        return canInherit;
    }

    public void setCanInherit(String canInherit) {
        this.canInherit = canInherit;
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
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
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

        Role role = (Role) object;

        if (id != role.id) return false;
        if (importance != role.importance) return false;
        if (owningOrganisationId != role.owningOrganisationId) return false;
        if (name != null ? !name.equals(role.name) : role.name != null) return false;
        if (description != null ? !description.equals(role.description) : role.description != null) return false;
        if (canInherit != null ? !canInherit.equals(role.canInherit) : role.canInherit != null) return false;
        if (modifierid != null ? !modifierid.equals(role.modifierid) : role.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(role.modifiedts) : role.modifiedts != null) return false;
        if (creatorid != null ? !creatorid.equals(role.creatorid) : role.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(role.createdts) : role.createdts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + importance;
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (canInherit != null ? canInherit.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        return result;
    }
}
