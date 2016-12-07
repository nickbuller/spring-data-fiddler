package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Ad {
    private int adgroupid;
    private LocalDateTime createdts;
    private Integer creatorid;
    private String digest;
    private String displayUrl;
    private Integer erattachmentid;
    private String haikuLine1;
    private String haikuLine2;
    private String haikuLine3;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Basic
    @Column(name = "adgroupid")
    public int getAdgroupid() {
        return adgroupid;
    }

    public void setAdgroupid(int adgroupid) {
        this.adgroupid = adgroupid;
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
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    @Basic
    @Column(name = "erattachmentid")
    public Integer getErattachmentid() {
        return erattachmentid;
    }

    public void setErattachmentid(Integer erattachmentid) {
        this.erattachmentid = erattachmentid;
    }

    @Basic
    @Column(name = "haiku_line1")
    public String getHaikuLine1() {
        return haikuLine1;
    }

    public void setHaikuLine1(String haikuLine1) {
        this.haikuLine1 = haikuLine1;
    }

    @Basic
    @Column(name = "haiku_line2")
    public String getHaikuLine2() {
        return haikuLine2;
    }

    public void setHaikuLine2(String haikuLine2) {
        this.haikuLine2 = haikuLine2;
    }

    @Basic
    @Column(name = "haiku_line3")
    public String getHaikuLine3() {
        return haikuLine3;
    }

    public void setHaikuLine3(String haikuLine3) {
        this.haikuLine3 = haikuLine3;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Ad ad = (Ad) object;

        if (adgroupid != ad.adgroupid) return false;
        if (id != ad.id) return false;
        if (createdts != null ? !createdts.equals(ad.createdts) : ad.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(ad.creatorid) : ad.creatorid != null) return false;
        if (digest != null ? !digest.equals(ad.digest) : ad.digest != null) return false;
        if (displayUrl != null ? !displayUrl.equals(ad.displayUrl) : ad.displayUrl != null) return false;
        if (erattachmentid != null ? !erattachmentid.equals(ad.erattachmentid) : ad.erattachmentid != null) return false;
        if (haikuLine1 != null ? !haikuLine1.equals(ad.haikuLine1) : ad.haikuLine1 != null) return false;
        if (haikuLine2 != null ? !haikuLine2.equals(ad.haikuLine2) : ad.haikuLine2 != null) return false;
        if (haikuLine3 != null ? !haikuLine3.equals(ad.haikuLine3) : ad.haikuLine3 != null) return false;
        if (modifiedts != null ? !modifiedts.equals(ad.modifiedts) : ad.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(ad.modifierid) : ad.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + adgroupid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (displayUrl != null ? displayUrl.hashCode() : 0);
        result = 31 * result + (erattachmentid != null ? erattachmentid.hashCode() : 0);
        result = 31 * result + (haikuLine1 != null ? haikuLine1.hashCode() : 0);
        result = 31 * result + (haikuLine2 != null ? haikuLine2.hashCode() : 0);
        result = 31 * result + (haikuLine3 != null ? haikuLine3.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
