package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class PricingPlanClassifyRel implements Serializable{
  private static final long serialVersionUID = 1L;
  private String pricingPlanClassifyRelId;
  private String pricingInfoId;
  private String pricingClassify;
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
public String getPricingPlanClassifyRelId() {
	return pricingPlanClassifyRelId;
}
public void setPricingPlanClassifyRelId(String pricingPlanClassifyRelId) {
	this.pricingPlanClassifyRelId = pricingPlanClassifyRelId;
}
public String getPricingInfoId() {
	return pricingInfoId;
}
public void setPricingInfoId(String pricingInfoId) {
	this.pricingInfoId = pricingInfoId;
}
public String getPricingClassify() {
	return pricingClassify;
}
public void setPricingClassify(String pricingClassify) {
	this.pricingClassify = pricingClassify;
}
  
  
}
