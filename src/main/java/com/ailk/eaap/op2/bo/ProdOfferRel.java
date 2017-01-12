package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProdOfferRel implements Serializable{
	private static final long serialVersionUID = -7584512469238385564L;

	private Integer prodOfferRelId;
	private BigDecimal offerAId;
	private BigDecimal offerZId;
	///////////////////////////////
	private String prodOfferName;
	private String extProdOfferId;
	private String offerProvider;
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
	
	public String getProdOfferName() {
		return prodOfferName;
	}
	public void setProdOfferName(String prodOfferName) {
		this.prodOfferName = prodOfferName;
	}
	public String getExtProdOfferId() {
		return extProdOfferId;
	}
	public void setExtProdOfferId(String extProdOfferId) {
		this.extProdOfferId = extProdOfferId;
	}
	public String getOfferProvider() {
		return offerProvider;
	}
	public void setOfferProvider(String offerProvider) {
		this.offerProvider = offerProvider;
	}


	///////////////////////////////////////////
	private Integer roleId;
	private String relTypeCd;
	private Date effDate;
	private Date expDate;
	private Integer minCount;
	private Integer maxCount;
	public Integer getProdOfferRelId() {
		return prodOfferRelId;
	}
	public void setProdOfferRelId(Integer prodOfferRelId) {
		this.prodOfferRelId = prodOfferRelId;
	}
	public BigDecimal getOfferAId() {
		return offerAId;
	}
	public void setOfferAId(BigDecimal offerAId) {
		this.offerAId = offerAId;
	}
	public BigDecimal getOfferZId() {
		return offerZId;
	}
	public void setOfferZId(BigDecimal offerZId) {
		this.offerZId = offerZId;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRelTypeCd() {
		return relTypeCd;
	}
	public void setRelTypeCd(String relTypeCd) {
		this.relTypeCd = relTypeCd;
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
	public Integer getMinCount() {
		return minCount;
	}
	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}
	public Integer getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	
	
}
