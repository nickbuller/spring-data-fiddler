package fiddler.dao.generated;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ad_group", schema = "public", catalog = "indoc")
public class AdGroup {
    private int campaignid;
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private String digest;
    private int id;
    private String keywords;
    private BigDecimal maxcpc;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private boolean targetDesktopLaptop;
    private boolean targetMobile;
    private String targetMode;
    private boolean targetTablet;

    @Basic
    @Column(name = "campaignid")
    public int getCampaignid() {
        return campaignid;
    }

    public void setCampaignid(int campaignid) {
        this.campaignid = campaignid;
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

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "maxcpc")
    public java.math.BigDecimal getMaxcpc() {
        return maxcpc;
    }

    public void setMaxcpc(java.math.BigDecimal maxcpc) {
        this.maxcpc = maxcpc;
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
    @Column(name = "target_desktop_laptop")
    public boolean isTargetDesktopLaptop() {
        return targetDesktopLaptop;
    }

    public void setTargetDesktopLaptop(boolean targetDesktopLaptop) {
        this.targetDesktopLaptop = targetDesktopLaptop;
    }

    @Basic
    @Column(name = "target_mobile")
    public boolean isTargetMobile() {
        return targetMobile;
    }

    public void setTargetMobile(boolean targetMobile) {
        this.targetMobile = targetMobile;
    }

    @Basic
    @Column(name = "target_mode")
    public String getTargetMode() {
        return targetMode;
    }

    public void setTargetMode(String targetMode) {
        this.targetMode = targetMode;
    }

    @Basic
    @Column(name = "target_tablet")
    public boolean isTargetTablet() {
        return targetTablet;
    }

    public void setTargetTablet(boolean targetTablet) {
        this.targetTablet = targetTablet;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        AdGroup adGroup = (AdGroup) object;

        if (campaignid != adGroup.campaignid) return false;
        if (id != adGroup.id) return false;
        if (targetDesktopLaptop != adGroup.targetDesktopLaptop) return false;
        if (targetMobile != adGroup.targetMobile) return false;
        if (targetTablet != adGroup.targetTablet) return false;
        if (createdts != null ? !createdts.equals(adGroup.createdts) : adGroup.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(adGroup.creatorid) : adGroup.creatorid != null) return false;
        if (description != null ? !description.equals(adGroup.description) : adGroup.description != null) return false;
        if (digest != null ? !digest.equals(adGroup.digest) : adGroup.digest != null) return false;
        if (keywords != null ? !keywords.equals(adGroup.keywords) : adGroup.keywords != null) return false;
        if (maxcpc != null ? !maxcpc.equals(adGroup.maxcpc) : adGroup.maxcpc != null) return false;
        if (modifiedts != null ? !modifiedts.equals(adGroup.modifiedts) : adGroup.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(adGroup.modifierid) : adGroup.modifierid != null) return false;
        if (name != null ? !name.equals(adGroup.name) : adGroup.name != null) return false;
        if (targetMode != null ? !targetMode.equals(adGroup.targetMode) : adGroup.targetMode != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + campaignid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (maxcpc != null ? maxcpc.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (targetDesktopLaptop ? 1 : 0);
        result = 31 * result + (targetMobile ? 1 : 0);
        result = 31 * result + (targetMode != null ? targetMode.hashCode() : 0);
        result = 31 * result + (targetTablet ? 1 : 0);
        return result;
    }
}
