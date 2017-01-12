package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
public class OfferCatalogLocation implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer offerCatlgLocId;
	private BigDecimal prodOfferId;
	private Integer dirId;
	private Integer catalogItemId;
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
	public Integer getOfferCatlgLocId() {
		return offerCatlgLocId;
	}
	public void setOfferCatlgLocId(Integer offerCatlgLocId) {
		this.offerCatlgLocId = offerCatlgLocId;
	}
	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}
	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}
	public Integer getDirId() {
		return dirId;
	}
	public void setDirId(Integer dirId) {
		this.dirId = dirId;
	}
	public Integer getCatalogItemId() {
		return catalogItemId;
	}
	public void setCatalogItemId(Integer catalogItemId) {
		this.catalogItemId = catalogItemId;
	}
}
