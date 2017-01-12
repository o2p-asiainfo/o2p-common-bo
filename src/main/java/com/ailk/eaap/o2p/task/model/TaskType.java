package com.ailk.eaap.o2p.task.model;

import java.io.Serializable;

public class TaskType implements Serializable{
	private int taskTypeId;
	private String taskTypeName;
	private String taskTypeCd;
	private String queueName;
	private String objTypeCd;
	private Integer tenantId;
	public int getTaskTypeId() {
		return taskTypeId;
	}
	public void setTaskTypeId(int taskTypeId) {
		this.taskTypeId = taskTypeId;
	}
	public String getTaskTypeName() {
		return taskTypeName;
	}
	public void setTaskTypeName(String taskTypeName) {
		this.taskTypeName = taskTypeName;
	}
	public String getTaskTypeCd() {
		return taskTypeCd;
	}
	public void setTaskTypeCd(String taskTypeCd) {
		this.taskTypeCd = taskTypeCd;
	}
	public String getQueueName() {
		return queueName;
	}
	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	public String getObjTypeCd() {
		return objTypeCd;
	}
	public void setObjTypeCd(String objTypeCd) {
		this.objTypeCd = objTypeCd;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

}
