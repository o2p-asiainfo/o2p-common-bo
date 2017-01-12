package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ControlCounterms implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer ccCd;
	private String name;
	private String cutmsType;
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
	
	public void setCcCd(Integer ccCd){
		this.ccCd=ccCd;
	}
	public Integer getCcCd(){
		return this.ccCd;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setCutmsType(String cutmsType){
		this.cutmsType=cutmsType;
	}
	public String getCutmsType(){
		return this.cutmsType;
	}
}
