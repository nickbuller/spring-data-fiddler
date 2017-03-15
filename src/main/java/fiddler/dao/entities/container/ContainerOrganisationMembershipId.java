package fiddler.dao.entities.container;

import fiddler.dao.entities.organisation.Organisation;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class ContainerOrganisationMembershipId implements Serializable {

	@ManyToOne(fetch = FetchType.LAZY)
	@Getter
	@Setter
	private Container container; // Stock

	@ManyToOne(fetch = FetchType.LAZY)
	@Getter
	@Setter
	private Organisation organisation; // Category

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ContainerOrganisationMembershipId that = (ContainerOrganisationMembershipId) o;
//
//        if (container != null ? !container.equals(that.container) : that.container != null) return false;
//        if (organisation != null ? !organisation.equals(that.organisation) : that.organisation != null) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        result = (container != null ? container.hashCode() : 0);
//        result = 31 * result + (organisation != null ? organisation.hashCode() : 0);
//        return result;
//    }
}
