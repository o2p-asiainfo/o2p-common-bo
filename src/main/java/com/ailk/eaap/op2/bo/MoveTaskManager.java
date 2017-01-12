package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class MoveTaskManager implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer taskId;
	private String taskName;
	private Integer serviceId;
	private Integer gcCd;
	private Integer moveWaitTime;
	private String threadSignId;
	private Date stateDate;
	private Date stopDate;
	private String taskState;
	private Date stateLastDate;
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
	public void setTaskId(Integer taskId){
		this.taskId=taskId;
	}
	public Integer getTaskId(){
		return this.taskId;
	}
	public void setTaskName(String taskName){
		this.taskName=taskName;
	}
	public String getTaskName(){
		return this.taskName;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setGcCd(Integer gcCd){
		this.gcCd=gcCd;
	}
	public Integer getGcCd(){
		return this.gcCd;
	}
	public void setMoveWaitTime(Integer moveWaitTime){
		this.moveWaitTime=moveWaitTime;
	}
	public Integer getMoveWaitTime(){
		return this.moveWaitTime;
	}
	public void setThreadSignId(String threadSignId){
		this.threadSignId=threadSignId;
	}
	public String getThreadSignId(){
		return this.threadSignId;
	}
	public void setStateDate(Date stateDate){
		this.stateDate=stateDate;
	}
	public Date getStateDate(){
		return this.stateDate;
	}
	public void setStopDate(Date stopDate){
		this.stopDate=stopDate;
	}
	public Date getStopDate(){
		return this.stopDate;
	}
	public void setTaskState(String taskState){
		this.taskState=taskState;
	}
	public String getTaskState(){
		return this.taskState;
	}
	public void setStateLastDate(Date stateLastDate){
		this.stateLastDate=stateLastDate;
	}
	public Date getStateLastDate(){
		return this.stateLastDate;
	}
}
