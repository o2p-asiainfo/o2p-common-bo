package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class CertType implements Serializable{
private static final long serialVersionUID = 1L;
	private String certTypeCode;
	private String certTypeName;
	private String certTypeDesc;
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

	public void setCertTypeCode(String certTypeCode){
		this.certTypeCode=certTypeCode;
	}
	public String getCertTypeCode(){
		return this.certTypeCode;
	}
	public void setCertTypeName(String certTypeName){
		this.certTypeName=certTypeName;
	}
	public String getCertTypeName(){
		return this.certTypeName;
	}
	public void setCertTypeDesc(String certTypeDesc){
		this.certTypeDesc=certTypeDesc;
	}
	public String getCertTypeDesc(){
		return this.certTypeDesc;
	}
}
