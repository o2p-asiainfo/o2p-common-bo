/** 
 * Project Name:o2p-common-bo 
 * File Name:SalesOfPricing.java 
 * Package Name:com.asiainfo.integration.o2p.billing 
 * Date:2014年12月24日下午3:26:55 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;



/**
 * ClassName:SalesOfPricing 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月24日 下午3:26:55 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */

//API定价计划数据结构
public class APISalesOfPricing implements Serializable {
	
	private static final long serialVersionUID = 1L;

	// 定价标识
	private int pricingInfoId;
	// 定价名称
	private String pricingName;
	// 创建时间
	private String createDate;
	// 状态CD
	private String statusCd;
	// 状态时间
	private String statusDate;
	// 生效时间
	private long effDate;
	// 失效时间
	private long expDate;
	// 是否为主定价计划
	private String isMain;
	// 计费优先级
	private int billingPriority;
	// 周期类型
	private byte cycleType;
	// 周期单位
	private byte cycleUnit;
	// 适用类型
	private byte applicType;
	// 许可证数量
	//private byte license_nbr;	
	//一个定价计划有多个组合资源
	private List<APIComponentPrice>  apiComponentPriceList= new ArrayList<APIComponentPrice>();

	public int getPricingInfoId() {
		return pricingInfoId;
	}

	public void setPricingInfoId(int pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}

	public String getPricingName() {
		return pricingName;
	}

	public void setPricingName(String pricingName) {
		this.pricingName = pricingName;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	public long getEffDate() {
		return effDate;
	}

	public void setEffDate(long effDate) {
		this.effDate = effDate;
	}

	public long getExpDate() {
		return expDate;
	}

	public void setExpDate(long expDate) {
		this.expDate = expDate;
	}

	public String getIsMain() {
		return isMain;
	}

	public void setIsMain(String isMain) {
		this.isMain = isMain;
	}

	public int getBillingPriority() {
		return billingPriority;
	}

	public void setBillingPriority(int billingPriority) {
		this.billingPriority = billingPriority;
	}

	public byte getCycleType() {
		return cycleType;
	}

	public void setCycleType(byte cycleType) {
		this.cycleType = cycleType;
	}

	public byte getCycleUnit() {
		return cycleUnit;
	}

	public void setCycleUnit(byte cycleUnit) {
		this.cycleUnit = cycleUnit;
	}

	public byte getApplicType() {
		return applicType;
	}

	public void setApplicType(byte applicType) {
		this.applicType = applicType;
	}

	public List<APIComponentPrice> getApiComponentPriceList() {
		return apiComponentPriceList;
	}

	public void setApiComponentPriceList(
			List<APIComponentPrice> apiComponentPriceList) {
		this.apiComponentPriceList = apiComponentPriceList;
	}
	
}
