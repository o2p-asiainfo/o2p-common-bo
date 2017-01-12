package com.ailk.eaap.op2.bo;

import java.util.Date;

public class IntfClobLog {
	
    private Long olcId;

    private Long endpointInteractionId;

    private Long contractInteractionId;

    private Integer endpointId;

    private String srcTranId;

    private String srcOrgCode;

    private String srcSysCode;

    private String dstTranId;

    private String dstOrgCode;

    private String dstSysCode;

    private String srcIp;

    private String reqOrRes;

    private Date createTime;

    private String msg;
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

    public Long getContractInteractionId() {
        return contractInteractionId;
    }

    public void setContractInteractionId(Long contractInteractionId) {
        this.contractInteractionId = contractInteractionId == null ? null : contractInteractionId;
    }
    
    public void setContractInteractionId(String contractInteractionId) {
        this.contractInteractionId = contractInteractionId == null ? null : Long.valueOf(contractInteractionId);
    }

    public Integer getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(Integer endpointId) {
        this.endpointId = endpointId;
    }

    public String getSrcTranId() {
        return srcTranId;
    }

    public void setSrcTranId(String srcTranId) {
        this.srcTranId = srcTranId == null ? null : srcTranId.trim();
    }

    public String getSrcOrgCode() {
        return srcOrgCode;
    }

    public void setSrcOrgCode(String srcOrgCode) {
        this.srcOrgCode = srcOrgCode == null ? null : srcOrgCode.trim();
    }

    public String getSrcSysCode() {
        return srcSysCode;
    }

    public void setSrcSysCode(String srcSysCode) {
        this.srcSysCode = srcSysCode == null ? null : srcSysCode.trim();
    }

    public String getDstTranId() {
        return dstTranId;
    }

    public void setDstTranId(String dstTranId) {
        this.dstTranId = dstTranId == null ? null : dstTranId.trim();
    }

    public String getDstOrgCode() {
        return dstOrgCode;
    }

    public void setDstOrgCode(String dstOrgCode) {
        this.dstOrgCode = dstOrgCode == null ? null : dstOrgCode.trim();
    }

    public String getDstSysCode() {
        return dstSysCode;
    }

    public void setDstSysCode(String dstSysCode) {
        this.dstSysCode = dstSysCode == null ? null : dstSysCode.trim();
    }

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp == null ? null : srcIp.trim();
    }

    public String getReqOrRes() {
        return reqOrRes;
    }

    public void setReqOrRes(String reqOrRes) {
        this.reqOrRes = reqOrRes == null ? null : reqOrRes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}