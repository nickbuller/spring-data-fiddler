package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Channel {
    private int id;
    private String name;
    private String status;
    private String digest;
    private Integer owningOrganisationId;
    private Integer owningPersonId;
    private Integer channelTypeId;
    private Integer creatorid;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "owning_organisation_id")
    public Integer getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(Integer owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
    }

    @Basic
    @Column(name = "owning_person_id")
    public Integer getOwningPersonId() {
        return owningPersonId;
    }

    public void setOwningPersonId(Integer owningPersonId) {
        this.owningPersonId = owningPersonId;
    }

    @Basic
    @Column(name = "channel_type_id")
    public Integer getChannelTypeId() {
        return channelTypeId;
    }

    public void setChannelTypeId(Integer channelTypeId) {
        this.channelTypeId = channelTypeId;
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

        Channel channel = (Channel) object;

        if (id != channel.id) return false;
        if (name != null ? !name.equals(channel.name) : channel.name != null) return false;
        if (status != null ? !status.equals(channel.status) : channel.status != null) return false;
        if (digest != null ? !digest.equals(channel.digest) : channel.digest != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(channel.owningOrganisationId) : channel.owningOrganisationId != null) return false;
        if (owningPersonId != null ? !owningPersonId.equals(channel.owningPersonId) : channel.owningPersonId != null) return false;
        if (channelTypeId != null ? !channelTypeId.equals(channel.channelTypeId) : channel.channelTypeId != null) return false;
        if (creatorid != null ? !creatorid.equals(channel.creatorid) : channel.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(channel.createdts) : channel.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(channel.modifiedts) : channel.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(channel.modifierid) : channel.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (owningPersonId != null ? owningPersonId.hashCode() : 0);
        result = 31 * result + (channelTypeId != null ? channelTypeId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
