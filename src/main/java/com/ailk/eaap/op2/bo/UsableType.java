package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class UsableType implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer utCd;
	private String utName;
	private String utDesc;
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

	public void setUtCd(Integer utCd){
		this.utCd=utCd;
	}
	public Integer getUtCd(){
		return this.utCd;
	}
	public void setUtName(String utName){
		this.utName=utName;
	}
	public String getUtName(){
		return this.utName;
	}
	public void setUtDesc(String utDesc){
		this.utDesc=utDesc;
	}
	public String getUtDesc(){
		return this.utDesc;
	}
}
