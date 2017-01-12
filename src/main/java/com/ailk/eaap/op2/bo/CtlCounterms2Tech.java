package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class CtlCounterms2Tech implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ccCd;
	private Integer techImplId;
	private Integer cutmsValue;
	private String effectState;
	private String cycleType;
	private Integer cycleValue;
	private Date confiTime;


	private Integer tenantId;


	public void setCcCd(Integer ccCd){
		this.ccCd=ccCd;
	}
	public Integer getCcCd(){
		return this.ccCd;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
	}
	public void setCutmsValue(Integer cutmsValue){
		this.cutmsValue=cutmsValue;
	}
	public Integer getCutmsValue(){
		return this.cutmsValue;
	}
	public void setEffectState(String effectState){
		this.effectState=effectState;
	}
	public String getEffectState(){
		return this.effectState;
	}
	public void setCycleType(String cycleType){
		this.cycleType=cycleType;
	}
	public String getCycleType(){
		return this.cycleType;
	}
	public void setCycleValue(Integer cycleValue){
		this.cycleValue=cycleValue;
	}
	public Integer getCycleValue(){
		return this.cycleValue;
	}
	public void setConfiTime(Date confiTime){
		this.confiTime=confiTime;
	}
	public Date getConfiTime(){
		return this.confiTime;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
}
