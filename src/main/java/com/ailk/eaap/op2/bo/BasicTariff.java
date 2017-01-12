package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class BasicTariff implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<RatingCurverDetail> ratingCurverDetailList;

	private Integer priceId;
	private String priceName;
	private String taxIncluded;
	private Integer baseItemType;
	private Integer ratingUnitVal = 1;
	private Integer ratingUnitType;
	private String precisionRound;
	private Integer currencyUnitType;
	private Integer rateType;
	private Date createDate;
	private Date version;
	private String itemName;
	private String baseQosType;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getTaxIncluded() {
		return taxIncluded;
	}

	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}

	public Integer getCurrencyUnitType() {
		return currencyUnitType;
	}

	public void setCurrencyUnitType(Integer currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
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

	public Integer getBaseItemType() {
		return baseItemType;
	}

	public void setBaseItemType(Integer baseItemType) {
		this.baseItemType = baseItemType;
	}

	public Integer getRateType() {
		return rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
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

	public Integer getRatingUnitVal() {
		return ratingUnitVal;
	}

	public void setRatingUnitVal(Integer ratingUnitVal) {
		this.ratingUnitVal = ratingUnitVal;
	}

	public Integer getRatingUnitType() {
		return ratingUnitType;
	}

	public void setRatingUnitType(Integer ratingUnitType) {
		this.ratingUnitType = ratingUnitType;
	}

	public List<RatingCurverDetail> getRatingCurverDetailList() {
		return ratingCurverDetailList;
	}

	public void setRatingCurverDetailList(
			List<RatingCurverDetail> ratingCurverDetailList) {
		this.ratingCurverDetailList = ratingCurverDetailList;
	}

	public String getPrecisionRound() {
		return precisionRound;
	}

	public void setPrecisionRound(String precisionRound) {
		this.precisionRound = precisionRound;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getBaseQosType() {
		return baseQosType;
	}
	public void setBaseQosType(String baseQosType) {
		this.baseQosType = baseQosType;
	}
}
