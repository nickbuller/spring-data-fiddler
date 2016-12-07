package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_action_log", schema = "public", catalog = "indoc")
public class UserActionLog {
    private int id;
    private Integer userId;
    private int actionId;
    private int domainId;
    private Integer objectEntityId;
    private LocalDateTime createdts;
    private String isAllowed;
    private String sessionId;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "action_id")
    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    @Basic
    @Column(name = "domain_id")
    public int getDomainId() {
        return domainId;
    }

    public void setDomainId(int domainId) {
        this.domainId = domainId;
    }

    @Basic
    @Column(name = "object_entity_id")
    public Integer getObjectEntityId() {
        return objectEntityId;
    }

    public void setObjectEntityId(Integer objectEntityId) {
        this.objectEntityId = objectEntityId;
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
    @Column(name = "is_allowed")
    public String getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(String isAllowed) {
        this.isAllowed = isAllowed;
    }

    @Basic
    @Column(name = "session_id")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UserActionLog that = (UserActionLog) object;

        if (id != that.id) return false;
        if (actionId != that.actionId) return false;
        if (domainId != that.domainId) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (objectEntityId != null ? !objectEntityId.equals(that.objectEntityId) : that.objectEntityId != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (isAllowed != null ? !isAllowed.equals(that.isAllowed) : that.isAllowed != null) return false;
        if (sessionId != null ? !sessionId.equals(that.sessionId) : that.sessionId != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + actionId;
        result = 31 * result + domainId;
        result = 31 * result + (objectEntityId != null ? objectEntityId.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (isAllowed != null ? isAllowed.hashCode() : 0);
        result = 31 * result + (sessionId != null ? sessionId.hashCode() : 0);
        return result;
    }
}
