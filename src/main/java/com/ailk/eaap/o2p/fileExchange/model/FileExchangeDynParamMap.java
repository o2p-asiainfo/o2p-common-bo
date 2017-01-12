package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 动态参数映射
 * @author zhongming
 *
 */
public class FileExchangeDynParamMap implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int dynParamMapId;
	private int nodeValAdapterReqId;
	private String paramName;
	private String paramSeq;
	private String paramBound;
	private String type;
	private String state;
	private Timestamp createDt;
	
	public int getDynParamMapId() {
		return dynParamMapId;
	}
	public void setDynParamMapId(int dynParamMapId) {
		this.dynParamMapId = dynParamMapId;
	}
	public int getNodeValAdapterReqId() {
		return nodeValAdapterReqId;
	}
	public void setNodeValAdapterReqId(int nodeValAdapterReqId) {
		this.nodeValAdapterReqId = nodeValAdapterReqId;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	public String getParamSeq() {
		return paramSeq;
	}
	public void setParamSeq(String paramSeq) {
		this.paramSeq = paramSeq;
	}
	public String getParamBound() {
		return paramBound;
	}
	public void setParamBound(String paramBound) {
		this.paramBound = paramBound;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Timestamp getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}
	
}
