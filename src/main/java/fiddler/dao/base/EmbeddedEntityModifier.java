package fiddler.dao.base;

import fiddler.dao.entities.person.Person;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by nickb on 12/03/17.
 */
@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"modifier"})
@ToString(doNotUseGetters = true, exclude = {"modifier"})
public class EmbeddedEntityModifier implements Serializable {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modifierid")
	@Getter
	@Setter
	private Person modifier;

	@Column(name = "modifiedts")
	@Getter
	@Setter
	private LocalDateTime modifiedAt;
}
