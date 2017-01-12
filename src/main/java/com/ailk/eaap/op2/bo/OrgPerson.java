package com.ailk.eaap.op2.bo;

public class OrgPerson {

	private Integer orgPerson ;
	private Integer orgId ;
	private Integer sysPersonId ; 
	private Integer orgRole ;
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
	
	public OrgPerson() {
		super();
	}
	
	public OrgPerson(Integer orgPerson, Integer orgId, Integer sysPersonId,
			Integer orgRole) {
		super();
		this.orgPerson = orgPerson;
		this.orgId = orgId;
		this.sysPersonId = sysPersonId;
		this.orgRole = orgRole;
	}
	
	
	public Integer getOrgPerson() {
		return orgPerson;
	}
	public void setOrgPerson(Integer orgPerson) {
		this.orgPerson = orgPerson;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Integer getSysPersonId() {
		return sysPersonId;
	}
	public void setSysPersonId(Integer sysPersonId) {
		this.sysPersonId = sysPersonId;
	}
	public Integer getOrgRole() {
		return orgRole;
	}
	public void setOrgRole(Integer orgRole) {
		this.orgRole = orgRole;
	}
	
}
