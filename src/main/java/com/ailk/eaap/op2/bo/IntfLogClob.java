package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Clob;
import java.sql.Timestamp;

public class IntfLogClob implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long olcId;
	private Long endpointInteractionId;
	private String contractInteractionId;
	private Long endPointId;
	private String srcTranId;
	private String srcOrgCode;
	private String srcSysCode;
	private String dstTranId;
	private String dstOrgCode;
	private String dstSysCode;
	private String srcIp;
	private String reqOrRes;
	private Clob msg;
	private Timestamp createTime;
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
	public Long getOlcId() {
		return olcId;
	}
	public void setOlcId(Long olcId) {
		this.olcId = olcId;
	}
	public Long getEndpointInteractionId() {
		return endpointInteractionId;
	}
	public void setEndpointInteractionId(Long endpointInteractionId) {
		this.endpointInteractionId = endpointInteractionId;
	}
	public String getContractInteractionId() {
		return contractInteractionId;
	}
	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}
	public Long getEndPointId() {
		return endPointId;
	}
	public void setEndPointId(Long endPointId) {
		this.endPointId = endPointId;
	}
	public String getSrcTranId() {
		return srcTranId;
	}
	public void setSrcTranId(String srcTranId) {
		this.srcTranId = srcTranId;
	}
	public String getSrcOrgCode() {
		return srcOrgCode;
	}
	public void setSrcOrgCode(String srcOrgCode) {
		this.srcOrgCode = srcOrgCode;
	}
	public String getSrcSysCode() {
		return srcSysCode;
	}
	public void setSrcSysCode(String srcSysCode) {
		this.srcSysCode = srcSysCode;
	}
	public String getDstTranId() {
		return dstTranId;
	}
	public void setDstTranId(String dstTranId) {
		this.dstTranId = dstTranId;
	}
	public String getDstOrgCode() {
		return dstOrgCode;
	}
	public void setDstOrgCode(String dstOrgCode) {
		this.dstOrgCode = dstOrgCode;
	}
	public String getDstSysCode() {
		return dstSysCode;
	}
	public void setDstSysCode(String dstSysCode) {
		this.dstSysCode = dstSysCode;
	}
	public String getSrcIp() {
		return srcIp;
	}
	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}
	public String getReqOrRes() {
		return reqOrRes;
	}
	public void setReqOrRes(String reqOrRes) {
		this.reqOrRes = reqOrRes;
	}

	public Clob getMsg() {
		return msg;
	}
	public void setMsg(Clob msg) {
		this.msg = msg;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
