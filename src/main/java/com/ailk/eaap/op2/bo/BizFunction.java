package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class BizFunction implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer bizFunctionId;
	private String bizBizFunctionId;
	private String name;
	private String code;
	private Date createTime;
	private String state;
	private Date stateTime;
	private String descriptor;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
    
    
	public Integer getBizFunctionId() {
		return bizFunctionId;
	}
	public void setBizFunctionId(Integer bizFunctionId) {
		this.bizFunctionId = bizFunctionId;
	}
	public void setBizBizFunctionId(String bizBizFunctionId){
		this.bizBizFunctionId=bizBizFunctionId;
	}
	public String getBizBizFunctionId(){
		return this.bizBizFunctionId;
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
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
}
