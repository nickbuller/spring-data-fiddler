package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ontology_tag_value", schema = "public", catalog = "indoc")
public class OntologyTagValue {
    private LocalDateTime createdts;
    private Integer creatorid;
    private Integer erAttachmentId;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private int ontologyId;
    private int ontologyTagId;
    private int tagdataid;

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
    @Column(name = "er_attachment_id")
    public Integer getErAttachmentId() {
        return erAttachmentId;
    }

    public void setErAttachmentId(Integer erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
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
    @Column(name = "ontology_id")
    public int getOntologyId() {
        return ontologyId;
    }

    public void setOntologyId(int ontologyId) {
        this.ontologyId = ontologyId;
    }

    @Basic
    @Column(name = "ontology_tag_id")
    public int getOntologyTagId() {
        return ontologyTagId;
    }

    public void setOntologyTagId(int ontologyTagId) {
        this.ontologyTagId = ontologyTagId;
    }

    @Basic
    @Column(name = "tagdataid")
    public int getTagdataid() {
        return tagdataid;
    }

    public void setTagdataid(int tagdataid) {
        this.tagdataid = tagdataid;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        OntologyTagValue that = (OntologyTagValue) object;

        if (id != that.id) return false;
        if (ontologyId != that.ontologyId) return false;
        if (ontologyTagId != that.ontologyTagId) return false;
        if (tagdataid != that.tagdataid) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(that.creatorid) : that.creatorid != null) return false;
        if (erAttachmentId != null ? !erAttachmentId.equals(that.erAttachmentId) : that.erAttachmentId != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (erAttachmentId != null ? erAttachmentId.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + ontologyId;
        result = 31 * result + ontologyTagId;
        result = 31 * result + tagdataid;
        return result;
    }
}
