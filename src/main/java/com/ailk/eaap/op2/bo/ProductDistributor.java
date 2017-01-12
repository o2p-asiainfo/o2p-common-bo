package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class ProductDistributor implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer productDistributorId;
	private Integer productId;
	private String distributorId;
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
	public Integer getProductDistributorId() {
		return productDistributorId;
	}
	public void setProductDistributorId(Integer productDistributorId) {
		this.productDistributorId = productDistributorId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
