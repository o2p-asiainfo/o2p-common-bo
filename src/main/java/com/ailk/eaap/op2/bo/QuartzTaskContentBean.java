package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class QuartzTaskContentBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//任务状态 0:启动时未加载
	public static final String TASK_STATE_NO = "0";
	//任务状态 1:启动时加载
	public static final String TASK_STATE_YES= "1";
			
	private int    taskId;                //任务管理ID
	private String taskCode;              //任务编码
	private String taskName;              //任务名称
	private String gcCd;                  //采集周期编码
	private String taskState;             //任务状态
	private String taskDesc;              //任务描述
	private String name;                  //周期名称
	private String gcExp;                 //周期起止表达式
	private String taskType;
	private String taskTypeId;
	private String taskTypeName;
	private String jobClass;
	private String taskTypeDesc;
	
	private Integer  serInvoKeInsId;
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
	
	public QuartzTaskContentBean() {
		
	}

	public QuartzTaskContentBean(int taskId, String taskCode, String taskName,
			String gcCd, int threadNumber, String startDate, String stopDate,
			String taskState, String stateLastDate, String taskDesc,
			String name, String gcExp, String taskType, String taskTypeId,
			String taskTypeName, String jobClass, String taskTypeDesc,
			Integer serInvoKeInsId) {
		super();
		this.taskId = taskId;
		this.taskCode = taskCode;
		this.taskName = taskName;
		this.gcCd = gcCd;
		this.taskState = taskState;
		this.taskDesc = taskDesc;
		this.name = name;
		this.gcExp = gcExp;
		this.taskType = taskType;
		this.taskTypeId = taskTypeId;
		this.taskTypeName = taskTypeName;
		this.jobClass = jobClass;
		this.taskTypeDesc = taskTypeDesc;
		this.serInvoKeInsId = serInvoKeInsId;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskCode() {
		return taskCode;
	}

	public void setTaskCode(String taskCode) {
		this.taskCode = taskCode;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getGcCd() {
		return gcCd;
	}

	public void setGcCd(String gcCd) {
		this.gcCd = gcCd;
	}


	public String getTaskState() {
		return taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getTaskDesc() {
		return taskDesc;
	}

	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGcExp() {
		return gcExp;
	}

	public void setGcExp(String gcExp) {
		this.gcExp = gcExp;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(String taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public String getTaskTypeName() {
		return taskTypeName;
	}

	public void setTaskTypeName(String taskTypeName) {
		this.taskTypeName = taskTypeName;
	}

	public String getJobClass() {
		return jobClass;
	}

	public void setJobClass(String jobClass) {
		this.jobClass = jobClass;
	}

	public String getTaskTypeDesc() {
		return taskTypeDesc;
	}

	public void setTaskTypeDesc(String taskTypeDesc) {
		this.taskTypeDesc = taskTypeDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getSerInvoKeInsId() {
		return serInvoKeInsId;
	}

	public void setSerInvoKeInsId(Integer serInvoKeInsId) {
		this.serInvoKeInsId = serInvoKeInsId;
	}

}