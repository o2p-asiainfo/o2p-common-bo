package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProcModeInstAttr implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeInstAttrId;
	private Integer procModeInstId;
	private Integer procModeAttrId;
	private String procModeInstAttrValue;
	private Integer procModeValueId;
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
	public void setProcModeInstAttrId(Integer procModeInstAttrId){
		this.procModeInstAttrId=procModeInstAttrId;
	}
	public Integer getProcModeInstAttrId(){
		return this.procModeInstAttrId;
	}
	public void setProcModeInstId(Integer procModeInstId){
		this.procModeInstId=procModeInstId;
	}
	public Integer getProcModeInstId(){
		return this.procModeInstId;
	}
	public void setProcModeAttrId(Integer procModeAttrId){
		this.procModeAttrId=procModeAttrId;
	}
	public Integer getProcModeAttrId(){
		return this.procModeAttrId;
	}
	public void setProcModeInstAttrValue(String procModeInstAttrValue){
		this.procModeInstAttrValue=procModeInstAttrValue;
	}
	public String getProcModeInstAttrValue(){
		return this.procModeInstAttrValue;
	}
	public void setProcModeValueId(Integer procModeValueId){
		this.procModeValueId=procModeValueId;
	}
	public Integer getProcModeValueId(){
		return this.procModeValueId;
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
