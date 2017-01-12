package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 * 
* @ClassName: RequestTcp 
* @Description: 请求头
* @author 李铁扬 
* @date Aug 22, 2011 4:06:43 PM 
*
 */
public class RequestTcp implements Serializable {
	/**
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 1L;
	private String busCode;
	private String serviceCode;
	private String serviceContractVer;
	private String actionCode;
	private String transactionId;
	private String serviceLevel;
	private String srcOrgId;
	private String srcSysId;
	private String srcSysSign;
	private String dstOrgId;
	private String dstSysId;
	private String reqTime;
	private String testFlag;
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
	private List<RequestTcp_request> requestList = new ArrayList<RequestTcp_request>(1);
	public String getActionCode() {
		return actionCode;
	}
	public void setActionCode(String actionCode) {
		this.actionCode = actionCode;
	}
	public String getBusCode() {
		return busCode;
	}
	public void setBusCode(String busCode) {
		this.busCode = busCode;
	}
	public String getDstOrgId() {
		return dstOrgId;
	}
	public void setDstOrgId(String dstOrgId) {
		this.dstOrgId = dstOrgId;
	}
	public String getDstSysId() {
		return dstSysId;
	}
	public void setDstSysId(String dstSysId) {
		this.dstSysId = dstSysId;
	}
	public String getReqTime() {
		return reqTime;
	}
	public void setReqTime(String reqTime) {
		this.reqTime = reqTime;
	}


	public List<RequestTcp_request> getRequestList() {
		return requestList;
	}
	public void setRequestList(List<RequestTcp_request> requestList) {
		this.requestList = requestList;
	}
	public void addRequest(RequestTcp_request request){
		this.requestList.add(request);
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getServiceContractVer() {
		return serviceContractVer;
	}
	public void setServiceContractVer(String serviceContractVer) {
		this.serviceContractVer = serviceContractVer;
	}
	public String getServiceLevel() {
		return serviceLevel;
	}
	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}
	public String getSrcOrgId() {
		return srcOrgId;
	}
	public void setSrcOrgId(String srcOrgId) {
		this.srcOrgId = srcOrgId;
	}
	public String getSrcSysId() {
		return srcSysId;
	}
	public void setSrcSysId(String srcSysId) {
		this.srcSysId = srcSysId;
	}
	public String getSrcSysSign() {
		return srcSysSign;
	}
	public void setSrcSysSign(String srcSysSign) {
		this.srcSysSign = srcSysSign;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTestFlag() {
		return testFlag;
	}
	public void setTestFlag(String testFlag) {
		this.testFlag = testFlag;
	}
	
}
