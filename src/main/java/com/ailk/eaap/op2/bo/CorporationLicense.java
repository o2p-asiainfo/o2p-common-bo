package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CorporationLicense implements Serializable{

	/**
	 * @author wanglm7     企业业务牌照
	 */
	private static final long serialVersionUID = 1L;
	private Integer corporationLicenseId;
	private Integer corporationId; //企业标识
	private String businessLicenseId; //业务牌照
	
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
	public CorporationLicense() {
		super();
	}
	
	
	public CorporationLicense(Integer corporationLicenseId,
			Integer corporationId, String businessLicenseId) {
		super();
		this.corporationLicenseId = corporationLicenseId;
		this.corporationId = corporationId;
		this.businessLicenseId = businessLicenseId;
	}


	public Integer getCorporationLicenseId() {
		return corporationLicenseId;
	}
	public void setCorporationLicenseId(Integer corporationLicenseId) {
		this.corporationLicenseId = corporationLicenseId;
	}
	public Integer getCorporationId() {
		return corporationId;
	}
	public void setCorporationId(Integer corporationId) {
		this.corporationId = corporationId;
	}
	public String getBusinessLicenseId() {
		return businessLicenseId;
	}
	public void setBusinessLicenseId(String businessLicenseId) {
		this.businessLicenseId = businessLicenseId;
	}
	
	
}
