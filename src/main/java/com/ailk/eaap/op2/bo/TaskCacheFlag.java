package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class TaskCacheFlag implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1764931138680816973L;
	
	private String taskCode;
	private Integer taskStatus;
	private Timestamp readyDate;
	private Timestamp receiveDate;
	private Timestamp modifyDate;

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

	private Integer taskRunningCount;
	private String taskStyle;
	private Map<String, Integer> runCountDetail = new HashMap<String, Integer>();
	

	public String getTaskCode() {
		return taskCode;
	}
	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}
	public Integer getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}
	public Timestamp getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Timestamp modifyDate) {
		this.modifyDate = modifyDate;
	}
	public Timestamp getReadyDate() {
		return readyDate;
	}
	public void setReadyDate(Timestamp readyDate) {
		this.readyDate = readyDate;
	}
	public Timestamp getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(Timestamp receiveDate) {
		this.receiveDate = receiveDate;
	}
	public Integer getTaskRunningCount() {
		return taskRunningCount;
	}
	public void setTaskRunningCount(Integer taskRunningCount) {
		this.taskRunningCount = taskRunningCount;
	}
	public String getTaskStyle() {
		return taskStyle;
	}
	public void setTaskStyle(String taskStyle) {
		this.taskStyle = taskStyle;
	}
	public Map<String, Integer> getRunCountDetail() {
		return runCountDetail;
	}
	public void setRunCountDetail(Map<String, Integer> runCountDetail) {
		this.runCountDetail = runCountDetail;
	}
}
