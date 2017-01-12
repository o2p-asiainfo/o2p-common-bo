package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class ServiceSpecAttrValue implements Serializable {
	private static final long serialVersionUID = 9111208059531457294L;
	private String serviceSpecAttrValueId;
	private Integer serviceSpecAttrId;
	private Integer attrValueId;
	private String ruleType;
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
	
	public String getServiceSpecAttrValueId() {
		return serviceSpecAttrValueId;
	}
	public void setServiceSpecAttrValueId(String serviceSpecAttrValueId) {
		this.serviceSpecAttrValueId = serviceSpecAttrValueId;
	}
	public Integer getAttrValueId() {
		return attrValueId;
	}
	public void setAttrValueId(Integer attrValueId) {
		this.attrValueId = attrValueId;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public Integer getServiceSpecAttrId() {
		return serviceSpecAttrId;
	}
	public void setServiceSpecAttrId(Integer serviceSpecAttrId) {
		this.serviceSpecAttrId = serviceSpecAttrId;
	}
	
}
