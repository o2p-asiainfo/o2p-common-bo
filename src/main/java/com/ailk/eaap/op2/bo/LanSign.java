package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class LanSign implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer lanSignId;
	private String lsName;
	private String lsCd;
	private Date createTime;
	private String state;
	private Date stateTime;
	private String descInfo;
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
	public void setLanSignId(Integer lanSignId){
		this.lanSignId=lanSignId;
	}
	public Integer getLanSignId(){
		return this.lanSignId;
	}
	public void setLsName(String lsName){
		this.lsName=lsName;
	}
	public String getLsName(){
		return this.lsName;
	}
	public void setLsCd(String lsCd){
		this.lsCd=lsCd;
	}
	public String getLsCd(){
		return this.lsCd;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
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
	public void setDescInfo(String descInfo){
		this.descInfo=descInfo;
	}
	public String getDescInfo(){
		return this.descInfo;
	}
}
