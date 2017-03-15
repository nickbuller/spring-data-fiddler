package fiddler.dao.entities.account;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import fiddler.dao.base.EmbeddedEntityOwner;
import fiddler.dao.base.EmbeddedTag;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account_tag", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AccountTag implements Serializable {
	@Id
	@SequenceGenerator(name = "account_tag_seq", sequenceName = "account_tag_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_tag_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

	@Embedded
	@Getter
	@Setter
	private EmbeddedTag tag;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityOwner owningOrganisation;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

}
