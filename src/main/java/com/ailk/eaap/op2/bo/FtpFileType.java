package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class FtpFileType implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ftpFileTypeId;
	private String fileTypeCd;
	private Integer serviceId;
	private String reqrsp;
	private Date createTime;
	private String fileDesc;
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
	public void setFtpFileTypeId(Integer ftpFileTypeId){
		this.ftpFileTypeId=ftpFileTypeId;
	}
	public Integer getFtpFileTypeId(){
		return this.ftpFileTypeId;
	}
	public void setFileTypeCd(String fileTypeCd){
		this.fileTypeCd=fileTypeCd;
	}
	public String getFileTypeCd(){
		return this.fileTypeCd;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setReqrsp(String reqrsp){
		this.reqrsp=reqrsp;
	}
	public String getReqrsp(){
		return this.reqrsp;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setFileDesc(String fileDesc){
		this.fileDesc=fileDesc;
	}
	public String getFileDesc(){
		return this.fileDesc;
	}
}
