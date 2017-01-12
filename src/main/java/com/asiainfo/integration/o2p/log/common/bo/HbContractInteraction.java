/** 
 * Project Name:o2p-log-common 
 * File Name:HbContractInteraction.java 
 * Package Name:com.asiainfo.log.common.bo 
 * Date:2015年11月23日下午3:15:30 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.common.bo;  


/** 
 * ClassName:HbContractInteraction  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年11月23日 下午3:15:30  
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class HbContractInteraction {

    String rowkeyValue;
    
    String srcSysSign;
    
    String contractInteractionId;

    String bizFuncCode;

    String bizIntfCode;
    
    String contractVersion;
    
    String regSerCode;

    String regSerVersion;

    String srcTranId;

    String dstTranId;
    
    String serviceLevel;
    
    String srcOrgCode;
    
    String dstOrgCode;
    
    String srcSysCode;
    
    String dstSysCode;

    String testFlag;

    long srcReqTime;

    long centerRecReqTime;

    long centerFwd2DstTime;

    long dstRecTime;
    
    long dstReplyTime;
    
    long centerRecDstTime;
    
    long centerFwd2SrcTime;
    
    long srcConfirmTime;
    
    long srcResponseTime;

    String responseType;

    String responseCode;

    String responseDes;
    
    long createTime;
    
    String srcIp;
    
    int inputFileNum;
    
    int outputSuccessFileNum;
    
    int outputErrFileNum;
    
    
//    String exceptionSpecId;
//
//    String exceptionMessage;
//
//    String content;
//
//    String staffNbr;

//    String errCode;
//
//    String funName;
//
//    String errorMsg;
//    
//    String descriptor;
//    
//    String status;
    
     String exceptionLogs;
     
     String ctgErrInfo;
    
    
    
    public String getContractInteractionId() {
        return contractInteractionId;
    }
    public void setContractInteractionId(String contractInteractionId) {
        this.contractInteractionId = contractInteractionId;
    }
    public long getDstRecTime() {
        return dstRecTime;
    }
    public void setDstRecTime(long dstRecTime) {
        this.dstRecTime = dstRecTime;
    }
    public long getDstReplyTime() {
        return dstReplyTime;
    }
    public void setDstReplyTime(long dstReplyTime) {
        this.dstReplyTime = dstReplyTime;
    }
    public long getCenterRecDstTime() {
        return centerRecDstTime;
    }
    public void setCenterRecDstTime(long centerRecDstTime) {
        this.centerRecDstTime = centerRecDstTime;
    }
    public long getCenterFwd2SrcTime() {
        return centerFwd2SrcTime;
    }
    public void setCenterFwd2SrcTime(long centerFwd2SrcTime) {
        this.centerFwd2SrcTime = centerFwd2SrcTime;
    }
    public long getSrcConfirmTime() {
        return srcConfirmTime;
    }
    public void setSrcConfirmTime(long srcConfirmTime) {
        this.srcConfirmTime = srcConfirmTime;
    }
    public long getSrcResponseTime() {
        return srcResponseTime;
    }
    public void setSrcResponseTime(long srcResponseTime) {
        this.srcResponseTime = srcResponseTime;
    }
    public String getResponseType() {
        return responseType;
    }
    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseDes() {
        return responseDes;
    }
    public void setResponseDes(String responseDes) {
        this.responseDes = responseDes;
    }
    public long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    public String getDstSysCode() {
        return dstSysCode;
    }
    public void setDstSysCode(String dstSysCode) {
        this.dstSysCode = dstSysCode;
    }
    public String getTestFlag() {
        return testFlag;
    }
    public void setTestFlag(String testFlag) {
        this.testFlag = testFlag;
    }
    public long getSrcReqTime() {
        return srcReqTime;
    }
    public void setSrcReqTime(long srcReqTime) {
        this.srcReqTime = srcReqTime;
    }
    public long getCenterRecReqTime() {
        return centerRecReqTime;
    }
    public void setCenterRecReqTime(long centerRecReqTime) {
        this.centerRecReqTime = centerRecReqTime;
    }
    public long getCenterFwd2DstTime() {
        return centerFwd2DstTime;
    }
    public void setCenterFwd2DstTime(long centerFwd2DstTime) {
        this.centerFwd2DstTime = centerFwd2DstTime;
    }
    public String getDstTranId() {
        return dstTranId;
    }
    public void setDstTranId(String dstTranId) {
        this.dstTranId = dstTranId;
    }
    public String getServiceLevel() {
        return serviceLevel;
    }
    public void setServiceLevel(String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
    public String getSrcOrgCode() {
        return srcOrgCode;
    }
    public void setSrcOrgCode(String srcOrgCode) {
        this.srcOrgCode = srcOrgCode;
    }
    public String getDstOrgCode() {
        return dstOrgCode;
    }
    public void setDstOrgCode(String dstOrgCode) {
        this.dstOrgCode = dstOrgCode;
    }
    public String getSrcSysCode() {
        return srcSysCode;
    }
    public void setSrcSysCode(String srcSysCode) {
        this.srcSysCode = srcSysCode;
    }
    public String getRegSerCode() {
        return regSerCode;
    }
    public void setRegSerCode(String regSerCode) {
        this.regSerCode = regSerCode;
    }
    public String getRegSerVersion() {
        return regSerVersion;
    }
    public void setRegSerVersion(String regSerVersion) {
        this.regSerVersion = regSerVersion;
    }
    public String getSrcTranId() {
        return srcTranId;
    }
    public void setSrcTranId(String srcTranId) {
        this.srcTranId = srcTranId;
    }
    public String getBizIntfCode() {
        return bizIntfCode;
    }
    public void setBizIntfCode(String bizIntfCode) {
        this.bizIntfCode = bizIntfCode;
    }
    public String getContractVersion() {
        return contractVersion;
    }
    public void setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
    }
    public String getBizFuncCode() {
        return bizFuncCode;
    }
    public void setBizFuncCode(String bizFuncCode) {
        this.bizFuncCode = bizFuncCode;
    }
    public String getRowkeyValue() {
        return rowkeyValue;
    }
    public void setRowkeyValue(String rowkeyValue) {
        this.rowkeyValue = rowkeyValue;
    }
    public String getSrcSysSign() {
        return srcSysSign;
    }
    public String getSrcIp() {
        return srcIp;
    }
    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }
    public int getInputFileNum() {
        return inputFileNum;
    }
    public void setInputFileNum(int inputFileNum) {
        this.inputFileNum = inputFileNum;
    }
    public int getOutputSuccessFileNum() {
        return outputSuccessFileNum;
    }
    public void setOutputSuccessFileNum(int outputSuccessFileNum) {
        this.outputSuccessFileNum = outputSuccessFileNum;
    }
    public int getOutputErrFileNum() {
        return outputErrFileNum;
    }
    public void setOutputErrFileNum(int outputErrFileNum) {
        this.outputErrFileNum = outputErrFileNum;
    }
    public String getExceptionLogs() {
        return exceptionLogs;
    }
    public void setExceptionLogs(String exceptionLogs) {
        this.exceptionLogs = exceptionLogs;
    }
    public void setSrcSysSign(String srcSysSign) {
        this.srcSysSign = srcSysSign;
    }
    public String getCtgErrInfo() {
        return ctgErrInfo;
    }
    public void setCtgErrInfo(String ctgErrInfo) {
        this.ctgErrInfo = ctgErrInfo;
    }
    

}
