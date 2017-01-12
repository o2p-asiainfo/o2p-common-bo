package com.ailk.eaap.op2.bo;

public class FreeResourceSeg {
	
	private Long priceId;
	private Integer startValue;
	private Integer endValue;
	private Long amount;
	private Integer measureId;
	private Long formulaId;
	private Long limitAmount;
	private Integer tenantId;
	
	public Long getPriceId() {
		return priceId;
	}
	public void setPriceId(Long priceId) {
		this.priceId = priceId;
	}
	public Integer getStartValue() {
		return startValue;
	}
	public void setStartValue(Integer startValue) {
		this.startValue = startValue;
	}
	public Integer getEndValue() {
		return endValue;
	}
	public void setEndValue(Integer endValue) {
		this.endValue = endValue;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Integer getMeasureId() {
		return measureId;
	}
	public void setMeasureId(Integer measureId) {
		this.measureId = measureId;
	}
	public Long getFormulaId() {
		return formulaId;
	}
	public void setFormulaId(Long formulaId) {
		this.formulaId = formulaId;
	}
	public Long getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(Long limitAmount) {
		this.limitAmount = limitAmount;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
