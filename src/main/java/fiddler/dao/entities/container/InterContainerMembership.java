package fiddler.dao.entities;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by nbuller on 06/12/16.
 */
@Entity
@Table(name = "inter_container_membership", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
//@AssociationOverrides({
//        @AssociationOverride(name = "pk.owning_container_id",
//                joinColumns = @JoinColumn(name = "owning_container_id")),
//        @AssociationOverride(name = "memberContainer",
//                joinColumns = @JoinColumn(name = "member_container_id")) })
public class InterContainerMembership implements Serializable {
	@Id
	@SequenceGenerator(name = "inter_container_membership_seq", sequenceName = "inter_container_membership_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inter_container_membership_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
