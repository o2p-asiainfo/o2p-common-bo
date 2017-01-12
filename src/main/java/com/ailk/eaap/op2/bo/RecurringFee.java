/** 
 * Project Name:o2p-common-bo 
 * File Name:APIRecurringFee.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月11日下午5:36:06 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;

/**
 * ClassName:APIRecurringFee 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月11日 下午5:36:06 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class RecurringFee implements Serializable {
	private static final long serialVersionUID = 1L;

	private int priceId;
	private String priceName;
	private String taxIncluded;
	private int billingPriority;
	private int currencyUnitType;
	private int currencyUnitValue;
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
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public String getTaxIncluded() {
		return taxIncluded;
	}
	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	public int getBillingPriority() {
		return billingPriority;
	}
	public void setBillingPriority(int billingPriority) {
		this.billingPriority = billingPriority;
	}
	public int getCurrencyUnitType() {
		return currencyUnitType;
	}
	public void setCurrencyUnitType(int currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
	}
	public int getCurrencyUnitValue() {
		return currencyUnitValue;
	}
	public void setCurrencyUnitValue(int currencyUnitValue) {
		this.currencyUnitValue = currencyUnitValue;
	}

}
