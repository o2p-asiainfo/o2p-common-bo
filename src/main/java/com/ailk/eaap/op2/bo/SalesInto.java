/** 
 * Project Name:o2p-common-bo 
 * File Name:SalesInto.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月11日下午6:01:00 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;

/**
 * ClassName:SalesInto 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月11日 下午6:01:00 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class SalesInto implements Serializable {
	private static final long serialVersionUID = 1L;

	// 定价计划ID
	private int priceId;
	// 货币单位类型
	private int currencyUnitType;
	// 免费金额
	private long freeAmount;
	// 使用者比例
	private byte partyUseRation;
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
