package com.ailk.eaap.op2.bo;

import java.util.Date;

public class PartnerContractAttach implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer contractAttachId;
	private Integer contractId;
	private String attachType;
	private Integer sFileId;
	private String state;
	private Date stateTime;
	private Date createTime;
	private String hiddenSFileId;
	private String sFileName;
	private String sFileUrl;
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
	
	public String getSFileUrl() {
		return sFileUrl;
	}
	public void setSFileUrl(String fileUrl) {
		sFileUrl = fileUrl;
	}
	public String getSFileName() {
		return sFileName;
	}
	public void setSFileName(String fileName) {
		sFileName = fileName;
	}
	public String getHiddenSFileId() {
		return hiddenSFileId;
	}
	public void setHiddenSFileId(String hiddenSFileId) {
		this.hiddenSFileId = hiddenSFileId;
	}
	public Integer getContractAttachId() {
		return contractAttachId;
	}
	public void setContractAttachId(Integer contractAttachId) {
		this.contractAttachId = contractAttachId;
	}
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}
	public String getAttachType() {
		return attachType;
	}
	public void setAttachType(String attachType) {
		this.attachType = attachType;
	}
	public Integer getSFileId() {
		return sFileId;
	}
	public void setSFileId(Integer fileId) {
		sFileId = fileId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getStateTime() {
		return stateTime;
	}
	public void setStateTime(Date stateTime) {
		this.stateTime = stateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
