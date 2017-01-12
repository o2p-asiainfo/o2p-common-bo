package com.asiainfo.integration.o2p.log.common.bo;


public class SimpleCIObject {
	
    
	String rowkeyValue;
	
	String contractInteractionId;
	
	String contractVersion;

	String serviceLevel;

	String responseCode;

	String srcTranId;

	String srcSysCode;

	String dstSysCode;

	String status;
	
	long srcReqTime;
	
	long createTime;
	
	
	

	public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public String getRowkeyValue() {
		return rowkeyValue;
	}

	public void setRowkeyValue(String rowkeyValue) {
		this.rowkeyValue = rowkeyValue;
	}

	public String getContractInteractionId() {
		return contractInteractionId;
	}

	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}

	public String getContractVersion() {
		return contractVersion;
	}

	public void setContractVersion(String contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
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

	public long getSrcReqTime() {
		return srcReqTime;
	}

	public void setSrcReqTime(long srcReqTime) {
		this.srcReqTime = srcReqTime;
	}

	
	

}
