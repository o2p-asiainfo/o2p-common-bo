package com.ailk.eaap.op2.bo;

import java.math.BigDecimal;

public class ObjectInfoLog {

	private String objId;
	private String objType;
	private String status;
	private String statusDate;
	private BigDecimal opId;
	private String contractInteractionId;
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
	public String getObjId() {
		return objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}
	public BigDecimal getOpId() {
		return opId;
	}
	public void setOpId(BigDecimal opId) {
		this.opId = opId;
	}
	public String getContractInteractionId() {
		return contractInteractionId;
	}
	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}
	
}
