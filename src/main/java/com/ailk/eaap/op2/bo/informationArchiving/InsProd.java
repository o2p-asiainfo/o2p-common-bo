package com.ailk.eaap.op2.bo.informationArchiving;

import java.util.Date;

public class InsProd  {

    private Long prodInstId;
    private Long offerUserRelatId;
    private Long offerInstId;
    private Long userId;
    private Long prodId;
    private String prodType;
    private int expireProcessType;
    private int state;
    private Date createDate;
    private Date doneDate;
    private Date effectiveDate;
    private Date expireDate;
    private int srcSystemType;
    private String srcSystemExtCode;
    private String busiType;
    private String actType;
    private String mainServerId;
    private String tenantId;
	
	public String getTenantId() {
		return tenantId;
	}
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
    
	public Long getProdInstId() {
		return prodInstId;
	}
	public void setProdInstId(Long prodInstId) {
		this.prodInstId = prodInstId;
	}
	public Long getOfferUserRelatId() {
		return offerUserRelatId;
	}
	public void setOfferUserRelatId(Long offerUserRelatId) {
		this.offerUserRelatId = offerUserRelatId;
	}
	public Long getOfferInstId() {
		return offerInstId;
	}
	public void setOfferInstId(Long offerInstId) {
		this.offerInstId = offerInstId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdType() {
		return prodType;
	}
	public void setProdType(String prodType) {
		this.prodType = prodType;
	}
	public int getExpireProcessType() {
		return expireProcessType;
	}
	public void setExpireProcessType(int expireProcessType) {
		this.expireProcessType = expireProcessType;
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
	public int getSrcSystemType() {
		return srcSystemType;
	}
	public void setSrcSystemType(int srcSystemType) {
		this.srcSystemType = srcSystemType;
	}
	public String getSrcSystemExtCode() {
		return srcSystemExtCode;
	}
	public void setSrcSystemExtCode(String srcSystemExtCode) {
		this.srcSystemExtCode = srcSystemExtCode;
	}
	public String getBusiType() {
		return busiType;
	}
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public String getMainServerId() {
		return mainServerId;
	}
	public void setMainServerId(String mainServerId) {
		this.mainServerId = mainServerId;
	}
    
    
}