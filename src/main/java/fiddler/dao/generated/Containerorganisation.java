//package fiddler.dao.generated;
//
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import java.math.BigInteger;
//import java.util.Arrays;
//
//@Entity
//public class Containerorganisation {
//    private Integer id;
//    private String name;
//    private String alias;
//    private String thirdpartyRef;
//    private Boolean allowAutoRegistration;
//    private String applicationName;
//    private String bankAccountName;
//    private String bankAccountNumber;
//    private String bankName;
//    private String bankSortCode;
//    private String companyRegistrationNo;
//    private String cssData;
//    private Integer failedLoginLimit;
//    private String faxNumber;
//    private BigInteger feeRate;
//    private Boolean forceCapatchaAtLogin;
//    private Boolean forceTermsConditionsAcceptance;
//    private Integer freemiumPrecisLevel;
//    private BigInteger fundsBalance;
//    private byte[] headerLogo;
//    private String howDidYouHearAboutUs;
//    private String logoutUrl;
//    private Integer maximumSettablePrecisLevel;
//    private String mod;
//    private String primaryContactName;
//    private String primaryEmailAddress;
//    private String sessionRestorationUrl;
//    private String telephoneNumber;
//    private String vatNumber;
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
//    @Column(name = "thirdparty_ref")
//    public String getThirdpartyRef() {
//        return thirdpartyRef;
//    }
//
//    public void setThirdpartyRef(String thirdpartyRef) {
//        this.thirdpartyRef = thirdpartyRef;
//    }
//
//    @Basic
//    @Column(name = "allow_auto_registration")
//    public Boolean getAllowAutoRegistration() {
//        return allowAutoRegistration;
//    }
//
//    public void setAllowAutoRegistration(Boolean allowAutoRegistration) {
//        this.allowAutoRegistration = allowAutoRegistration;
//    }
//
//    @Basic
//    @Column(name = "application_name")
//    public String getApplicationName() {
//        return applicationName;
//    }
//
//    public void setApplicationName(String applicationName) {
//        this.applicationName = applicationName;
//    }
//
//    @Basic
//    @Column(name = "bank_account_name")
//    public String getBankAccountName() {
//        return bankAccountName;
//    }
//
//    public void setBankAccountName(String bankAccountName) {
//        this.bankAccountName = bankAccountName;
//    }
//
//    @Basic
//    @Column(name = "bank_account_number")
//    public String getBankAccountNumber() {
//        return bankAccountNumber;
//    }
//
//    public void setBankAccountNumber(String bankAccountNumber) {
//        this.bankAccountNumber = bankAccountNumber;
//    }
//
//    @Basic
//    @Column(name = "bank_name")
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    @Basic
//    @Column(name = "bank_sort_code")
//    public String getBankSortCode() {
//        return bankSortCode;
//    }
//
//    public void setBankSortCode(String bankSortCode) {
//        this.bankSortCode = bankSortCode;
//    }
//
//    @Basic
//    @Column(name = "company_registration_no")
//    public String getCompanyRegistrationNo() {
//        return companyRegistrationNo;
//    }
//
//    public void setCompanyRegistrationNo(String companyRegistrationNo) {
//        this.companyRegistrationNo = companyRegistrationNo;
//    }
//
//    @Basic
//    @Column(name = "css_data")
//    public String getCssData() {
//        return cssData;
//    }
//
//    public void setCssData(String cssData) {
//        this.cssData = cssData;
//    }
//
//    @Basic
//    @Column(name = "failed_login_limit")
//    public Integer getFailedLoginLimit() {
//        return failedLoginLimit;
//    }
//
//    public void setFailedLoginLimit(Integer failedLoginLimit) {
//        this.failedLoginLimit = failedLoginLimit;
//    }
//
//    @Basic
//    @Column(name = "fax_number")
//    public String getFaxNumber() {
//        return faxNumber;
//    }
//
//    public void setFaxNumber(String faxNumber) {
//        this.faxNumber = faxNumber;
//    }
//
//    @Basic
//    @Column(name = "fee_rate")
//    public java.math.BigInteger getFeeRate() {
//        return feeRate;
//    }
//
//    public void setFeeRate(java.math.BigInteger feeRate) {
//        this.feeRate = feeRate;
//    }
//
//    @Basic
//    @Column(name = "force_capatcha_at_login")
//    public Boolean getForceCapatchaAtLogin() {
//        return forceCapatchaAtLogin;
//    }
//
//    public void setForceCapatchaAtLogin(Boolean forceCapatchaAtLogin) {
//        this.forceCapatchaAtLogin = forceCapatchaAtLogin;
//    }
//
//    @Basic
//    @Column(name = "force_terms_conditions_acceptance")
//    public Boolean getForceTermsConditionsAcceptance() {
//        return forceTermsConditionsAcceptance;
//    }
//
//    public void setForceTermsConditionsAcceptance(Boolean forceTermsConditionsAcceptance) {
//        this.forceTermsConditionsAcceptance = forceTermsConditionsAcceptance;
//    }
//
//    @Basic
//    @Column(name = "freemium_precis_level")
//    public Integer getFreemiumPrecisLevel() {
//        return freemiumPrecisLevel;
//    }
//
//    public void setFreemiumPrecisLevel(Integer freemiumPrecisLevel) {
//        this.freemiumPrecisLevel = freemiumPrecisLevel;
//    }
//
//    @Basic
//    @Column(name = "funds_balance")
//    public java.math.BigInteger getFundsBalance() {
//        return fundsBalance;
//    }
//
//    public void setFundsBalance(java.math.BigInteger fundsBalance) {
//        this.fundsBalance = fundsBalance;
//    }
//
//    @Basic
//    @Column(name = "header_logo")
//    public byte[] getHeaderLogo() {
//        return headerLogo;
//    }
//
//    public void setHeaderLogo(byte[] headerLogo) {
//        this.headerLogo = headerLogo;
//    }
//
//    @Basic
//    @Column(name = "how_did_you_hear_about_us")
//    public String getHowDidYouHearAboutUs() {
//        return howDidYouHearAboutUs;
//    }
//
//    public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
//        this.howDidYouHearAboutUs = howDidYouHearAboutUs;
//    }
//
//    @Basic
//    @Column(name = "logout_url")
//    public String getLogoutUrl() {
//        return logoutUrl;
//    }
//
//    public void setLogoutUrl(String logoutUrl) {
//        this.logoutUrl = logoutUrl;
//    }
//
//    @Basic
//    @Column(name = "maximum_settable_precis_level")
//    public Integer getMaximumSettablePrecisLevel() {
//        return maximumSettablePrecisLevel;
//    }
//
//    public void setMaximumSettablePrecisLevel(Integer maximumSettablePrecisLevel) {
//        this.maximumSettablePrecisLevel = maximumSettablePrecisLevel;
//    }
//
//    @Basic
//    @Column(name = "mod")
//    public String getMod() {
//        return mod;
//    }
//
//    public void setMod(String mod) {
//        this.mod = mod;
//    }
//
//    @Basic
//    @Column(name = "primary_contact_name")
//    public String getPrimaryContactName() {
//        return primaryContactName;
//    }
//
//    public void setPrimaryContactName(String primaryContactName) {
//        this.primaryContactName = primaryContactName;
//    }
//
//    @Basic
//    @Column(name = "primary_email_address")
//    public String getPrimaryEmailAddress() {
//        return primaryEmailAddress;
//    }
//
//    public void setPrimaryEmailAddress(String primaryEmailAddress) {
//        this.primaryEmailAddress = primaryEmailAddress;
//    }
//
//    @Basic
//    @Column(name = "session_restoration_url")
//    public String getSessionRestorationUrl() {
//        return sessionRestorationUrl;
//    }
//
//    public void setSessionRestorationUrl(String sessionRestorationUrl) {
//        this.sessionRestorationUrl = sessionRestorationUrl;
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
//    @Column(name = "vat_number")
//    public String getVatNumber() {
//        return vatNumber;
//    }
//
//    public void setVatNumber(String vatNumber) {
//        this.vatNumber = vatNumber;
//    }
//
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        if (!super.equals(object)) return false;
//
//        Containerorganisation that = (Containerorganisation) object;
//
//        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (name != null ? !name.equals(that.name) : that.name != null) return false;
//        if (alias != null ? !alias.equals(that.alias) : that.alias != null) return false;
//        if (thirdpartyRef != null ? !thirdpartyRef.equals(that.thirdpartyRef) : that.thirdpartyRef != null) return false;
//        if (allowAutoRegistration != null ? !allowAutoRegistration.equals(that.allowAutoRegistration) : that.allowAutoRegistration != null) return false;
//        if (applicationName != null ? !applicationName.equals(that.applicationName) : that.applicationName != null) return false;
//        if (bankAccountName != null ? !bankAccountName.equals(that.bankAccountName) : that.bankAccountName != null) return false;
//        if (bankAccountNumber != null ? !bankAccountNumber.equals(that.bankAccountNumber) : that.bankAccountNumber != null) return false;
//        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
//        if (bankSortCode != null ? !bankSortCode.equals(that.bankSortCode) : that.bankSortCode != null) return false;
//        if (companyRegistrationNo != null ? !companyRegistrationNo.equals(that.companyRegistrationNo) : that.companyRegistrationNo != null) return false;
//        if (cssData != null ? !cssData.equals(that.cssData) : that.cssData != null) return false;
//        if (failedLoginLimit != null ? !failedLoginLimit.equals(that.failedLoginLimit) : that.failedLoginLimit != null) return false;
//        if (faxNumber != null ? !faxNumber.equals(that.faxNumber) : that.faxNumber != null) return false;
//        if (feeRate != null ? !feeRate.equals(that.feeRate) : that.feeRate != null) return false;
//        if (forceCapatchaAtLogin != null ? !forceCapatchaAtLogin.equals(that.forceCapatchaAtLogin) : that.forceCapatchaAtLogin != null) return false;
//        if (forceTermsConditionsAcceptance != null ? !forceTermsConditionsAcceptance.equals(that.forceTermsConditionsAcceptance) : that.forceTermsConditionsAcceptance != null) return false;
//        if (freemiumPrecisLevel != null ? !freemiumPrecisLevel.equals(that.freemiumPrecisLevel) : that.freemiumPrecisLevel != null) return false;
//        if (fundsBalance != null ? !fundsBalance.equals(that.fundsBalance) : that.fundsBalance != null) return false;
//        if (!java.util.Arrays.equals(headerLogo, that.headerLogo)) return false;
//        if (howDidYouHearAboutUs != null ? !howDidYouHearAboutUs.equals(that.howDidYouHearAboutUs) : that.howDidYouHearAboutUs != null) return false;
//        if (logoutUrl != null ? !logoutUrl.equals(that.logoutUrl) : that.logoutUrl != null) return false;
//        if (maximumSettablePrecisLevel != null ? !maximumSettablePrecisLevel.equals(that.maximumSettablePrecisLevel) : that.maximumSettablePrecisLevel != null) return false;
//        if (mod != null ? !mod.equals(that.mod) : that.mod != null) return false;
//        if (primaryContactName != null ? !primaryContactName.equals(that.primaryContactName) : that.primaryContactName != null) return false;
//        if (primaryEmailAddress != null ? !primaryEmailAddress.equals(that.primaryEmailAddress) : that.primaryEmailAddress != null) return false;
//        if (sessionRestorationUrl != null ? !sessionRestorationUrl.equals(that.sessionRestorationUrl) : that.sessionRestorationUrl != null) return false;
//        if (telephoneNumber != null ? !telephoneNumber.equals(that.telephoneNumber) : that.telephoneNumber != null) return false;
//        if (vatNumber != null ? !vatNumber.equals(that.vatNumber) : that.vatNumber != null) return false;
//
//        return true;
//    }
//
//    public int hashCode() {
//        int result = super.hashCode();
//        result = 31 * result + (id != null ? id.hashCode() : 0);
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (alias != null ? alias.hashCode() : 0);
//        result = 31 * result + (thirdpartyRef != null ? thirdpartyRef.hashCode() : 0);
//        result = 31 * result + (allowAutoRegistration != null ? allowAutoRegistration.hashCode() : 0);
//        result = 31 * result + (applicationName != null ? applicationName.hashCode() : 0);
//        result = 31 * result + (bankAccountName != null ? bankAccountName.hashCode() : 0);
//        result = 31 * result + (bankAccountNumber != null ? bankAccountNumber.hashCode() : 0);
//        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
//        result = 31 * result + (bankSortCode != null ? bankSortCode.hashCode() : 0);
//        result = 31 * result + (companyRegistrationNo != null ? companyRegistrationNo.hashCode() : 0);
//        result = 31 * result + (cssData != null ? cssData.hashCode() : 0);
//        result = 31 * result + (failedLoginLimit != null ? failedLoginLimit.hashCode() : 0);
//        result = 31 * result + (faxNumber != null ? faxNumber.hashCode() : 0);
//        result = 31 * result + (feeRate != null ? feeRate.hashCode() : 0);
//        result = 31 * result + (forceCapatchaAtLogin != null ? forceCapatchaAtLogin.hashCode() : 0);
//        result = 31 * result + (forceTermsConditionsAcceptance != null ? forceTermsConditionsAcceptance.hashCode() : 0);
//        result = 31 * result + (freemiumPrecisLevel != null ? freemiumPrecisLevel.hashCode() : 0);
//        result = 31 * result + (fundsBalance != null ? fundsBalance.hashCode() : 0);
//        result = 31 * result + Arrays.hashCode(headerLogo);
//        result = 31 * result + (howDidYouHearAboutUs != null ? howDidYouHearAboutUs.hashCode() : 0);
//        result = 31 * result + (logoutUrl != null ? logoutUrl.hashCode() : 0);
//        result = 31 * result + (maximumSettablePrecisLevel != null ? maximumSettablePrecisLevel.hashCode() : 0);
//        result = 31 * result + (mod != null ? mod.hashCode() : 0);
//        result = 31 * result + (primaryContactName != null ? primaryContactName.hashCode() : 0);
//        result = 31 * result + (primaryEmailAddress != null ? primaryEmailAddress.hashCode() : 0);
//        result = 31 * result + (sessionRestorationUrl != null ? sessionRestorationUrl.hashCode() : 0);
//        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
//        result = 31 * result + (vatNumber != null ? vatNumber.hashCode() : 0);
//        return result;
//    }
//}
