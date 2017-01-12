package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class LocaleRegConfigEx implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String columnName;
	private Integer localeRegConfigId;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public Integer getLocaleRegConfigId() {
		return localeRegConfigId;
	}
	public void setLocaleRegConfigId(Integer localeRegConfigId) {
		this.localeRegConfigId = localeRegConfigId;
	}
	
}
