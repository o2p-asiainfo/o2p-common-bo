package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class GatherCycle implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer gcCd;
	private String name;
	private String gcSEExp;
	private String gcDesc;
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
	public void setGcCd(Integer gcCd){
		this.gcCd=gcCd;
	}
	public Integer getGcCd(){
		return this.gcCd;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public void setGcSEExp(String gcSEExp){
		this.gcSEExp=gcSEExp;
	}
	public String getGcSEExp(){
		return this.gcSEExp;
	}
	public void setGcDesc(String gcDesc){
		this.gcDesc=gcDesc;
	}
	public String getGcDesc(){
		return this.gcDesc;
	}
}
