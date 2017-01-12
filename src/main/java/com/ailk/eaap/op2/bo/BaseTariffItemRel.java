package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class BaseTariffItemRel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer basicTariffItemRelId;
	private Integer priceId;
	private Long itemId;
	private Integer itemType;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public Integer getItemType() {
		return itemType;
	}
	public void setItemType(Integer itemType) {
		this.itemType = itemType;
	}
	public Integer getBasicTariffItemRelId() {
		return basicTariffItemRelId;
	}
	public void setBasicTariffItemRelId(Integer basicTariffItemRelId) {
		this.basicTariffItemRelId = basicTariffItemRelId;
	}
	
	
	
}
