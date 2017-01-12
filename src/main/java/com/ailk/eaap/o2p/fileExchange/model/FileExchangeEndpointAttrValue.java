package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;

import com.ailk.eaap.op2.bo.AttrSpec;
import com.ailk.eaap.op2.bo.EndpointAttrValue;

public class FileExchangeEndpointAttrValue extends EndpointAttrValue implements Serializable{
	private static final long serialVersionUID = 1L;
	private AttrSpec attrSpec;
	
	public AttrSpec getAttrSpec() {
		return attrSpec;
	}
	public void setAttrSpec(AttrSpec attrSpec) {
		this.attrSpec = attrSpec;
	}

}
