package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
public class RatingDiscount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer priceId;
	private String priceName;
	private Integer discountStandard;
	private BigDecimal segId;
	private String segName;
	private Integer baseItemType;
	private Integer discountType;
	private Integer numberator;
	private Integer demominator;
	private String maxiMum;
	private Integer currencyUnitType;
	private Date createDate;
	private Date version;
	private String operateCode;
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
	public Integer getDiscountStandard() {
		return discountStandard;
	}
	public void setDiscountStandard(Integer discountStandard) {
		this.discountStandard = discountStandard;
	}
	public Integer getDiscountType() {
		return discountType;
	}
	public void setDiscountType(Integer discountType) {
		this.discountType = discountType;
	}
	public Integer getNumberator() {
		return numberator;
	}
	public void setNumberator(Integer numberator) {
		this.numberator = numberator;
	}
	public Integer getDemominator() {
		return demominator;
	}
	public void setDemominator(Integer demominator) {
		this.demominator = demominator;
	}
	public Integer getCurrencyUnitType() {
		return currencyUnitType;
	}
	public void setCurrencyUnitType(Integer currencyUnitType) {
		this.currencyUnitType = currencyUnitType;
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
	public Integer getBaseItemType() {
		return baseItemType;
	}
	public void setBaseItemType(Integer baseItemType) {
		this.baseItemType = baseItemType;
	}
	public String getMaxiMum() {
		return maxiMum;
	}
	public void setMaxiMum(String maxiMum) {
		this.maxiMum = maxiMum;
	}
	public BigDecimal getSegId() {
		return segId;
	}
	public void setSegId(BigDecimal segId) {
		this.segId = segId;
	}
	public String getSegName() {
		return segName;
	}
	public void setSegName(String segName) {
		this.segName = segName;
	}
	public String getOperateCode() {
		return operateCode;
	}
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
	
	
}
