package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestMessageHis implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer hisId;
	private String requestMessage;
	private Integer testId;
	private Integer taskId;
	private Integer endpointId;
	private Integer sceneId;
	private Integer personId;
	private Date testDate;
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
	public Integer getHisId() {
		return hisId;
	}
	public void setHisId(Integer hisId) {
		this.hisId = hisId;
	}
	public String getRequestMessage() {
		return requestMessage;
	}
	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public Integer getEndpointId() {
		return endpointId;
	}
	public void setEndpointId(Integer endpointId) {
		this.endpointId = endpointId;
	}
	public Integer getSceneId() {
		return sceneId;
	}
	public void setSceneId(Integer sceneId) {
		this.sceneId = sceneId;
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	
}
