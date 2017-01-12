package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
public class ProdOfferDistributor implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer prodOfferDistributorId;
	private BigDecimal prodOfferId;
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
	public Integer getProdOfferDistributorId() {
		return prodOfferDistributorId;
	}
	public void setProdOfferDistributorId(Integer prodOfferDistributorId) {
		this.prodOfferDistributorId = prodOfferDistributorId;
	}
	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}
	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
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
