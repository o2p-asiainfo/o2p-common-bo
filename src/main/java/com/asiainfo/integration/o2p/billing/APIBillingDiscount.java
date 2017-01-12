/** 
 * Project Name:o2p-common-bo 
 * File Name:APIBillingDiscount.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月29日上午9:30:06 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:APIBillingDiscount 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月29日 上午9:30:06 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
@SuppressWarnings("serial")
public class APIBillingDiscount extends APIComponentPrice {
	// 定价计划ID
	private int priceId;
	// 货币单位类型
	private int currencyUnitType;
	// 优惠类型
	private byte fromType;
	//最大优惠金额
	private Integer maxiMum;
	//周期类型
	private String calcType;
	// 基础资源的费率详情
	private List<APIBillingDiscountInfo> discountInfoList = new ArrayList<APIBillingDiscountInfo>(
			20);

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public int getCurrencyUnitType() {
		return currencyUnitType;
	}

	public void setCurrencyUnitType(int currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
	}

	public byte getFromType() {
		return fromType;
	}

	public void setFromType(byte fromType) {
		this.fromType = fromType;
	}

	public Integer getMaxiMum() {
		return maxiMum;
	}

	public void setMaxiMum(Integer maxiMum) {
		this.maxiMum = maxiMum;
	}

	public String getCalcType() {
		return calcType;
	}

	public void setCalcType(String calcType) {
		this.calcType = calcType;
	}
	
	public List<APIBillingDiscountInfo> getDiscountInfoList() {
		return discountInfoList;
	}

	public void setDiscountInfoList(
			List<APIBillingDiscountInfo> discountInfoList) {
		this.discountInfoList = discountInfoList;
	}

}
