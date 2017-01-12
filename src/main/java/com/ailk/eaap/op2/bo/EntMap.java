package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class EntMap extends BaseClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -428709265674219153L;
	private String entMapId;
	private String entId;
	private String entType;
	private String srcEntId;
	private String srcEntType;
	private String srcCode;
	private Integer tenantId;
	public String getEntMapId() {
		return entMapId;
	}
	public void setEntMapId(String entMapId) {
		this.entMapId = entMapId;
	}
	public String getEntId() {
		return entId;
	}
	public void setEntId(String entId) {
		this.entId = entId;
	}
	public String getEntType() {
		return entType;
	}
	public void setEntType(String entType) {
		this.entType = entType;
	}
	public String getSrcEntId() {
		return srcEntId;
	}
	public void setSrcEntId(String srcEntId) {
		this.srcEntId = srcEntId;
	}
	public String getSrcEntType() {
		return srcEntType;
	}
	public void setSrcEntType(String srcEntType) {
		this.srcEntType = srcEntType;
	}
	public String getSrcCode() {
		return srcCode;
	}
	public void setSrcCode(String srcCode) {
		this.srcCode = srcCode;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
