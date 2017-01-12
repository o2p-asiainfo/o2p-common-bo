package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

import com.ailk.eaap.op2.bo.NodeDesc;
import com.ailk.eaap.op2.bo.NodeValReq;

/**
 * 
 * @author zhuangyq
 *
 */
public class NodeDescMapper implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3678127263982149634L;
	private Integer Id;
	private NodeDesc srcNode;
	private NodeDesc tarNode;
	private Integer transformerId;
	private Object srcNodeVal;
	private Object tarNodeVal;
	private String operTypeCd; //
	private Date createDt;
	private NodeValReq tarNodeValReq;
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
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public NodeDesc getSrcNode() {
		return srcNode;
	}
	public void setSrcNode(NodeDesc srcNode) {
		this.srcNode = srcNode;
	}
	public NodeDesc getTarNode() {
		return tarNode;
	}
	public void setTarNode(NodeDesc tarNode) {
		this.tarNode = tarNode;
	}
	public Integer getTransformerId() {
		return transformerId;
	}
	public void setTransformerId(Integer transformerId) {
		this.transformerId = transformerId;
	}
	public Object getSrcNodeVal() {
		return srcNodeVal;
	}
	public void setSrcNodeVal(Object srcNodeVal) {
		this.srcNodeVal = srcNodeVal;
	}
	public Object getTarNodeVal() {
		return tarNodeVal;
	}
	public void setTarNodeVal(Object tarNodeVal) {
		this.tarNodeVal = tarNodeVal;
	}
	public String getOperTypeCd() {
		return operTypeCd;
	}
	public void setOperTypeCd(String operTypeCd) {
		this.operTypeCd = operTypeCd;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public NodeValReq getTarNodeValReq() {
		return tarNodeValReq;
	}
	public void setTarNodeValReq(NodeValReq tarNodeValReq) {
		this.tarNodeValReq = tarNodeValReq;
	}
	
}
