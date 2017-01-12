package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class TestMsgModResponse implements Serializable{
private static final long serialVersionUID = 1L;
	private int msgId;
	private int modId;
	private String expression;
	private String responseMsgMod;
	private String remark;

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
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public int getModId() {
		return modId;
	}
	public void setModId(int modId) {
		this.modId = modId;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public String getResponseMsgMod() {
		return responseMsgMod;
	}
	public void setResponseMsgMod(String responseMsgMod) {
		this.responseMsgMod = responseMsgMod;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
