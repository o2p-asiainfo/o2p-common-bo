package com.ailk.eaap.op2.bo;

public class WhiteList implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer whiteId;
	private String mac;
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
	public Integer getWhiteId() {
		return whiteId;
	}
	public void setWhiteId(Integer whiteId) {
		this.whiteId = whiteId;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

}
