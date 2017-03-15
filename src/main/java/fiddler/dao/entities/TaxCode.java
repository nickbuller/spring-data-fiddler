package fiddler.dao.entities;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "tax_code", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class TaxCode {
    @Id
	@SequenceGenerator(name = "tax_code_seq", sequenceName = "tax_code_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tax_code_seq")
	@Column(name = "id", nullable = false)
	@Getter
	@Setter
	private Long id;

    @Column(name = "key")
	@Getter
	@Setter
	private String key;

    @Column(name = "name")
	@Getter
	@Setter
	private String name;

    @Column(name = "domicile")
	@Getter
	@Setter
	private String domicile;

    @Column(name = "rate")
	@Getter
	@Setter
	private BigDecimal rate;

    @Column(name = "scope")
	@Getter
	@Setter
	private String scope;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;
}
