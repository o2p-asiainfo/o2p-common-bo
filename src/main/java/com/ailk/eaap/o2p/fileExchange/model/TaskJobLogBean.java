package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;

public class TaskJobLogBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int taskLogId;
	private String logType;
	private int taskId;
	private String schdInstId;
	private String eventType;
	private String sessionId;
	private String jobName;
	private String jobClass;
	private String staffNo;
	private String ip;
	private String createDT;
	private String info;
	private String errorInfo;
	private Integer tenantId;
	public TaskJobLogBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskJobLogBean(int taskLogId, String logType, int taskId,
			String schdInstId, String eventType, String sessionId,
			String jobName, String jobClass, String staffNo, String ip,
			String createDT, String info) {
		super();
		this.taskLogId = taskLogId;
		this.logType = logType;
		this.taskId = taskId;
		this.schdInstId = schdInstId;
		this.eventType = eventType;
		this.sessionId = sessionId;
		this.jobName = jobName;
		this.jobClass = jobClass;
		this.staffNo = staffNo;
		this.ip = ip;
		this.createDT = createDT;
		this.info = info;
	}

	public int getTaskLogId() {
		return taskLogId;
	}

	public void setTaskLogId(int taskLogId) {
		this.taskLogId = taskLogId;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getSchdInstId() {
		return schdInstId;
	}

	public void setSchdInstId(String schdInstId) {
		this.schdInstId = schdInstId;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getCreateDT() {
		return createDT;
	}

	public void setCreateDT(String createDT) {
		this.createDT = createDT;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

}
