/** 
 * Project Name:o2p-common-bo-tags 
 * File Name:HubInputParam.java 
 * Package Name:com.ailk.eaap.op2.bo.hub 
 * Date:2016年3月11日上午11:55:29 
 * Copyright (c) 2016, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.ailk.eaap.op2.bo.hub;  
/** 
 * ClassName:HubInputParam  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2016年3月11日 上午11:55:29  
 * @author   wushuzhen 
 * @version   
 * @since    JDK 1.7 
 *        
 */
public class HubUrlParam {
     
	private String tenant;
	private String appToken;
	private String token;
	private String roleType;
	private Object webHubParamsJson;
	public String getTenant() {
		return tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	public String getAppToken() {
		return appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public Object getWebHubParamsJson() {
		return webHubParamsJson;
	}
	public void setWebHubParamsJson(Object webHubParamsJson) {
		this.webHubParamsJson = webHubParamsJson;
	}
	
	
}
