package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AuthObjAttr implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer authObjAttrId;
	private Integer attrSpecId;
	private Integer authId;
	private String  attrValue;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getAuthObjAttrId() {
		return authObjAttrId;
	}
	public void setAuthObjAttrId(Integer authObjAttrId) {
		this.authObjAttrId = authObjAttrId;
	}
	public Integer getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(Integer attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public Integer getAuthId() {
		return authId;
	}
	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	
 
}
