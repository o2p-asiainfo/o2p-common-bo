package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ApiAccPriList implements Serializable{
private static final long serialVersionUID = 1L;
	private int apiAccPriLiId;
	private int apiId;
	private int priDefineId;
	private String state;
	private Date createTime;
	private Date lastestTime;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public void setApiAccPriLiId(int apiAccPriLiId){
		this.apiAccPriLiId=apiAccPriLiId;
	}
	public int getApiAccPriLiId(){
		return this.apiAccPriLiId;
	}
	public void setApiId(int apiId){
		this.apiId=apiId;
	}
	public int getApiId(){
		return this.apiId;
	}
	public void setPriDefineId(int priDefineId){
		this.priDefineId=priDefineId;
	}
	public int getPriDefineId(){
		return this.priDefineId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
}
