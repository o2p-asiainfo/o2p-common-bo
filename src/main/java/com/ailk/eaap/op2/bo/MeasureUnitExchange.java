package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class MeasureUnitExchange implements Serializable{

	private static final long serialVersionUID = 913309716564728756L;

	private String measureId;
	private String destMeasureId;
	private String measureExchangeId;
	private Integer exchangeNumerator;
	private Integer exchangeDenominator;
	private Integer tenantId;
	
	public String getMeasureId() {
		return measureId;
	}
	public void setMeasureId(String measureId) {
		this.measureId = measureId;
	}
	public String getDestMeasureId() {
		return destMeasureId;
	}
	public void setDestMeasureId(String destMeasureId) {
		this.destMeasureId = destMeasureId;
	}
	public String getMeasureExchangeId() {
		return measureExchangeId;
	}
	public void setMeasureExchangeId(String measureExchangeId) {
		this.measureExchangeId = measureExchangeId;
	}
	public Integer getExchangeNumerator() {
		return exchangeNumerator;
	}
	public void setExchangeNumerator(Integer exchangeNumerator) {
		this.exchangeNumerator = exchangeNumerator;
	}
	public Integer getExchangeDenominator() {
		return exchangeDenominator;
	}
	public void setExchangeDenominator(Integer exchangeDenominator) {
		this.exchangeDenominator = exchangeDenominator;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
