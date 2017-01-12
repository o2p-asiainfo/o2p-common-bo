package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class ComponentPrice implements Serializable, DateConvertBeanImpl {

	private static final long serialVersionUID = 5536992588365347098L;

	private Integer priceId;
	private String priceName;
	private String priceType;
	private Integer priPricingInfoId;
	private String description;
	public String priceDesc;
	private Date createDate;
	private Date version;
	private String statusCd;
	private Date statusDate;
	@DateConvertField
	private Date effDate;
	@DateConvertField
	private Date expDate;
	private String formatEffDate = DefaultVlueUtils.getNowDate(0);
	private String formatExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;// getNowDate(1);
	private String priceType2Num;

	private RecurringFee recurringFee;
	private BasicTariff basicTariff;
	private BillingDiscount billingDiscount;
	private SalesInto salesInfo;
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

	public SalesInto getSalesInfo() {
		return salesInfo;
	}

	public void setSalesInfo(SalesInto salesInfo) {
		this.salesInfo = salesInfo;
	}

	public RecurringFee getRecurringFee() {
		return recurringFee;
	}

	public void setRecurringFee(RecurringFee recurringFee) {
		this.recurringFee = recurringFee;
	}

	public BasicTariff getBasicTariff() {
		return basicTariff;
	}

	public void setBasicTariff(BasicTariff basicTariff) {
		this.basicTariff = basicTariff;
	}

	public BillingDiscount getBillingDiscount() {
		return billingDiscount;
	}

	public void setBillingDiscount(BillingDiscount billingDiscount) {
		this.billingDiscount = billingDiscount;
	}

	public String getPriceType2Num() {
		return priceType2Num;
	}

	public void setPriceType2Num(String priceType2Num) {
		this.priceType2Num = priceType2Num;
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

	public Integer getPriPricingInfoId() {
		return priPricingInfoId;
	}

	public void setPriPricingInfoId(Integer priPricingInfoId) {
		this.priPricingInfoId = priPricingInfoId;
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

	public String getFormatEffDate() {
		return formatEffDate;
	}

	public void setFormatEffDate(String formatEffDate) {
		this.formatEffDate = formatEffDate;
	}

	public String getFormatExpDate() {
		return formatExpDate;
	}

	public void setFormatExpDate(String formatExpDate) {
		this.formatExpDate = formatExpDate;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

}
