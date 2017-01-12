package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsCustInfo {
    private Long custId;
    private String companyName;
    private String firstName;
    private String midName;
    private String lastName;
    private String status;
    private String custTypeId;
    private String country;
    private String city;
    private String cvr;
    private String certTypeId;
    private String certName;
    private String certCode;
    private String addressInfo;
    private String birthday;
    private Date createTime;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidName() {
		return midName;
	}
	public void setMidName(String midName) {
		this.midName = midName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustTypeId() {
		return custTypeId;
	}
	public void setCustTypeId(String custTypeId) {
		this.custTypeId = custTypeId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCvr() {
		return cvr;
	}
	public void setCvr(String cvr) {
		this.cvr = cvr;
	}
	public String getCertTypeId() {
		return certTypeId;
	}
	public void setCertTypeId(String certTypeId) {
		this.certTypeId = certTypeId;
	}
	public String getCertName() {
		return certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}
	public String getCertCode() {
		return certCode;
	}
	public void setCertCode(String certCode) {
		this.certCode = certCode;
	}
	public String getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}