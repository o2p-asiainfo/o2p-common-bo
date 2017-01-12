package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ContractInteractionXx implements Serializable{
private static final long serialVersionUID = 1L;
	private String contractInteractionId;
	private String bizFuncCode;
	private String bizIntfCode;
	private String contractVersion;
	private String regSerCode;
	private String regSerVersion;
	private String srcTranId;
	private String dstTranId;
	private String serviceLevel;
	private String srcOrgCode;
	private String dstOrgCode;
	private String srcSysCode;
	private String dstSysCode;
	private String testFlag;
	private Date srcReqTime;
	private Object centerRecReqTime;
	private Object centerFwd2DstTime;
	private Date dstRecTime;
	private Date dstReplyTime;
	private Object centerRecDstTime;
	private Object centerFwd2SrcTime;
	private Date srcConfirmTime;
	private Date srcResponseTime;
	private String responseType;
	private String responseCode;
	private String responseDes;
	private Date createTime;
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
	public void setContractInteractionId(String contractInteractionId){
		this.contractInteractionId=contractInteractionId;
	}
	public String getContractInteractionId(){
		return this.contractInteractionId;
	}
	public void setBizFuncCode(String bizFuncCode){
		this.bizFuncCode=bizFuncCode;
	}
	public String getBizFuncCode(){
		return this.bizFuncCode;
	}
	public void setBizIntfCode(String bizIntfCode){
		this.bizIntfCode=bizIntfCode;
	}
	public String getBizIntfCode(){
		return this.bizIntfCode;
	}
	public void setContractVersion(String contractVersion){
		this.contractVersion=contractVersion;
	}
	public String getContractVersion(){
		return this.contractVersion;
	}
	public void setRegSerCode(String regSerCode){
		this.regSerCode=regSerCode;
	}
	public String getRegSerCode(){
		return this.regSerCode;
	}
	public void setRegSerVersion(String regSerVersion){
		this.regSerVersion=regSerVersion;
	}
	public String getRegSerVersion(){
		return this.regSerVersion;
	}
	public void setSrcTranId(String srcTranId){
		this.srcTranId=srcTranId;
	}
	public String getSrcTranId(){
		return this.srcTranId;
	}
	public void setDstTranId(String dstTranId){
		this.dstTranId=dstTranId;
	}
	public String getDstTranId(){
		return this.dstTranId;
	}
	public void setServiceLevel(String serviceLevel){
		this.serviceLevel=serviceLevel;
	}
	public String getServiceLevel(){
		return this.serviceLevel;
	}
	public void setSrcOrgCode(String srcOrgCode){
		this.srcOrgCode=srcOrgCode;
	}
	public String getSrcOrgCode(){
		return this.srcOrgCode;
	}
	public void setDstOrgCode(String dstOrgCode){
		this.dstOrgCode=dstOrgCode;
	}
	public String getDstOrgCode(){
		return this.dstOrgCode;
	}
	public void setSrcSysCode(String srcSysCode){
		this.srcSysCode=srcSysCode;
	}
	public String getSrcSysCode(){
		return this.srcSysCode;
	}
	public void setDstSysCode(String dstSysCode){
		this.dstSysCode=dstSysCode;
	}
	public String getDstSysCode(){
		return this.dstSysCode;
	}
	public void setTestFlag(String testFlag){
		this.testFlag=testFlag;
	}
	public String getTestFlag(){
		return this.testFlag;
	}
	public void setSrcReqTime(Date srcReqTime){
		this.srcReqTime=srcReqTime;
	}
	public Date getSrcReqTime(){
		return this.srcReqTime;
	}
	public void setCenterRecReqTime(Object centerRecReqTime){
		this.centerRecReqTime=centerRecReqTime;
	}
	public Object getCenterRecReqTime(){
		return this.centerRecReqTime;
	}
	public void setCenterFwd2DstTime(Object centerFwd2DstTime){
		this.centerFwd2DstTime=centerFwd2DstTime;
	}
	public Object getCenterFwd2DstTime(){
		return this.centerFwd2DstTime;
	}
	public void setDstRecTime(Date dstRecTime){
		this.dstRecTime=dstRecTime;
	}
	public Date getDstRecTime(){
		return this.dstRecTime;
	}
	public void setDstReplyTime(Date dstReplyTime){
		this.dstReplyTime=dstReplyTime;
	}
	public Date getDstReplyTime(){
		return this.dstReplyTime;
	}
	public void setCenterRecDstTime(Object centerRecDstTime){
		this.centerRecDstTime=centerRecDstTime;
	}
	public Object getCenterRecDstTime(){
		return this.centerRecDstTime;
	}
	public void setCenterFwd2SrcTime(Object centerFwd2SrcTime){
		this.centerFwd2SrcTime=centerFwd2SrcTime;
	}
	public Object getCenterFwd2SrcTime(){
		return this.centerFwd2SrcTime;
	}
	public void setSrcConfirmTime(Date srcConfirmTime){
		this.srcConfirmTime=srcConfirmTime;
	}
	public Date getSrcConfirmTime(){
		return this.srcConfirmTime;
	}
	public void setSrcResponseTime(Date srcResponseTime){
		this.srcResponseTime=srcResponseTime;
	}
	public Date getSrcResponseTime(){
		return this.srcResponseTime;
	}
	public void setResponseType(String responseType){
		this.responseType=responseType;
	}
	public String getResponseType(){
		return this.responseType;
	}
	public void setResponseCode(String responseCode){
		this.responseCode=responseCode;
	}
	public String getResponseCode(){
		return this.responseCode;
	}
	public void setResponseDes(String responseDes){
		this.responseDes=responseDes;
	}
	public String getResponseDes(){
		return this.responseDes;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
}
