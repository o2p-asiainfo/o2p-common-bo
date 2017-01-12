package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProductPp implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer productPpId;
	private String productCode;
	private Integer pricePlanId;
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

	public void setProductPpId(Integer productPpId){
		this.productPpId=productPpId;
	}
	public Integer getProductPpId(){
		return this.productPpId;
	}
	public void setProductCode(String productCode){
		this.productCode=productCode;
	}
	public String getProductCode(){
		return this.productCode;
	}
	public void setPricePlanId(Integer pricePlanId){
		this.pricePlanId=pricePlanId;
	}
	public Integer getPricePlanId(){
		return this.pricePlanId;
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
