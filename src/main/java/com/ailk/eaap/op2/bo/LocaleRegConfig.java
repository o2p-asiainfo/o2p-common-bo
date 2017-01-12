package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LocaleRegConfig implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer localeRegConfigId;
	private String tableName;
	private Date createTime;
	private String version;
	private List<LocaleRegConfigEx> localeRegConfigExs;
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
	public Integer getLocaleRegConfigId() {
		return localeRegConfigId;
	}
	
	public List<LocaleRegConfigEx> getLocaleRegConfigExs() {
		return localeRegConfigExs;
	}

	public void setLocaleRegConfigExs(List<LocaleRegConfigEx> localeRegConfigExs) {
		this.localeRegConfigExs = localeRegConfigExs;
	}

	public void setLocaleRegConfigId(Integer localeRegConfigId) {
		this.localeRegConfigId = localeRegConfigId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
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
