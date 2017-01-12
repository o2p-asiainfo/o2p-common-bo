package com.ailk.eaap.op2.bo;

import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

/**
 * Corporation entity. @author MyEclipse Persistence Tools
 *  wanglm7
 */

public class Corporation implements java.io.Serializable,DateConvertBeanImpl {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer corporationId; //企业标识
	private String corporationType;//10电商,11实体渠道商
	private String corporationNature;//10国有企业11集体所有制企业12联营企业13中外合资经营企业14中外合作经营企业	15外资企业16私营企业
	private String taxCode;//税务号
	private Integer registeredCapital;//注册资金
	@DateConvertField
	private Date registeredTime;//登记时间
	private String registeredAddress;//登记地址
	private Date updateTime;//修改时间
	private String formatRegisteredTime;
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
	// Constructors

	public String getFormatRegisteredTime() {
		return formatRegisteredTime;
	}

	public void setFormatRegisteredTime(String formatRegisteredTime) {
		this.formatRegisteredTime = formatRegisteredTime;
	}

	/** default constructor */
	public Corporation() {
	}

	/** full constructor */
	public Corporation(Integer corporationId, String corporationType,
			String corporationNature, String taxCode,
			Integer registeredCapital, Date registeredTime,
			String registeredAddress, Date updateTime) {
		this.corporationId = corporationId;
		this.corporationType = corporationType;
		this.corporationNature = corporationNature;
		this.taxCode = taxCode;
		this.registeredCapital = registeredCapital;
		this.registeredTime = registeredTime;
		this.registeredAddress = registeredAddress;
		this.updateTime = updateTime;
	}

	// Property accessors

	public Integer getCorporationId() {
		return this.corporationId;
	}

	public void setCorporationId(Integer corporationId) {
		this.corporationId = corporationId;
	}

	public String getCorporationType() {
		return this.corporationType;
	}

	public void setCorporationType(String corporationType) {
		this.corporationType = corporationType;
	}

	public String getCorporationNature() {
		return this.corporationNature;
	}

	public void setCorporationNature(String corporationNature) {
		this.corporationNature = corporationNature;
	}

	public String getTaxCode() {
		return this.taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public Integer getRegisteredCapital() {
		return this.registeredCapital;
	}

	public void setRegisteredCapital(Integer registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public Date getRegisteredTime() {
		return this.registeredTime;
	}

	public void setRegisteredTime(Date registeredTime) {
		this.registeredTime = registeredTime;
	}

	public String getRegisteredAddress() {
		return this.registeredAddress;
	}

	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
