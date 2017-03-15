package fiddler.dao.entities.address;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true, exclude = {"addressTagValues"})
public class Address implements Serializable {
    @Id
    @SequenceGenerator(name = "state_seq", sequenceName = "state_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "state_seq")
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_type_id")
    @Getter
    @Setter
    private AddressType addressType;

    @Column(name = "digest")
    @Getter
    @Setter
    private String digest;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<AddressTagValue> addressTagValues;

    @Embedded
    @Getter
    @Setter
    private EmbeddedEntityCreator entityCreator;

    @Embedded
    @Getter
    @Setter
    private EmbeddedEntityModifier entityModifier;

//    public String x() {
//        return this.getAddressTagValues().stream().filter(tagValue -> tagValue.getTagName().equals("Line 1")).toString();
//                ;
//            forEach(tagValue -> LOG.info(tagValue.getDebugString()));
//;
//        this.addressTag.getTag().getName(),
//            getFormattedValue());
//    }
}
