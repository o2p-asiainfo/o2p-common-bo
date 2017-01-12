package com.ailk.eaap.op2.bo;

import java.util.Date;

public class ApplyInfo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer applyId;
	private Integer applyTypeId;
	private Integer orgId;
	private Date applyDate;
	private String state;
	private Date stateTime;
	private String descriptor;
	private Integer auditFlowId;
	private String auditDescriptor;
	private Integer auditStaff ;
	private Integer sFileId;
	private Integer cycleId;
	private String fileName ;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getAuditStaff() {
		return auditStaff;
	}
	public void setAuditStaff(Integer auditStaff) {
		this.auditStaff = auditStaff;
	}
	public Integer getCycleId() {
		return cycleId;
	}
	public void setCycleId(Integer cycleId) {
		this.cycleId = cycleId;
	}
	public Integer getSFileId() {
		return sFileId;
	}
	public void setSFileId(Integer fileId) {
		sFileId = fileId;
	}
	public Integer getApplyId() {
		return applyId;
	}
	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}
	public Integer getApplyTypeId() {
		return applyTypeId;
	}
	public void setApplyTypeId(Integer applyTypeId) {
		this.applyTypeId = applyTypeId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
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
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	public Integer getAuditFlowId() {
		return auditFlowId;
	}
	public void setAuditFlowId(Integer auditFlowId) {
		this.auditFlowId = auditFlowId;
	}
	public String getAuditDescriptor() {
		return auditDescriptor;
	}
	public void setAuditDescriptor(String auditDescriptor) {
		this.auditDescriptor = auditDescriptor;
	}
	public Integer getsFileId() {
		return sFileId;
	}
	public void setsFileId(Integer sFileId) {
		this.sFileId = sFileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
