//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//
//@Entity
//public class Containeraddress {
//    private Integer id;
//    private String addess1;
//    private String address;
//    private String address2;
//    private String address3;
//    private String buildingName;
//    private String buildingNumber;
//    private String dependentLocality;
//    private String dependentThoroughfare;
//    private String doubleDependentLocality;
//    private String poBox;
//    private String postCode;
//    private String postTown;
//    private String postalCode;
//    private String postalTown;
//    private String subBuildingName;
//    private String thoroughfare;
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
//    @Column(name = "addess_1")
//    public String getAddess1() {
//        return addess1;
//    }
//
//    public void setAddess1(String addess1) {
//        this.addess1 = addess1;
//    }
//
//    @Basic
//    @Column(name = "address")
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Basic
//    @Column(name = "address_2")
//    public String getAddress2() {
//        return address2;
//    }
//
//    public void setAddress2(String address2) {
//        this.address2 = address2;
//    }
//
//    @Basic
//    @Column(name = "address_3")
//    public String getAddress3() {
//        return address3;
//    }
//
//    public void setAddress3(String address3) {
//        this.address3 = address3;
//    }
//
//    @Basic
//    @Column(name = "building_name")
//    public String getBuildingName() {
//        return buildingName;
//    }
//
//    public void setBuildingName(String buildingName) {
//        this.buildingName = buildingName;
//    }
//
//    @Basic
//    @Column(name = "building_number")
//    public String getBuildingNumber() {
//        return buildingNumber;
//    }
//
//    public void setBuildingNumber(String buildingNumber) {
//        this.buildingNumber = buildingNumber;
//    }
//
//    @Basic
//    @Column(name = "dependent_locality")
//    public String getDependentLocality() {
//        return dependentLocality;
//    }
//
//    public void setDependentLocality(String dependentLocality) {
//        this.dependentLocality = dependentLocality;
//    }
//
//    @Basic
//    @Column(name = "dependent_thoroughfare")
//    public String getDependentThoroughfare() {
//        return dependentThoroughfare;
//    }
//
//    public void setDependentThoroughfare(String dependentThoroughfare) {
//        this.dependentThoroughfare = dependentThoroughfare;
//    }
//
//    @Basic
//    @Column(name = "double_dependent_locality")
//    public String getDoubleDependentLocality() {
//        return doubleDependentLocality;
//    }
//
//    public void setDoubleDependentLocality(String doubleDependentLocality) {
//        this.doubleDependentLocality = doubleDependentLocality;
//    }
//
//    @Basic
//    @Column(name = "po_box")
//    public String getPoBox() {
//        return poBox;
//    }
//
//    public void setPoBox(String poBox) {
//        this.poBox = poBox;
//    }
//
//    @Basic
//    @Column(name = "post_code")
//    public String getPostCode() {
//        return postCode;
//    }
//
//    public void setPostCode(String postCode) {
//        this.postCode = postCode;
//    }
//
//    @Basic
//    @Column(name = "post_town")
//    public String getPostTown() {
//        return postTown;
//    }
//
//    public void setPostTown(String postTown) {
//        this.postTown = postTown;
//    }
//
//    @Basic
//    @Column(name = "postal_code")
//    public String getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(String postalCode) {
//        this.postalCode = postalCode;
//    }
//
//    @Basic
//    @Column(name = "postal_town")
//    public String getPostalTown() {
//        return postalTown;
//    }
//
//    public void setPostalTown(String postalTown) {
//        this.postalTown = postalTown;
//    }
//
//    @Basic
//    @Column(name = "sub_building_name")
//    public String getSubBuildingName() {
//        return subBuildingName;
//    }
//
//    public void setSubBuildingName(String subBuildingName) {
//        this.subBuildingName = subBuildingName;
//    }
//
//    @Basic
//    @Column(name = "thoroughfare")
//    public String getThoroughfare() {
//        return thoroughfare;
//    }
//
//    public void setThoroughfare(String thoroughfare) {
//        this.thoroughfare = thoroughfare;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Containeraddress that = (Containeraddress) object;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (addess1 != null ? !addess1.equals(that.addess1) : that.addess1 != null) return false;
//        if (address != null ? !address.equals(that.address) : that.address != null) return false;
//        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
//        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
//        if (buildingName != null ? !buildingName.equals(that.buildingName) : that.buildingName != null) return false;
//        if (buildingNumber != null ? !buildingNumber.equals(that.buildingNumber) : that.buildingNumber != null) return false;
//        if (dependentLocality != null ? !dependentLocality.equals(that.dependentLocality) : that.dependentLocality != null) return false;
//        if (dependentThoroughfare != null ? !dependentThoroughfare.equals(that.dependentThoroughfare) : that.dependentThoroughfare != null) return false;
//        if (doubleDependentLocality != null ? !doubleDependentLocality.equals(that.doubleDependentLocality) : that.doubleDependentLocality != null) return false;
//        if (poBox != null ? !poBox.equals(that.poBox) : that.poBox != null) return false;
//        if (postCode != null ? !postCode.equals(that.postCode) : that.postCode != null) return false;
//        if (postTown != null ? !postTown.equals(that.postTown) : that.postTown != null) return false;
//        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
//        if (postalTown != null ? !postalTown.equals(that.postalTown) : that.postalTown != null) return false;
//        if (subBuildingName != null ? !subBuildingName.equals(that.subBuildingName) : that.subBuildingName != null) return false;
//        if (thoroughfare != null ? !thoroughfare.equals(that.thoroughfare) : that.thoroughfare != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (id != null ? id.hashCode() : 0);
//        result = 31 * result + (addess1 != null ? addess1.hashCode() : 0);
//        result = 31 * result + (address != null ? address.hashCode() : 0);
//        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
//        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
//        result = 31 * result + (buildingName != null ? buildingName.hashCode() : 0);
//        result = 31 * result + (buildingNumber != null ? buildingNumber.hashCode() : 0);
//        result = 31 * result + (dependentLocality != null ? dependentLocality.hashCode() : 0);
//        result = 31 * result + (dependentThoroughfare != null ? dependentThoroughfare.hashCode() : 0);
//        result = 31 * result + (doubleDependentLocality != null ? doubleDependentLocality.hashCode() : 0);
//        result = 31 * result + (poBox != null ? poBox.hashCode() : 0);
//        result = 31 * result + (postCode != null ? postCode.hashCode() : 0);
//        result = 31 * result + (postTown != null ? postTown.hashCode() : 0);
//        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
//        result = 31 * result + (postalTown != null ? postalTown.hashCode() : 0);
//        result = 31 * result + (subBuildingName != null ? subBuildingName.hashCode() : 0);
//        result = 31 * result + (thoroughfare != null ? thoroughfare.hashCode() : 0);
//        return result;
//    }
//}
