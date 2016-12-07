package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Notification {
    private int id;
    private Serializable channels;
    private Serializable message;
    private LocalDateTime createdts;
    private Integer userId;
    private Boolean isread;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "channels")
    public java.io.Serializable getChannels() {
        return channels;
    }

    public void setChannels(java.io.Serializable channels) {
        this.channels = channels;
    }

    @Basic
    @Column(name = "message")
    public java.io.Serializable getMessage() {
        return message;
    }

    public void setMessage(java.io.Serializable message) {
        this.message = message;
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
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "isread")
    public Boolean getIsread() {
        return isread;
    }

    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Notification that = (Notification) object;

        if (id != that.id) return false;
        if (channels != null ? !channels.equals(that.channels) : that.channels != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (isread != null ? !isread.equals(that.isread) : that.isread != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (channels != null ? channels.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (isread != null ? isread.hashCode() : 0);
        return result;
    }
}
