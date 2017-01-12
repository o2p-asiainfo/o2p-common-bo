package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class EndpointAttrValue implements Serializable{
private static final long serialVersionUID = 1L;
	private int endpointAttrValueId;
	private int endpointId;
	private int endpointSpecAttrId;
	private String attrValue;
	private String longAttrValue;
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
	public void setEndpointAttrValueId(int endpointAttrValueId){
		this.endpointAttrValueId=endpointAttrValueId;
	}
	public int getEndpointAttrValueId(){
		return this.endpointAttrValueId;
	}
	public void setEndpointId(int endpointId){
		this.endpointId=endpointId;
	}
	public int getEndpointId(){
		return this.endpointId;
	}
	public void setEndpointSpecAttrId(int endpointSpecAttrId){
		this.endpointSpecAttrId=endpointSpecAttrId;
	}
	public int getEndpointSpecAttrId(){
		return this.endpointSpecAttrId;
	}
	public void setAttrValue(String attrValue){
		this.attrValue=attrValue;
	}
	public String getAttrValue(){
		return this.attrValue;
	}
	public void setLongAttrValue(String longAttrValue){
		this.longAttrValue=longAttrValue;
	}
	public String getLongAttrValue(){
		return this.longAttrValue;
	}
}
