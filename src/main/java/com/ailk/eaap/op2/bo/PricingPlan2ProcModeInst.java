package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class PricingPlan2ProcModeInst implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer relaId;
	private Integer seqId;
	private Integer pricingInfoId;
	private Integer procModeInstId;
	private Integer relaType;
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
	public void setRelaId(Integer relaId){
		this.relaId=relaId;
	}
	public Integer getRelaId(){
		return this.relaId;
	}
	public void setSeqId(Integer seqId){
		this.seqId=seqId;
	}
	public Integer getSeqId(){
		return this.seqId;
	}
	public void setPricingInfoId(Integer pricingInfoId){
		this.pricingInfoId=pricingInfoId;
	}
	public Integer getPricingInfoId(){
		return this.pricingInfoId;
	}
	public void setProcModeInstId(Integer procModeInstId){
		this.procModeInstId=procModeInstId;
	}
	public Integer getProcModeInstId(){
		return this.procModeInstId;
	}
	public void setRelaType(Integer relaType){
		this.relaType=relaType;
	}
	public Integer getRelaType(){
		return this.relaType;
	}
}
