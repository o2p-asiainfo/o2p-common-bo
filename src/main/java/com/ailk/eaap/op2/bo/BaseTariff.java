/** 
 * Project Name:o2p-common-bo 
 * File Name:APIBaseTariffBill.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月11日下午5:16:06 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:APIBaseTariffBill 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月11日 下午5:16:06 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class BaseTariff implements Serializable {
	private static final long serialVersionUID = 1L;
	// 主键ID
	private int priceId;
	// 当前区间指针
	private int position;
	// 计费单位类型
	private byte ratingUnitType;
	// 基础资源的费率详情
	
	
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	private List<RatingCurverDetail> billInfoList = new ArrayList<RatingCurverDetail>();

	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public byte getRatingUnitType() {
		return ratingUnitType;
	}

	public void setRatingUnitType(byte ratingUnitType) {
		this.ratingUnitType = ratingUnitType;
	}

	public List<RatingCurverDetail> getBillInfoList() {
		return billInfoList;
	}

	public void setBillInfoList(List<RatingCurverDetail> billInfoList) {
		this.billInfoList = billInfoList;
	}

	
}
