package fiddler.dao.base;

import fiddler.dao.entities.tag.TagData;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class EmbeddedTagData {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tag_data_id")
	@Getter
	@Setter
	private TagData tagData;

	@Getter
	@Setter
	@Column(name = "er_attachment_id")
	private Integer erAttachmentId;
}
