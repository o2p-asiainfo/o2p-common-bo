/** 
 * Project Name:o2p-common-bo 
 * File Name:ApiAndProdOffer.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2014年12月19日上午10:33:33 
 * Copyright (c) 2014, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.billing;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ClassName:ApiAndProdOffer 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2014年12月19日 上午10:33:33 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class ApiProductProdOfferOrgRela implements Serializable {
	private static final long serialVersionUID = 1L;

	private int orgId;
	private int apiId;
	private int appId;
	private String apiName;
	private BigDecimal productId;
	private int offerProdRelaId;
	private BigDecimal prodOfferId;
	private String offerType;
	private String prodOfferName;
	private String statusCd;
	private Date effDate;
	private Date expDate;
	private String offerNbr;
	private String brandId;
	private String servBrandId;
	private long templetId;
	private int defaultTimePeriod;
	private String extProdOfferId;
	private String expProcMethod;
	private String valueAddedFlag;
	private String prodOfferInitialamount;
	private String expireHandleCondition;
	private long commonRegionId;
	private String innerOfferNbr;
	private String cooperationType;
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

	public int getApiId() {
		return apiId;
	}

	public void setApiId(int apiId) {
		this.apiId = apiId;
	}
	
	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}



	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public int getOfferProdRelaId() {
		return offerProdRelaId;
	}

	public void setOfferProdRelaId(int offerProdRelaId) {
		this.offerProdRelaId = offerProdRelaId;
	}

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getProdOfferName() {
		return prodOfferName;
	}

	public void setProdOfferName(String prodOfferName) {
		this.prodOfferName = prodOfferName;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
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

	public String getOfferNbr() {
		return offerNbr;
	}

	public void setOfferNbr(String offerNbr) {
		this.offerNbr = offerNbr;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getServBrandId() {
		return servBrandId;
	}

	public void setServBrandId(String servBrandId) {
		this.servBrandId = servBrandId;
	}

	public Long getTempletId() {
		return templetId;
	}

	public void setTempletId(Long templetId) {
		this.templetId = templetId;
	}

	public int getDefaultTimePeriod() {
		return defaultTimePeriod;
	}

	public void setDefaultTimePeriod(int defaultTimePeriod) {
		this.defaultTimePeriod = defaultTimePeriod;
	}

	public String getExtProdOfferId() {
		return extProdOfferId;
	}

	public void setExtProdOfferId(String extProdOfferId) {
		this.extProdOfferId = extProdOfferId;
	}

	public String getExpProcMethod() {
		return expProcMethod;
	}

	public void setExpProcMethod(String expProcMethod) {
		this.expProcMethod = expProcMethod;
	}

	public String getValueAddedFlag() {
		return valueAddedFlag;
	}

	public void setValueAddedFlag(String valueAddedFlag) {
		this.valueAddedFlag = valueAddedFlag;
	}

	public String getProdOfferInitialamount() {
		return prodOfferInitialamount;
	}

	public void setProdOfferInitialamount(String prodOfferInitialamount) {
		this.prodOfferInitialamount = prodOfferInitialamount;
	}

	public String getExpireHandleCondition() {
		return expireHandleCondition;
	}

	public void setExpireHandleCondition(String expireHandleCondition) {
		this.expireHandleCondition = expireHandleCondition;
	}

	public Long getCommonRegionId() {
		return commonRegionId;
	}

	public void setCommonRegionId(Long commonRegionId) {
		this.commonRegionId = commonRegionId;
	}

	public String getInnerOfferNbr() {
		return innerOfferNbr;
	}

	public void setInnerOfferNbr(String innerOfferNbr) {
		this.innerOfferNbr = innerOfferNbr;
	}

	public String getCooperationType() {
		return cooperationType;
	}

	public void setCooperationType(String cooperationType) {
		this.cooperationType = cooperationType;
	}

}
