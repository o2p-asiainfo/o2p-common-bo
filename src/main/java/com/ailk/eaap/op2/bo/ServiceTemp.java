package com.ailk.eaap.op2.bo;

public class ServiceTemp {

	private String version;
	private String template;
	private String reqOrRep;
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getReqOrRep() {
		return reqOrRep;
	}
	public void setReqOrRep(String reqOrRep) {
		this.reqOrRep = reqOrRep;
	}

	
}
