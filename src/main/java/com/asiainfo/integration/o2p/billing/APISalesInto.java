/** 
 * Project Name:o2p-common-bo 
 * File Name:APISalesInto.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:28:34 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;


/**
 * ClassName:APISalesInto 销售分成
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:28:34 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class APISalesInto extends APIComponentPrice {
	private static final long serialVersionUID = 1L;

	// 定价计划ID
	private int priceId;
	// 货币单位类型
	private int currencyUnitType;
	// 免费金额
	private long freeAmount;
	// 使用者比例
	private byte partyUseRation;
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
	public long getFreeAmount() {
		return freeAmount;
	}
	public void setFreeAmount(long freeAmount) {
		this.freeAmount = freeAmount;
	}
	public byte getPartyUseRation() {
		return partyUseRation;
	}
	public void setPartyUseRation(byte partyUseRation) {
		this.partyUseRation = partyUseRation;
	}

}
