package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

public class LogLevel implements Serializable {
	private int logLevelId;
	private String logLevel;
	private String runningStatus;
	private List<String> logOutObjects;
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
	public int getLogLevelId() {
		return logLevelId;
	}
	public void setLogLevelId(int logLevelId) {
		this.logLevelId = logLevelId;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getRunningStatus() {
		return runningStatus;
	}
	public void setRunningStatus(String runningStatus) {
		this.runningStatus = runningStatus;
	}
	public List<String> getLogOutObjects() {
		return logOutObjects;
	}
	public void setLogOutObjects(List<String> logOutObjects) {
		this.logOutObjects = logOutObjects;
	}
}
