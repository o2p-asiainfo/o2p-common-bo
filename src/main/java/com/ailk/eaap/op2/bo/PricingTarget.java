package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PricingTarget implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer pricingTargetId;
	private BigDecimal prodOfferId;
	private String pricingTargetName;
	private String pricingTargetType;
	private Date createDate;
	private Date statusDate;
	private String statusCd;
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
	private List<OfferProdRelPricing> offerProdRelPricingList;

	public Integer getPricingTargetId() {
		return pricingTargetId;
	}

	public void setPricingTargetId(Integer pricingTargetId) {
		this.pricingTargetId = pricingTargetId;
	}
	public Date getCreateDate() {
		return createDate;
	}

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getPricingTargetName() {
		return pricingTargetName;
	}

	public void setPricingTargetName(String pricingTargetName) {
		this.pricingTargetName = pricingTargetName;
	}

	public String getPricingTargetType() {
		return pricingTargetType;
	}

	public void setPricingTargetType(String pricingTargetType) {
		this.pricingTargetType = pricingTargetType;
	}

	public List<OfferProdRelPricing> getOfferProdRelPricingList() {
		return offerProdRelPricingList;
	}

	public void setOfferProdRelPricingList(
			List<OfferProdRelPricing> offerProdRelPricingList) {
		this.offerProdRelPricingList = offerProdRelPricingList;
	}

}
