package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
public class RatingCurverDetail implements Serializable{
	private static final long serialVersionUID = 8170797773417072487L;
	
	private Integer ratingCurveId;
	private Integer priceId;
	private Integer segMentId;
	private Integer startval;
	private Integer endVal;
	private String rateVal;
	private String baseVal;
	private Integer numerator;
	private Integer denominator;
	private Date createDate;
	private Date version;
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
	
	public Integer getRatingCurveId() {
		return ratingCurveId;
	}
	public void setRatingCurveId(Integer ratingCurveId) {
		this.ratingCurveId = ratingCurveId;
	}
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public Integer getSegMentId() {
		return segMentId;
	}
	public void setSegMentId(Integer segMentId) {
		this.segMentId = segMentId;
	}
	public Integer getStartval() {
		return startval;
	}
	public void setStartval(Integer startval) {
		this.startval = startval;
	}
	public Integer getEndVal() {
		return endVal;
	}
	public void setEndVal(Integer endVal) {
		this.endVal = endVal;
	}
	public String getRateVal() {
		return rateVal;
	}
	public void setRateVal(String rateVal) {
		this.rateVal = rateVal;
	}
	public String getBaseVal() {
		return baseVal;
	}
	public void setBaseVal(String baseVal) {
		this.baseVal = baseVal;
	}
	public Integer getNumerator() {
		return numerator;
	}
	public void setNumerator(Integer numerator) {
		this.numerator = numerator;
	}
	public Integer getDenominator() {
		return denominator;
	}
	public void setDenominator(Integer denominator) {
		this.denominator = denominator;
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
	
	
}
