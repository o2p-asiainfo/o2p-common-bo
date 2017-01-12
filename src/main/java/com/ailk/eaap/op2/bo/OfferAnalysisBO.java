package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class OfferAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//套餐id
	private String offerId;
	//套餐名称
	private String offerName;
	//省份id
	private String provCode; 
	//省份名称
	private String provName;
	//套餐用户数
	private int totalOfferUser;
	//套餐新增数
	private int totalAddUser;
	//套餐退订数
	private int totalOffUser;
	//净增数
	private int growOffer;
	//新增数
	private int growAddUser;
	//退订数
	private int growOffUser;
	//净增同比率
	private Float growTbOfferRate;
	//净增环比率
	private Float growHbOfferRate;
	//排行
	private int offerSort;
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
	
	public int getGrowAddUser() {
		return growAddUser;
	}
	public void setGrowAddUser(int growAddUser) {
		this.growAddUser = growAddUser;
	}
	public int getGrowOffUser() {
		return growOffUser;
	}
	public void setGrowOffUser(int growOffUser) {
		this.growOffUser = growOffUser;
	}
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
	public int getOfferSort() {
		return offerSort;
	}
	public void setOfferSort(int offerSort) {
		this.offerSort = offerSort;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public int getTotalOfferUser() {
		return totalOfferUser;
	}
	public void setTotalOfferUser(int totalOfferUser) {
		this.totalOfferUser = totalOfferUser;
	}
	public int getGrowOffer() {
		return growOffer;
	}
	public void setGrowOffer(int growOffer) {
		this.growOffer = growOffer;
	}
	public Float getGrowTbOfferRate() {
		return growTbOfferRate;
	}
	public void setGrowTbOfferRate(Float growTbOfferRate) {
		this.growTbOfferRate = growTbOfferRate;
	}
	public Float getGrowHbOfferRate() {
		return growHbOfferRate;
	}
	public void setGrowHbOfferRate(Float growHbOfferRate) {
		this.growHbOfferRate = growHbOfferRate;
	}
	public int getTotalAddUser() {
		return totalAddUser;
	}
	public void setTotalAddUser(int totalAddUser) {
		this.totalAddUser = totalAddUser;
	}
	public int getTotalOffUser() {
		return totalOffUser;
	}
	public void setTotalOffUser(int totalOffUser) {
		this.totalOffUser = totalOffUser;
	}
	
	
	
	
	
}
