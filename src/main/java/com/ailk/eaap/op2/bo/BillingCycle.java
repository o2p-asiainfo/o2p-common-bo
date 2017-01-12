/** 
 * Project Name:o2p-common-bo 
 * File Name:BillingCycle.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月17日上午11:57:10 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName:BillingCycle计费周期 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月17日 上午11:57:10 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class BillingCycle implements Serializable {
	private static final long serialVersionUID = 1L;

	private int orgId;
	private BigDecimal prodOfferId;
	private int pricingInfoId;
	private int componentPriceId;
	private int apiId;
	private String billingYearMonth;
	private Date effDate;
	private Date expDate;
	private long useUnit;
	private long eff;
	private long exp;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
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

	public int getPricingInfoId() {
		return pricingInfoId;
	}

	public void setPricingInfoId(int pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}

	public Date getEffDate() {
		return effDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}



	public long getEff() {
		return eff;
	}

	public void setEff(long eff) {
		this.eff = eff;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public String getBillingYearMonth() {
		return billingYearMonth;
	}

	public void setBillingYearMonth(String billingYearMonth) {
		this.billingYearMonth = billingYearMonth;
	}

	public long getUseUnit() {
		return useUnit;
	}

	public void setUseUnit(long useUnit) {
		this.useUnit = useUnit;
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
}
