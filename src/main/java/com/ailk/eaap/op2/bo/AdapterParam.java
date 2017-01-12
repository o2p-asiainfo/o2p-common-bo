package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AdapterParam implements Serializable{
private static final long serialVersionUID = 1L;
	private Long paramId;
	private Long adapterId;
	private String paramName;
	private String paramType;
	private String paramValue;
	private String state;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public void setParamId(Long paramId){
		this.paramId=paramId;
	}
	public Long getParamId(){
		return this.paramId;
	}
	public void setAdapterId(Long adapterId){
		this.adapterId=adapterId;
	}
	public Long getAdapterId(){
		return this.adapterId;
	}
	public void setParamName(String paramName){
		this.paramName=paramName;
	}
	public String getParamName(){
		return this.paramName;
	}
	public void setParamType(String paramType){
		this.paramType=paramType;
	}
	public String getParamType(){
		return this.paramType;
	}
	public void setParamValue(String paramValue){
		this.paramValue=paramValue;
	}
	public String getParamValue(){
		return this.paramValue;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
