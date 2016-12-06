package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by nickb on 04/12/16.
 */
@Entity
public class UserGroup {
    Boolean allowExternalMembership;
    Integer termsAndConditionsId;
    Boolean canInherit;
    @Id
    @SequenceGenerator(name = "user_group_seq", sequenceName = "user_group_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_group_seq")
    private Long id;
    private String name;
    @Column(name = "creatorid")
    private Long creatorId;
    @Column(name = "createdts")
    private LocalDateTime createdts;
    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;
    @Column(name = "modifierid")
    private Long modifierId;
}
