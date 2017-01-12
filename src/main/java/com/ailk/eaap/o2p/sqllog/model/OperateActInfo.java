package com.ailk.eaap.o2p.sqllog.model;

/**
 * @ClassName: OperateActionInfo
 * @Description: 
 * @author zhengpeng
 * @date 2015-3-6 上午10:00:46
 *
 */
public class OperateActInfo {
	
	private String userName;   
	private String userIp;
	private String execClass;
	private String exceMothod;
	private Integer tenantId;
	
	
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getExecClass() {
		return execClass;
	}
	public void setExecClass(String execClass) {
		this.execClass = execClass;
	}
	public String getExceMothod() {
		return exceMothod;
	}
	public void setExceMothod(String exceMothod) {
		this.exceMothod = exceMothod;
	}

}
