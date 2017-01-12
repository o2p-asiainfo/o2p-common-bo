package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class DocContract implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer docContrId;
	private Integer contractDocId;
	private Integer contractVersionId;
	private String descriptor;
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
	public void setDocContrId(Integer docContrId){
		this.docContrId=docContrId;
	}
	public Integer getDocContrId(){
		return this.docContrId;
	}
	public void setContractDocId(Integer contractDocId){
		this.contractDocId=contractDocId;
	}
	public Integer getContractDocId(){
		return this.contractDocId;
	}
	public void setContractVersionId(Integer contractVersionId){
		this.contractVersionId=contractVersionId;
	}
	public Integer getContractVersionId(){
		return this.contractVersionId;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
}
