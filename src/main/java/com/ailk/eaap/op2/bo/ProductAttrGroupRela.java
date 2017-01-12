package com.ailk.eaap.op2.bo;
import java.io.Serializable;
 
public class ProductAttrGroupRela implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer groupRelaId ;
	private Integer productAttrId;
	private Integer productAttrGroupId;
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
	public Integer getGroupRelaId() {
		return groupRelaId;
	}
	public void setGroupRelaId(Integer groupRelaId) {
		this.groupRelaId = groupRelaId;
	}
	public Integer getProductAttrId() {
		return productAttrId;
	}
	public void setProductAttrId(Integer productAttrId) {
		this.productAttrId = productAttrId;
	}
	public Integer getProductAttrGroupId() {
		return productAttrGroupId;
	}
	public void setProductAttrGroupId(Integer productAttrGroupId) {
		this.productAttrGroupId = productAttrGroupId;
	}
	 
}
