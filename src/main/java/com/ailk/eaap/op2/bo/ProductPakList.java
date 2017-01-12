package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProductPakList implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer proPakList;
	private String productCode;
	private String proPakCode;
	private String state;
	private Date createTime;
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
	public void setProPakList(Integer proPakList){
		this.proPakList=proPakList;
	}
	public Integer getProPakList(){
		return this.proPakList;
	}
	public void setProductCode(String productCode){
		this.productCode=productCode;
	}
	public String getProductCode(){
		return this.productCode;
	}
	public void setProPakCode(String proPakCode){
		this.proPakCode=proPakCode;
	}
	public String getProPakCode(){
		return this.proPakCode;
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
}
