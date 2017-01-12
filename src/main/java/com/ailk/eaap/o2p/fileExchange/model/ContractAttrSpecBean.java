package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;

import com.ailk.eaap.op2.bo.AttrSpec;
/**
 * 协议属性
 * @author wuwz
 *
 */
public class ContractAttrSpecBean  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer  contractAttrSpecId;
	private Integer  tcpCtrFId;
	private AttrSpec attrSpecBean;
	private String   value;
	private String   state;
	
	public ContractAttrSpecBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractAttrSpecBean(Integer contractAttrSpecId, Integer tcpCtrFId,
			AttrSpec attrSpecBean, String value, String state) {
		super();
		this.contractAttrSpecId = contractAttrSpecId;
		this.tcpCtrFId = tcpCtrFId;
		this.attrSpecBean = attrSpecBean;
		this.value = value;
		this.state = state;
	}

	public Integer getContractAttrSpecId() {
		return contractAttrSpecId;
	}

	public void setContractAttrSpecId(Integer contractAttrSpecId) {
		this.contractAttrSpecId = contractAttrSpecId;
	}

	public Integer getTcpCtrFId() {
		return tcpCtrFId;
	}

	public void setTcpCtrFId(Integer tcpCtrFId) {
		this.tcpCtrFId = tcpCtrFId;
	}

	public AttrSpec getAttrSpecBean() {
		return attrSpecBean;
	}

	public void setAttrSpecBean(AttrSpec attrSpecBean) {
		this.attrSpecBean = attrSpecBean;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
