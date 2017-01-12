package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class OrgType implements Serializable{
private static final long serialVersionUID = 1L;
	private String orgTypeCode;
	private String orgTypeName;
	private String orgTypeDesc;
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

	public void setOrgTypeCode(String orgTypeCode){
		this.orgTypeCode=orgTypeCode;
	}
	public String getOrgTypeCode(){
		return this.orgTypeCode;
	}
	public void setOrgTypeName(String orgTypeName){
		this.orgTypeName=orgTypeName;
	}
	public String getOrgTypeName(){
		return this.orgTypeName;
	}
	public void setOrgTypeDesc(String orgTypeDesc){
		this.orgTypeDesc=orgTypeDesc;
	}
	public String getOrgTypeDesc(){
		return this.orgTypeDesc;
	}
}
