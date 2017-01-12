package com.ailk.eaap.op2.bo;

import java.util.Date;

public class IntfLog {

    private Long contractInteractionId;

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

    private Date centerRecReqTime;

    private Date centerFwd2DstTime;

    private Date dstRecTime;

    private Date dstReplyTime;

    private Date centerRecDstTime;

    private Date centerFwd2SrcTime;

    private Date srcConfirmTime;

    private Date srcResponseTime;

    private String responseType;

    private String responseCode;

    private String responseDes;

    private Date createTime;

    private String busObjType;

    private String busObjId;
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
    public Long getContractInteractionId() {
        return contractInteractionId;
    }

    public void setContractInteractionId(Long contractInteractionId) {
        this.contractInteractionId = contractInteractionId == null ? null : contractInteractionId;
    }
    
    public void setContractInteractionId(String contractInteractionId) {
        this.contractInteractionId = contractInteractionId == null ? null : Long.valueOf(contractInteractionId);
    }

    public String getBizFuncCode() {
        return bizFuncCode;
    }

    public void setBizFuncCode(String bizFuncCode) {
        this.bizFuncCode = bizFuncCode == null ? null : bizFuncCode.trim();
    }

    public String getBizIntfCode() {
        return bizIntfCode;
    }

    public void setBizIntfCode(String bizIntfCode) {
        this.bizIntfCode = bizIntfCode == null ? null : bizIntfCode.trim();
    }

    public String getContractVersion() {
        return contractVersion;
    }

    public void setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion == null ? null : contractVersion.trim();
    }

    public String getRegSerCode() {
        return regSerCode;
    }

    public void setRegSerCode(String regSerCode) {
        this.regSerCode = regSerCode == null ? null : regSerCode.trim();
    }

    public String getRegSerVersion() {
        return regSerVersion;
    }

    public void setRegSerVersion(String regSerVersion) {
        this.regSerVersion = regSerVersion == null ? null : regSerVersion.trim();
    }

    public String getSrcTranId() {
        return srcTranId;
    }

    public void setSrcTranId(String srcTranId) {
        this.srcTranId = srcTranId == null ? null : srcTranId.trim();
    }

    public String getDstTranId() {
        return dstTranId;
    }

    public void setDstTranId(String dstTranId) {
        this.dstTranId = dstTranId == null ? null : dstTranId.trim();
    }

    public String getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel == null ? null : serviceLevel.trim();
    }

    public String getSrcOrgCode() {
        return srcOrgCode;
    }

    public void setSrcOrgCode(String srcOrgCode) {
        this.srcOrgCode = srcOrgCode == null ? null : srcOrgCode.trim();
    }

    public String getDstOrgCode() {
        return dstOrgCode;
    }

    public void setDstOrgCode(String dstOrgCode) {
        this.dstOrgCode = dstOrgCode == null ? null : dstOrgCode.trim();
    }

    public String getSrcSysCode() {
        return srcSysCode;
    }

    public void setSrcSysCode(String srcSysCode) {
        this.srcSysCode = srcSysCode == null ? null : srcSysCode.trim();
    }

    public String getDstSysCode() {
        return dstSysCode;
    }

    public void setDstSysCode(String dstSysCode) {
        this.dstSysCode = dstSysCode == null ? null : dstSysCode.trim();
    }

    public String getTestFlag() {
        return testFlag;
    }

    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag == null ? null : testFlag.trim();
    }

    public Date getSrcReqTime() {
        return srcReqTime;
    }

    public void setSrcReqTime(Date srcReqTime) {
        this.srcReqTime = srcReqTime;
    }

    public Date getCenterRecReqTime() {
        return centerRecReqTime;
    }

    public void setCenterRecReqTime(Date centerRecReqTime) {
        this.centerRecReqTime = centerRecReqTime;
    }

    public Date getCenterFwd2DstTime() {
        return centerFwd2DstTime;
    }

    public void setCenterFwd2DstTime(Date centerFwd2DstTime) {
        this.centerFwd2DstTime = centerFwd2DstTime;
    }

    public Date getDstRecTime() {
        return dstRecTime;
    }

    public void setDstRecTime(Date dstRecTime) {
        this.dstRecTime = dstRecTime;
    }

    public Date getDstReplyTime() {
        return dstReplyTime;
    }

    public void setDstReplyTime(Date dstReplyTime) {
        this.dstReplyTime = dstReplyTime;
    }

    public Date getCenterRecDstTime() {
        return centerRecDstTime;
    }

    public void setCenterRecDstTime(Date centerRecDstTime) {
        this.centerRecDstTime = centerRecDstTime;
    }

    public Date getCenterFwd2SrcTime() {
        return centerFwd2SrcTime;
    }

    public void setCenterFwd2SrcTime(Date centerFwd2SrcTime) {
        this.centerFwd2SrcTime = centerFwd2SrcTime;
    }

    public Date getSrcConfirmTime() {
        return srcConfirmTime;
    }

    public void setSrcConfirmTime(Date srcConfirmTime) {
        this.srcConfirmTime = srcConfirmTime;
    }

    public Date getSrcResponseTime() {
        return srcResponseTime;
    }

    public void setSrcResponseTime(Date srcResponseTime) {
        this.srcResponseTime = srcResponseTime;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType == null ? null : responseType.trim();
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode == null ? null : responseCode.trim();
    }

    public String getResponseDes() {
        return responseDes;
    }

    public void setResponseDes(String responseDes) {
        this.responseDes = responseDes == null ? null : responseDes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getBusObjType() {
        return busObjType;
    }

    public void setBusObjType(String busObjType) {
        this.busObjType = busObjType == null ? null : busObjType.trim();
    }

    public String getBusObjId() {
        return busObjId;
    }

    public void setBusObjId(String busObjId) {
        this.busObjId = busObjId == null ? null : busObjId.trim();
    }
}