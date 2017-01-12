package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class Cache implements Serializable{
private static final long serialVersionUID = 1L;
	private String version;
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

	public void setVersion(String version){
		this.version=version;
	}
	public String getVersion(){
		return this.version;
	}
}
