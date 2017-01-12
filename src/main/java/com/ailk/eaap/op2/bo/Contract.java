package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class Contract implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer contractId;
	private String name;
	private String code;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private String descriptor;
	private Integer baseContractId;
	private Integer isBase;
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
	//private String exceptionCode;
	public void setContractId(Integer contractId){
		this.contractId=contractId;
	}
	public Integer getContractId(){
		return this.contractId;
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
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setDescriptor(String descriptor){
		this.descriptor=descriptor;
	}
	public String getDescriptor(){
		return this.descriptor;
	}
	public Integer getBaseContractId() {
		return baseContractId;
	}
	public void setBaseContractId(Integer baseContractId) {
		this.baseContractId = baseContractId;
	}
/*	public String getExceptionCode() {
		return exceptionCode;
	}
	public void setExceptionCode(String exceptionCode) {
		this.exceptionCode = exceptionCode;
	}*/
	public Integer getIsBase() {
		return isBase;
	}
	public void setIsBase(Integer isBase) {
		this.isBase = isBase;
	}
}
