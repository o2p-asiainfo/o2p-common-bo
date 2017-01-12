package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class Func2Service implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer func2SerId;
	private Integer bizFunctionId;
	private Integer serviceId;
	private String state;

	private Integer tenantId;


	
	public void setFunc2SerId(Integer func2SerId){
		this.func2SerId=func2SerId;
	}
	public Integer getFunc2SerId(){
		return this.func2SerId;
	}
	public void setBizFunctionId(Integer bizFunctionId){
		this.bizFunctionId=bizFunctionId;
	}
	public Integer getBizFunctionId(){
		return this.bizFunctionId;
	}
	public void setServiceId(Integer serviceId){
		this.serviceId=serviceId;
	}
	public Integer getServiceId(){
		return this.serviceId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
}
