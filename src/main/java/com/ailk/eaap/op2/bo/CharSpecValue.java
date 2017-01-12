package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

public class CharSpecValue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2152635527984891084L;

	private String charSpecValueId;
	private String charSpecId;
	private String code;
	private String value;
	private String displayValue;
	private String isDefault;
	private String description;
	private String valueFrom;
	private String valueTo;
	private Integer increment;
	private Integer seqId;
	private Date statusDate;
	private Date createDate;
	private String statusCd;
	private Integer tenantId;
	
	public String getCharSpecValueId() {
		return charSpecValueId;
	}
	public void setCharSpecValueId(String charSpecValueId) {
		this.charSpecValueId = charSpecValueId;
	}
	public String getCharSpecId() {
		return charSpecId;
	}
	public void setCharSpecId(String charSpecId) {
		this.charSpecId = charSpecId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDisplayValue() {
		return displayValue;
	}
	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValueFrom() {
		return valueFrom;
	}
	public void setValueFrom(String valueFrom) {
		this.valueFrom = valueFrom;
	}
	public String getValueTo() {
		return valueTo;
	}
	public void setValueTo(String valueTo) {
		this.valueTo = valueTo;
	}
	public Integer getSeqId() {
		return seqId;
	}
	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
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
	public Integer getIncrement() {
		return increment;
	}
	public void setIncrement(Integer increment) {
		this.increment = increment;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
