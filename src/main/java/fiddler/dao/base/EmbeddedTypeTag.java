package fiddler.dao.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Access(AccessType.FIELD)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class EmbeddedTypeTag implements Serializable {

	@Column(name = "display_order")
	@Getter
	@Setter
	private Integer displayOrder;

	@Column(name = "mandatory")
	@Getter
	@Setter
	private String mandatory;
}
