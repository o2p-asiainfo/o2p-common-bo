package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProcModeInstRel implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeInstRelId;
	private Integer procModeInstAId;
	private Integer procModeInstZId;
	private String relationTypeCd;
	private String useType;
	private String statusCd;
	private Date createDate;
	private Date statusDate;
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
	public void setProcModeInstRelId(Integer procModeInstRelId){
		this.procModeInstRelId=procModeInstRelId;
	}
	public Integer getProcModeInstRelId(){
		return this.procModeInstRelId;
	}
	public void setProcModeInstAId(Integer procModeInstAId){
		this.procModeInstAId=procModeInstAId;
	}
	public Integer getProcModeInstAId(){
		return this.procModeInstAId;
	}
	public void setProcModeInstZId(Integer procModeInstZId){
		this.procModeInstZId=procModeInstZId;
	}
	public Integer getProcModeInstZId(){
		return this.procModeInstZId;
	}
	public void setRelationTypeCd(String relationTypeCd){
		this.relationTypeCd=relationTypeCd;
	}
	public String getRelationTypeCd(){
		return this.relationTypeCd;
	}
	public void setUseType(String useType){
		this.useType=useType;
	}
	public String getUseType(){
		return this.useType;
	}
	public void setStatusCd(String statusCd){
		this.statusCd=statusCd;
	}
	public String getStatusCd(){
		return this.statusCd;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setStatusDate(Date statusDate){
		this.statusDate=statusDate;
	}
	public Date getStatusDate(){
		return this.statusDate;
	}
}
