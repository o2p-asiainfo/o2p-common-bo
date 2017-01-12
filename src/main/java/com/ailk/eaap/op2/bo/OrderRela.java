package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class OrderRela implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer orderRelaId;
	private String proPakCode;
	private Integer orgId;
	private Date orderTime;
	private Date effTime;
	private Date expTime;
	private Date unorderTime;
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
	public void setOrderRelaId(Integer orderRelaId){
		this.orderRelaId=orderRelaId;
	}
	public Integer getOrderRelaId(){
		return this.orderRelaId;
	}
	public void setProPakCode(String proPakCode){
		this.proPakCode=proPakCode;
	}
	public String getProPakCode(){
		return this.proPakCode;
	}
	public void setOrgId(Integer orgId){
		this.orgId=orgId;
	}
	public Integer getOrgId(){
		return this.orgId;
	}
	public void setOrderTime(Date orderTime){
		this.orderTime=orderTime;
	}
	public Date getOrderTime(){
		return this.orderTime;
	}
	public void setEffTime(Date effTime){
		this.effTime=effTime;
	}
	public Date getEffTime(){
		return this.effTime;
	}
	public void setExpTime(Date expTime){
		this.expTime=expTime;
	}
	public Date getExpTime(){
		return this.expTime;
	}
	public void setUnorderTime(Date unorderTime){
		this.unorderTime=unorderTime;
	}
	public Date getUnorderTime(){
		return this.unorderTime;
	}
}
