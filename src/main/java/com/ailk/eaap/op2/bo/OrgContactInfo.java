package com.ailk.eaap.op2.bo;

/**
 * OrgContactInfo entity. @author MyEclipse Persistence Tools
 * wanglm7
 */

public class OrgContactInfo implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer orgContactInfoId;
	private Integer orgId;
	private Integer contactId;
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
	
	public OrgContactInfo() {
		super();
	}
	
	
	public OrgContactInfo(Integer orgContactInfoId, Integer orgId,
			Integer contactId) {
		super();
		this.orgContactInfoId = orgContactInfoId;
		this.orgId = orgId;
		this.contactId = contactId;
	}


	public Integer getOrgContactInfoId() {
		return orgContactInfoId;
	}
	public void setOrgContactInfoId(Integer orgContactInfoId) {
		this.orgContactInfoId = orgContactInfoId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

}
