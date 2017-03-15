package fiddler.dao.base;

import fiddler.dao.entities.tag.TagFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class EmbeddedTag implements Serializable {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tag_format_id")
	@Getter
	@Setter
	private TagFormat tagFormat;

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
