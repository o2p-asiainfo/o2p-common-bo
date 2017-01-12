package com.asiainfo.integration.o2p.log.common.bo;


public class SimpleEIObject {
	
    
	String contractInteractionId;
	String endpointInteractionId;
	String serviceId;
	String endpointId;
	String reqOrRes;
	long createDate;
	
	
	
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
    public String getEndpointInteractionId() {
		return endpointInteractionId;
	}
	public void setEndpointInteractionId(String endpointInteractionId) {
		this.endpointInteractionId = endpointInteractionId;
	}
	public String getReqOrRes() {
		return reqOrRes;
	}
	public void setReqOrRes(String reqOrRes) {
		this.reqOrRes = reqOrRes;
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
	
}
