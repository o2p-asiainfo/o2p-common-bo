package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AppType implements Serializable{
private static final long serialVersionUID = 1L;
	private String appTypeCd;
	private String appTypeName;
	private String appTypeDesc;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public void setAppTypeCd(String appTypeCd){
		this.appTypeCd=appTypeCd;
	}
	public String getAppTypeCd(){
		return this.appTypeCd;
	}
	public void setAppTypeName(String appTypeName){
		this.appTypeName=appTypeName;
	}
	public String getAppTypeName(){
		return this.appTypeName;
	}
	public void setAppTypeDesc(String appTypeDesc){
		this.appTypeDesc=appTypeDesc;
	}
	public String getAppTypeDesc(){
		return this.appTypeDesc;
	}
}
