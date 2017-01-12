package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.sql.Timestamp;

import com.ailk.eaap.op2.bo.NodeDesc;

/**
 * 节点映射
 * @author zhongming
 *
 */
public class FileExchangeNodeDescMaper implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int nodeDescMaperId;
	private int srcNodeDescId;
	private NodeDesc srcNodeDesc;
	private int tarNodeDescId;
	private NodeDesc tarNodeDesc;
	private int contractAdapterId;
	private String actionTypeCd;
	private Timestamp createDt;
	
	public int getNodeDescMaperId() {
		return nodeDescMaperId;
	}
	public void setNodeDescMaperId(int nodeDescMaperId) {
		this.nodeDescMaperId = nodeDescMaperId;
	}
	public int getSrcNodeDescId() {
		return srcNodeDescId;
	}
	public void setSrcNodeDescId(int srcNodeDescId) {
		this.srcNodeDescId = srcNodeDescId;
	}
	public int getTarNodeDescId() {
		return tarNodeDescId;
	}
	public void setTarNodeDescId(int tarNodeDescId) {
		this.tarNodeDescId = tarNodeDescId;
	}
	public int getContractAdapterId() {
		return contractAdapterId;
	}
	public void setContractAdapterId(int contractAdapterId) {
		this.contractAdapterId = contractAdapterId;
	}
	public String getActionTypeCd() {
		return actionTypeCd;
	}
	public void setActionTypeCd(String actionTypeCd) {
		this.actionTypeCd = actionTypeCd;
	}
	public Timestamp getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}
	public NodeDesc getSrcNodeDesc() {
		return srcNodeDesc;
	}
	public void setSrcNodeDesc(NodeDesc srcNodeDesc) {
		this.srcNodeDesc = srcNodeDesc;
	}
	public NodeDesc getTarNodeDesc() {
		return tarNodeDesc;
	}
	public void setTarNodeDesc(NodeDesc tarNodeDesc) {
		this.tarNodeDesc = tarNodeDesc;
	}
	
}
