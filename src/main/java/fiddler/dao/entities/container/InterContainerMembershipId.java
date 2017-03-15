package fiddler.dao.entities.container;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class InterContainerMembershipId implements Serializable {

	@ManyToOne
	private Container owner;
	@ManyToOne
	private Container member;
}
