package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class ContainerType {

    Long owningOrganisationId;
    @Id
    @SequenceGenerator(name = "container_type_seq", sequenceName = "container_type_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_type_seq")
    private Long id;
    private String name;
    private String description;
    @Column(name = "private")
    private Boolean isPrivate;
    @Column(name = "creatorid")
    private Long creatorId;
    @Column(name = "createdts")
    private LocalDateTime createdts;
    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;
    @Column(name = "modifierid")
    private Long modifierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPrivate() {
        return isPrivate;
    }

    public void setPrivate(Boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public Long getOwningOrganisationId() {
        return owningOrganisationId;
    }

    public void setOwningOrganisationId(Long owningOrganisationId) {
        this.owningOrganisationId = owningOrganisationId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContainerType{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isPrivate=").append(isPrivate);
        sb.append(", owningOrganisationId=").append(owningOrganisationId);
        sb.append(", creatorId=").append(creatorId);
        sb.append(", createdts=").append(createdts);
        sb.append(", modifiedTs=").append(modifiedTs);
        sb.append(", modifierId=").append(modifierId);
        sb.append('}');
        return sb.toString();
    }
}
