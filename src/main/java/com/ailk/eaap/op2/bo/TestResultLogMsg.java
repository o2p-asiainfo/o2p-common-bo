package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestResultLogMsg implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer logId;
	private Integer relaId;
	private String requestMsg;
	private String responseMsg;
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
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getRelaId() {
		return relaId;
	}
	public void setRelaId(Integer relaId) {
		this.relaId = relaId;
	}
	public String getRequestMsg() {
		return requestMsg;
	}
	public void setRequestMsg(String requestMsg) {
		this.requestMsg = requestMsg;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	
}
