package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class SysCardType implements Serializable{

	/**
	 * wanglm7
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer sysCardTypeId ; 
	private String sysCardTypeName ;
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
	
	public SysCardType() {
		super();
	}
	
	public SysCardType(Integer sysCardTypeId, String sysCardTypeName) {
		super();
		this.sysCardTypeId = sysCardTypeId;
		this.sysCardTypeName = sysCardTypeName;
	}
	
	public Integer getSysCardTypeId() {
		return sysCardTypeId;
	}
	public void setSysCardTypeId(Integer sysCardTypeId) {
		this.sysCardTypeId = sysCardTypeId;
	}
	public String getSysCardTypeName() {
		return sysCardTypeName;
	}
	public void setSysCardTypeName(String sysCardTypeName) {
		this.sysCardTypeName = sysCardTypeName;
	}
	
}
