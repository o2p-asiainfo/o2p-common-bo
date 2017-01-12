package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class OauthType implements Serializable{
private static final long serialVersionUID = 1L;
	private String oauthTypeCd;
	private String oauthTypeName;
	private String oauthTypeDesc;
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
	public void setOauthTypeCd(String oauthTypeCd){
		this.oauthTypeCd=oauthTypeCd;
	}
	public String getOauthTypeCd(){
		return this.oauthTypeCd;
	}
	public void setOauthTypeName(String oauthTypeName){
		this.oauthTypeName=oauthTypeName;
	}
	public String getOauthTypeName(){
		return this.oauthTypeName;
	}
	public void setOauthTypeDesc(String oauthTypeDesc){
		this.oauthTypeDesc=oauthTypeDesc;
	}
	public String getOauthTypeDesc(){
		return this.oauthTypeDesc;
	}
}
