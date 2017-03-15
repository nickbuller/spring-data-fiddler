package fiddler.dao.entities.address;

import fiddler.dao.base.EmbeddedEntityCreator;
import fiddler.dao.base.EmbeddedEntityModifier;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "address_tag_value", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AddressTagValue {
    @Id
    @SequenceGenerator(name = "address_tag_value_seq", sequenceName = "address_tag_value_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_tag_value_seq")
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    @Getter
    @Setter
    private Address address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_tag_id")
    @Getter
    @Setter
    private AddressTag addressTag;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_data_id")
    @Getter
    @Setter
    private AddressTagData value;

    @Embedded
    @Getter
    @Setter
    private EmbeddedEntityCreator entityCreator;

    @Embedded
    @Getter
    @Setter
    private EmbeddedEntityModifier entityModifier;

    public String getFormattedValue() {
        return this.value.getStringValue();
    }

    public String getTagName() {
        return this.addressTag.getTag().getName();
    }

    public String getDebugString() {
        return String.format("EmbeddedTag[%s] {%s} Value {%s}",
            this.addressTag.getId(),
            this.addressTag.getTag().getName(),
            getFormattedValue());
    }

}