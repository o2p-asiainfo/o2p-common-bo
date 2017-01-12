package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class Measure implements Serializable{

	private static final long serialVersionUID = 5073849229968173936L;
	
	private String measureId;
	private String measureTypeId;
	private String name;
	private Integer measureLevel;
	private String descript;
	private Integer precisionFlag;
	private Integer isDisplay;
	private Integer minRealunit;
	private Integer tenantId;
	
	public String getMeasureId() {
		return measureId;
	}
	public void setMeasureId(String measureId) {
		this.measureId = measureId;
	}
	public String getMeasureTypeId() {
		return measureTypeId;
	}
	public void setMeasureTypeId(String measureTypeId) {
		this.measureTypeId = measureTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMeasureLevel() {
		return measureLevel;
	}
	public void setMeasureLevel(Integer measureLevel) {
		this.measureLevel = measureLevel;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	public Integer getPrecisionFlag() {
		return precisionFlag;
	}
	public void setPrecisionFlag(Integer precisionFlag) {
		this.precisionFlag = precisionFlag;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	public Integer getMinRealunit() {
		return minRealunit;
	}
	public void setMinRealunit(Integer minRealunit) {
		this.minRealunit = minRealunit;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
