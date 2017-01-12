package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class FtpMoveDire implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ftpMoveDireId;
	private String dstComponentId;
	private Integer serviceId;
	private String moveType;
	private Date createTime;
	private String state;
	private Date stateTime;
	private String moveDesc;
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
	public void setFtpMoveDireId(Integer ftpMoveDireId){
		this.ftpMoveDireId=ftpMoveDireId;
	}
	public Integer getFtpMoveDireId(){
		return this.ftpMoveDireId;
	}
	public void setDstComponentId(String dstComponentId){
		this.dstComponentId=dstComponentId;
	}
	public String getDstComponentId(){
		return this.dstComponentId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setMoveType(String moveType){
		this.moveType=moveType;
	}
	public String getMoveType(){
		return this.moveType;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setStateTime(Date stateTime){
		this.stateTime=stateTime;
	}
	public Date getStateTime(){
		return this.stateTime;
	}
	public void setMoveDesc(String moveDesc){
		this.moveDesc=moveDesc;
	}
	public String getMoveDesc(){
		return this.moveDesc;
	}
}
