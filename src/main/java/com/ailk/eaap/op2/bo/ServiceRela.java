package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ServiceRela implements Serializable{
private static final long serialVersionUID = 1L;
	private int serviceRelaId;
	private int openServiceId;
	private int regServiceId;
	private String serRelaType;
	private Date createTime;
	private String state;
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

	public void setServiceRelaId(int serviceRelaId){
		this.serviceRelaId=serviceRelaId;
	}
	public int getServiceRelaId(){
		return this.serviceRelaId;
	}
	public void setOpenServiceId(int openServiceId){
		this.openServiceId=openServiceId;
	}
	public int getOpenServiceId(){
		return this.openServiceId;
	}
	public void setRegServiceId(int regServiceId){
		this.regServiceId=regServiceId;
	}
	public int getRegServiceId(){
		return this.regServiceId;
	}
	public void setSerRelaType(String serRelaType){
		this.serRelaType=serRelaType;
	}
	public String getSerRelaType(){
		return this.serRelaType;
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
}
