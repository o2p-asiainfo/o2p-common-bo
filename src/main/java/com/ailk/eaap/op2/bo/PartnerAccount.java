package com.ailk.eaap.op2.bo;

import java.util.Date;

/**
 * PartnerAccount entity. @author MyEclipse Persistence Tools
 * wanglm7
 */

public class PartnerAccount implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer accountId;
	private Integer orgId;
	private String accountName;
	private String accountNumber;
	private String contactPhone;
	private String mobilePhone;
	private String ifDefault;
	private String statusCd;
	private Date statusDate;
	private Date createDate;
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
	public PartnerAccount() {
	}

	/** minimal constructor */
	public PartnerAccount(Integer accountId) {
		this.accountId = accountId;
	}

	/** full constructor */
	public PartnerAccount(Integer accountId,Integer orgId, String accountName,
			String accountNumber, String contactPhone, String mobilePhone,
			String ifDefault, String statusCd, Date statusDate,
			Date createDate) {
		this.accountId = accountId;
		this.orgId = orgId ;
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.contactPhone = contactPhone;
		this.mobilePhone = mobilePhone;
		this.ifDefault = ifDefault;
		this.statusCd = statusCd;
		this.statusDate = statusDate;
		this.createDate = createDate;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getIfDefault() {
		return this.ifDefault;
	}

	public void setIfDefault(String ifDefault) {
		this.ifDefault = ifDefault;
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

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
