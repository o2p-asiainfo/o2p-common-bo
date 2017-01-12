/** 
 * Project Name:o2p-log-common 
 * File Name:HbEndpointInteraction.java 
 * Package Name:com.asiainfo.log.common.bo 
 * Date:2015年11月23日下午3:15:48 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.common.bo;  


/** 
 * ClassName:HbEndpointInteraction  
 * Function: TODO ADD FUNCTION.  
 * Reason:   TODO ADD REASON.  
 * Date:     2015年11月23日 下午3:15:48  
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 *        
 */
public class HbEndpointInteraction {

    String rowkeyValue;
    String srcSysSign;
    String endpointInteractionId;
    String contractInteractionId;
    String serviceId;
    String endpointId;
    long createDate;
    String srcTranId;
    String reqOrRes;
    String queueMsgId;
    String resQueue;
    String reqQueue;
    String dstTranId;
    String srcIp;
    String srcOrgCode;
    String srcSysCode;
    String dstOrgCode;
    String dstSysCode;
    long   centerFwd2DstTime;
    long   dstReplyTime;
    String descriptor;
    String inMsg;
    String outMsg;
    
   
   
   
    public String getEndpointInteractionId() {
        return endpointInteractionId;
    }
    public void setEndpointInteractionId(String endpointInteractionId) {
        this.endpointInteractionId = endpointInteractionId;
    }
    public String getInMsg() {
        return inMsg;
    }
    public void setInMsg(String inMsg) {
        this.inMsg = inMsg;
    }
    public String getOutMsg() {
        return outMsg;
    }
    public void setOutMsg(String outMsg) {
        this.outMsg = outMsg;
    }

    public String getContractInteractionId() {
        return contractInteractionId;
    }
    public void setContractInteractionId(String contractInteractionId) {
        this.contractInteractionId = contractInteractionId;
    }
    public String getServiceId() {
        return serviceId;
    }
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public String getEndpointId() {
        return endpointId;
    }
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }
    public long getCreateDate() {
        return createDate;
    }
    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }
    public String getSrcTranId() {
        return srcTranId;
    }
    public void setSrcTranId(String srcTranId) {
        this.srcTranId = srcTranId;
    }
    public String getReqOrRes() {
        return reqOrRes;
    }
    public void setReqOrRes(String reqOrRes) {
        this.reqOrRes = reqOrRes;
    }
    public String getQueueMsgId() {
        return queueMsgId;
    }
    public void setQueueMsgId(String queueMsgId) {
        this.queueMsgId = queueMsgId;
    }
    public String getResQueue() {
        return resQueue;
    }
    public void setResQueue(String resQueue) {
        this.resQueue = resQueue;
    }
    public String getReqQueue() {
        return reqQueue;
    }
    public void setReqQueue(String reqQueue) {
        this.reqQueue = reqQueue;
    }
    public String getDstTranId() {
        return dstTranId;
    }
    public void setDstTranId(String dstTranId) {
        this.dstTranId = dstTranId;
    }
    public String getSrcIp() {
        return srcIp;
    }
    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
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
    public long getCenterFwd2DstTime() {
        return centerFwd2DstTime;
    }
    public void setCenterFwd2DstTime(long centerFwd2DstTime) {
        this.centerFwd2DstTime = centerFwd2DstTime;
    }
    public long getDstReplyTime() {
        return dstReplyTime;
    }
    public void setDstReplyTime(long dstReplyTime) {
        this.dstReplyTime = dstReplyTime;
    }
    public String getDescriptor() {
        return descriptor;
    }
    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
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
    public void setSrcSysSign(String srcSysSign) {
        this.srcSysSign = srcSysSign;
    }
}
