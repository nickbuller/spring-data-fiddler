package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Hop {
    private int id;
    private String name;
    private Integer workflowId;
    private Integer sourceContainerId;
    private Integer destinationContainerId;
    private Integer destinationStateId;
    private Integer channelId;
    private String movementType;
    private String layoutCoordinates;
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
    @Column(name = "workflow_id")
    public Integer getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Integer workflowId) {
        this.workflowId = workflowId;
    }

    @Basic
    @Column(name = "source_container_id")
    public Integer getSourceContainerId() {
        return sourceContainerId;
    }

    public void setSourceContainerId(Integer sourceContainerId) {
        this.sourceContainerId = sourceContainerId;
    }

    @Basic
    @Column(name = "destination_container_id")
    public Integer getDestinationContainerId() {
        return destinationContainerId;
    }

    public void setDestinationContainerId(Integer destinationContainerId) {
        this.destinationContainerId = destinationContainerId;
    }

    @Basic
    @Column(name = "destination_state_id")
    public Integer getDestinationStateId() {
        return destinationStateId;
    }

    public void setDestinationStateId(Integer destinationStateId) {
        this.destinationStateId = destinationStateId;
    }

    @Basic
    @Column(name = "channel_id")
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "movement_type")
    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    @Basic
    @Column(name = "layout_coordinates")
    public String getLayoutCoordinates() {
        return layoutCoordinates;
    }

    public void setLayoutCoordinates(String layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
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

        Hop hop = (Hop) object;

        if (id != hop.id) return false;
        if (name != null ? !name.equals(hop.name) : hop.name != null) return false;
        if (workflowId != null ? !workflowId.equals(hop.workflowId) : hop.workflowId != null) return false;
        if (sourceContainerId != null ? !sourceContainerId.equals(hop.sourceContainerId) : hop.sourceContainerId != null) return false;
        if (destinationContainerId != null ? !destinationContainerId.equals(hop.destinationContainerId) : hop.destinationContainerId != null) return false;
        if (destinationStateId != null ? !destinationStateId.equals(hop.destinationStateId) : hop.destinationStateId != null) return false;
        if (channelId != null ? !channelId.equals(hop.channelId) : hop.channelId != null) return false;
        if (movementType != null ? !movementType.equals(hop.movementType) : hop.movementType != null) return false;
        if (layoutCoordinates != null ? !layoutCoordinates.equals(hop.layoutCoordinates) : hop.layoutCoordinates != null) return false;
        if (creatorid != null ? !creatorid.equals(hop.creatorid) : hop.creatorid != null) return false;
        if (createdts != null ? !createdts.equals(hop.createdts) : hop.createdts != null) return false;
        if (modifiedts != null ? !modifiedts.equals(hop.modifiedts) : hop.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(hop.modifierid) : hop.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (workflowId != null ? workflowId.hashCode() : 0);
        result = 31 * result + (sourceContainerId != null ? sourceContainerId.hashCode() : 0);
        result = 31 * result + (destinationContainerId != null ? destinationContainerId.hashCode() : 0);
        result = 31 * result + (destinationStateId != null ? destinationStateId.hashCode() : 0);
        result = 31 * result + (channelId != null ? channelId.hashCode() : 0);
        result = 31 * result + (movementType != null ? movementType.hashCode() : 0);
        result = 31 * result + (layoutCoordinates != null ? layoutCoordinates.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
