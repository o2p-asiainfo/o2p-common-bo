package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class UsableMonitorConf implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ubmCd;
	private Integer utCd;
	private Integer techImplId;
	private Integer techImpConPoId;
	private String state;
	private Date stateTime;
	private String xmlMsg;
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

	public void setUbmCd(Integer ubmCd){
		this.ubmCd=ubmCd;
	}
	public Integer getUbmCd(){
		return this.ubmCd;
	}
	public void setUtCd(Integer utCd){
		this.utCd=utCd;
	}
	public Integer getUtCd(){
		return this.utCd;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
	}
	public void setTechImpConPoId(Integer techImpConPoId){
		this.techImpConPoId=techImpConPoId;
	}
	public Integer getTechImpConPoId(){
		return this.techImpConPoId;
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
	public void setXmlMsg(String xmlMsg){
		this.xmlMsg=xmlMsg;
	}
	public String getXmlMsg(){
		return this.xmlMsg;
	}
}
