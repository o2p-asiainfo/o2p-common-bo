package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class OrgRole implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer orgRoleId;
	private String  roleCode ;
	private Integer orgId;
	private Date    createTime;

	private Integer tenantId;

	public Integer getOrgRoleId() {
		return orgRoleId;
	}
	public void setOrgRoleId(Integer orgRoleId) {
		this.orgRoleId = orgRoleId;
	}
 
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	 
	 
}
