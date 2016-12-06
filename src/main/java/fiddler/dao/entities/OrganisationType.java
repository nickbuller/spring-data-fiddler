package fiddler.dao.entities;

import fiddler.dao.base.TypeEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
public class OrganisationType {
    Integer addressTypeId;
    Integer localeId;
    @Id
    @SequenceGenerator(name = "organisation_type_seq", sequenceName = "organisation_type_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organisation_type_seq")
    private Long id;
    private String name;
    private String description;
    @Column(name = "private")
    private Boolean isPrivate;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owning_organisation_id")
    private Organisation organisation;
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

    public Integer getAddressTypeId() {
        return addressTypeId;
    }

    public void setAddressTypeId(Integer addressTypeId) {
        this.addressTypeId = addressTypeId;
    }

    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
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

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
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
        final StringBuffer sb = new StringBuffer("OrganisationType{");
        sb.append("id=").append(id);
        sb.append(", addressTypeId=").append(addressTypeId);
        sb.append(", localeId=").append(localeId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isPrivate=").append(isPrivate);
        sb.append(", organisation=").append(organisation.getId());
        sb.append(", creatorId=").append(creatorId);
        sb.append(", createdts=").append(createdts);
        sb.append(", modifiedTs=").append(modifiedTs);
        sb.append(", modifierId=").append(modifierId);
        sb.append('}');
        return sb.toString();
    }
}
