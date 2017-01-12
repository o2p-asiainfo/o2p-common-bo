package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ProcModeAttrValue implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeValueId;
	private Integer procModeAttrId;
	private Integer attrValueId;
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
	public void setProcModeValueId(Integer procModeValueId){
		this.procModeValueId=procModeValueId;
	}
	public Integer getProcModeValueId(){
		return this.procModeValueId;
	}
	public void setProcModeAttrId(Integer procModeAttrId){
		this.procModeAttrId=procModeAttrId;
	}
	public Integer getProcModeAttrId(){
		return this.procModeAttrId;
	}
	public void setAttrValueId(Integer attrValueId){
		this.attrValueId=attrValueId;
	}
	public Integer getAttrValueId(){
		return this.attrValueId;
	}
}
