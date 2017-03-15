package fiddler.dao.entities.container;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.entities.organisation.Organisation;
import fiddler.dao.entities.state.State;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

// TODO: See https://giannigar.wordpress.com/2009/09/04/mapping-a-many-to-many-join-table-with-extra-column-using-jpa/
// or

@Entity
@Table(name = "container", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"lockOwner"})
@ToString(doNotUseGetters = true, exclude = {"entityCreator", "entityModifier", "owningOrganisation", "containerType", "template", "containerTagValues"})
public class Container implements Serializable {
	@Id
    @SequenceGenerator(name = "container_seq", sequenceName = "container_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "container_seq")
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

	@Column(name = "name")
	@Getter
    @Setter
    private String name;

	@Column(name = "status")
	@Getter
    @Setter
    private String status;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "state_id")
	@Getter
    @Setter
	private State state;

	@Column(name = "scope")
	@Getter
    @Setter
    private String scope;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "container_type_id")
    @Getter
    @Setter
    private ContainerType containerType;

    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "template_id")
	@Getter
    @Setter
	private Container template;

    @Basic
    @Getter
    @Setter
    private Long contentRbacTemplateId;

    @Basic
    @Getter
    @Setter
    private String digest;

	@Column(name = "locked")
	@Getter
    @Setter
	private Boolean isLocked;

    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lock_owner_id")
	@Getter
    @Setter
	private Organisation lockOwner;

	@Column(name = "lock_key")
	@Getter
    @Setter
	private Long lockKey;

	@Column(name = "credit_rating")
	@Getter
    @Setter
	private String creditRating;

	@Column(name = "security_rating")
	@Getter
    @Setter
	private String securityRating;

	@Column(name = "loan_ref")
	@Getter
    @Setter
	private String loanRef;

	@OneToMany(mappedBy = "container", fetch = FetchType.LAZY)
	@Getter
    @Setter
	private List<ContainerTagValue> containerTagValues;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityOwner owningOrganisation;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
    @Setter
	private EmbeddedEntityModifier entityModifier;
}


