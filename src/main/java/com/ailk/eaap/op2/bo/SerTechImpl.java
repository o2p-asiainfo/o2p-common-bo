package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class SerTechImpl implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer serTechImplId;
	private Integer serviceId;
	private Integer techImplId;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private TechImpl techImpl;
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
	public void setSerTechImplId(Integer serTechImplId){
		this.serTechImplId=serTechImplId;
	}
	public Integer getSerTechImplId(){
		return this.serTechImplId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setTechImplId(Integer techImplId){
		this.techImplId=techImplId;
	}
	public Integer getTechImplId(){
		return this.techImplId;
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
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public TechImpl getTechImpl() {
		return techImpl;
	}
	public void setTechImpl(TechImpl techImpl) {
		this.techImpl = techImpl;
	}
}
