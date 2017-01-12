package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class ResellerMsg implements Serializable{

	/**
	 * @author wanglm7
	 * @desc 转售商信息
	 */
	
	private static final long serialVersionUID = 1L;

	private int id ; //主键
	private String resellerCode ;//转售商标识码
	private String resellerType ;//转售商分类
	private String companyName ;//公司名称 
	private String companyType ;//公司性质 
	private String busiLicenseNum ;//工商执照编号
	private String taxRegistrationNum ;//税务登记号
	private String registeredCapital ;// 注册资金（万元）
	private String registrationTime ;// 注册时间
	private String registrationAdd ;// 注册地址
	private String busiLicense ;// 转售商业务牌照
	private String agreementNum ;// 合同编号
	private String responsiblePerson ;// 法定代表人或负责人
	private String responsibleDocumentType ;// 证件类型
	private String responsibleDocumentNum ;// 证件号码
	private String bankNum ;// 银行帐号
	private String bankName ;// 开户银行
	private String accountName ;// 账户名称
	private String contactsName ;// 联系人姓名
	private String contactsPost ;// 联系人职务
	private String contactsFixedLine ;// 联系人固话
	private String contactsPhone ;// 联系人手机
	private String contactsEmail ;// 联系人E-mail
	private String contactsAdd ;// 联系人地址
	private String contactsEncoded ;// 联系人邮编
	private String emergencyContactName ;// 紧急联系人
	private String emergencyContactPhone ;// 紧急联系人电话
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
	
	public ResellerMsg() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getResellerCode() {
		return resellerCode;
	}


	public void setResellerCode(String resellerCode) {
		this.resellerCode = resellerCode;
	}


	public String getResellerType() {
		return resellerType;
	}


	public void setResellerType(String resellerType) {
		this.resellerType = resellerType;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyType() {
		return companyType;
	}


	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}


	public String getBusiLicenseNum() {
		return busiLicenseNum;
	}


	public void setBusiLicenseNum(String busiLicenseNum) {
		this.busiLicenseNum = busiLicenseNum;
	}


	public String getTaxRegistrationNum() {
		return taxRegistrationNum;
	}


	public void setTaxRegistrationNum(String taxRegistrationNum) {
		this.taxRegistrationNum = taxRegistrationNum;
	}


	public String getRegisteredCapital() {
		return registeredCapital;
	}


	public void setRegisteredCapital(String registeredCapital) {
		this.registeredCapital = registeredCapital;
	}


	public String getRegistrationTime() {
		return registrationTime;
	}


	public void setRegistrationTime(String registrationTime) {
		this.registrationTime = registrationTime;
	}


	public String getRegistrationAdd() {
		return registrationAdd;
	}


	public void setRegistrationAdd(String registrationAdd) {
		this.registrationAdd = registrationAdd;
	}


	public String getBusiLicense() {
		return busiLicense;
	}


	public void setBusiLicense(String busiLicense) {
		this.busiLicense = busiLicense;
	}


	public String getAgreementNum() {
		return agreementNum;
	}


	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}


	public String getResponsiblePerson() {
		return responsiblePerson;
	}


	public void setResponsiblePerson(String responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}


	public String getResponsibleDocumentType() {
		return responsibleDocumentType;
	}


	public void setResponsibleDocumentType(String responsibleDocumentType) {
		this.responsibleDocumentType = responsibleDocumentType;
	}


	public String getResponsibleDocumentNum() {
		return responsibleDocumentNum;
	}


	public void setResponsibleDocumentNum(String responsibleDocumentNum) {
		this.responsibleDocumentNum = responsibleDocumentNum;
	}


	public String getBankNum() {
		return bankNum;
	}


	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getContactsName() {
		return contactsName;
	}


	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}


	public String getContactsPost() {
		return contactsPost;
	}


	public void setContactsPost(String contactsPost) {
		this.contactsPost = contactsPost;
	}


	public String getContactsFixedLine() {
		return contactsFixedLine;
	}


	public void setContactsFixedLine(String contactsFixedLine) {
		this.contactsFixedLine = contactsFixedLine;
	}


	public String getContactsPhone() {
		return contactsPhone;
	}


	public void setContactsPhone(String contactsPhone) {
		this.contactsPhone = contactsPhone;
	}


	public String getContactsEmail() {
		return contactsEmail;
	}


	public void setContactsEmail(String contactsEmail) {
		this.contactsEmail = contactsEmail;
	}


	public String getContactsAdd() {
		return contactsAdd;
	}


	public void setContactsAdd(String contactsAdd) {
		this.contactsAdd = contactsAdd;
	}


	public String getContactsEncoded() {
		return contactsEncoded;
	}


	public void setContactsEncoded(String contactsEncoded) {
		this.contactsEncoded = contactsEncoded;
	}


	public String getEmergencyContactName() {
		return emergencyContactName;
	}


	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}


	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}


	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}
	
}
