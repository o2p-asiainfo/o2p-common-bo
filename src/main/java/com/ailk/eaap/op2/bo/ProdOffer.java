package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class ProdOffer implements Serializable, DateConvertBeanImpl {
	private static final long serialVersionUID = 1684358885653146982L;
	
	private BigDecimal prodOfferId;
	private String offerType;
	private String prodOfferName;
	private String innerOfferName;
	@DateConvertField
	private Date statusDate;
	private String prodOfferPublisher;
	private String statusCd;
	@DateConvertField
	private Date effDate;
	@DateConvertField
	private Date expDate;
	private String offerNbr;
	private String offerProviderId;
	private String brandId;
	private String servBrandId;
	private Long templetId;
	private Integer defaultTimePeriod;
	private String prodOfferDesc;
	private String extProdOfferId;
	private String expProcMethod;
	private String valueAddedFlag;
	private String manageGrade;
	private String prodOfferInitialamount;
	private String expireHandleCondition;
	private Long commonRegionId;
	private String manageGrade2;
	private Date createDt;
	private Date simpleSpell;
	private Date version;
	private String innerOfferNbr;
	private String prodOfferTrait;
	private String cooperationType;
	private String formatEffDate = DefaultVlueUtils.getNowDate(0);
	private String formatExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;// getNowDate(1);
	private Integer logoFileId;
	private String auditFlowId;
	private int offerPrice;
	private String operateCode;

	private List<ProdOfferPricing> prodOfferPricingList;
	private List<PricePlan> pricePlanList;
	private Integer tenantId;
	
	
	
	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public List<PricePlan> getPricePlanList() {
		return pricePlanList;
	}

	public void setPricePlanList(List<PricePlan> pricePlanList) {
		this.pricePlanList = pricePlanList;
	}

	public List<ProdOfferPricing> getProdOfferPricingList() {
		return prodOfferPricingList;
	}

	public void setProdOfferPricingList(
			List<ProdOfferPricing> prodOfferPricingList) {
		this.prodOfferPricingList = prodOfferPricingList;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public String getAuditFlowId() {
		return auditFlowId;
	}

	public void setAuditFlowId(String auditFlowId) {
		this.auditFlowId = auditFlowId;
	}

	public Integer getLogoFileId() {
		return logoFileId;
	}

	public void setLogoFileId(Integer logoFileId) {
		this.logoFileId = logoFileId;
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

	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}

	public String getOfferType() {
		return this.offerType;
	}

	public void setProdOfferName(String prodOfferName) {
		this.prodOfferName = prodOfferName;
	}

	public String getProdOfferName() {
		return this.prodOfferName;
	}

	public void setInnerOfferName(String innerOfferName) {
		this.innerOfferName = innerOfferName;
	}

	public String getInnerOfferName() {
		return this.innerOfferName;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setProdOfferPublisher(String prodOfferPublisher) {
		this.prodOfferPublisher = prodOfferPublisher;
	}

	public String getProdOfferPublisher() {
		return this.prodOfferPublisher;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getEffDate() {
		return this.effDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getExpDate() {
		return this.expDate;
	}

	public void setOfferNbr(String offerNbr) {
		this.offerNbr = offerNbr;
	}

	public String getOfferNbr() {
		return this.offerNbr;
	}

	public void setOfferProviderId(String offerProviderId) {
		this.offerProviderId = offerProviderId;
	}

	public String getOfferProviderId() {
		return this.offerProviderId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandId() {
		return this.brandId;
	}

	public void setServBrandId(String servBrandId) {
		this.servBrandId = servBrandId;
	}

	public String getServBrandId() {
		return this.servBrandId;
	}

	public void setTempletId(Long templetId) {
		this.templetId = templetId;
	}

	public Long getTempletId() {
		return this.templetId;
	}

	public void setDefaultTimePeriod(Integer defaultTimePeriod) {
		this.defaultTimePeriod = defaultTimePeriod;
	}

	public Integer getDefaultTimePeriod() {
		return this.defaultTimePeriod;
	}

	public void setProdOfferDesc(String prodOfferDesc) {
		this.prodOfferDesc = prodOfferDesc;
	}

	public String getProdOfferDesc() {
		return this.prodOfferDesc;
	}

	public void setExtProdOfferId(String extProdOfferId) {
		this.extProdOfferId = extProdOfferId;
	}

	public String getExtProdOfferId() {
		return this.extProdOfferId;
	}

	public void setExpProcMethod(String expProcMethod) {
		this.expProcMethod = expProcMethod;
	}

	public String getExpProcMethod() {
		return this.expProcMethod;
	}

	public void setValueAddedFlag(String valueAddedFlag) {
		this.valueAddedFlag = valueAddedFlag;
	}

	public String getValueAddedFlag() {
		return this.valueAddedFlag;
	}

	public void setManageGrade(String manageGrade) {
		this.manageGrade = manageGrade;
	}

	public String getManageGrade() {
		return this.manageGrade;
	}

	public void setProdOfferInitialamount(String prodOfferInitialamount) {
		this.prodOfferInitialamount = prodOfferInitialamount;
	}

	public String getProdOfferInitialamount() {
		return this.prodOfferInitialamount;
	}

	public void setExpireHandleCondition(String expireHandleCondition) {
		this.expireHandleCondition = expireHandleCondition;
	}

	public String getExpireHandleCondition() {
		return this.expireHandleCondition;
	}

	public void setCommonRegionId(Long commonRegionId) {
		this.commonRegionId = commonRegionId;
	}

	public Long getCommonRegionId() {
		return this.commonRegionId;
	}

	public void setManageGrade2(String manageGrade2) {
		this.manageGrade2 = manageGrade2;
	}

	public String getManageGrade2() {
		return this.manageGrade2;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setSimpleSpell(Date simpleSpell) {
		this.simpleSpell = simpleSpell;
	}

	public Date getSimpleSpell() {
		return this.simpleSpell;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Date getVersion() {
		return this.version;
	}

	public void setInnerOfferNbr(String innerOfferNbr) {
		this.innerOfferNbr = innerOfferNbr;
	}

	public String getInnerOfferNbr() {
		return this.innerOfferNbr;
	}

	public void setProdOfferTrait(String prodOfferTrait) {
		this.prodOfferTrait = prodOfferTrait;
	}

	public String getProdOfferTrait() {
		return this.prodOfferTrait;
	}

	public void setCooperationType(String cooperationType) {
		this.cooperationType = cooperationType;
	}

	public String getCooperationType() {
		return this.cooperationType;
	}

	public String getNowDate(Integer num) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		if (num == -2) {
			return c.getTimeInMillis() + "";
		}

		StringBuffer sb = new StringBuffer();
		sb.append(c.get(Calendar.YEAR) + num).append("-")
				.append(c.get(Calendar.MONTH) + 1).append("-")
				.append(c.get(Calendar.DAY_OF_MONTH));
		if (num == -1) {
			sb.append(" " + c.get(Calendar.HOUR_OF_DAY)).append(":")
					.append(c.get(Calendar.MINUTE)).append(":")
					.append(c.get(Calendar.SECOND));
		}
		return sb.toString();
	}

	public String getOperateCode() {
		return operateCode;
	}

	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
	
	
}
