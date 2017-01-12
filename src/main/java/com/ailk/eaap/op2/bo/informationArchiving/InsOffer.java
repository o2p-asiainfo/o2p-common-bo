package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsOffer  {
    private Long offerInstId;
    private Long custId;
    private String custType;
    private Long userId;
    private Long offerId;
    private String offerType;
    private int state;
    private Date createDate;
    private Date doneDate;
    private int expireProcessType;
    private Long channelType;
    private int srcSystemType;
    private Date effectiveDate;
    private Date expireDate;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	public Long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(Long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getOfferId() {
		return offerId;
	}
	public void setOfferId(Long offerId) {
		this.offerId = offerId;
	}
	public String getOfferType() {
		return offerType;
	}
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getDoneDate() {
		return doneDate;
	}
	public void setDoneDate(Date doneDate) {
		this.doneDate = doneDate;
	}
	public int getExpireProcessType() {
		return expireProcessType;
	}
	public void setExpireProcessType(int expireProcessType) {
		this.expireProcessType = expireProcessType;
	}
	public Long getChannelType() {
		return channelType;
	}
	public void setChannelType(Long channelType) {
		this.channelType = channelType;
	}
	public int getSrcSystemType() {
		return srcSystemType;
	}
	public void setSrcSystemType(int srcSystemType) {
		this.srcSystemType = srcSystemType;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
    

}