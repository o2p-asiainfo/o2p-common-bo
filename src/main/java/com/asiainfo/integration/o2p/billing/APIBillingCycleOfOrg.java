/** 
 * Project Name:o2p-common-bo 
 * File Name:APIBillingCycleOfOrg.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:45:27 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:APIBillingCycleOfOrg 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:45:27 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */

//用户周期数据结构
public class APIBillingCycleOfOrg implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// 机构ID
	private int orgId;
	// 销售品ID
	private BigDecimal proOfferId;
	// 定价计划
	private int picingInfoId;
	//组合资源ID 数据库库中为 PRICE_ID字段
	private int componentPriceId;
	//apiId
	private int apiId;
	// 该定价计划的周期计费日期对象
	private List<APIBillingCycleOfDate> billingCycleDateList = new ArrayList<APIBillingCycleOfDate>();

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public BigDecimal getProOfferId() {
		return proOfferId;
	}

	public void setProOfferId(BigDecimal proOfferId) {
		this.proOfferId = proOfferId;
	}

	public int getPicingInfoId() {
		return picingInfoId;
	}

	public void setPicingInfoId(int picingInfoId) {
		this.picingInfoId = picingInfoId;
	}

	public int getComponentPriceId() {
		return componentPriceId;
	}

	public void setComponentPriceId(int componentPriceId) {
		this.componentPriceId = componentPriceId;
	}

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}
	
	public List<APIBillingCycleOfDate> getBillingCycleDateList() {
		return billingCycleDateList;
	}

	public void setBillingCycleDateList(
			List<APIBillingCycleOfDate> billingCycleDateList) {
		this.billingCycleDateList = billingCycleDateList;
	}

}
