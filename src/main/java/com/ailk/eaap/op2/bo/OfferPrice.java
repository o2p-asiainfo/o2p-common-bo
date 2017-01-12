package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class OfferPrice{
	private Integer offerPriceId;
	private ProdOfferPricing prodOfferPricing;
	private PricingPlan pricingPlan;
	private Map<String,Object> objects;
	private List<RatingCurverDetail> ratingCurverDetailList;
	private List<PricingTarget> priceTargets;
	private PricingTarget pricingTarget;
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
	public List<PricingTarget> getPriceTargets() {
		return priceTargets;
	}
	public void setPriceTargets(List<PricingTarget> priceTargets) {
		this.priceTargets = priceTargets;
	}
	public Integer getOfferPriceId() {
		return offerPriceId;
	}
	public void setOfferPriceId(Integer offerPriceId) {
		this.offerPriceId = offerPriceId;
	}
	public ProdOfferPricing getProdOfferPricing() {
		return prodOfferPricing;
	}
	public void setProdOfferPricing(ProdOfferPricing prodOfferPricing) {
		this.prodOfferPricing = prodOfferPricing;
	}
	public PricingPlan getPricingPlan() {
		return pricingPlan;
	}
	public void setPricingPlan(PricingPlan pricingPlan) {
		this.pricingPlan = pricingPlan;
	}
	public List<RatingCurverDetail> getRatingCurverDetailList() {
		return ratingCurverDetailList;
	}
	public void setRatingCurverDetailList(
			List<RatingCurverDetail> ratingCurverDetailList) {
		this.ratingCurverDetailList = ratingCurverDetailList;
	}
	public PricingTarget getPricingTarget() {
		return pricingTarget;
	}
	public void setPricingTarget(PricingTarget pricingTarget) {
		this.pricingTarget = pricingTarget;
	}
	public Map<String, Object> getObjects() {
		return objects;
	}
	public void setObjects(Map<String, Object> objects) {
		this.objects = objects;
	}
	
	
}
