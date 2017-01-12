/** 
 * Project Name:o2p-common-bo 
 * File Name:APIRecurringFee.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:28:15 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;


/**
 * ClassName:APIRecurringFee固定费 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:28:15 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class APIRecurringFee extends APIComponentPrice {
	private static final long serialVersionUID = 1L;

	// 定价计划ID
	private int priceId;
	// 固定资源费用
	private long currencyUnitValue;
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public long getCurrencyUnitValue() {
		return currencyUnitValue;
	}
	public void setCurrencyUnitValue(long currencyUnitValue) {
		this.currencyUnitValue = currencyUnitValue;
	}
	
}
