package fiddler.dao.base;

import fiddler.dao.entities.person.Person;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"creator"})
@ToString(doNotUseGetters = true, exclude = {"creator"})
public class EmbeddedEntityCreator implements Serializable {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creatorid")
	@Getter
	@Setter
	private Person creator;

	@Column(name = "createdts")
	@Getter
	@Setter
	private LocalDateTime createdAt;
}
