package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;

import com.sun.jmx.snmp.Timestamp;
public class OrgAuthCode implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer orgAuthId;
	private Integer orgId;
	private String authType;
	private String authCode;
	private Date authTime;
	private Date disableTime;
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
	public Integer getOrgAuthId() {
		return orgAuthId;
	}
	public void setOrgAuthId(Integer orgAuthId) {
		this.orgAuthId = orgAuthId;
	}
	public Integer getOrgId() {
		return orgId;
	}
	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}
	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}
	public Date getAuthTime() {
		return authTime;
	}
	public Date getDisableTime() {
		return disableTime;
	}

}
