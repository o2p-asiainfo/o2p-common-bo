package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;
public class ProductAttr implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer productAttrId;
	private BigDecimal productId;
	private String attrSpecId;
	private String defaultValue;
	private Date createDate;
	private String statusCd;
	private Date statusDate;
	private String productAttrDesc;
	private String displayType;
	private String isAffirmOption;
	private Integer seqId ;
	private String mappingId;
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

	public String getMappingId() {
		return mappingId;
	}
	public void setMappingId(String mappingId) {
		this.mappingId = mappingId;
	}
	public Integer getSeqId() {
		return seqId;
	}
	public void setSeqId(Integer seqId) {
		this.seqId = seqId;
	}
	public void setProductAttrId(Integer productAttrId){
		this.productAttrId=productAttrId;
	}
	public Integer getProductAttrId(){
		return this.productAttrId;
	}
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public String getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(String attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public void setDefaultValue(String defaultValue){
		this.defaultValue=defaultValue;
	}
	public String getDefaultValue(){
		return this.defaultValue;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setStatusCd(String statusCd){
		this.statusCd=statusCd;
	}
	public String getStatusCd(){
		return this.statusCd;
	}
	public void setStatusDate(Date statusDate){
		this.statusDate=statusDate;
	}
	public Date getStatusDate(){
		return this.statusDate;
	}
	public void setProductAttrDesc(String productAttrDesc){
		this.productAttrDesc=productAttrDesc;
	}
	public String getProductAttrDesc(){
		return this.productAttrDesc;
	}
	public void setDisplayType(String displayType){
		this.displayType=displayType;
	}
	public String getDisplayType(){
		return this.displayType;
	}
	public void setIsAffirmOption(String isAffirmOption){
		this.isAffirmOption=isAffirmOption;
	}
	public String getIsAffirmOption(){
		return this.isAffirmOption;
	}
}
