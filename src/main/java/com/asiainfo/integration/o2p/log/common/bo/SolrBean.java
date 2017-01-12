package com.asiainfo.integration.o2p.log.common.bo;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.solr.client.solrj.beans.Field;

public class SolrBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 185679462066732473L;
	
	
	
	@Field("rowkey")
	private String rowkey;
	@Field
	private String id;
	@Field
	private String contractInteractionId;
	@Field
	private String table;
	@Field
	private String contractVersion;
	@Field
	private String srcTranId;
	@Field
	private String srcSysCode;
	@Field
	private String dstSysCode;
	@Field
	private String status;
	@Field
	private String responseCode;
	@Field
	private long srcReqTime;
	@Field
	private long createTime;
	@Field
	private int tenantId;
	@Field
	private String serviceStyle;
	
	@Field
	private String errCode;
	@Field
	private String funName;
	
    public String getRowkey() {
        return rowkey;
    }
    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContractInteractionId() {
        return contractInteractionId;
    }
    public void setContractInteractionId(String contractInteractionId) {
        this.contractInteractionId = contractInteractionId;
    }
    public String getTable() {
        return table;
    }
    public void setTable(String table) {
        this.table = table;
    }
    public String getContractVersion() {
        return contractVersion;
    }
    public void setContractVersion(String contractVersion) {
        this.contractVersion = contractVersion;
    }
    public String getSrcTranId() {
        return srcTranId;
    }
    public void setSrcTranId(String srcTranId) {
        this.srcTranId = srcTranId;
    }
    public String getSrcSysCode() {
        return srcSysCode;
    }
    public void setSrcSysCode(String srcSysCode) {
        this.srcSysCode = srcSysCode;
    }
    public String getDstSysCode() {
        return dstSysCode;
    }
    public void setDstSysCode(String dstSysCode) {
        this.dstSysCode = dstSysCode;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public long getSrcReqTime() {
        return srcReqTime;
    }
    public void setSrcReqTime(long srcReqTime) {
        this.srcReqTime = srcReqTime;
    }
    public long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    public int getTenantId() {
        return tenantId;
    }
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    public String getServiceStyle() {
        return serviceStyle;
    }
    public void setServiceStyle(String serviceStyle) {
        this.serviceStyle = serviceStyle;
    }
    public String getErrCode() {
        return errCode;
    }
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
    public String getFunName() {
        return funName;
    }
    public void setFunName(String funName) {
        this.funName = funName;
    }

}
