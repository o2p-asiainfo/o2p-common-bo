package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PricePlan implements Serializable {
	private static final long serialVersionUID = 1L;
	// 定价标识
	private Integer pricingInfoId;
	// 定价名称
	private String pricingName;
	private String pricingClassify;
	private String pricingType;
	private Integer pricingDesc;
	private String beyondDesc;
	private String priceSign;
	private String priceCha;
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

	private List<ComponentPrice> componentPriceList;

	// 创建时间
	private Date createDate;
	// 状态CD
	private String statusCd;
	// 状态时间
	private Date statusDate;
	// 生效时间
	private Date effDate;
	// 失效时间
	private Date expDate;
	// 是否为主定价计划
	private String isMain;
	// 计费优先级
	private int billingPriority;
	// 周期类型
	private int cycleType;
	// 周期单位
	private int cycleUnit;
	// 适用类型
	private byte applicType;
	// 许可证数量
	private int licenseNbr;

	public List<ComponentPrice> getComponentPriceList() {
		return componentPriceList;
	}

	public void setComponentPriceList(List<ComponentPrice> componentPriceList) {
		this.componentPriceList = componentPriceList;
	}

	public String getPricingClassify() {
		return pricingClassify;
	}

	public void setPricingClassify(String pricingClassify) {
		this.pricingClassify = pricingClassify;
	}

	public Integer getPricingInfoId() {
		return pricingInfoId;
	}

	public void setPricingInfoId(Integer pricingInfoId) {
		this.pricingInfoId = pricingInfoId;
	}

	public String getPricingType() {
		return pricingType;
	}

	public void setPricingType(String pricingType) {
		this.pricingType = pricingType;
	}

	public Integer getPricingDesc() {
		return pricingDesc;
	}

	public void setPricingDesc(Integer pricingDesc) {
		this.pricingDesc = pricingDesc;
	}

	public String getBeyondDesc() {
		return beyondDesc;
	}

	public void setBeyondDesc(String beyondDesc) {
		this.beyondDesc = beyondDesc;
	}

	public String getPriceSign() {
		return priceSign;
	}

	public void setPriceSign(String priceSign) {
		this.priceSign = priceSign;
	}

	public String getPriceCha() {
		return priceCha;
	}

	public void setPriceCha(String priceCha) {
		this.priceCha = priceCha;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getStatusCd() {
		return statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
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

	public String getPricingName() {
		return pricingName;
	}

	public void setPricingName(String pricingName) {
		this.pricingName = pricingName;
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

	public int getCycleType() {
		return cycleType;
	}

	public void setCycleType(int cycleType) {
		this.cycleType = cycleType;
	}

	public int getCycleUnit() {
		return cycleUnit;
	}

	public void setCycleUnit(int cycleUnit) {
		this.cycleUnit = cycleUnit;
	}

	public byte getApplicType() {
		return applicType;
	}

	public void setApplicType(byte applicType) {
		this.applicType = applicType;
	}

	public int getLicenseNbr() {
		return licenseNbr;
	}

	public void setLicenseNbr(int licenseNbr) {
		this.licenseNbr = licenseNbr;
	}

}
