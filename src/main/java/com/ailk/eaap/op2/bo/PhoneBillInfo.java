package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class PhoneBillInfo implements Serializable{
private static final long serialVersionUID = 1L;
	private String phBiInfoId;
	private String contractInteractionId;
	private String srcCompId;
	private String accountId;
	private Integer phoneBillMoney;
	private Object pbBeginTime;
	private Object pbEndTime;
	private Object pbSyncTime;
	private String pbState;
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
	public void setPhBiInfoId(String phBiInfoId){
		this.phBiInfoId=phBiInfoId;
	}
	public String getPhBiInfoId(){
		return this.phBiInfoId;
	}
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setSrcCompId(String srcCompId){
		this.srcCompId=srcCompId;
	}
	public String getSrcCompId(){
		return this.srcCompId;
	}
	public void setAccountId(String accountId){
		this.accountId=accountId;
	}
	public String getAccountId(){
		return this.accountId;
	}
	public void setPhoneBillMoney(Integer phoneBillMoney){
		this.phoneBillMoney=phoneBillMoney;
	}
	public Integer getPhoneBillMoney(){
		return this.phoneBillMoney;
	}
	public void setPbBeginTime(Object pbBeginTime){
		this.pbBeginTime=pbBeginTime;
	}
	public Object getPbBeginTime(){
		return this.pbBeginTime;
	}
	public void setPbEndTime(Object pbEndTime){
		this.pbEndTime=pbEndTime;
	}
	public Object getPbEndTime(){
		return this.pbEndTime;
	}
	public void setPbSyncTime(Object pbSyncTime){
		this.pbSyncTime=pbSyncTime;
	}
	public Object getPbSyncTime(){
		return this.pbSyncTime;
	}
	public void setPbState(String pbState){
		this.pbState=pbState;
	}
	public String getPbState(){
		return this.pbState;
	}
}
