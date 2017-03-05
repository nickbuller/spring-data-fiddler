package fiddler.dao.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

// TODO: See https://giannigar.wordpress.com/2009/09/04/mapping-a-many-to-many-join-table-with-extra-column-using-jpa/
// or

@Entity
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"creator", "modifier", "owningOrganisation", "containerType"})
@ToString(doNotUseGetters = true, exclude = {"creator", "modifier", "owningOrganisation", "containerType"})
public class Container {
    @Id
    @SequenceGenerator(name = "container_seq", sequenceName = "container_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_seq")
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

    @Basic
    @Getter
    @Setter
    private String name;

    @Basic
    @Getter
    @Setter
    private String status;

    @Basic
    @Getter
    @Setter
    private Long state_id;

    @Basic
    @Getter
    @Setter
    private String scope;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "container_type_id")
    @Getter
    @Setter
    private ContainerType containerType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    @Getter
    @Setter
    private Organisation owningOrganisation;

    @Basic
    @Getter
    @Setter
    private Long templateId;

    @Basic
    @Getter
    @Setter
    private Long contentRbacTemplateId;

    @Basic
    @Getter
    @Setter
    private String digest;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    @Getter
    @Setter
    private Person creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    @Getter
    @Setter
    private Person modifier;

    @Basic
    @Column(name = "createdts")
    @Getter
    @Setter
    private LocalDateTime createdTs;

    @Basic
    @Column(name = "modifiedts")
    @Getter
    @Setter
    private LocalDateTime modifiedTs;

    @Basic
    @Getter
    @Setter
    private Boolean locked;

    @Basic
    @Getter
    @Setter
    private Long lockOwnerId;

    @Basic
    @Getter
    @Setter
    private Long lockKey;

    @Basic
    @Getter
    @Setter
    private String creditRating;

    @Basic
    @Getter
    @Setter
    private String securityRating;

    @Basic
    @Getter
    @Setter
    private String loanRef;
}


