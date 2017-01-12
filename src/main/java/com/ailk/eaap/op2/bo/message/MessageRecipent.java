package com.ailk.eaap.op2.bo.message;

import java.io.Serializable;
import java.math.BigDecimal;

import com.ailk.eaap.op2.bo.BaseClass;
import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;

public class MessageRecipent extends BaseClass implements Serializable, DateConvertBeanImpl {
	private static final long serialVersionUID = -7927218110268146597L;

	private BigDecimal msgRecId;
	private String recId;
	private BigDecimal msgId;
	private String msgDecision;
	private Integer lookTimes;
	private Integer tenantId;
	
	public BigDecimal getMsgRecId() {
		return msgRecId;
	}
	public void setMsgRecId(BigDecimal msgRecId) {
		this.msgRecId = msgRecId;
	}
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public BigDecimal getMsgId() {
		return msgId;
	}
	public void setMsgId(BigDecimal msgId) {
		this.msgId = msgId;
	}
	public String getMsgDecision() {
		return msgDecision;
	}
	public void setMsgDecision(String msgDecision) {
		this.msgDecision = msgDecision;
	}
	public Integer getLookTimes() {
		return lookTimes;
	}
	public void setLookTimes(Integer lookTimes) {
		this.lookTimes = lookTimes;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}
