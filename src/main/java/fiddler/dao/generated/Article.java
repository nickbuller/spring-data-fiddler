package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Article {
    private int articleTypeId;
    private String author;
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private String digest;
    private int feedId;
    private int id;
    private int meatchartId;
    private Double meatchartScore;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private int owningOrganisationId;
    private LocalDateTime publishedOn;
    private int stateId;
    private String url;

    @Basic
    @Column(name = "article_type_id")
    public int getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(int articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
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
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "feed_id")
    public int getFeedId() {
        return feedId;
    }

    public void setFeedId(int feedId) {
        this.feedId = feedId;
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
    @Column(name = "meatchart_id")
    public int getMeatchartId() {
        return meatchartId;
    }

    public void setMeatchartId(int meatchartId) {
        this.meatchartId = meatchartId;
    }

    @Basic
    @Column(name = "meatchart_score")
    public Double getMeatchartScore() {
        return meatchartScore;
    }

    public void setMeatchartScore(Double meatchartScore) {
        this.meatchartScore = meatchartScore;
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

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "published_on")
    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }

    @Basic
    @Column(name = "state_id")
    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Article article = (Article) object;

        if (articleTypeId != article.articleTypeId) return false;
        if (feedId != article.feedId) return false;
        if (id != article.id) return false;
        if (meatchartId != article.meatchartId) return false;
        if (owningOrganisationId != article.owningOrganisationId) return false;
        if (stateId != article.stateId) return false;
        if (author != null ? !author.equals(article.author) : article.author != null) return false;
        if (createdts != null ? !createdts.equals(article.createdts) : article.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(article.creatorid) : article.creatorid != null) return false;
        if (description != null ? !description.equals(article.description) : article.description != null) return false;
        if (digest != null ? !digest.equals(article.digest) : article.digest != null) return false;
        if (meatchartScore != null ? !meatchartScore.equals(article.meatchartScore) : article.meatchartScore != null) return false;
        if (modifiedts != null ? !modifiedts.equals(article.modifiedts) : article.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(article.modifierid) : article.modifierid != null) return false;
        if (name != null ? !name.equals(article.name) : article.name != null) return false;
        if (publishedOn != null ? !publishedOn.equals(article.publishedOn) : article.publishedOn != null) return false;
        if (url != null ? !url.equals(article.url) : article.url != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + articleTypeId;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + feedId;
        result = 31 * result + id;
        result = 31 * result + meatchartId;
        result = 31 * result + (meatchartScore != null ? meatchartScore.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (publishedOn != null ? publishedOn.hashCode() : 0);
        result = 31 * result + stateId;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
