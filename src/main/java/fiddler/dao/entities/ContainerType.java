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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    private Person creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Person modifier;

    @Column(name = "createdts")
    private LocalDateTime createdTs;

    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

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


    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedts() {
        return createdTs;
    }

    public void setCreatedts(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public LocalDateTime getModifiedTs() {
        return modifiedTs;
    }

    public void setModifiedTs(LocalDateTime modifiedTs) {
        this.modifiedTs = modifiedTs;
    }

    public Person getModifier() {
        return modifier;
    }

    public void setModifier(Person modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ContainerType{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isPrivate=").append(isPrivate);
        sb.append(", owningOrganisationId=").append(owningOrganisationId);
        sb.append(", creator=").append(creator);
        sb.append(", createdts=").append(createdTs);
        sb.append(", modifiedTs=").append(modifiedTs);
        sb.append(", modifier=").append(modifier);
        sb.append('}');
        return sb.toString();
    }
}
