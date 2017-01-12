package com.ailk.eaap.op2.bo;

import java.util.Date;

/**
 * SysPerson entity. @author MyEclipse Persistence Tools
 * wanglm7
 */

public class SysPerson implements java.io.Serializable {

	
	// Fields
	
	private static final long serialVersionUID = 1L;
	private Integer sysPersonId;
	private String name;
	private String mobile;
	private String password;
	private String last1Pwd;
	private String last2Pwd;
	private String email;
	private Integer sysIdTypeId;
	private Short sysCardTypeId;
	private Integer sysAreaId;
	private String cardNumber;
	private String sysUserType;
	private Date createDate;
	private Short sysStatusId;
	private Date stateDate;
	private Date pwdLastUpTime;
	private Date pwdEffTime;
	private String sysCardType;


	private Integer tenantId;

	
	// Constructors

	public String getSysCardType() {
		return sysCardType;
	}

	public void setSysCardType(String sysCardType) {
		this.sysCardType = sysCardType;
	}

	/** default constructor */
	public SysPerson() {
	}

	/** minimal constructor */
	public SysPerson(Integer sysPersonId) {
		this.sysPersonId = sysPersonId;
	}

	/** full constructor */
	public SysPerson(Integer sysPersonId, String name, String mobile,
			String password, String last1Pwd, String last2Pwd, String email,
			Integer sysIdTypeId, Short sysCardTypeId, Integer sysAreaId,
			String cardNumber, String sysUserType, Date createDate,
			Short sysStatusId, Date stateDate, Date pwdLastUpTime,
			Date pwdEffTime) {
		this.sysPersonId = sysPersonId;
		this.name = name;
		this.mobile = mobile;
		this.password = password;
		this.last1Pwd = last1Pwd;
		this.last2Pwd = last2Pwd;
		this.email = email;
		this.sysIdTypeId = sysIdTypeId;
		this.sysCardTypeId = sysCardTypeId;
		this.sysAreaId = sysAreaId;
		this.cardNumber = cardNumber;
		this.sysUserType = sysUserType;
		this.createDate = createDate;
		this.sysStatusId = sysStatusId;
		this.stateDate = stateDate;
		this.pwdLastUpTime = pwdLastUpTime;
		this.pwdEffTime = pwdEffTime;
	}

	// Property accessors

	public Integer getSysPersonId() {
		return this.sysPersonId;
	}

	public void setSysPersonId(Integer sysPersonId) {
		this.sysPersonId = sysPersonId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLast1Pwd() {
		return this.last1Pwd;
	}

	public void setLast1Pwd(String last1Pwd) {
		this.last1Pwd = last1Pwd;
	}

	public String getLast2Pwd() {
		return this.last2Pwd;
	}

	public void setLast2Pwd(String last2Pwd) {
		this.last2Pwd = last2Pwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSysIdTypeId() {
		return this.sysIdTypeId;
	}

	public void setSysIdTypeId(Integer sysIdTypeId) {
		this.sysIdTypeId = sysIdTypeId;
	}

	public Short getSysCardTypeId() {
		return this.sysCardTypeId;
	}

	public void setSysCardTypeId(Short sysCardTypeId) {
		this.sysCardTypeId = sysCardTypeId;
	}

	public Integer getSysAreaId() {
		return this.sysAreaId;
	}

	public void setSysAreaId(Integer sysAreaId) {
		this.sysAreaId = sysAreaId;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getSysUserType() {
		return this.sysUserType;
	}

	public void setSysUserType(String sysUserType) {
		this.sysUserType = sysUserType;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Short getSysStatusId() {
		return this.sysStatusId;
	}

	public void setSysStatusId(Short sysStatusId) {
		this.sysStatusId = sysStatusId;
	}

	public Date getStateDate() {
		return this.stateDate;
	}

	public void setStateDate(Date stateDate) {
		this.stateDate = stateDate;
	}

	public Date getPwdLastUpTime() {
		return this.pwdLastUpTime;
	}

	public void setPwdLastUpTime(Date pwdLastUpTime) {
		this.pwdLastUpTime = pwdLastUpTime;
	}

	public Date getPwdEffTime() {
		return this.pwdEffTime;
	}

	public void setPwdEffTime(Date pwdEffTime) {
		this.pwdEffTime = pwdEffTime;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

}
