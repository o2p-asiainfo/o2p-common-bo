package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CharSpec extends BaseClass implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8753252469116356471L;

	private String charSpecId;
	private String charSpecName;
	private String code;
	private String charSpecType;
	private String charSpecMaintainType;
	private String valueType;
	private String defaultValue;
	private Integer minCardinality;
	private Integer maxCardinality;
	private String derivationFomula;
	private String isCustomized;
	private String isComposite;
	private String description;
	private String url;
	private String isMulti;
	private String orgId;
	private Integer tenantId;
	
	
	
	public String getCharSpecId() {
		return charSpecId;
	}
	public void setCharSpecId(String charSpecId) {
		this.charSpecId = charSpecId;
	}
	public String getCharSpecName() {
		return charSpecName;
	}
	public void setCharSpecName(String charSpecName) {
		this.charSpecName = charSpecName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCharSpecType() {
		return charSpecType;
	}
	public void setCharSpecType(String charSpecType) {
		this.charSpecType = charSpecType;
	}
	public String getValueType() {
		return valueType;
	}
	public void setValueType(String valueType) {
		this.valueType = valueType;
	}
	public Integer getMinCardinality() {
		return minCardinality;
	}
	public void setMinCardinality(Integer minCardinality) {
		this.minCardinality = minCardinality;
	}
	public Integer getMaxCardinality() {
		return maxCardinality;
	}
	public void setMaxCardinality(Integer maxCardinality) {
		this.maxCardinality = maxCardinality;
	}
	public String getDerivationFomula() {
		return derivationFomula;
	}
	public void setDerivationFomula(String derivationFomula) {
		this.derivationFomula = derivationFomula;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsMulti() {
		return isMulti;
	}
	public void setIsMulti(String isMulti) {
		this.isMulti = isMulti;
	}
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	public String getCharSpecMaintainType() {
		return charSpecMaintainType;
	}
	public void setCharSpecMaintainType(String charSpecMaintainType) {
		this.charSpecMaintainType = charSpecMaintainType;
	}
	public String getIsCustomized() {
		return isCustomized;
	}
	public void setIsCustomized(String isCustomized) {
		this.isCustomized = isCustomized;
	}
	public String getIsComposite() {
		return isComposite;
	}
	public void setIsComposite(String isComposite) {
		this.isComposite = isComposite;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
