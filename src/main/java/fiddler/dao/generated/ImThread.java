package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "im_thread", schema = "public", catalog = "indoc")
public class ImThread {
    private Integer lastMessageId;
    private String name;
    private int id;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;

    @Basic
    @Column(name = "last_message_id")
    public Integer getLastMessageId() {
        return lastMessageId;
    }

    public void setLastMessageId(Integer lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        ImThread imThread = (ImThread) object;

        if (id != imThread.id) return false;
        if (lastMessageId != null ? !lastMessageId.equals(imThread.lastMessageId) : imThread.lastMessageId != null) return false;
        if (name != null ? !name.equals(imThread.name) : imThread.name != null) return false;
        if (createdts != null ? !createdts.equals(imThread.createdts) : imThread.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(imThread.modifiedts) : imThread.modifiedts != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lastMessageId != null ? lastMessageId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        return result;
    }
}
