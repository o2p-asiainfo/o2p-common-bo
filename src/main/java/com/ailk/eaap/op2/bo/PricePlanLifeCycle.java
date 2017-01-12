package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class PricePlanLifeCycle implements Serializable{
	private static final long serialVersionUID = -1799058483891756507L;
	private Long  pricePlanId;
	private String halfCycleFlag;
	private Integer cycleUnit;
	private String cycleType;
	private String cycleSyncFlag;
	private Integer subEffectMode;
	private Integer subDelayUnit;
	private String subDelayCycle;
	private Integer unSubEffectMode;
	private Integer unSubDelayUnit;
	private String unSubDelayCycle;
	private Integer validUnit;
	private String vaildType;
	private Date fixedExpireDate;
	private String fFixedExpireDate;
	@DateConvertField
	private Date modifyDate;
	@DateConvertField
	private Date createDate;
	private String statusCd;
	@DateConvertField
	private Date statusDate;
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
	public Long getPricePlanId() {
		return pricePlanId;
	}
	public void setPricePlanId(Long pricePlanId) {
		this.pricePlanId = pricePlanId;
	}
	public String getHalfCycleFlag() {
		return halfCycleFlag;
	}
	public void setHalfCycleFlag(String halfCycleFlag) {
		this.halfCycleFlag = halfCycleFlag;
	}
	public Integer getCycleUnit() {
		return cycleUnit;
	}
	public void setCycleUnit(Integer cycleUnit) {
		this.cycleUnit = cycleUnit;
	}
	public String getCycleType() {
		return cycleType;
	}
	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}
	public String getCycleSyncFlag() {
		return cycleSyncFlag;
	}
	public void setCycleSyncFlag(String cycleSyncFlag) {
		this.cycleSyncFlag = cycleSyncFlag;
	}
	public Integer getSubEffectMode() {
		return subEffectMode;
	}
	public void setSubEffectMode(Integer subEffectMode) {
		this.subEffectMode = subEffectMode;
	}
	public Integer getSubDelayUnit() {
		return subDelayUnit;
	}
	public void setSubDelayUnit(Integer subDelayUnit) {
		this.subDelayUnit = subDelayUnit;
	}
	public String getSubDelayCycle() {
		return subDelayCycle;
	}
	public void setSubDelayCycle(String subDelayCycle) {
		this.subDelayCycle = subDelayCycle;
	}
	public Integer getUnSubEffectMode() {
		return unSubEffectMode;
	}
	public void setUnSubEffectMode(Integer unSubEffectMode) {
		this.unSubEffectMode = unSubEffectMode;
	}
	public Integer getUnSubDelayUnit() {
		return unSubDelayUnit;
	}
	public void setUnSubDelayUnit(Integer unSubDelayUnit) {
		this.unSubDelayUnit = unSubDelayUnit;
	}
	public String getUnSubDelayCycle() {
		return unSubDelayCycle;
	}
	public void setUnSubDelayCycle(String unSubDelayCycle) {
		this.unSubDelayCycle = unSubDelayCycle;
	}
	public Integer getValidUnit() {
		return validUnit;
	}
	public void setValidUnit(Integer validUnit) {
		this.validUnit = validUnit;
	}
	public String getVaildType() {
		return vaildType;
	}
	public void setVaildType(String vaildType) {
		this.vaildType = vaildType;
	}
	public Date getFixedExpireDate() {
		return fixedExpireDate;
	}
	public void setFixedExpireDate(Date fixedExpireDate) {
		this.fixedExpireDate = fixedExpireDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
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
	public String getfFixedExpireDate() {
		return fFixedExpireDate;
	}
	public void setfFixedExpireDate(String fFixedExpireDate) {
		this.fFixedExpireDate = fFixedExpireDate;
	}
	
}
