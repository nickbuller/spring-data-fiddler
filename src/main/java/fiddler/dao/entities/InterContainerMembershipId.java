//package fiddler.dao.entities;
//
//import javax.persistence.*;
//
///**
// * Created by nickb on 09/12/16.
// */
//@Embeddable
//public class InterContainerMembershipId {
////    private Long id;
//    private Container owner;
//    private Container member;
//
////    @Id
////    @SequenceGenerator(name = "inter_container_membership_seq", sequenceName = "inter_container_membership_seq")
////    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inter_container_membership_seq")
////    public Long getId() {
////        return id;
////    }
////
////    public void setId(Long  id) {
////        this.id = id;
////    }
//
//    @ManyToOne
//    public Container getOwner() {
//        return owner;
//    }
//
//    public void setOwner(Container owner) {
//        this.owner = owner;
//    }
//
//    @ManyToOne
//    public Container getMember() {
//        return member;
//    }
//
//    public void setMember(Container member) {
//        this.member = member;
//    }
//
//}
