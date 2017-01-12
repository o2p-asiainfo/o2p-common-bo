package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class CatalogItem implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer catalogItemId;
	private Integer upCatalogItemId;
	private String catalogItemName;
	private Integer catalogId;
	private String catalogItemDesc;
	private String catalogItemType;
	private String catalogItemCd;
	private Integer catalogLevel;
	private Integer seqId;
	private String iconUrl;
	private Integer useStatus;
	private String pathName;
	private String state;
	private String isNode;
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
	public Integer getUpCatalogItemId() {
		return upCatalogItemId;
	}
	public void setUpCatalogItemId(Integer upCatalogItemId) {
		this.upCatalogItemId = upCatalogItemId;
	}
	public Integer getCatalogId() {
		return catalogId;
	}
	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}
	public Integer getCatalogLevel() {
		return catalogLevel;
	}
	public void setCatalogLevel(Integer catalogLevel) {
		this.catalogLevel = catalogLevel;
	}
	public Integer getSeqId() {
		return seqId;
	}
	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public Integer getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}
	public String getPathName() {
		return pathName;
	}
	public void setPathName(String pathName) {
		this.pathName = pathName;
	}
	public Integer getCatalogItemId() {
		return catalogItemId;
	}
	public void setCatalogItemId(Integer catalogItemId) {
		this.catalogItemId = catalogItemId;
	}
	public String getCatalogItemName() {
		return catalogItemName;
	}
	public void setCatalogItemName(String catalogItemName) {
		this.catalogItemName = catalogItemName;
	}
	public String getCatalogItemDesc() {
		return catalogItemDesc;
	}
	public void setCatalogItemDesc(String catalogItemDesc) {
		this.catalogItemDesc = catalogItemDesc;
	}
	public String getCatalogItemType() {
		return catalogItemType;
	}
	public void setCatalogItemType(String catalogItemType) {
		this.catalogItemType = catalogItemType;
	}
	public String getCatalogItemCd() {
		return catalogItemCd;
	}
	public void setCatalogItemCd(String catalogItemCd) {
		this.catalogItemCd = catalogItemCd;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIsNode() {
		return isNode;
	}
	public void setIsNode(String isNode) {
		this.isNode = isNode;
	}
}
