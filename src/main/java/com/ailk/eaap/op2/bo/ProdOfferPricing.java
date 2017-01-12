package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ProdOfferPricing implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer prodOfferPricingId;
	private BigDecimal prodOfferId;
	private Integer pricingInfoId;
	private Date createDate;
	private String statusCd;
	private Date statusDate;
	private String pricingType;
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
	// 定价对象编码
	private Integer pricingTargetId;
	// 定价计划
	private List<PricePlan> pricePlanList;
	// 定价对象
	private PricingTarget pricingTarget;

	public PricingTarget getPricingTarget() {
		return pricingTarget;
	}

	public void setPricingTarget(PricingTarget pricingTarget) {
		this.pricingTarget = pricingTarget;
	}

	public List<PricePlan> getPricePlanList() {
		return pricePlanList;
	}

	public void setPricePlanList(List<PricePlan> pricePlanList) {
		this.pricePlanList = pricePlanList;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public void setProdOfferPricingId(Integer prodOfferPricingId) {
		this.prodOfferPricingId = prodOfferPricingId;
	}

	public Integer getProdOfferPricingId() {
		return this.prodOfferPricingId;
	}

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public void setPricingInfoId(Integer pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}

	public Integer getPricingInfoId() {
		return this.pricingInfoId;
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

	public Integer getPricingTargetId() {
		return pricingTargetId;
	}

	public void setPricingTargetId(Integer pricingTargetId) {
		this.pricingTargetId = pricingTargetId;
	}

}
