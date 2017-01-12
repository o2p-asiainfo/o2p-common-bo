package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.ailk.eaap.op2.bo.Contract2AttrSpec;
import com.ailk.eaap.op2.bo.ContractFormat;

public class MessageDesc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<MessageNode> messageNodes;
	private List<NodeDescMapper> nodeMappers;
	private ContractFormat contractFormat;//String conType = "1";//1代表XML，2代表JSON，3代表URLGET，4TXT，5代表MAP，6代表XML/JSON默认XML，7TLV，9XSL，10TAP3，11CSV
	private String srcConType;
	private Map<String,Object> headers;
	private List<Contract2AttrSpec> attrs;
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

	public List<MessageNode> getMessageNodes() {
		return messageNodes;
	}
	public void setMessageNodes(List<MessageNode> messageNodes) {
		this.messageNodes = messageNodes;
	}
	public ContractFormat getContractFormat() {
		return contractFormat;
	}
	public void setContractFormat(ContractFormat contractFormat) {
		this.contractFormat = contractFormat;
	}
	public List<Contract2AttrSpec> getAttrs() {
		return attrs;
	}
	
	public Map<String, Object> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, Object> headers) {
		this.headers = headers;
	}
	public void setAttrs(List<Contract2AttrSpec> attrs) {
		this.attrs = attrs;
	}
	public List<NodeDescMapper> getNodeMappers() {
		return nodeMappers;
	}
	public void setNodeMappers(List<NodeDescMapper> nodeMappers) {
		this.nodeMappers = nodeMappers;
	}
	public String getSrcConType() {
		return srcConType;
	}
	public void setSrcConType(String srcConType) {
		this.srcConType = srcConType;
	}
	
}
