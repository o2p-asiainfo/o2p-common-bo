package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProcModeInst implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeInstId;
	private Integer procModeId;
	private String statusCd;
	private Date createDate;
	private Date statusDate;
	private Integer parentProcModeInstId;
	private String procModeDesc;
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
	public void setProcModeInstId(Integer procModeInstId){
		this.procModeInstId=procModeInstId;
	}
	public Integer getProcModeInstId(){
		return this.procModeInstId;
	}
	public void setProcModeId(Integer procModeId){
		this.procModeId=procModeId;
	}
	public Integer getProcModeId(){
		return this.procModeId;
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
	public void setParentProcModeInstId(Integer parentProcModeInstId){
		this.parentProcModeInstId=parentProcModeInstId;
	}
	public Integer getParentProcModeInstId(){
		return this.parentProcModeInstId;
	}
	public void setProcModeDesc(String procModeDesc){
		this.procModeDesc=procModeDesc;
	}
	public String getProcModeDesc(){
		return this.procModeDesc;
	}
}
