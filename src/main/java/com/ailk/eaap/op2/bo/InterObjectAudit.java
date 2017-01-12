package com.ailk.eaap.op2.bo;

import java.math.BigDecimal;
import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class InterObjectAudit extends BaseClass {

	private BigDecimal interObjId;
	private String objType;
	private BigDecimal objId;
	private String checkResult;
	private String remark;
	private BigDecimal opId;
	private String status;
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
	public BigDecimal getInterObjId() {
		return interObjId;
	}
	public void setInterObjId(BigDecimal interObjId) {
		this.interObjId = interObjId;
	}
	public String getObjType() {
		return objType;
	}
	public void setObjType(String objType) {
		this.objType = objType;
	}
	public BigDecimal getObjId() {
		return objId;
	}
	public void setObjId(BigDecimal objId) {
		this.objId = objId;
	}
	public String getCheckResult() {
		return checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BigDecimal getOpId() {
		return opId;
	}
	public void setOpId(BigDecimal opId) {
		this.opId = opId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
