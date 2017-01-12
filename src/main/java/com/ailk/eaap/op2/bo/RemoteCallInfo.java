package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class RemoteCallInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7017898745983834365L;
	
	private Integer RemoteCallUrlId;
	private String  RemoteCallUrlCode;
	private String  RemoteCallUrl;
	private String  RemoteCallUrlStatus;
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
	public RemoteCallInfo(Integer remoteCallUrlId, String remoteCallUrlCode,
			String remoteCallUrl, String remoteCallUrlStatus) {
		RemoteCallUrlId = remoteCallUrlId;
		RemoteCallUrlCode = remoteCallUrlCode;
		RemoteCallUrl = remoteCallUrl;
		RemoteCallUrlStatus = remoteCallUrlStatus;
	}
	
	
	public RemoteCallInfo() {
		
	}

	public Integer getRemoteCallUrlId() {
		return RemoteCallUrlId;
	}
	public void setRemoteCallUrlId(Integer remoteCallUrlId) {
		RemoteCallUrlId = remoteCallUrlId;
	}
	public String getRemoteCallUrlCode() {
		return RemoteCallUrlCode;
	}
	public void setRemoteCallUrlCode(String remoteCallUrlCode) {
		RemoteCallUrlCode = remoteCallUrlCode;
	}
	public String getRemoteCallUrl() {
		return RemoteCallUrl;
	}
	public void setRemoteCallUrl(String remoteCallUrl) {
		RemoteCallUrl = remoteCallUrl;
	}
	public String getRemoteCallUrlStatus() {
		return RemoteCallUrlStatus;
	}
	public void setRemoteCallUrlStatus(String remoteCallUrlStatus) {
		RemoteCallUrlStatus = remoteCallUrlStatus;
	}
	
}
