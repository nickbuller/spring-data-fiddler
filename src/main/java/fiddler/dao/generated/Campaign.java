package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Campaign {
    private BigDecimal budget;
    private int campaignTypeId;
    private LocalDateTime createdts;
    private Integer creatorid;
    private String description;
    private String digest;
    private LocalDateTime endDate;
    private int id;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String name;
    private int owningOrganisationId;
    private LocalDateTime startDate;

    @Basic
    @Column(name = "budget")
    public java.math.BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(java.math.BigDecimal budget) {
        this.budget = budget;
    }

    @Basic
    @Column(name = "campaign_type_id")
    public int getCampaignTypeId() {
        return campaignTypeId;
    }

    public void setCampaignTypeId(int campaignTypeId) {
        this.campaignTypeId = campaignTypeId;
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
    @Column(name = "end_date")
    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
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
    @Column(name = "start_date")
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Campaign campaign = (Campaign) object;

        if (campaignTypeId != campaign.campaignTypeId) return false;
        if (id != campaign.id) return false;
        if (owningOrganisationId != campaign.owningOrganisationId) return false;
        if (budget != null ? !budget.equals(campaign.budget) : campaign.budget != null) return false;
        if (createdts != null ? !createdts.equals(campaign.createdts) : campaign.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(campaign.creatorid) : campaign.creatorid != null) return false;
        if (description != null ? !description.equals(campaign.description) : campaign.description != null) return false;
        if (digest != null ? !digest.equals(campaign.digest) : campaign.digest != null) return false;
        if (endDate != null ? !endDate.equals(campaign.endDate) : campaign.endDate != null) return false;
        if (modifiedts != null ? !modifiedts.equals(campaign.modifiedts) : campaign.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(campaign.modifierid) : campaign.modifierid != null) return false;
        if (name != null ? !name.equals(campaign.name) : campaign.name != null) return false;
        if (startDate != null ? !startDate.equals(campaign.startDate) : campaign.startDate != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + campaignTypeId;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + owningOrganisationId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}
