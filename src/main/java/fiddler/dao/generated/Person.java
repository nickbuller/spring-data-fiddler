package fiddler.dao.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Arrays;

@Entity
public class Person {
    private int id;
    private Integer personTypeId;
    private String name;
    private String scope;
    private byte[] password;
    private String salt;
    private String digest;
    private Integer addressId;
    private Integer localeId;
    private int creatorid;
    private LocalDateTime createdts;
    private Integer modifierid;
    private LocalDateTime modifiedts;
    private String alias;

    @Column(name = "id")
    @Id
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

    @Basic
    @Column(name = "creatorid")
    public int getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(int creatorid) {
        this.creatorid = creatorid;
    }

    @Basic
    @Column(name = "createdts")
    public LocalDateTime getCreatedts() {
        return createdts;
    }

    public void setCreatedts(LocalDateTime createdts) {
        this.createdts = createdts;
    }

    @Basic
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "modifiedts")
    public LocalDateTime getModifiedts() {
        return modifiedts;
    }

    public void setModifiedts(LocalDateTime modifiedts) {
        this.modifiedts = modifiedts;
    }

    @Basic
    @Column(name = "alias")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Person person = (Person) object;

        if (id != person.id) return false;
        if (creatorid != person.creatorid) return false;
        if (personTypeId != null ? !personTypeId.equals(person.personTypeId) : person.personTypeId != null) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (scope != null ? !scope.equals(person.scope) : person.scope != null) return false;
        if (!java.util.Arrays.equals(password, person.password)) return false;
        if (salt != null ? !salt.equals(person.salt) : person.salt != null) return false;
        if (digest != null ? !digest.equals(person.digest) : person.digest != null) return false;
        if (addressId != null ? !addressId.equals(person.addressId) : person.addressId != null) return false;
        if (localeId != null ? !localeId.equals(person.localeId) : person.localeId != null) return false;
        if (createdts != null ? !createdts.equals(person.createdts) : person.createdts != null) return false;
        if (modifierid != null ? !modifierid.equals(person.modifierid) : person.modifierid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(person.modifiedts) : person.modifiedts != null) return false;
        if (alias != null ? !alias.equals(person.alias) : person.alias != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (personTypeId != null ? personTypeId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(password);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (digest != null ? digest.hashCode() : 0);
        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
        result = 31 * result + (localeId != null ? localeId.hashCode() : 0);
        result = 31 * result + creatorid;
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (alias != null ? alias.hashCode() : 0);
        return result;
    }
}
