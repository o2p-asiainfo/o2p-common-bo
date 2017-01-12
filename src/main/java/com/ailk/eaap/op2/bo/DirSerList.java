package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class DirSerList implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer dirSerListId;
	private Integer serviceId;
	private Integer dirId;
	private String state;
	private Date createTime;
	private Date lastestTime;

	private Integer tenantId;


	
	public void setDirSerListId(Integer dirSerListId){
		this.dirSerListId=dirSerListId;
	}
	public Integer getDirSerListId(){
		return this.dirSerListId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setDirId(Integer dirId){
		this.dirId=dirId;
	}
	public Integer getDirId(){
		return this.dirId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
