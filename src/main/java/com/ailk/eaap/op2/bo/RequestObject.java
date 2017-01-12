package com.ailk.eaap.op2.bo;

public class RequestObject implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private Integer requestObjectId;
	private String requestTemplateInstId;
	private String objectType;
	private String objectCode;
	private String objectName;
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
	public Integer getRequestObjectId() {
		return requestObjectId;
	}
	public void setRequestObjectId(Integer requestObjectId) {
		this.requestObjectId = requestObjectId;
	}
	public String getRequestTemplateInstId() {
		return requestTemplateInstId;
	}
	public void setRequestTemplateInstId(String requestTemplateInstId) {
		this.requestTemplateInstId = requestTemplateInstId;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public String getObjectCode() {
		return objectCode;
	}
	public void setObjectCode(String objectCode) {
		this.objectCode = objectCode;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
}
