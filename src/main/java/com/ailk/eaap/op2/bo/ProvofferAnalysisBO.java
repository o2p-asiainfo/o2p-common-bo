package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class ProvofferAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String offerSort;
	private String queryTime;
	//省份id
	private String provCode; 
	//省份名称
	private String provName;
	//套餐数
	private int totalOffer;
	//净增数
	private int growOffer;
	//净增同比率
	private Float growTbOfferRate;
	//净增环比率
	private Float growHbOfferRate;
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
	
	public String getOfferSort() {
		return offerSort;
	}
	public void setOfferSort(String offerSort) {
		this.offerSort = offerSort;
	}
	public String getQueryTime() {
		return queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
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
	

	public int getTotalOffer() {
		return totalOffer;
	}
	public void setTotalOffer(int totalOffer) {
		this.totalOffer = totalOffer;
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
