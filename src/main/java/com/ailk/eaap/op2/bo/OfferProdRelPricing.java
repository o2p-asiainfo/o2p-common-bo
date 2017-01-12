package com.ailk.eaap.op2.bo;

import java.util.Date;
import java.io.Serializable;

public class OfferProdRelPricing implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer offerProdRelPricingId;
	private Integer offerProdRelaId;
	private int pricingTargetId;
	private Integer pricingInfoId;// 定价对象ID
	private Date createDate;
	private String statusCd;
	private Date statusDate;
	private OfferProdRel offerProdRel;
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
	public void setOfferProdRelPricingId(Integer offerProdRelPricingId) {
		this.offerProdRelPricingId = offerProdRelPricingId;
	}

	public Integer getOfferProdRelPricingId() {
		return this.offerProdRelPricingId;
	}

	public void setOfferProdRelaId(Integer offerProdRelaId) {
		this.offerProdRelaId = offerProdRelaId;
	}

	public Integer getOfferProdRelaId() {
		return this.offerProdRelaId;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public Integer getPricingInfoId() {
		return pricingInfoId;
	}

	public void setPricingInfoId(Integer pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}

	public int getPricingTargetId() {
		return pricingTargetId;
	}

	public void setPricingTargetId(int pricingTargetId) {
		this.pricingTargetId = pricingTargetId;
	}

	public OfferProdRel getOfferProdRel() {
		return offerProdRel;
	}

	public void setOfferProdRel(OfferProdRel offerProdRel) {
		this.offerProdRel = offerProdRel;
	}

}
