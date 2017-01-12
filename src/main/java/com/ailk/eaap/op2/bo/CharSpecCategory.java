package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CharSpecCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1787427931919273700L;

	private String charSpecCategoryId;
	private String charSpecId;
	private String categoryCode;
	private Integer tenantId;
	public String getCharSpecCategoryId() {
		return charSpecCategoryId;
	}
	public void setCharSpecCategoryId(String charSpecCategoryId) {
		this.charSpecCategoryId = charSpecCategoryId;
	}
	public String getCharSpecId() {
		return charSpecId;
	}
	public void setCharSpecId(String charSpecId) {
		this.charSpecId = charSpecId;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
