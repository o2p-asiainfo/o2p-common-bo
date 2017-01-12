package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;

/**
 * 常量映射
 * @author zhongming
 *
 */
public class FileExchangeConstMap implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int conMapingId;
	private int nodeValAdapterReqId;
	private String srcKey;
	private String tarVal;
	private String version;
	private String state;
	
	public int getConMapingId() {
		return conMapingId;
	}
	public void setConMapingId(int conMapingId) {
		this.conMapingId = conMapingId;
	}
	public int getNodeValAdapterReqId() {
		return nodeValAdapterReqId;
	}
	public void setNodeValAdapterReqId(int nodeValAdapterReqId) {
		this.nodeValAdapterReqId = nodeValAdapterReqId;
	}
	public String getSrcKey() {
		return srcKey;
	}
	public void setSrcKey(String srcKey) {
		this.srcKey = srcKey;
	}
	public String getTarVal() {
		return tarVal;
	}
	public void setTarVal(String tarVal) {
		this.tarVal = tarVal;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
