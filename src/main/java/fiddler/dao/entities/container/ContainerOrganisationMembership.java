package fiddler.dao.entities.container;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.entities.organisation.Organisation;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "container_organisation_membership", schema = "public", catalog = "indoc")
@AssociationOverrides({
	@AssociationOverride(name = "id.container", joinColumns = @JoinColumn(name = "container_id", updatable = false, insertable = false)),
	@AssociationOverride(name = "id.organisation", joinColumns = @JoinColumn(name = "organisation_id", updatable = false, insertable = false))
})
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true, exclude = {"entityCreator", "entityModifier"})
public class ContainerOrganisationMembership implements Serializable {
	@EmbeddedId
	@Getter
	@Setter
	private ContainerOrganisationMembershipId id = new ContainerOrganisationMembershipId();
	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;
	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

	@Transient
	public Container getContainer() {
		return id.getContainer();
	}

	public void setContainer(Container container) {
		id.setContainer(container);
	}

	@Transient
	public Organisation getOrganisation() {
		return id.getOrganisation();
	}

	public void setOrganisation(Organisation organisation) {
		id.setOrganisation(organisation);
	}
}
