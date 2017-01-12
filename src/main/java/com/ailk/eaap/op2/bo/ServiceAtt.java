package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ServiceAtt implements Serializable{
private static final long serialVersionUID = 1L;
	private int serviceAttId;
	private int serviceId;
	private int attrSpecId;
	private String serSpecVa;
	private Date createTime;
	private Date lastestTime;
	private String state;

	private Integer tenantId;



	public void setServiceAttId(int serviceAttId){
		this.serviceAttId=serviceAttId;
	}
	public int getServiceAttId(){
		return this.serviceAttId;
	}
	public void setServiceId(int serviceId){
		this.serviceId=serviceId;
	}
	public int getServiceId(){
		return this.serviceId;
	}
	public void setAttrSpecId(int attrSpecId){
		this.attrSpecId=attrSpecId;
	}
	public int getAttrSpecId(){
		return this.attrSpecId;
	}
	public void setSerSpecVa(String serSpecVa){
		this.serSpecVa=serSpecVa;
	}
	public String getSerSpecVa(){
		return this.serSpecVa;
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
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
