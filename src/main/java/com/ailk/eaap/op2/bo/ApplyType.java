package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class ApplyType implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer applyTypeId;
	private String applyTypeName;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getApplyTypeId() {
		return applyTypeId;
	}
	public void setApplyTypeId(Integer applyTypeId) {
		this.applyTypeId = applyTypeId;
	}
	public String getApplyTypeName() {
		return applyTypeName;
	}
	public void setApplyTypeName(String applyTypeName) {
		this.applyTypeName = applyTypeName;
	}
}
