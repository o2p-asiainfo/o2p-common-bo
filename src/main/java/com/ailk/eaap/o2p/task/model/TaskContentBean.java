package com.ailk.eaap.o2p.task.model;

import java.io.Serializable;
import java.util.Map;

import com.ailk.eaap.op2.bo.i18n.ProvideI18NData;
import com.ailk.eaap.op2.bo.i18n.ProvideI18NDatas;

@ProvideI18NDatas(values = { 
		@ProvideI18NData(tableName = "gather_cycle", columnNames = "NAME", idName = "gcCd", propertyNames = "name") 
	}
)
public class TaskContentBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int taskId; // 任务管理ID
	private Integer tenantId;//租户Id
	private String taskCode; // 任务编码
	private String taskName; // 任务名称
	private String gcCd; // 采集周期编码
	private int threadNumber; // 任务线程池个数
	private String startDate; // 启动时间
	private String stopDate; // 停止时间
	private String taskState; // 任务状态
	private String stateLastDate; // 状态最新修改时间
	private String taskDesc; // 任务描述
	private String name; // 周期名称
	private String gcExp; // 周期起止表达式
	private TaskRelaObj taskRelaObj;//业务实体对象
	private String enableLog;
	private TaskType taskTypeObj;
	private String taskType;
	private boolean taskUsable;
	private String serviceStatus;
	private String errorStrategyExpression;
	private Integer parallelismDegree;
	
	/* 
	 * 任务风格：
	 *  1：并发任务（concurrency task），
	 *	2：非并发无依赖任务(Non concurrent independent task)，
	 *	3：非并发依赖任务(Non concurrent dependent task)
	 */
	private TaskStyle taskStyleObj;
	private String taskStyle;
	
	public static final String CONCURRENCY_TASK = "1";
	public static final String NON_CONCURRENCY_INDEPENDENT_TASK = "2";
	public static final String NON_CONCURRENCY_DEPENDENT_TASK = "3";

	public TaskContentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TaskContentBean(int taskId, String taskCode, String taskName,
			String gcCd, int threadNumber, String startDate, String stopDate,
			String taskState, String stateLastDate, String taskDesc,
			String name, String gcExp, Map<String, Object> taskGlobalParams,
			TaskRelaObj taskRelaObj, String enableLog, TaskType taskTypeObj, String errorStrategyExpression, Integer parallelismDegree) {
		super();
		this.taskId = taskId;
		this.taskCode = taskCode;
		this.taskName = taskName;
		this.gcCd = gcCd;
		this.threadNumber = threadNumber;
		this.startDate = startDate;
		this.stopDate = stopDate;
		this.taskState = taskState;
		this.stateLastDate = stateLastDate;
		this.taskDesc = taskDesc;
		this.name = name;
		this.gcExp = gcExp;
		this.taskRelaObj = taskRelaObj;
		this.enableLog = enableLog;
		this.taskTypeObj = taskTypeObj;
		this.parallelismDegree = parallelismDegree;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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

	public int getThreadNumber() {
		return threadNumber;
	}

	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStopDate() {
		return stopDate;
	}

	public void setStopDate(String stopDate) {
		this.stopDate = stopDate;
	}

	public String getTaskState() {
		return taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
	}

	public String getStateLastDate() {
		return stateLastDate;
	}

	public void setStateLastDate(String stateLastDate) {
		this.stateLastDate = stateLastDate;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEnableLog() {
		return enableLog;
	}

	public void setEnableLog(String enableLog) {
		this.enableLog = enableLog;
	}

	public TaskRelaObj getTaskRelaObj() {
		return taskRelaObj;
	}

	public void setTaskRelaObj(TaskRelaObj taskRelaObj) {
		this.taskRelaObj = taskRelaObj;
	}

	public TaskType getTaskTypeObj() {
		return taskTypeObj;
	}

	public void setTaskTypeObj(TaskType taskTypeObj) {
		this.taskTypeObj = taskTypeObj;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskStyle() {
		return taskStyle;
	}

	public void setTaskStyle(String taskStyle) {
		this.taskStyle = taskStyle;
	}

	public TaskStyle getTaskStyleObj() {
		return taskStyleObj;
	}

	public void setTaskStyleObj(TaskStyle taskStyleObj) {
		this.taskStyleObj = taskStyleObj;
	}

	public boolean getTaskUsable() {
		return taskUsable;
	}

	public void setTaskUsable(boolean taskUsable) {
		this.taskUsable = taskUsable;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getErrorStrategyExpression() {
		return errorStrategyExpression;
	}

	public void setErrorStrategyExpression(String errorStrategyExpression) {
		this.errorStrategyExpression = errorStrategyExpression;
	}

	public Integer getParallelismDegree() {
		return parallelismDegree;
	}

	public void setParallelismDegree(Integer parallelismDegree) {
		this.parallelismDegree = parallelismDegree;
	}
}