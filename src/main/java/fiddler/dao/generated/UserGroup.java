package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_group", schema = "public", catalog = "indoc")
public class UserGroup {
    private int id;
    private Boolean allowExternalMembership;
    private int owningOrganisationId;
    private Integer termsAndConditionsId;
    private String name;
    private String description;
    private String canInherit;
    private Boolean allowAutoJoining;
    private int creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "allow_external_membership")
    public Boolean getAllowExternalMembership() {
        return allowExternalMembership;
    }

    public void setAllowExternalMembership(Boolean allowExternalMembership) {
        this.allowExternalMembership = allowExternalMembership;
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
    @Column(name = "terms_and_conditions_id")
    public Integer getTermsAndConditionsId() {
        return termsAndConditionsId;
    }

    public void setTermsAndConditionsId(Integer termsAndConditionsId) {
        this.termsAndConditionsId = termsAndConditionsId;
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
    @Column(name = "can_inherit")
    public String getCanInherit() {
        return canInherit;
    }

    public void setCanInherit(String canInherit) {
        this.canInherit = canInherit;
    }

    @Basic
    @Column(name = "allow_auto_joining")
    public Boolean getAllowAutoJoining() {
        return allowAutoJoining;
    }

    public void setAllowAutoJoining(Boolean allowAutoJoining) {
        this.allowAutoJoining = allowAutoJoining;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UserGroup userGroup = (UserGroup) object;

        if (id != userGroup.id) return false;
        if (owningOrganisationId != userGroup.owningOrganisationId) return false;
        if (creatorid != userGroup.creatorid) return false;
        if (allowExternalMembership != null ? !allowExternalMembership.equals(userGroup.allowExternalMembership) : userGroup.allowExternalMembership != null) return false;
        if (termsAndConditionsId != null ? !termsAndConditionsId.equals(userGroup.termsAndConditionsId) : userGroup.termsAndConditionsId != null) return false;
        if (name != null ? !name.equals(userGroup.name) : userGroup.name != null) return false;
        if (description != null ? !description.equals(userGroup.description) : userGroup.description != null) return false;
        if (canInherit != null ? !canInherit.equals(userGroup.canInherit) : userGroup.canInherit != null) return false;
        if (allowAutoJoining != null ? !allowAutoJoining.equals(userGroup.allowAutoJoining) : userGroup.allowAutoJoining != null) return false;
        if (createdts != null ? !createdts.equals(userGroup.createdts) : userGroup.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(userGroup.modifierid) : userGroup.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(userGroup.modifiedts) : userGroup.modifiedts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (allowExternalMembership != null ? allowExternalMembership.hashCode() : 0);
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (termsAndConditionsId != null ? termsAndConditionsId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (canInherit != null ? canInherit.hashCode() : 0);
        result = 31 * result + (allowAutoJoining != null ? allowAutoJoining.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        return result;
    }
}
