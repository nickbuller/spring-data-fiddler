package fiddler.dao.base;

import fiddler.dao.entities.organisation.Organisation;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"owningOrganisation"})
//@ToString(doNotUseGetters = true)
public class EmbeddedEntityOwner implements Serializable {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owning_organisation_id")
	@Getter
	@Setter
	Organisation owningOrganisation;

	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("owningOrganisationId", owningOrganisation.getId())
			.append("owningOrganisationName", owningOrganisation.getName())
			.toString();
	}
}