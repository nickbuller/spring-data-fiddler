package fiddler.dao.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
public class Person {

    @Id
    @SequenceGenerator(name = "person_seq", sequenceName = "person_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq")
    @Column(name = "id")
    private int id;

    private Integer personTypeId;
    private String name;
    private String scope;
    private byte[] password;
    private String salt;
    private String digest;
    private Integer addressId;
    private Integer localeId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creatorid")
    private Person creator;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "modifierid")
    private Person modifier;

    @Column(name = "createdts")
    private LocalDateTime createdTs;

    @Column(name = "modifiedts")
    private LocalDateTime modifiedTs;

    private String alias;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "person_type_id")
    public Integer getPersonTypeId() {
        return personTypeId;
    }

    public void setPersonTypeId(Integer personTypeId) {
        this.personTypeId = personTypeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "password")
    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "digest")
    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "address_id")
    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "locale_id")
    public Integer getLocaleId() {
        return localeId;
    }

    public void setLocaleId(Integer localeId) {
        this.localeId = localeId;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdTs;
    }

    public void setCreatedts(LocalDateTime createdTs) {
        this.createdTs = createdTs;
    }

    public Person getModifier() {
        return modifier;
    }

    public void setModifier(Person modifier) {
        this.modifier = modifier;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedTs;
    }

    public void setModifiedts(LocalDateTime v) {
        this.modifiedTs = modifiedTs;
    }

    @Basic
    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (personTypeId != null ? !personTypeId.equals(person.personTypeId) : person.personTypeId != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (scope != null ? !scope.equals(person.scope) : person.scope != null) return false;
        if (!Arrays.equals(password, person.password)) return false;
        if (salt != null ? !salt.equals(person.salt) : person.salt != null) return false;
        if (digest != null ? !digest.equals(person.digest) : person.digest != null) return false;
        if (addressId != null ? !addressId.equals(person.addressId) : person.addressId != null) return false;
        if (localeId != null ? !localeId.equals(person.localeId) : person.localeId != null) return false;
        if (creator != null ? !creator.equals(person.creator) : person.creator != null) return false;
        if (createdTs != null ? !createdTs.equals(person.createdTs) : person.createdTs != null) return false;
        if (modifier != null ? !modifier.equals(person.modifier) : person.modifier != null) return false;
        if (modifiedTs != null ? !modifiedTs.equals(person.modifiedTs) : person.modifiedTs != null) return false;
        return alias != null ? alias.equals(person.alias) : person.alias == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (personTypeId != null ? personTypeId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(password);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (localeId != null ? localeId.hashCode() : 0);
        result = 31 * result + (creator != null ? creator.hashCode() : 0);
        result = 31 * result + (createdTs != null ? createdTs.hashCode() : 0);
        result = 31 * result + (modifier != null ? modifier.hashCode() : 0);
        result = 31 * result + (modifiedTs != null ? modifiedTs.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", personTypeId=" + personTypeId +
                ", name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", password=" + Arrays.toString(password) +
                ", salt='" + salt + '\'' +
                ", digest='" + digest + '\'' +
                ", addressId=" + addressId +
                ", localeId=" + localeId +
                ", creatorid=" + (creator == null ? null : creator.getId()) +
                ", createdts=" + createdTs +
                ", modifierid=" + (modifier == null ? null : modifier.getId()) +
                ", modifiedts=" + modifiedTs +
                ", alias='" + alias + '\'' +
                '}';
    }
}
