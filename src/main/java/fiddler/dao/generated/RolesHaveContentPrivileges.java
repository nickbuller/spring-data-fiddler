package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "roles_have_content_privileges", schema = "public", catalog = "indoc")
public class RolesHaveContentPrivileges {
    private int id;
    private int roleId;
    private int privilegeId;
    private Integer contentId;
    private Integer contentRbacId;
    private String isAllowed;
    private Integer creatorid;
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
    @Column(name = "role_id")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "privilege_id")
    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Basic
    @Column(name = "content_id")
    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    @Basic
    @Column(name = "content_rbac_id")
    public Integer getContentRbacId() {
        return contentRbacId;
    }

    public void setContentRbacId(Integer contentRbacId) {
        this.contentRbacId = contentRbacId;
    }

    @Basic
    @Column(name = "is_allowed")
    public String getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(String isAllowed) {
        this.isAllowed = isAllowed;
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

        RolesHaveContentPrivileges that = (RolesHaveContentPrivileges) object;

        if (id != that.id) return false;
        if (roleId != that.roleId) return false;
        if (privilegeId != that.privilegeId) return false;
        if (contentId != null ? !contentId.equals(that.contentId) : that.contentId != null) return false;
        if (contentRbacId != null ? !contentRbacId.equals(that.contentRbacId) : that.contentRbacId != null) return false;
        if (isAllowed != null ? !isAllowed.equals(that.isAllowed) : that.isAllowed != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + roleId;
        result = 31 * result + privilegeId;
        result = 31 * result + (contentId != null ? contentId.hashCode() : 0);
        result = 31 * result + (contentRbacId != null ? contentRbacId.hashCode() : 0);
        result = 31 * result + (isAllowed != null ? isAllowed.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        return result;
    }
}
