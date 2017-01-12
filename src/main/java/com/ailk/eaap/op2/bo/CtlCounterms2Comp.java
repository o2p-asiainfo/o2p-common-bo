package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class CtlCounterms2Comp implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ctlC2CompId;
	private Integer ccCd;
	private Integer serInvokeInsId;
	private Integer cutmsValue;
	private String effectState;
	private String cycleType = "1";
	private Integer cycleValue = 1;
	private Date configTime;
	private Date lastestTime;
	private String ccSeq;
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
	public void setCtlC2CompId(Integer ctlC2CompId){
		this.ctlC2CompId=ctlC2CompId;
	}
	public Integer getCtlC2CompId(){
		return this.ctlC2CompId;
	}
	public void setCcCd(Integer ccCd){
		this.ccCd=ccCd;
	}
	public Integer getCcCd(){
		return this.ccCd;
	}
	public void setSerInvokeInsId(Integer serInvokeInsId){
		this.serInvokeInsId=serInvokeInsId;
	}
	public Integer getSerInvokeInsId(){
		return this.serInvokeInsId;
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
	public void setConfigTime(Date configTime){
		this.configTime=configTime;
	}
	public Date getConfigTime(){
		return this.configTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setCcSeq(String ccSeq){
		this.ccSeq=ccSeq;
	}
	public String getCcSeq(){
		return this.ccSeq;
	}
}
