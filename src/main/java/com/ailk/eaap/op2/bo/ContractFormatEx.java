package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

import com.ailk.eaap.op2.bo.Contract2AttrSpec;
import com.ailk.eaap.op2.bo.ContractFormat;

public class ContractFormatEx extends ContractFormat implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4269445032047028543L;
	private List<Contract2AttrSpec> contract2AttrSpecs;
	private Object msgBody;
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
	public List<Contract2AttrSpec> getContract2AttrSpecs() {
		return contract2AttrSpecs;
	}

	public void setContract2AttrSpecs(List<Contract2AttrSpec> contract2AttrSpecs) {
		this.contract2AttrSpecs = contract2AttrSpecs;
	}

	public Object getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(Object msgBody) {
		this.msgBody = msgBody;
	}
	
}
