package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class TestMessageMod implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer modId;
	private String modName;
	private String requestMessageMod;
	private String responseMessageMod;
	private Integer msgFormatType;
	private String state;
	private String remark;
	private Date createDate;
	private Integer personId;
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
	public Integer getModId() {
		return modId;
	}
	public void setModId(Integer modId) {
		this.modId = modId;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	public String getRequestMessageMod() {
		return requestMessageMod;
	}
	public void setRequestMessageMod(String requestMessageMod) {
		this.requestMessageMod = requestMessageMod;
	}
	public String getResponseMessageMod() {
		return responseMessageMod;
	}
	public void setResponseMessageMod(String responseMessageMod) {
		this.responseMessageMod = responseMessageMod;
	}
	public Integer getMsgFormatType() {
		return msgFormatType;
	}
	public void setMsgFormatType(Integer msgFormatType) {
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
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

}
