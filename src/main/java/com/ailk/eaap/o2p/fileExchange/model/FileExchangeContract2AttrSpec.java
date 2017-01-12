package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.util.List;

import com.ailk.eaap.op2.bo.AttrSpec;

/**
 * 协议格式属性
 * @author zhongming
 *
 */
public class FileExchangeContract2AttrSpec implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int contract2AttrSpecId;
	private int tcpCtrFId;
	private int attrSpecId;
	private AttrSpec attrSpec;
	private String value;
	private String state;
	
	public int getContract2AttrSpecId() {
		return contract2AttrSpecId;
	}
	public void setContract2AttrSpecId(int contract2AttrSpecId) {
		this.contract2AttrSpecId = contract2AttrSpecId;
	}
	public int getTcpCtrFId() {
		return tcpCtrFId;
	}
	public void setTcpCtrFId(int tcpCtrFId) {
		this.tcpCtrFId = tcpCtrFId;
	}
	public int getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(int attrSpecId) {
		this.attrSpecId = attrSpecId;
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
	public AttrSpec getAttrSpec() {
		return attrSpec;
	}
	public void setAttrSpec(AttrSpec attrSpec) {
		this.attrSpec = attrSpec;
	}

	
}
