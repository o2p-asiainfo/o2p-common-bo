package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
public class ValueAddedProdInfo implements Serializable{
private static final long serialVersionUID = 1L;
	private BigDecimal productId;
	private String systemCode;
	private String subOption;
	private Date createDate;
	private Integer serviceId;
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

	public void setSystemCode(String systemCode){
		this.systemCode=systemCode;
	}
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public String getSystemCode(){
		return this.systemCode;
	}
	public void setSubOption(String subOption){
		this.subOption=subOption;
	}
	public String getSubOption(){
		return this.subOption;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
}
