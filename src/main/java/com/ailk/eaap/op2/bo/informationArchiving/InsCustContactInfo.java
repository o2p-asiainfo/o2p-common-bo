package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsCustContactInfo {
	private Long custId;
	private String zip;
	private String phone;
	private String phExtention;
	private String faxNumber;
	private String faxExtention;
	private String postInfo;
	private String taxStatus;
	private String email;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhExtention() {
		return phExtention;
	}
	public void setPhExtention(String phExtention) {
		this.phExtention = phExtention;
	}
	public String getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getFaxExtention() {
		return faxExtention;
	}
	public void setFaxExtention(String faxExtention) {
		this.faxExtention = faxExtention;
	}
	public String getPostInfo() {
		return postInfo;
	}
	public void setPostInfo(String postInfo) {
		this.postInfo = postInfo;
	}
	public String getTaxStatus() {
		return taxStatus;
	}
	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}