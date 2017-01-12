package com.ailk.eaap.op2.bo;

import java.io.Serializable;

import com.ailk.eaap.op2.bo.NodeDesc;

public class MessageNode implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NodeDesc nodeDesc;
	private Object nodeVal;
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
	public NodeDesc getNodeDesc() {
		return nodeDesc;
	}
	public void setNodeDesc(NodeDesc nodeDesc) {
		this.nodeDesc = nodeDesc;
	}
	public Object getNodeVal() {
		return nodeVal;
	}
	public void setNodeVal(Object nodeVal) {
		this.nodeVal = nodeVal;
	}
	
}
