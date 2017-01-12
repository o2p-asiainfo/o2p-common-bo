package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ProdOfferCatalogitem implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer catalogId;
	private String catalogName;
	private String catalogType;
	private String catalogDesc;
	private String catalogCode;
	private String catalogUsage;
	private String commonRegionId;
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
	public Integer getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public String getCatalogType() {
		return catalogType;
	}
	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}
	public String getCatalogDesc() {
		return catalogDesc;
	}
	public void setCatalogDesc(String catalogDesc) {
		this.catalogDesc = catalogDesc;
	}
	public String getCatalogCode() {
		return catalogCode;
	}
	public void setCatalogCode(String catalogCode) {
		this.catalogCode = catalogCode;
	}
	public String getCatalogUsage() {
		return catalogUsage;
	}
	public void setCatalogUsage(String catalogUsage) {
		this.catalogUsage = catalogUsage;
	}
	public String getCommonRegionId() {
		return commonRegionId;
	}
	public void setCommonRegionId(String commonRegionId) {
		this.commonRegionId = commonRegionId;
	}
}
