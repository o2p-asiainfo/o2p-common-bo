package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ProdOfferAttr implements Serializable{

	
	/**
	 * @author wanglm 
	 * @create time 2013年5月9日 11:09:44
	 * ProdOfferAttr实体类
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer prodOfferAttrId;
	private BigDecimal prodOfferId;
	private Integer attrSpecId;
	private String defaultValue;
	private Date createDate;
	private String minValue;
	private String maxValue;
	private String statusCd;
	private Date statusDate;
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
	
	
	public ProdOfferAttr() {
		super();
	}
	
	public ProdOfferAttr(Integer prodOfferAttrId, BigDecimal prodOfferId,
			Integer attrSpecId, String defaultValue, Date createDate,
			String minValue, String maxValue, String statusCd, Date statusDate) {
		super();
		this.prodOfferAttrId = prodOfferAttrId;
		this.prodOfferId = prodOfferId;
		this.attrSpecId = attrSpecId;
		this.defaultValue = defaultValue;
		this.createDate = createDate;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.statusCd = statusCd;
		this.statusDate = statusDate;
	}
	
	public Integer getProdOfferAttrId() {
		return prodOfferAttrId;
	}
	public void setProdOfferAttrId(Integer prodOfferAttrId) {
		this.prodOfferAttrId = prodOfferAttrId;
	}
	public BigDecimal getProdOfferId() {
		return prodOfferId;
	}

	public void setProdOfferId(BigDecimal prodOfferId) {
		this.prodOfferId = prodOfferId;
	}

	public Integer getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(Integer attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getMinValue() {
		return minValue;
	}
	public void setMinValue(String minValue) {
		this.minValue = minValue;
	}
	public String getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(String maxValue) {
		this.maxValue = maxValue;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public Date getStatusDate() {
		return statusDate;
	}
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	
}
