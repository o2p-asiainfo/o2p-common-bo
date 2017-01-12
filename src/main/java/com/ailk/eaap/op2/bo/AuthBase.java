package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AuthBase implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer authBaseId;
	private Integer authId;
	private Integer serInvokeInsId;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getAuthBaseId() {
		return authBaseId;
	}

	public void setAuthBaseId(Integer authBaseId) {
		this.authBaseId = authBaseId;
	}

	public Integer getSerInvokeInsId() {
		return serInvokeInsId;
	}

	public void setSerInvokeInsId(Integer serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}

	public Integer getAuthId() {
		return authId;
	}

	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
}
