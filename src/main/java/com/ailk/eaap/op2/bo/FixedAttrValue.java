package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class FixedAttrValue implements Serializable{
	private static final long serialVersionUID = 1L;
	private String applicationsName ;
	private String applicationsAim ;
	private String trafficldenRule ;
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
	public String getApplicationsName() {
		return applicationsName;
	}
	public void setApplicationsName(String applicationsName) {
		this.applicationsName = applicationsName;
	}
	public String getApplicationsAim() {
		return applicationsAim;
	}
	public void setApplicationsAim(String applicationsAim) {
		this.applicationsAim = applicationsAim;
	}
	public String getTrafficldenRule() {
		return trafficldenRule;
	}
	public void setTrafficldenRule(String trafficldenRule) {
		this.trafficldenRule = trafficldenRule;
	}
	
	
}
