package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

public class AppUserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserInfo userInfo;
	private List<App> appList;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public List<App> getAppList() {
		return appList;
	}
	public void setAppList(List<App> appList) {
		this.appList = appList;
	}
	
}
