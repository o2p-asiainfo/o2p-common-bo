package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class EndpointInteractionXx implements Serializable{
private static final long serialVersionUID = 1L;
	private Long endpointInteractionId;
	private String contractInteractionId;
	private Integer serviceId;
	private Integer endpointId;
	private Date createDate;
	private String srcTranId;
	private String reqOrRes;
	private String queueMsgId;
	private Integer resQueue;
	private Integer reqQueue;
	private String dstTranId;
	private String dstOrgCode;
	private String dstSysCode;
	private Object centerFwd2DstTime;
	private Object dstReplyTime;
	private String descriptor;
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
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setEndpointId(Integer endpointId){
		this.endpointId=endpointId;
	}
	public Integer getEndpointId(){
		return this.endpointId;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setSrcTranId(String srcTranId){
		this.srcTranId=srcTranId;
	}
	public String getSrcTranId(){
		return this.srcTranId;
	}
	public void setReqOrRes(String reqOrRes){
		this.reqOrRes=reqOrRes;
	}
	public String getReqOrRes(){
		return this.reqOrRes;
	}
	public void setQueueMsgId(String queueMsgId){
		this.queueMsgId=queueMsgId;
	}
	public String getQueueMsgId(){
		return this.queueMsgId;
	}
	public void setResQueue(Integer resQueue){
		this.resQueue=resQueue;
	}
	public Integer getResQueue(){
		return this.resQueue;
	}
	public void setReqQueue(Integer reqQueue){
		this.reqQueue=reqQueue;
	}
	public Integer getReqQueue(){
		return this.reqQueue;
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
	public void setCenterFwd2DstTime(Object centerFwd2DstTime){
		this.centerFwd2DstTime=centerFwd2DstTime;
	}
	public Object getCenterFwd2DstTime(){
		return this.centerFwd2DstTime;
	}
	public void setDstReplyTime(Object dstReplyTime){
		this.dstReplyTime=dstReplyTime;
	}
	public Object getDstReplyTime(){
		return this.dstReplyTime;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
}
