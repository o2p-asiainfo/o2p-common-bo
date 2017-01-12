package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ExceptionType implements Serializable{
private static final long serialVersionUID = 1L;
	private String exceptionSpecId;
	private String name;
	private String code;
	private String typeId;
	private String cause;
	private String exceptionReason;
	private String exceptionType;
	private String action;
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
	public void setExceptionSpecId(String exceptionSpecId){
		this.exceptionSpecId=exceptionSpecId;
	}
	public String getExceptionSpecId(){
		return this.exceptionSpecId;
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
	public void setTypeId(String typeId){
		this.typeId=typeId;
	}
	public String getTypeId(){
		return this.typeId;
	}
	public void setCause(String cause){
		this.cause=cause;
	}
	public String getCause(){
		return this.cause;
	}
	public void setExceptionReason(String exceptionReason){
		this.exceptionReason=exceptionReason;
	}
	public String getExceptionReason(){
		return this.exceptionReason;
	}
	public void setExceptionType(String exceptionType){
		this.exceptionType=exceptionType;
	}
	public String getExceptionType(){
		return this.exceptionType;
	}
	public void setAction(String action){
		this.action=action;
	}
	public String getAction(){
		return this.action;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
}
