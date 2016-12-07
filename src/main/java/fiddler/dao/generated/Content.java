package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Content {
    private int id;
    private String name;
    private String scope;
    private Integer stateId;
    private Integer contentTypeId;
    private Boolean locked;
    private Integer lockOwnerId;
    private Integer version;
    private Integer sourcePosition;
    private Integer parentId;
    private String digest;
    private Integer previousSnapshotId;
    private Integer owningOrganisationId;
    private Integer counterpartyOrganisationId;
    private Integer creatorid;
    private LocalDateTime createdts;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private Long lockKey;

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
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "state_id")
    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    @Basic
    @Column(name = "content_type_id")
    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    @Basic
    @Column(name = "locked")
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @Basic
    @Column(name = "lock_owner_id")
    public Integer getLockOwnerId() {
        return lockOwnerId;
    }

    public void setLockOwnerId(Integer lockOwnerId) {
        this.lockOwnerId = lockOwnerId;
    }

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "source_position")
    public Integer getSourcePosition() {
        return sourcePosition;
    }

    public void setSourcePosition(Integer sourcePosition) {
        this.sourcePosition = sourcePosition;
    }

    @Basic
    @Column(name = "parent_id")
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
    @Column(name = "previous_snapshot_id")
    public Integer getPreviousSnapshotId() {
        return previousSnapshotId;
    }

    public void setPreviousSnapshotId(Integer previousSnapshotId) {
        this.previousSnapshotId = previousSnapshotId;
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
    @Column(name = "counterparty_organisation_id")
    public Integer getCounterpartyOrganisationId() {
        return counterpartyOrganisationId;
    }

    public void setCounterpartyOrganisationId(Integer counterpartyOrganisationId) {
        this.counterpartyOrganisationId = counterpartyOrganisationId;
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

    @Basic
    @Column(name = "lock_key")
    public Long getLockKey() {
        return lockKey;
    }

    public void setLockKey(Long lockKey) {
        this.lockKey = lockKey;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Content content = (Content) object;

        if (id != content.id) return false;
        if (name != null ? !name.equals(content.name) : content.name != null) return false;
        if (scope != null ? !scope.equals(content.scope) : content.scope != null) return false;
        if (stateId != null ? !stateId.equals(content.stateId) : content.stateId != null) return false;
        if (contentTypeId != null ? !contentTypeId.equals(content.contentTypeId) : content.contentTypeId != null) return false;
        if (locked != null ? !locked.equals(content.locked) : content.locked != null) return false;
        if (lockOwnerId != null ? !lockOwnerId.equals(content.lockOwnerId) : content.lockOwnerId != null) return false;
        if (version != null ? !version.equals(content.version) : content.version != null) return false;
        if (sourcePosition != null ? !sourcePosition.equals(content.sourcePosition) : content.sourcePosition != null) return false;
        if (parentId != null ? !parentId.equals(content.parentId) : content.parentId != null) return false;
        if (digest != null ? !digest.equals(content.digest) : content.digest != null) return false;
        if (previousSnapshotId != null ? !previousSnapshotId.equals(content.previousSnapshotId) : content.previousSnapshotId != null) return false;
        if (owningOrganisationId != null ? !owningOrganisationId.equals(content.owningOrganisationId) : content.owningOrganisationId != null) return false;
        if (counterpartyOrganisationId != null ? !counterpartyOrganisationId.equals(content.counterpartyOrganisationId) : content.counterpartyOrganisationId != null) return false;
        if (creatorid != null ? !creatorid.equals(content.creatorid) : content.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(content.createdts) : content.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(content.modifiedts) : content.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(content.modifierid) : content.modifierid != null) return false;
        if (lockKey != null ? !lockKey.equals(content.lockKey) : content.lockKey != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (stateId != null ? stateId.hashCode() : 0);
        result = 31 * result + (contentTypeId != null ? contentTypeId.hashCode() : 0);
        result = 31 * result + (locked != null ? locked.hashCode() : 0);
        result = 31 * result + (lockOwnerId != null ? lockOwnerId.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (sourcePosition != null ? sourcePosition.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (previousSnapshotId != null ? previousSnapshotId.hashCode() : 0);
        result = 31 * result + (owningOrganisationId != null ? owningOrganisationId.hashCode() : 0);
        result = 31 * result + (counterpartyOrganisationId != null ? counterpartyOrganisationId.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (lockKey != null ? lockKey.hashCode() : 0);
        return result;
    }
}
