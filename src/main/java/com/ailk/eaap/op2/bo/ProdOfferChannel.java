package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.ailk.eaap.op2.bo.utc.DateConvertField;
public class ProdOfferChannel implements Serializable {
private static final long serialVersionUID = 1L;
	private Integer prodOfferChannelId;
	private BigDecimal prodOfferId;
	private Integer channelId;
	private String statusCd;
	private Integer auditFlowId;
	@DateConvertField
	private Date effDate;
	@DateConvertField
	private Date expDate;
	private String forEffDate = DefaultVlueUtils.getNowDate(0);
	private String forExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
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
	public void setProdOfferChannelId(Integer prodOfferChannelId){
		this.prodOfferChannelId=prodOfferChannelId;
	}
	public Integer getProdOfferChannelId(){
		return this.prodOfferChannelId;
	}
	public void setProdOfferId(BigDecimal prodOfferId){
		this.prodOfferId=prodOfferId;
	}
	public BigDecimal getProdOfferId(){
		return this.prodOfferId;
	}
	public void setChannelId(Integer channelId){
		this.channelId=channelId;
	}
	public Integer getChannelId(){
		return this.channelId;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public Integer getAuditFlowId() {
		return auditFlowId;
	}
	public void setAuditFlowId(Integer auditFlowId) {
		this.auditFlowId = auditFlowId;
	}
	public Date getEffDate() {
		return effDate;
	}
	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getForEffDate() {
		return forEffDate;
	}
	public void setForEffDate(String forEffDate) {
		this.forEffDate = forEffDate;
	}
	public String getForExpDate() {
		return forExpDate;
	}
	public void setForExpDate(String forExpDate) {
		this.forExpDate = forExpDate;
	}
	
}
