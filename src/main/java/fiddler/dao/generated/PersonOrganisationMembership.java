package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person_organisation_membership", schema = "public", catalog = "indoc")
public class PersonOrganisationMembership {
    private int id;
    private Integer personId;
    private int organisationId;
    private boolean isPrimaryMembership;
    private String status;
    private boolean isDefaultForLogin;
    private boolean isLoggedIn;
    private String currentSessionId;
    private LocalDateTime lastLoggedIn;
    private LocalDateTime lastLoggedOut;
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
    @Column(name = "person_id")
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
    @Column(name = "is_primary_membership")
    public boolean isPrimaryMembership() {
        return isPrimaryMembership;
    }

    public void setPrimaryMembership(boolean primaryMembership) {
        isPrimaryMembership = primaryMembership;
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
    @Column(name = "is_default_for_login")
    public boolean isDefaultForLogin() {
        return isDefaultForLogin;
    }

    public void setDefaultForLogin(boolean defaultForLogin) {
        isDefaultForLogin = defaultForLogin;
    }

    @Basic
    @Column(name = "is_logged_in")
    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    @Basic
    @Column(name = "current_session_id")
    public String getCurrentSessionId() {
        return currentSessionId;
    }

    public void setCurrentSessionId(String currentSessionId) {
        this.currentSessionId = currentSessionId;
    }

    @Basic
    @Column(name = "last_logged_in")
    public LocalDateTime getLastLoggedIn() {
        return lastLoggedIn;
    }

    public void setLastLoggedIn(LocalDateTime lastLoggedIn) {
        this.lastLoggedIn = lastLoggedIn;
    }

    @Basic
    @Column(name = "last_logged_out")
    public LocalDateTime getLastLoggedOut() {
        return lastLoggedOut;
    }

    public void setLastLoggedOut(LocalDateTime lastLoggedOut) {
        this.lastLoggedOut = lastLoggedOut;
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

        PersonOrganisationMembership that = (PersonOrganisationMembership) object;

        if (id != that.id) return false;
        if (organisationId != that.organisationId) return false;
        if (isPrimaryMembership != that.isPrimaryMembership) return false;
        if (isDefaultForLogin != that.isDefaultForLogin) return false;
        if (isLoggedIn != that.isLoggedIn) return false;
        if (creatorid != that.creatorid) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (currentSessionId != null ? !currentSessionId.equals(that.currentSessionId) : that.currentSessionId != null) return false;
        if (lastLoggedIn != null ? !lastLoggedIn.equals(that.lastLoggedIn) : that.lastLoggedIn != null) return false;
        if (lastLoggedOut != null ? !lastLoggedOut.equals(that.lastLoggedOut) : that.lastLoggedOut != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + organisationId;
        result = 31 * result + (isPrimaryMembership ? 1 : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (isDefaultForLogin ? 1 : 0);
        result = 31 * result + (isLoggedIn ? 1 : 0);
        result = 31 * result + (currentSessionId != null ? currentSessionId.hashCode() : 0);
        result = 31 * result + (lastLoggedIn != null ? lastLoggedIn.hashCode() : 0);
        result = 31 * result + (lastLoggedOut != null ? lastLoggedOut.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
