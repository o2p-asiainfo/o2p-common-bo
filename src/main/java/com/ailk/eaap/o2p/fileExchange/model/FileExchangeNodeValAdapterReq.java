package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 节点取值要求
 * @author zhongming
 *
 */
public class FileExchangeNodeValAdapterReq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int nodeValAdapterReqId;
	private int nodeDescId;
	private int contractAdapterId;
	private String nodeValueSourceCd;
	private String valueExpress;
	private String triggerExpress;
	private String state;
	private Timestamp version;
	
	public int getNodeValAdapterReqId() {
		return nodeValAdapterReqId;
	}
	public void setNodeValAdapterReqId(int nodeValAdapterReqId) {
		this.nodeValAdapterReqId = nodeValAdapterReqId;
	}
	public int getNodeDescId() {
		return nodeDescId;
	}
	public void setNodeDescId(int nodeDescId) {
		this.nodeDescId = nodeDescId;
	}
	public int getContractAdapterId() {
		return contractAdapterId;
	}
	public void setContractAdapterId(int contractAdapterId) {
		this.contractAdapterId = contractAdapterId;
	}
	public String getNodeValueSourceCd() {
		return nodeValueSourceCd;
	}
	public void setNodeValueSourceCd(String nodeValueSourceCd) {
		this.nodeValueSourceCd = nodeValueSourceCd;
	}
	public String getValueExpress() {
		return valueExpress;
	}
	public void setValueExpress(String valueExpress) {
		this.valueExpress = valueExpress;
	}
	public String getTriggerExpress() {
		return triggerExpress;
	}
	public void setTriggerExpress(String triggerExpress) {
		this.triggerExpress = triggerExpress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Timestamp getVersion() {
		return version;
	}
	public void setVersion(Timestamp version) {
		this.version = version;
	}
	
}
