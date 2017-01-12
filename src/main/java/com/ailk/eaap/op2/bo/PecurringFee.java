package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class PecurringFee implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ComponentPrice componentPrice;
	private Integer priceId;
	private String priceName;
	private String taxIncluded;
	private Long itemId;
	private Integer billingPriority;
	public Integer currencyUnitType;
	public String currencyUnitVal ;
	public String description;
	public Date createDate;
	public Date version;
	private String itemName;
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
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Integer getBillingPriority() {
		return billingPriority;
	}
	public void setBillingPriority(Integer billingPriority) {
		this.billingPriority = billingPriority;
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
	public ComponentPrice getComponentPrice() {
		return componentPrice;
	}
	public void setComponentPrice(ComponentPrice componentPrice) {
		this.componentPrice = componentPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
