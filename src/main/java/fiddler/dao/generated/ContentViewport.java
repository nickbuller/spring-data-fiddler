package fiddler.dao.generated;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "content_viewport", schema = "public", catalog = "indoc")
public class ContentViewport {
    private int id;
    private int contentTypeId;
    private BigDecimal xOffsetFactor;
    private BigDecimal yOffsetFactor;
    private BigDecimal widthFactor;
    private BigDecimal heightFactor;
    private Integer owningOrganisationId;
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
    @Column(name = "content_type_id")
    public int getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(int contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    @Basic
    @Column(name = "x_offset_factor")
    public java.math.BigDecimal getxOffsetFactor() {
        return xOffsetFactor;
    }

    public void setxOffsetFactor(java.math.BigDecimal xOffsetFactor) {
        this.xOffsetFactor = xOffsetFactor;
    }

    @Basic
    @Column(name = "y_offset_factor")
    public java.math.BigDecimal getyOffsetFactor() {
        return yOffsetFactor;
    }

    public void setyOffsetFactor(java.math.BigDecimal yOffsetFactor) {
        this.yOffsetFactor = yOffsetFactor;
    }

    @Basic
    @Column(name = "width_factor")
    public java.math.BigDecimal getWidthFactor() {
        return widthFactor;
    }

    public void setWidthFactor(java.math.BigDecimal widthFactor) {
        this.widthFactor = widthFactor;
    }

    @Basic
    @Column(name = "height_factor")
    public java.math.BigDecimal getHeightFactor() {
        return heightFactor;
    }

    public void setHeightFactor(java.math.BigDecimal heightFactor) {
        this.heightFactor = heightFactor;
    }

    @Basic
    @Column(name = "owning_organisation_id")
    public Integer getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(Integer owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
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

        ContentViewport that = (ContentViewport) object;

        if (id != that.id) return false;
        if (contentTypeId != that.contentTypeId) return false;
        if (creatorid != that.creatorid) return false;
        if (xOffsetFactor != null ? !xOffsetFactor.equals(that.xOffsetFactor) : that.xOffsetFactor != null) return false;
        if (yOffsetFactor != null ? !yOffsetFactor.equals(that.yOffsetFactor) : that.yOffsetFactor != null) return false;
        if (widthFactor != null ? !widthFactor.equals(that.widthFactor) : that.widthFactor != null) return false;
        if (heightFactor != null ? !heightFactor.equals(that.heightFactor) : that.heightFactor != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(that.owningOrganisationId) : that.owningOrganisationId != null) return false;
        if (createdts != null ? !createdts.equals(that.createdts) : that.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(that.modifiedts) : that.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(that.modifierid) : that.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + contentTypeId;
        result = 31 * result + (xOffsetFactor != null ? xOffsetFactor.hashCode() : 0);
        result = 31 * result + (yOffsetFactor != null ? yOffsetFactor.hashCode() : 0);
        result = 31 * result + (widthFactor != null ? widthFactor.hashCode() : 0);
        result = 31 * result + (heightFactor != null ? heightFactor.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
