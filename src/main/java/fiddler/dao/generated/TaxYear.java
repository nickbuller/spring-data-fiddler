package fiddler.dao.generated;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "tax_year", schema = "public", catalog = "indoc")
public class TaxYear {
    private int id;
    private String name;
    private LocalDate fromdate;
    private LocalDate todate;
    private LocalDateTime createdts;
    private Integer creatorid;
    private LocalDateTime modifiedts;
    private Integer modifierid;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "fromdate")
    public LocalDate getFromdate() {
        return fromdate;
    }

    public void setFromdate(LocalDate fromdate) {
        this.fromdate = fromdate;
    }

    @Basic
    @Column(name = "todate")
    public LocalDate getTodate() {
        return todate;
    }

    public void setTodate(LocalDate todate) {
        this.todate = todate;
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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        TaxYear taxYear = (TaxYear) object;

        if (id != taxYear.id) return false;
        if (name != null ? !name.equals(taxYear.name) : taxYear.name != null) return false;
        if (fromdate != null ? !fromdate.equals(taxYear.fromdate) : taxYear.fromdate != null) return false;
        if (todate != null ? !todate.equals(taxYear.todate) : taxYear.todate != null) return false;
        if (createdts != null ? !createdts.equals(taxYear.createdts) : taxYear.createdts != null) return false;
        if (creatorid != null ? !creatorid.equals(taxYear.creatorid) : taxYear.creatorid != null) return false;
        if (modifiedts != null ? !modifiedts.equals(taxYear.modifiedts) : taxYear.modifiedts != null) return false;
        if (modifierid != null ? !modifierid.equals(taxYear.modifierid) : taxYear.modifierid != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fromdate != null ? fromdate.hashCode() : 0);
        result = 31 * result + (todate != null ? todate.hashCode() : 0);
        result = 31 * result + (createdts != null ? createdts.hashCode() : 0);
        result = 31 * result + (creatorid != null ? creatorid.hashCode() : 0);
        result = 31 * result + (modifiedts != null ? modifiedts.hashCode() : 0);
        result = 31 * result + (modifierid != null ? modifierid.hashCode() : 0);
        return result;
    }
}
