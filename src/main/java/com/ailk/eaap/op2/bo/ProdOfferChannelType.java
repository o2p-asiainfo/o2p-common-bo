package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
public class ProdOfferChannelType implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer prodOfferChannelTypeId;
	private BigDecimal prodOfferId;
	private String channelType;
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
	public void setProdOfferChannelTypeId(Integer prodOfferChannelTypeId){
		this.prodOfferChannelTypeId=prodOfferChannelTypeId;
	}
	public Integer getProdOfferChannelTypeId(){
		return this.prodOfferChannelTypeId;
	}
	public void setProdOfferId(BigDecimal prodOfferId){
		this.prodOfferId = prodOfferId;
	}
	public BigDecimal getProdOfferId(){
		return this.prodOfferId;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	 
}
