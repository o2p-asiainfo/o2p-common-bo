package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestMsgMod implements Serializable{
private static final long serialVersionUID = 1L;
	private int modId;
	private String modName;
	private String requestMsgMod;
	private String responseMsgMod;
	private String msgFormatType;
	private String state;
	private String remark;
	private Date createDate;
	private int personId;
	private String expressionFlag;
	private int delayTime;


	private Integer tenantId;
	
	

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getRequestMsgMod() {
		return requestMsgMod;
	}
	public void setRequestMsgMod(String requestMsgMod) {
		this.requestMsgMod = requestMsgMod;
	}
	public String getResponseMsgMod() {
		return responseMsgMod;
	}
	public void setResponseMsgMod(String responseMsgMod) {
		this.responseMsgMod = responseMsgMod;
	}
	public String getMsgFormatType() {
		return msgFormatType;
	}
	public void setMsgFormatType(String msgFormatType) {
		this.msgFormatType = msgFormatType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getModId() {
		return modId;
	}
	public void setModId(int modId) {
		this.modId = modId;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getExpressionFlag() {
		return expressionFlag;
	}
	public void setExpressionFlag(String expressionFlag) {
		this.expressionFlag = expressionFlag;
	}
	public int getDelayTime() {
		return delayTime;
	}
	public void setDelayTime(int delayTime) {
		this.delayTime = delayTime;
	}
	
}
