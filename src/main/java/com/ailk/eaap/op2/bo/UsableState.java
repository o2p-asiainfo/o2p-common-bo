package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class UsableState implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer useableInsId;
	private Integer techImplId;
	private String state;
	private Date stateTime;
	private String reqDesc;
	private String usaWay;
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

	public void setUseableInsId(Integer useableInsId){
		this.useableInsId=useableInsId;
	}
	public Integer getUseableInsId(){
		return this.useableInsId;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
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
	public void setReqDesc(String reqDesc){
		this.reqDesc=reqDesc;
	}
	public String getReqDesc(){
		return this.reqDesc;
	}
	public void setUsaWay(String usaWay){
		this.usaWay=usaWay;
	}
	public String getUsaWay(){
		return this.usaWay;
	}
}
