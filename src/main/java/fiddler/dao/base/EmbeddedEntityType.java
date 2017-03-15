package fiddler.dao.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true, exclude = {"description", "isPrivate"})
public class EmbeddedEntityType {
	@Column(name = "name")
	@Getter
	@Setter
	private String name;

	@Column(name = "description")
	@Getter
	@Setter
	private String description;

	@Column(name = "private")
	@Getter
	@Setter
	private Boolean isPrivate;
}