package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class FtpDir implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer dirId;
	private Integer serviceId;
	private String componentId;
	private String dirType;
	private String reqrsp;
	private String dirPath;
	private Date createTime;
	private String description;
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
	public void setDirId(Integer dirId){
		this.dirId=dirId;
	}
	public Integer getDirId(){
		return this.dirId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setComponentId(String componentId){
		this.componentId=componentId;
	}
	public String getComponentId(){
		return this.componentId;
	}
	public void setDirType(String dirType){
		this.dirType=dirType;
	}
	public String getDirType(){
		return this.dirType;
	}
	public void setReqrsp(String reqrsp){
		this.reqrsp=reqrsp;
	}
	public String getReqrsp(){
		return this.reqrsp;
	}
	public void setDirPath(String dirPath){
		this.dirPath=dirPath;
	}
	public String getDirPath(){
		return this.dirPath;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setDescription(String description){
		this.description=description;
	}
	public String getDescription(){
		return this.description;
	}
}
