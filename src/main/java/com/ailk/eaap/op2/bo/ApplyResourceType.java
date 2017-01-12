package com.ailk.eaap.op2.bo;

public class ApplyResourceType implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer resTypeId;
	private Integer applyTypeId;
	private String resTypeName;
	private String resTypeDesc;
	private Integer upTypeId;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getResTypeId() {
		return resTypeId;
	}
	public void setResTypeId(Integer resTypeId) {
		this.resTypeId = resTypeId;
	}
	public Integer getApplyTypeId() {
		return applyTypeId;
	}
	public void setApplyTypeId(Integer applyTypeId) {
		this.applyTypeId = applyTypeId;
	}
	public String getResTypeName() {
		return resTypeName;
	}
	public void setResTypeName(String resTypeName) {
		this.resTypeName = resTypeName;
	}
	public String getResTypeDesc() {
		return resTypeDesc;
	}
	public void setResTypeDesc(String resTypeDesc) {
		this.resTypeDesc = resTypeDesc;
	}
	public Integer getUpTypeId() {
		return upTypeId;
	}
	public void setUpTypeId(Integer upTypeId) {
		this.upTypeId = upTypeId;
	}
	
}
