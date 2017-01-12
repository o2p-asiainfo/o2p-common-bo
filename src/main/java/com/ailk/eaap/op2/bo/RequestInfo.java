package com.ailk.eaap.op2.bo;

import java.util.Date;

public class RequestInfo implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String requestTemplateInstId;
	private String batchNo;
	private String name;
	private String description;
	private String deptCode;
	private String contName;
	private String contTele;
	private Date createDate;
	private Date finishDate;
	private Date expectFinishDate;
	private String requestType;
	private String actionType;
	private String statusCd;
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
	public String getRequestTemplateInstId() {
		return requestTemplateInstId;
	}
	public void setRequestTemplateInstId(String requestTemplateInstId) {
		this.requestTemplateInstId = requestTemplateInstId;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public String getContTele() {
		return contTele;
	}
	public void setContTele(String contTele) {
		this.contTele = contTele;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getFinishDate() {
		return finishDate;
	}
	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	public Date getExpectFinishDate() {
		return expectFinishDate;
	}
	public void setExpectFinishDate(Date expectFinishDate) {
		this.expectFinishDate = expectFinishDate;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
}
