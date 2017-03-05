package fiddler.dao.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EqualsAndHashCode(doNotUseGetters = true, exclude = {"creator", "modifier"})
@ToString(doNotUseGetters = true, exclude = {"creator", "modifier"})
@Data
public class Person {
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

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "creatorid")
    private Person creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Person modifier;

    @Basic(optional = false)
    @Column(name = "createdts")
    private LocalDateTime createdTs;

    @Basic(optional = false)
    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

    @Basic(optional = false)
    @Column(name = "alias")
    private String alias;
}
