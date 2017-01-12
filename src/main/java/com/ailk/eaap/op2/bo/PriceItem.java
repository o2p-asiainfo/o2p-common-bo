package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class PriceItem implements Serializable{
	private static final long serialVersionUID = -8544938306993996770L;
	
	private long itemId;
	private Integer parentItemId;
	public String itemName;
	public String itemType;
	public String itemTypeName;
	public String description;
	public Date createDate;
	public Date version;
	private Integer baseItemType;
	private Integer isLeaf;
	private String operateCode;
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
	
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public Integer getParentItemId() {
		return parentItemId;
	}
	public void setParentItemId(Integer parentItemId) {
		this.parentItemId = parentItemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public Integer getBaseItemType() {
		return baseItemType;
	}
	public void setBaseItemType(Integer baseItemType) {
		this.baseItemType = baseItemType;
	}
	public Integer getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(Integer isLeaf) {
		this.isLeaf = isLeaf;
	}
	public String getItemTypeName() {
		return itemTypeName;
	}
	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}
	public String getOperateCode() {
		return operateCode;
	}
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
	
}
