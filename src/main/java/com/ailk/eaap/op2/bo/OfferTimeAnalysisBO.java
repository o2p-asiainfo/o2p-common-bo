package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class OfferTimeAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//排行
	private int offerSort;
	//时间
	private String queryTime;
	//套餐用户数
	private int totalOfferUser;
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
	//套餐新增数
	private int totalAddUser;
	//套餐退订数
	private int totalOffUser;
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
	public int getOfferSort() {
		return offerSort;
	}
	public void setOfferSort(int offerSort) {
		this.offerSort = offerSort;
	}
	public String getQueryTime() {
		return queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
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
	
	
	
	
	
}
