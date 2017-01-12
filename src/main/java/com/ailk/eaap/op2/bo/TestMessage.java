package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestMessage implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer msgId;
	private Integer testId;
	private Integer endpointId;
	private String requestMessage;
	private String responseMessage;
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
	
	public Integer getMsgId() {
		return msgId;
	}
	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public Integer getEndpointId() {
		return endpointId;
	}
	public void setEndpointId(Integer endpointId) {
		this.endpointId = endpointId;
	}
	public String getRequestMessage() {
		return requestMessage;
	}
	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
}
