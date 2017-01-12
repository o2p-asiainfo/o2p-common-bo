package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProductPackage implements Serializable{
private static final long serialVersionUID = 1L;
	private String proPakCode;
	private String proPakName;
	private String proPakDesc;
	private Date createTime;
	private String state;
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

	public void setProPakCode(String proPakCode){
		this.proPakCode=proPakCode;
	}
	public String getProPakCode(){
		return this.proPakCode;
	}
	public void setProPakName(String proPakName){
		this.proPakName=proPakName;
	}
	public String getProPakName(){
		return this.proPakName;
	}
	public void setProPakDesc(String proPakDesc){
		this.proPakDesc=proPakDesc;
	}
	public String getProPakDesc(){
		return this.proPakDesc;
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
}
