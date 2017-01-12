package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class AttrSpec implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer attrSpecId;
	private String attrSpecName;
	private String attrSpecCode;
	private String defaultValue;
	private String nullable;
	private Integer upAttrSpecId;
	private String state;
	private Date createDate;
	private String attrSpecDesc;
	private Integer tenantId;


	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}


	public void setAttrSpecName(String attrSpecName){
		this.attrSpecName=attrSpecName;
	}
	public String getAttrSpecName(){
		return this.attrSpecName;
	}
	public void setAttrSpecCode(String attrSpecCode){
		this.attrSpecCode=attrSpecCode;
	}
	public String getAttrSpecCode(){
		return this.attrSpecCode;
	}
	public void setDefaultValue(String defaultValue){
		this.defaultValue=defaultValue;
	}
	public String getDefaultValue(){
		return this.defaultValue;
	}
	public void setNullable(String nullable){
		this.nullable=nullable;
	}
	public String getNullable(){
		return this.nullable;
	}

	public Integer getAttrSpecId() {
		return attrSpecId;
	}
	public void setAttrSpecId(Integer attrSpecId) {
		this.attrSpecId = attrSpecId;
	}
	public Integer getUpAttrSpecId() {
		return upAttrSpecId;
	}
	public void setUpAttrSpecId(Integer upAttrSpecId) {
		this.upAttrSpecId = upAttrSpecId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setAttrSpecDesc(String attrSpecDesc){
		this.attrSpecDesc=attrSpecDesc;
	}
	public String getAttrSpecDesc(){
		return this.attrSpecDesc;
	}
}
