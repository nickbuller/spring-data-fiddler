package fiddler.dao.entities.address;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "address_tag_data", schema = "public", catalog = "indoc")
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class AddressTagData {
    @Id
    @SequenceGenerator(name = "address_tag_data_seq", sequenceName = "address_tag_data_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_tag_data_seq")
    @Column(name = "id", nullable = false)
    @Getter
    @Setter
    private Long id;

    @Column(name = "string_value")
    @Getter
    @Setter
    private String stringValue;
}
