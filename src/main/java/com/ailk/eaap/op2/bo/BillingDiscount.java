package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillingDiscount implements Serializable {
	private static final long serialVersionUID = 1L;

	private ComponentPrice componentPrice;
	//定价计划ID
	private Integer priceId;
	private String priceName;
	private Long eligibleItem;
	private Long targetItem;
	private Integer billingPriority;
	//优惠类型
	private String promType;
	//货币单位类型
	public Integer currencyUnitType;
	private String maxiMum;
	private String calcType;
	private String precisionRound;
	public String description;
	public Date createDate;
	public Date version;

	private String eligibleItemName;
	private String targetItemName;
	private String taxIncluded;
	//基础资源的费率详情	
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	private List<RatingCurverDetail> discountInfoList = new ArrayList<RatingCurverDetail>();

	public String getTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public ComponentPrice getComponentPrice() {
		return componentPrice;
	}

	public void setComponentPrice(ComponentPrice componentPrice) {
		this.componentPrice = componentPrice;
	}

	public Integer getPriceId() {
		return priceId;
	}

	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}

	public String getPriceName() {
		return priceName;
	}

	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}

	public Long getEligibleItem() {
		return eligibleItem;
	}

	public void setEligibleItem(Long eligibleItem) {
		this.eligibleItem = eligibleItem;
	}

	public Long getTargetItem() {
		return targetItem;
	}

	public void setTargetItem(Long targetItem) {
		this.targetItem = targetItem;
	}

	public Integer getBillingPriority() {
		return billingPriority;
	}

	public void setBillingPriority(Integer billingPriority) {
		this.billingPriority = billingPriority;
	}

	public String getPromType() {
		return promType;
	}

	public void setPromType(String promType) {
		this.promType = promType;
	}

	public Integer getCurrencyUnitType() {
		return currencyUnitType;
	}

	public void setCurrencyUnitType(Integer currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
	}

	public String getMaxiMum() {
		return maxiMum;
	}

	public void setMaxiMum(String maxiMum) {
		this.maxiMum = maxiMum;
	}

	public String getCalcType() {
		return calcType;
	}

	public void setCalcType(String calcType) {
		this.calcType = calcType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public String getEligibleItemName() {
		return eligibleItemName;
	}

	public void setEligibleItemName(String eligibleItemName) {
		this.eligibleItemName = eligibleItemName;
	}

	public String getTargetItemName() {
		return targetItemName;
	}

	public void setTargetItemName(String targetItemName) {
		this.targetItemName = targetItemName;
	}

	public String getPrecisionRound() {
		return precisionRound;
	}

	public void setPrecisionRound(String precisionRound) {
		this.precisionRound = precisionRound;
	}

	public List<RatingCurverDetail> getDiscountInfoList() {
		return discountInfoList;
	}

	public void setDiscountInfoList(List<RatingCurverDetail> discountInfoList) {
		this.discountInfoList = discountInfoList;
	}

}
