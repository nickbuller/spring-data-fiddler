//package fiddler.dao.entities;
//
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.Set;
//
///**
// * Created by nbuller on 06/12/16.
// */
//@Entity
//@Table(name = "inter_container_membership")
////@AssociationOverrides({
////        @AssociationOverride(name = "pk.owning_container_id",
////                joinColumns = @JoinColumn(name = "owning_container_id")),
////        @AssociationOverride(name = "memberContainer",
////                joinColumns = @JoinColumn(name = "member_container_id")) })
//public class InterContainerMembership {
////    private InterContainerMembershipId id  = new InterContainerMembershipId();
//////    private Organisation creator;
//////    private LocalDateTime created;
//////    private Organisation modifier;
//////    private LocalDateTime modified;
////
////    @EmbeddedId
////    public InterContainerMembershipId getId() {
////        return id;
////    }
////
////    public void setId(InterContainerMembershipId id) {
////        this.id = id;
////    }
////
////    @Transient
////    public Container getOwningContainer() {
////        return id.getOwner();
////    }
////
////    public void setOwningContainer(Container owningContainer) {
////        getId().setOwner(owningContainer);
////    }
////
////    @Transient
////    public Container getMemberContainer() {
////        return id.getMember();
////    }
////
////    public void setMemberContainer(Container memberContainer) {
////        getId().setMember(memberContainer);
//    }
////    @OneToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "creatorid")
////    public Organisation getCreator() {
////        return creator;
////    }
////
////    public void setCreator(Organisation creator) {
////        this.creator = creator;
////    }
////
////    public LocalDateTime getCreated() {
////        return created;
////    }
////
////    public void setCreated(LocalDateTime created) {
////        this.created = created;
////    }
////
////    @OneToOne(fetch = FetchType.LAZY)
////    @JoinColumn(name = "modifierid")
////    public Organisation getModifier() {
////        return modifier;
////    }
////
////    public void setModifier(Organisation modifier) {
////        this.modifier = modifier;
////    }
////
////    public LocalDateTime getModified() {
////        return modified;
////    }
////
////    public void setModified(LocalDateTime modified) {
////        this.modified = modified;
////    }
//}
