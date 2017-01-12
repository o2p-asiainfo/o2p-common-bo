package com.ailk.eaap.op2.bo;

import java.sql.Timestamp;

public class Interaction {
private static final long serialVersionUID = 1L;
	private String contractInteractionId;
	private Timestamp createtime;
	private String state;
	private Timestamp stateTime;
	private String tabSuffix;
	
	//来源实例标识
	private String srcSysSign;
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
	public String getSrcSysSign() {
		return srcSysSign;
	}
	public void setSrcSysSign(String srcSysSign) {
		this.srcSysSign = srcSysSign;
	}
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setCreatetime(Timestamp createtime){
		this.createtime=createtime;
	}
	public Timestamp getCreatetime(){
		return this.createtime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setStateTime(Timestamp stateTime){
		this.stateTime=stateTime;
	}
	public Timestamp getStateTime(){
		return this.stateTime;
	}
	public String getTabSuffix() {
		return tabSuffix;
	}
	public void setTabSuffix(String tabSuffix) {
		this.tabSuffix = tabSuffix;
	}
}
