package com.ailk.eaap.op2.bo;

public class Message<T> {
	private String tranSid;
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

	public String getTranSid() {
		return tranSid;
	}

	public void setTranSid(String tranSid) {
		this.tranSid = tranSid;
	}
	
}
