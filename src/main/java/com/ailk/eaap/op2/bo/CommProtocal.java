package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class CommProtocal implements Serializable{
private static final long serialVersionUID = 1L;
	private String commProCd;
	private String commProName;
	private String commProDesc;
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

	public void setCommProCd(String commProCd){
		this.commProCd=commProCd;
	}
	public String getCommProCd(){
		return this.commProCd;
	}
	public void setCommProName(String commProName){
		this.commProName=commProName;
	}
	public String getCommProName(){
		return this.commProName;
	}
	public void setCommProDesc(String commProDesc){
		this.commProDesc=commProDesc;
	}
	public String getCommProDesc(){
		return this.commProDesc;
	}
}
