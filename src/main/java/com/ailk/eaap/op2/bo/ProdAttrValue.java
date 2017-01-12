package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ProdAttrValue implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer prodAttrValueId;
	private Integer productAttrId;
	private Integer attrValueId;
	private String ruleType;
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
	public void setProdAttrValueId(Integer prodAttrValueId){
		this.prodAttrValueId=prodAttrValueId;
	}
	public Integer getProdAttrValueId(){
		return this.prodAttrValueId;
	}
	public void setProductAttrId(Integer productAttrId){
		this.productAttrId=productAttrId;
	}
	public Integer getProductAttrId(){
		return this.productAttrId;
	}
	public void setAttrValueId(Integer attrValueId){
		this.attrValueId=attrValueId;
	}
	public Integer getAttrValueId(){
		return this.attrValueId;
	}
	public void setRuleType(String ruleType){
		this.ruleType=ruleType;
	}
	public String getRuleType(){
		return this.ruleType;
	}
}
