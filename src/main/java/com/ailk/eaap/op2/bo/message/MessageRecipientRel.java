package com.ailk.eaap.op2.bo.message;

import java.io.Serializable;
import java.math.BigDecimal;

import com.ailk.eaap.op2.bo.BaseClass;

public class MessageRecipientRel extends BaseClass implements Serializable{

	private static final long serialVersionUID = -6719451288380394129L;

	private BigDecimal recRelId;
	private BigDecimal msgId;
	private String recId;
	private Integer msgRecType;
	private String statusCd;
	private Integer tenantId;
	
	public BigDecimal getRecRelId() {
		return recRelId;
	}
	public void setRecRelId(BigDecimal recRelId) {
		this.recRelId = recRelId;
	}
	public BigDecimal getMsgId() {
		return msgId;
	}
	public void setMsgId(BigDecimal msgId) {
		this.msgId = msgId;
	}
	public String getRecId() {
		return recId;
	}
	public void setRecId(String recId) {
		this.recId = recId;
	}
	public Integer getMsgRecType() {
		return msgRecType;
	}
	public void setMsgRecType(Integer msgRecType) {
		this.msgRecType = msgRecType;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}
