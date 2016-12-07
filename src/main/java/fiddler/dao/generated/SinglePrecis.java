package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "single_precis", schema = "public", catalog = "indoc")
public class SinglePrecis {
    private int articleId;
    private LocalDateTime createdts;
    private int creatorId;
    private int id;
    private int level;
    private LocalDateTime modifiedts;
    private int modifierId;
    private String precisText;

    @Basic
    @Column(name = "article_id")
    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
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
    @Column(name = "creator_id")
    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
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
    @Column(name = "level")
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
    @Column(name = "modifier_id")
    public int getModifierId() {
        return modifierId;
    }

    public void setModifierId(int modifierId) {
        this.modifierId = modifierId;
    }

    @Basic
    @Column(name = "precis_text")
    public String getPrecisText() {
        return precisText;
    }

    public void setPrecisText(String precisText) {
        this.precisText = precisText;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        SinglePrecis that = (SinglePrecis) object;

        if (articleId != that.articleId) return false;
        if (creatorId != that.creatorId) return false;
        if (id != that.id) return false;
        if (level != that.level) return false;
        if (modifierId != that.modifierId) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (precisText != null ? !precisText.equals(that.precisText) : that.precisText != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + articleId;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + creatorId;
        result = 31 * result + id;
        result = 31 * result + level;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + modifierId;
        result = 31 * result + (precisText != null ? precisText.hashCode() : 0);
        return result;
    }
}
