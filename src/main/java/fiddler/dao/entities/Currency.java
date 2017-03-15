package fiddler.dao.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "currency")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class Currency {
	@Id
	@SequenceGenerator(name = "currency_seq", sequenceName = "currency_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_seq")
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

	@Column(name = "symbol")
	@Getter
	@Setter
	private String symbol;

	@Column(name = "scale")
	@Getter
	@Setter
	private int scale;

	@Column(name = "rounding")
	@Getter
	@Setter
	private int rounding;

	@Column(name = "displayFormat")
	@Getter
	@Setter
	private String displayFormat;

}
