package com.ailk.eaap.o2p.fileExchange.model;

public class ServiceInstance {
	private Long serInvokeInsId;
	private Long messageFlowId;
	private Long componentId;
	private Long serviceId;
	private String serInvokeInsesc;
	public Long getSerInvokeInsId() {
		return serInvokeInsId;
	}
	public void setSerInvokeInsId(Long serInvokeInsId) {
		this.serInvokeInsId = serInvokeInsId;
	}
	public Long getMessageFlowId() {
		return messageFlowId;
	}
	public void setMessageFlowId(Long messageFlowId) {
		this.messageFlowId = messageFlowId;
	}
	public Long getComponentId() {
		return componentId;
	}
	public void setComponentId(Long componentId) {
		this.componentId = componentId;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getSerInvokeInsesc() {
		return serInvokeInsesc;
	}
	public void setSerInvokeInsesc(String serInvokeInsesc) {
		this.serInvokeInsesc = serInvokeInsesc;
	}
	
}
