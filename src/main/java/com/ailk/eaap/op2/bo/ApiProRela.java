package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ApiProRela implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer apiProRelaId;
	private String productCode;
	private Integer apiId;
	private Date createTime;
	private String state;
	private Date stateTime;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}


	public void setProductCode(String productCode){
		this.productCode=productCode;
	}
	public String getProductCode(){
		return this.productCode;
	}

	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setStateTime(Date stateTime){
		this.stateTime=stateTime;
	}
	public Date getStateTime(){
		return this.stateTime;
	}
	public Integer getApiProRelaId() {
		return apiProRelaId;
	}
	public void setApiProRelaId(Integer apiProRelaId) {
		this.apiProRelaId = apiProRelaId;
	}
	public Integer getApiId() {
		return apiId;
	}
	public void setApiId(Integer apiId) {
		this.apiId = apiId;
	}
}
