package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProcMode implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer procModeId;
	private String procModeName;
	private String procModeCode;
	private String procModeDesc;
	private String procModeType;
	private Integer versionNumber;
	private Date createDate;
	private String statusCd;
	private Date statusDate;
	private String format;
	private String implSysId;
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

	public void setProcModeId(Integer procModeId){
		this.procModeId=procModeId;
	}
	public Integer getProcModeId(){
		return this.procModeId;
	}
	public void setProcModeName(String procModeName){
		this.procModeName=procModeName;
	}
	public String getProcModeName(){
		return this.procModeName;
	}
	public void setProcModeCode(String procModeCode){
		this.procModeCode=procModeCode;
	}
	public String getProcModeCode(){
		return this.procModeCode;
	}
	public void setProcModeDesc(String procModeDesc){
		this.procModeDesc=procModeDesc;
	}
	public String getProcModeDesc(){
		return this.procModeDesc;
	}
	public void setProcModeType(String procModeType){
		this.procModeType=procModeType;
	}
	public String getProcModeType(){
		return this.procModeType;
	}
	public void setVersionNumber(Integer versionNumber){
		this.versionNumber=versionNumber;
	}
	public Integer getVersionNumber(){
		return this.versionNumber;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setStatusCd(String statusCd){
		this.statusCd=statusCd;
	}
	public String getStatusCd(){
		return this.statusCd;
	}
	public void setStatusDate(Date statusDate){
		this.statusDate=statusDate;
	}
	public Date getStatusDate(){
		return this.statusDate;
	}
	public void setFormat(String format){
		this.format=format;
	}
	public String getFormat(){
		return this.format;
	}
	public void setImplSysId(String implSysId){
		this.implSysId=implSysId;
	}
	public String getImplSysId(){
		return this.implSysId;
	}
}
