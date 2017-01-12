/** 
 * Project Name:o2p-common-bo 
 * File Name:OrgOfferOrderRela.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月15日上午10:41:58 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.asiainfo.integration.o2p.billing.APIPricingCase;

/**
 * ClassName:OrgOfferOrderRela 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月15日 上午10:41:58 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class OrgOfferOrderRela implements Serializable {
	private static final long serialVersionUID = 1L;

	private int offerApiRelaId;
	private int orgId;
	private BigDecimal prodOfferId;
	private Date orderTime;
	private Date effTime;
	private Date expTime;
	private int useUnit;
	private Date cancelTime;
	private int appId;
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
	private List<APIPricingCase> apiPricingCaseList;
	
	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public List<APIPricingCase> getApiPricingCaseList() {
		return apiPricingCaseList;
	}

	public void setApiPricingCaseList(List<APIPricingCase> apiPricingCaseList) {
		this.apiPricingCaseList = apiPricingCaseList;
	}

	public int getOfferApiRelaId() {
		return offerApiRelaId;
	}

	public void setOfferApiRelaId(int offerApiRelaId) {
		this.offerApiRelaId = offerApiRelaId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getEffTime() {
		return effTime;
	}

	public void setEffTime(Date effTime) {
		this.effTime = effTime;
	}

	public Date getExpTime() {
		return expTime;
	}

	public void setExpTime(Date expTime) {
		this.expTime = expTime;
	}

	public int getUseUnit() {
		return useUnit;
	}

	public void setUseUnit(int useUnit) {
		this.useUnit = useUnit;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

}
