package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class EndpointSpecAttr implements Serializable{
private static final long serialVersionUID = 1L;
	private int endpointSpecAttrId;
	private int attrSpecId;
	private int endpointSpecId;
	private String state;
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
	public void setEndpointSpecAttrId(int endpointSpecAttrId){
		this.endpointSpecAttrId=endpointSpecAttrId;
	}
	public int getEndpointSpecAttrId(){
		return this.endpointSpecAttrId;
	}
	public void setAttrSpecId(int attrSpecId){
		this.attrSpecId=attrSpecId;
	}
	public int getAttrSpecId(){
		return this.attrSpecId;
	}
	public void setEndpointSpecId(int endpointSpecId){
		this.endpointSpecId=endpointSpecId;
	}
	public int getEndpointSpecId(){
		return this.endpointSpecId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
