package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class AppApiList implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer appApiListId;
	private Integer apiId;
	private Integer appId;
	private String state;
	private Date regTime;
	private Date auditTime;
	private String auditPerson;
	private String auditState;
	private String apiMethod;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	public void setAppApiListId(Integer appApiListId){
		this.appApiListId=appApiListId;
	}
	public Integer getAppApiListId(){
		return this.appApiListId;
	}
	public void setApiId(Integer apiId){
		this.apiId=apiId;
	}
	public Integer getApiId(){
		return this.apiId;
	}
	public void setAppId(Integer appId){
		this.appId=appId;
	}
	public Integer getAppId(){
		return this.appId;
	}
 
 
	public Date getRegTime() {
		return regTime;
	}
	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}
	public void setAuditTime(Date auditTime){
		this.auditTime=auditTime;
	}
	public Date getAuditTime(){
		return this.auditTime;
	}
	public void setAuditPerson(String auditPerson){
		this.auditPerson=auditPerson;
	}
	public String getAuditPerson(){
		return this.auditPerson;
	}
	public void setAuditState(String auditState){
		this.auditState=auditState;
	}
	public String getAuditState(){
		return this.auditState;
	}
	public String getApiMethod() {
		return apiMethod;
	}
	public void setApiMethod(String apiMethod) {
		this.apiMethod = apiMethod;
	}

}
