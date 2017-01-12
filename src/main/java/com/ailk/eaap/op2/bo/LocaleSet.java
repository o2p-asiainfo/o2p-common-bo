package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

public class LocaleSet implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer localeSetId;
	private String localeValue;
	private String objectId;
	private String language;
	private String country;
	private Date createTime;
	private String version;
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
	public Integer getLocaleSetId() {
		return localeSetId;
	}
	public void setLocaleSetId(Integer localeSetId) {
		this.localeSetId = localeSetId;
	}
	public String getLocaleValue() {
		return localeValue;
	}
	public void setLocaleValue(String localeValue) {
		this.localeValue = localeValue;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
