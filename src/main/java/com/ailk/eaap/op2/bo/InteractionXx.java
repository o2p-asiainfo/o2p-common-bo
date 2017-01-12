package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class InteractionXx implements Serializable{
private static final long serialVersionUID = 1L;
	private String contractInteractionId;
	private Object createtime;
	private String state;
	private Date stateTime;
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
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setCreatetime(Object createtime){
		this.createtime=createtime;
	}
	public Object getCreatetime(){
		return this.createtime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setStateTime(Date stateTime){
		this.stateTime=stateTime;
	}
	public Date getStateTime(){
		return this.stateTime;
	}
}
