package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.ailk.eaap.op2.bo.NodeDesc;

public class NodeValReq implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer nodeValReqId;
	private NodeDesc nodeDesc;
	private Integer nodeDescId;
	private Integer transformerRuleId;
	private String nodeValSourceCd;
	private String valueExpress;
	private List<ParamVarMap> paramVarMapList;
	private String script;
	private String triggerExpress;
	private String state;
	private Date version;
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
	public Integer getNodeValReqId() {
		return nodeValReqId;
	}
	public void setNodeValReqId(Integer nodeValReqId) {
		this.nodeValReqId = nodeValReqId;
	}
	public NodeDesc getNodeDesc() {
		return nodeDesc;
	}
	public void setNodeDesc(NodeDesc nodeDesc) {
		this.nodeDesc = nodeDesc;
	}
	public Integer getNodeDescId() {
		return nodeDescId;
	}
	public void setNodeDescId(Integer nodeDescId) {
		this.nodeDescId = nodeDescId;
	}
	public Integer getTransformerRuleId() {
		return transformerRuleId;
	}
	public void setTransformerRuleId(Integer transformerRuleId) {
		this.transformerRuleId = transformerRuleId;
	}
	public String getNodeValSourceCd() {
		return nodeValSourceCd;
	}
	public void setNodeValSourceCd(String nodeValSourceCd) {
		this.nodeValSourceCd = nodeValSourceCd;
	}
	public String getValueExpress() {
		return valueExpress;
	}
	public void setValueExpress(String valueExpress) {
		this.valueExpress = valueExpress;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
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
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public List<ParamVarMap> getParamVarMapList() {
		return paramVarMapList;
	}
	public void setParamVarMapList(List<ParamVarMap> paramVarMapList) {
		this.paramVarMapList = paramVarMapList;
	}
	
}
