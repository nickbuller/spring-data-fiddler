package fiddler.dao.entities.person;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
@Data
public class Person implements Serializable {
	@Id
    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "person_type_id")
    private Integer personTypeId;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "scope")
    private String scope;

    @Basic(optional = false)
    @Column(name = "password")
    private byte[] password;

    @Basic(optional = false)
    @Column(name = "salt")
    private String salt;

    @Basic
    @Column(name = "digest")
    private String digest;

    @Basic
    @Column(name = "address_id")
    private Integer addressId;

    @Basic
    @Column(name = "locale_id")
    private Integer localeId;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityCreator entityCreator;

	@Embedded
	@Getter
	@Setter
	private EmbeddedEntityModifier entityModifier;

    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
}
