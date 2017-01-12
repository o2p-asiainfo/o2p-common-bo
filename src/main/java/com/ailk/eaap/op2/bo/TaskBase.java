package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class TaskBase implements Serializable{

	private TaskManager taskManager = new TaskManager();
	private SerInvokeIns serInvokeIns;
	private Object taskCfg;
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
	public TaskManager getTaskManager() {
		return taskManager;
	}
	public void setTaskManager(TaskManager taskManager) {
		this.taskManager = taskManager;
	}
	public SerInvokeIns getSerInvokeIns() {
		return serInvokeIns;
	}
	public void setSerInvokeIns(SerInvokeIns serInvokeIns) {
		this.serInvokeIns = serInvokeIns;
	}
	public Object getTaskCfg() {
		return taskCfg;
	}
	public void setTaskCfg(Object taskCfg) {
		this.taskCfg = taskCfg;
	}
	
}
