package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class OneTimeCharge implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ComponentPrice baseInfo;
	
	private Integer priceId;
	private String priceName;
	private String taxIncluded;
	private Long businessItem;
	private Long oneTimeItem;
	private Integer billingPriority;
	public String channelType;
	public String chargeType;
	private Integer currencyUnitType;
	public String currencyUnitVal;
	private String description;
	private Date createDate;
	private Date version;
	
	private String businessItemName;
	private String oneTimeItemName;
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
	public ComponentPrice getBaseInfo() {
		return baseInfo;
	}
	public void setBaseInfo(ComponentPrice baseInfo) {
		this.baseInfo = baseInfo;
	}
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public String getPriceName() {
		return priceName;
	}
	public void setPriceName(String priceName) {
		this.priceName = priceName;
	}
	public String getTaxIncluded() {
		return taxIncluded;
	}
	public void setTaxIncluded(String taxIncluded) {
		this.taxIncluded = taxIncluded;
	}
	public Long getBusinessItem() {
		return businessItem;
	}
	public void setBusinessItem(Long businessItem) {
		this.businessItem = businessItem;
	}
	public Long getOneTimeItem() {
		return oneTimeItem;
	}
	public void setOneTimeItem(Long oneTimeItem) {
		this.oneTimeItem = oneTimeItem;
	}
	public Integer getBillingPriority() {
		return billingPriority;
	}
	public void setBillingPriority(Integer billingPriority) {
		this.billingPriority = billingPriority;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public Integer getCurrencyUnitType() {
		return currencyUnitType;
	}
	public void setCurrencyUnitType(Integer currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
	}
	public String getCurrencyUnitVal() {
		return currencyUnitVal;
	}
	public void setCurrencyUnitVal(String currencyUnitVal) {
		this.currencyUnitVal = currencyUnitVal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public String getBusinessItemName() {
		return businessItemName;
	}
	public void setBusinessItemName(String businessItemName) {
		this.businessItemName = businessItemName;
	}
	public String getOneTimeItemName() {
		return oneTimeItemName;
	}
	public void setOneTimeItemName(String oneTimeItemName) {
		this.oneTimeItemName = oneTimeItemName;
	}
	
	
}
