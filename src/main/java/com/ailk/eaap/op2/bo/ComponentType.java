package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ComponentType implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer componentTypeId;
	private String name;
	private String code;
	private String descriptor;
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
	public void setComponentTypeId(Integer componentTypeId){
		this.componentTypeId=componentTypeId;
	}
	public Integer getComponentTypeId(){
		return this.componentTypeId;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return this.code;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
}
