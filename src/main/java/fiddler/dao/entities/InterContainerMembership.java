package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nbuller on 06/12/16.
 */
@Entity
@AssociationOverrides({
        @AssociationOverride(name = "value.owner_container",
                joinColumns = @JoinColumn(name = "owning_container_id")),
        @AssociationOverride(name = "value.member_container",
                joinColumns = @JoinColumn(name = "member_container_id"))})
public class InterContainerMembership {
    private Long id;
    private Container owningContainer;
    private Container memberContainer;
    private Organisation creator;
    private LocalDateTime created;
    private Organisation modifier;
    private LocalDateTime modified;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @OneToOne(fetch = FetchType.LAZY)
    public Container getOwningContainer() {
        return owningContainer;
    }

    public void setOwningContainer(Container owningContainer) {
        this.owningContainer = owningContainer;
    }

    @OneToOne(fetch = FetchType.LAZY)
    public Container getMemberContainer() {
        return memberContainer;
    }

    public void setMemberContainer(Container memberContainer) {
        this.memberContainer = memberContainer;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    public Organisation getCreator() {
        return creator;
    }

    public void setCreator(Organisation creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    public Organisation getModifier() {
        return modifier;
    }

    public void setModifier(Organisation modifier) {
        this.modifier = modifier;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
