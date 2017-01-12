package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ProcModeAttr implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeAttrId;
	private Integer procModeId;
	private Integer attrSpecId;
	private Integer procModeSeq;
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
	public void setProcModeAttrId(Integer procModeAttrId){
		this.procModeAttrId=procModeAttrId;
	}
	public Integer getProcModeAttrId(){
		return this.procModeAttrId;
	}
	public void setProcModeId(Integer procModeId){
		this.procModeId=procModeId;
	}
	public Integer getProcModeId(){
		return this.procModeId;
	}
	public void setAttrSpecId(Integer attrSpecId){
		this.attrSpecId=attrSpecId;
	}
	public Integer getAttrSpecId(){
		return this.attrSpecId;
	}
	public void setProcModeSeq(Integer procModeSeq){
		this.procModeSeq=procModeSeq;
	}
	public Integer getProcModeSeq(){
		return this.procModeSeq;
	}
}
