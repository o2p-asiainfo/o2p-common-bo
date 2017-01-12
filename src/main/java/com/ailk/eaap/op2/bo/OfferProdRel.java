package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;

public class OfferProdRel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer offerProdRelaId;
	// /////////////////////
	private String productName;
	private String extProdId;
	private String productProviderName;
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
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductProviderName() {
		return productProviderName;
	}

	public void setProductProviderName(String productProviderName) {
		this.productProviderName = productProviderName;
	}

	public String getExtProdId() {
		return extProdId;
	}

	public void setExtProdId(String extProdId) {
		this.extProdId = extProdId;
	}

	// //////////////////////////
	private Integer roleCd;
	private BigDecimal prodOfferId;
	private BigDecimal productId;
	private Integer maxCount;
	private Integer minCount;
	private String ruleType;
	private Integer defaultCount;
	private String prodExistType;
	private String compoentType;

	private ProdOffer prodOffer;
	private Product product;

	public ProdOffer getProdOffer() {
		return prodOffer;
	}

	public void setProdOffer(ProdOffer prodOffer) {
		this.prodOffer = prodOffer;
	}

	public void setOfferProdRelaId(Integer offerProdRelaId) {
		this.offerProdRelaId = offerProdRelaId;
	}

	public Integer getOfferProdRelaId() {
		return this.offerProdRelaId;
	}

	public void setRoleCd(Integer roleCd) {
		this.roleCd = roleCd;
	}

	public Integer getRoleCd() {
		return this.roleCd;
	}

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}
	public BigDecimal getProductId() {
		return productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public Integer getMaxCount() {
		return this.maxCount;
	}

	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}

	public Integer getMinCount() {
		return this.minCount;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setDefaultCount(Integer defaultCount) {
		this.defaultCount = defaultCount;
	}

	public Integer getDefaultCount() {
		return this.defaultCount;
	}

	public void setProdExistType(String prodExistType) {
		this.prodExistType = prodExistType;
	}

	public String getProdExistType() {
		return this.prodExistType;
	}

	public void setCompoentType(String compoentType) {
		this.compoentType = compoentType;
	}

	public String getCompoentType() {
		return this.compoentType;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
