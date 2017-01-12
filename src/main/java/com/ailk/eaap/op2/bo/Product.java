package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class Product implements Serializable, DateConvertBeanImpl {
	private static final long serialVersionUID = 1L;
	private BigDecimal productId;
	private String productNbr;
	private String productName;
	private String productDesc;
	private String manageGrade;
	private String productType;
	private Integer productProviderId;
	private String statusCd;
	private Date statusDate;
	@DateConvertField
	private Date effDate;
	@DateConvertField
	private Date expDate;
	private Date createDate;
	private String prodFuncType;
	private String extProdId;
	private String valueAddedFlag;
	private String innerProdNbr;
	private Long commonRegionId;
	private String isTemplate;
	private Integer parentProductId;
	private String cooperationType;
	private String auditFlowId;
	private String formatEffDate = DefaultVlueUtils.getNowDate(0);
	private String formatExpDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
	private String productPublisher;
	private Integer sFileId;
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

	private List<OfferProdRel> offerProdRelList;
	

	public List<OfferProdRel> getOfferProdRelList() {
		return offerProdRelList;
	}

	public void setOfferProdRelList(List<OfferProdRel> offerProdRelList) {
		this.offerProdRelList = offerProdRelList;
	}

	public void setProductNbr(String productNbr) {
		this.productNbr = productNbr;
	}

	public BigDecimal getProductId() {
		return productId;
	}

	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}

	public String getProductNbr() {
		return this.productNbr;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setManageGrade(String manageGrade) {
		this.manageGrade = manageGrade;
	}

	public String getManageGrade() {
		return this.manageGrade;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductProviderId(Integer productProviderId) {
		this.productProviderId = productProviderId;
	}

	public Integer getProductProviderId() {
		return this.productProviderId;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public String getAuditFlowId() {
		return auditFlowId;
	}

	public void setAuditFlowId(String auditFlowId) {
		this.auditFlowId = auditFlowId;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}

	public Date getEffDate() {
		return this.effDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Date getExpDate() {
		return this.expDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setProdFuncType(String prodFuncType) {
		this.prodFuncType = prodFuncType;
	}

	public String getProdFuncType() {
		return this.prodFuncType;
	}

	public void setExtProdId(String extProdId) {
		this.extProdId = extProdId;
	}

	public String getExtProdId() {
		return this.extProdId;
	}

	public void setValueAddedFlag(String valueAddedFlag) {
		this.valueAddedFlag = valueAddedFlag;
	}

	public String getValueAddedFlag() {
		return this.valueAddedFlag;
	}

	public void setInnerProdNbr(String innerProdNbr) {
		this.innerProdNbr = innerProdNbr;
	}

	public String getInnerProdNbr() {
		return this.innerProdNbr;
	}

	public void setCommonRegionId(Long commonRegionId) {
		this.commonRegionId = commonRegionId;
	}

	public Long getCommonRegionId() {
		return this.commonRegionId;
	}

	public void setIsTemplate(String isTemplate) {
		this.isTemplate = isTemplate;
	}

	public String getIsTemplate() {
		return this.isTemplate;
	}

	public void setParentProductId(Integer parentProductId) {
		this.parentProductId = parentProductId;
	}

	public Integer getParentProductId() {
		return this.parentProductId;
	}

	public String getCooperationType() {
		return cooperationType;
	}

	public void setCooperationType(String cooperationType) {
		this.cooperationType = cooperationType;
	}

	public String getFormatEffDate() {
		return formatEffDate;
	}

	public void setFormatEffDate(String formatEffDate) {
		this.formatEffDate = formatEffDate;
	}

	public String getFormatExpDate() {
		return formatExpDate;
	}

	public void setFormatExpDate(String formatExpDate) {
		this.formatExpDate = formatExpDate;
	}

	public String getProductPublisher() {
		return productPublisher;
	}

	public void setProductPublisher(String productPublisher) {
		this.productPublisher = productPublisher;
	}

	public String getNowDate(Integer num) {
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		if (num == -2) {
			return c.getTimeInMillis() + "";
		}
		StringBuffer sb = new StringBuffer();
		sb.append(c.get(Calendar.YEAR) + num).append("-")
				.append(c.get(Calendar.MONTH) + 1).append("-")
				.append(c.get(Calendar.DAY_OF_MONTH));
		if (num == -1) {
			sb.append(" " + c.get(Calendar.HOUR_OF_DAY)).append(":")
					.append(c.get(Calendar.MINUTE)).append(":")
					.append(c.get(Calendar.SECOND));
		}
		return sb.toString();
	}
	public Integer getSFileId() {
		return sFileId;
	}
	public void setSFileId(Integer sFileId) {
		this.sFileId = sFileId;
	}
	
	
}
