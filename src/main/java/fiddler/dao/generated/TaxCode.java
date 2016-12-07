package fiddler.dao.generated;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "tax_code", schema = "public", catalog = "indoc")
public class TaxCode {
    private int id;
    private String key;
    private String name;
    private String domicile;
    private BigInteger rate;
    private LocalDateTime createdts;
    private Integer creatorid;
    private LocalDateTime modifiedts;
    private Integer modifierid;
    private String scope;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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
    @Column(name = "domicile")
    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Basic
    @Column(name = "rate")
    public java.math.BigInteger getRate() {
        return rate;
    }

    public void setRate(java.math.BigInteger rate) {
        this.rate = rate;
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
    @Column(name = "creatorid")
    public Integer getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(Integer creatorid) {
        this.creatorid = creatorid;
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
    @Column(name = "modifierid")
    public Integer getModifierid() {
        return modifierid;
    }

    public void setModifierid(Integer modifierid) {
        this.modifierid = modifierid;
    }

    @Basic
    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TaxCode taxCode = (TaxCode) object;

        if (id != taxCode.id) return false;
        if (key != null ? !key.equals(taxCode.key) : taxCode.key != null) return false;
        if (name != null ? !name.equals(taxCode.name) : taxCode.name != null) return false;
        if (domicile != null ? !domicile.equals(taxCode.domicile) : taxCode.domicile != null) return false;
        if (rate != null ? !rate.equals(taxCode.rate) : taxCode.rate != null) return false;
        if (createdts != null ? !createdts.equals(taxCode.createdts) : taxCode.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(taxCode.creatorid) : taxCode.creatorid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(taxCode.modifiedts) : taxCode.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(taxCode.modifierid) : taxCode.modifierid != null) return false;
        if (scope != null ? !scope.equals(taxCode.scope) : taxCode.scope != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (key != null ? key.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (domicile != null ? domicile.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        return result;
    }
}
