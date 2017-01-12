package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class OriLogClobXx implements Serializable{
private static final long serialVersionUID = 1L;
	private Long olcId;
	private Long endpointInteractionId;
	private String contractInteractionId;
	private String srcTranId;
	private String srcOrgCode;
	private String srcSysCode;
	private String dstTranId;
	private String dstOrgCode;
	private String dstSysCode;
	private String srcIp;
	private String reqOrRes;
	private String msg;
	private Object createTime;
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

	public void setOlcId(Long olcId){
		this.olcId=olcId;
	}
	public Long getOlcId(){
		return this.olcId;
	}
	public void setEndpointInteractionId(Long endpointInteractionId){
		this.endpointInteractionId=endpointInteractionId;
	}
	public Long getEndpointInteractionId(){
		return this.endpointInteractionId;
	}
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setSrcTranId(String srcTranId){
		this.srcTranId=srcTranId;
	}
	public String getSrcTranId(){
		return this.srcTranId;
	}
	public void setSrcOrgCode(String srcOrgCode){
		this.srcOrgCode=srcOrgCode;
	}
	public String getSrcOrgCode(){
		return this.srcOrgCode;
	}
	public void setSrcSysCode(String srcSysCode){
		this.srcSysCode=srcSysCode;
	}
	public String getSrcSysCode(){
		return this.srcSysCode;
	}
	public void setDstTranId(String dstTranId){
		this.dstTranId=dstTranId;
	}
	public String getDstTranId(){
		return this.dstTranId;
	}
	public void setDstOrgCode(String dstOrgCode){
		this.dstOrgCode=dstOrgCode;
	}
	public String getDstOrgCode(){
		return this.dstOrgCode;
	}
	public void setDstSysCode(String dstSysCode){
		this.dstSysCode=dstSysCode;
	}
	public String getDstSysCode(){
		return this.dstSysCode;
	}
	public void setSrcIp(String srcIp){
		this.srcIp=srcIp;
	}
	public String getSrcIp(){
		return this.srcIp;
	}
	public void setReqOrRes(String reqOrRes){
		this.reqOrRes=reqOrRes;
	}
	public String getReqOrRes(){
		return this.reqOrRes;
	}
	public void setMsg(String msg){
		this.msg=msg;
	}
	public String getMsg(){
		return this.msg;
	}
	public void setCreateTime(Object createTime){
		this.createTime=createTime;
	}
	public Object getCreateTime(){
		return this.createTime;
	}
}
