package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class BaseOfferAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//套餐id
	private String offerId; 
	//套餐名称
	private String offerName;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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
	

	
	
}
