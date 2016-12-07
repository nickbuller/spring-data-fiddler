//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import java.math.BigInteger;
//
//@Entity
//public class Containerperson {
//    private Integer id;
//    private String name;
//    private Integer addressId;
//    private String alias;
//    private String emailAddress;
//    private String firstName;
//    private String gender;
//    private String location;
//    private String mobileTelephoneNumber;
//    private String professionalStatus;
//    private BigInteger salary;
//    private String surname;
//    private String telephoneNumber;
//    private String yearOfBirth;
//
//    @Basic
//    @Column(name = "id")
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "name")
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Basic
//    @Column(name = "address_id")
//    public Integer getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(Integer addressId) {
//        this.addressId = addressId;
//    }
//
//    @Basic
//    @Column(name = "alias")
//    public String getAlias() {
//        return alias;
//    }
//
//    public void setAlias(String alias) {
//        this.alias = alias;
//    }
//
//    @Basic
//    @Column(name = "email_address")
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    @Basic
//    @Column(name = "first_name")
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    @Basic
//    @Column(name = "gender")
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    @Basic
//    @Column(name = "location")
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    @Basic
//    @Column(name = "mobile_telephone_number")
//    public String getMobileTelephoneNumber() {
//        return mobileTelephoneNumber;
//    }
//
//    public void setMobileTelephoneNumber(String mobileTelephoneNumber) {
//        this.mobileTelephoneNumber = mobileTelephoneNumber;
//    }
//
//    @Basic
//    @Column(name = "professional_status")
//    public String getProfessionalStatus() {
//        return professionalStatus;
//    }
//
//    public void setProfessionalStatus(String professionalStatus) {
//        this.professionalStatus = professionalStatus;
//    }
//
//    @Basic
//    @Column(name = "salary")
//    public java.math.BigInteger getSalary() {
//        return salary;
//    }
//
//    public void setSalary(java.math.BigInteger salary) {
//        this.salary = salary;
//    }
//
//    @Basic
//    @Column(name = "surname")
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    @Basic
//    @Column(name = "telephone_number")
//    public String getTelephoneNumber() {
//        return telephoneNumber;
//    }
//
//    public void setTelephoneNumber(String telephoneNumber) {
//        this.telephoneNumber = telephoneNumber;
//    }
//
//    @Basic
//    @Column(name = "year_of_birth")
//    public String getYearOfBirth() {
//        return yearOfBirth;
//    }
//
//    public void setYearOfBirth(String yearOfBirth) {
//        this.yearOfBirth = yearOfBirth;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Containerperson that = (Containerperson) object;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (addressId != null ? !addressId.equals(that.addressId) : that.addressId != null) return false;
//        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
//        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
//        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
//        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
//        if (location != null ? !location.equals(that.location) : that.location != null) return false;
//        if (mobileTelephoneNumber != null ? !mobileTelephoneNumber.equals(that.mobileTelephoneNumber) : that.mobileTelephoneNumber != null) return false;
//        if (professionalStatus != null ? !professionalStatus.equals(that.professionalStatus) : that.professionalStatus != null) return false;
//        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
//        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
//        if (telephoneNumber != null ? !telephoneNumber.equals(that.telephoneNumber) : that.telephoneNumber != null) return false;
//        if (yearOfBirth != null ? !yearOfBirth.equals(that.yearOfBirth) : that.yearOfBirth != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (id != null ? id.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (addressId != null ? addressId.hashCode() : 0);
//        result = 31 * result + (alias != null ? alias.hashCode() : 0);
//        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
//        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
//        result = 31 * result + (gender != null ? gender.hashCode() : 0);
//        result = 31 * result + (location != null ? location.hashCode() : 0);
//        result = 31 * result + (mobileTelephoneNumber != null ? mobileTelephoneNumber.hashCode() : 0);
//        result = 31 * result + (professionalStatus != null ? professionalStatus.hashCode() : 0);
//        result = 31 * result + (salary != null ? salary.hashCode() : 0);
//        result = 31 * result + (surname != null ? surname.hashCode() : 0);
//        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
//        result = 31 * result + (yearOfBirth != null ? yearOfBirth.hashCode() : 0);
//        return result;
//    }
//}
