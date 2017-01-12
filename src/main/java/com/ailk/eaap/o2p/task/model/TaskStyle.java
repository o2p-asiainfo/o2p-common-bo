package com.ailk.eaap.o2p.task.model;

import java.io.Serializable;

public class TaskStyle implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6418112579827295568L;
	
	private int taskStyleId;
	private String taskStyleName;
	private String taskStyle;
	private String taskStyleDesc;
	private String state;
	private Integer tenantId;
	

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public int getTaskStyleId() {
		return taskStyleId;
	}
	public void setTaskStyleId(int taskStyleId) {
		this.taskStyleId = taskStyleId;
	}
	public String getTaskStyleName() {
		return taskStyleName;
	}
	public void setTaskStyleName(String taskStyleName) {
		this.taskStyleName = taskStyleName;
	}
	public String getTaskStyle() {
		return taskStyle;
	}
	public void setTaskStyle(String taskStyle) {
		this.taskStyle = taskStyle;
	}
	public String getTaskStyleDesc() {
		return taskStyleDesc;
	}
	public void setTaskStyleDesc(String taskStyleDesc) {
		this.taskStyleDesc = taskStyleDesc;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	
}
