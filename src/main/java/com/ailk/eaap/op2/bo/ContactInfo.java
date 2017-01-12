package com.ailk.eaap.op2.bo;

import java.util.Date;

public class ContactInfo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer contactId;
	private String headFlag;
	private String contactType;
	private String contactDuty;//职务
	private String contactName;
	private String contactGender;
	private String contactAddress;
	private String contactEmployer;
	private String homePhone;
	private String officePhone;
	private String mobilePhone;
	private String contactDesc;
	private String EMail;
	private String postcode;
	private String postAddress;
	private String fax;
	private String statusCd;
	private Date statusDate;
	private Date modDate;
	private Integer staffId;
	private Date createDate;
	private String extContactInfoId;
	private String emergencyContact;
	private String emergencyPhone;
	/**
	 * 租户ID
	 */
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	// Constructors

	/** default constructor */
	public ContactInfo() {
	}

	/** minimal constructor */
	public ContactInfo(Integer contactId) {
		this.contactId = contactId;
	}

	/** full constructor */
	public ContactInfo(Integer contactId, String headFlag, String contactType,
			String contactDuty, String contactName, String contactGender,
			String contactAddress, String contactEmployer, String homePhone,
			String officePhone, String mobilePhone, String contactDesc,
			String EMail, String postcode, String postAddress, String fax,
			String statusCd, Date statusDate, Date modDate, Integer staffId,
			Date createDate) {
		this.contactId = contactId;
		this.headFlag = headFlag;
		this.contactType = contactType;
		this.contactDuty = contactDuty;
		this.contactName = contactName;
		this.contactGender = contactGender;
		this.contactAddress = contactAddress;
		this.contactEmployer = contactEmployer;
		this.homePhone = homePhone;
		this.officePhone = officePhone;
		this.mobilePhone = mobilePhone;
		this.contactDesc = contactDesc;
		this.EMail = EMail;
		this.postcode = postcode;
		this.postAddress = postAddress;
		this.fax = fax;
		this.statusCd = statusCd;
		this.statusDate = statusDate;
		this.modDate = modDate;
		this.staffId = staffId;
		this.createDate = createDate;
	}

	// Property accessors

	public Integer getContactId() {
		return this.contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getHeadFlag() {
		return this.headFlag;
	}

	public void setHeadFlag(String headFlag) {
		this.headFlag = headFlag;
	}

	public String getContactType() {
		return this.contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactDuty() {
		return this.contactDuty;
	}

	public void setContactDuty(String contactDuty) {
		this.contactDuty = contactDuty;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactGender() {
		return this.contactGender;
	}

	public void setContactGender(String contactGender) {
		this.contactGender = contactGender;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactEmployer() {
		return this.contactEmployer;
	}

	public void setContactEmployer(String contactEmployer) {
		this.contactEmployer = contactEmployer;
	}

	public String getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getContactDesc() {
		return this.contactDesc;
	}

	public void setContactDesc(String contactDesc) {
		this.contactDesc = contactDesc;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPostAddress() {
		return this.postAddress;
	}

	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getModDate() {
		return this.modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	public Integer getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getExtContactInfoId() {
		return extContactInfoId;
	}

	public void setExtContactInfoId(String extContactInfoId) {
		this.extContactInfoId = extContactInfoId;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

}
