package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class PriDefine implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer priDefineId;
	private String priDefineType;
	private String priDefineName;
	private String priDefineDesc;
	private Date priDefineTime;
	private int apiId;
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
	public void setPriDefineId(Integer priDefineId){
		this.priDefineId=priDefineId;
	}
	public Integer getPriDefineId(){
		return this.priDefineId;
	}
	public void setPriDefineType(String priDefineType){
		this.priDefineType=priDefineType;
	}
	public String getPriDefineType(){
		return this.priDefineType;
	}
	public void setPriDefineName(String priDefineName){
		this.priDefineName=priDefineName;
	}
	public String getPriDefineName(){
		return this.priDefineName;
	}
	public void setPriDefineDesc(String priDefineDesc){
		this.priDefineDesc=priDefineDesc;
	}
	public String getPriDefineDesc(){
		return this.priDefineDesc;
	}
	public void setPriDefineTime(Date priDefineTime){
		this.priDefineTime=priDefineTime;
	}
	public Date getPriDefineTime(){
		return this.priDefineTime;
	}
	public int getApiId() {
		return apiId;
	}
	public void setApiId(int apiId) {
		this.apiId = apiId;
	}
	
}
