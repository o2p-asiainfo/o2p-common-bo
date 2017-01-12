/** 
 * Project Name:o2p-common-bo 
 * File Name:APIBillingDiscountInfo.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:28:46 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;

/**
 * ClassName:APIBillingDiscountInfo 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:28:46 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class APIBillingDiscountInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	// 定价计划ID
	private int priceId;
	// 本段起始值
	private long startValue;
	// 本段结束值
	private long endValue;
	// 本段费率值
	private long rateValue;
	// 本段基础值
	private long baseValue;
	// 本段折扣分子
	private long numberator;
	// 本段折扣分母
	private long denominator;

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	
	public long getStartValue() {
		return startValue;
	}

	public void setStartValue(long startValue) {
		this.startValue = startValue;
	}

	public long getEndValue() {
		return endValue;
	}

	public void setEndValue(long endValue) {
		this.endValue = endValue;
	}

	public long getRateValue() {
		return rateValue;
	}

	public void setRateValue(long rateValue) {
		this.rateValue = rateValue;
	}

	public long getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(long baseValue) {
		this.baseValue = baseValue;
	}

	public long getNumberator() {
		return numberator;
	}

	public void setNumberator(long numberator) {
		this.numberator = numberator;
	}

	public long getDenominator() {
		return denominator;
	}

	public void setDenominator(long denominator) {
		this.denominator = denominator;
	}

}
