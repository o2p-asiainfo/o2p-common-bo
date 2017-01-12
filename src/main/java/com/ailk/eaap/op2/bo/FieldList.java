package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class FieldList implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer fieldListId;
	private Integer modelTableId;
	private Integer baseFiListId;
	private String fieldName;
	private String fieldCode;
	private String state;
	private Date createTime;
	private String fieldDesc;
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
	public void setFieldListId(Integer fieldListId){
		this.fieldListId=fieldListId;
	}
	public Integer getFieldListId(){
		return this.fieldListId;
	}
	public void setModelTableId(Integer modelTableId){
		this.modelTableId=modelTableId;
	}
	public Integer getModelTableId(){
		return this.modelTableId;
	}
	public void setBaseFiListId(Integer baseFiListId){
		this.baseFiListId=baseFiListId;
	}
	public Integer getBaseFiListId(){
		return this.baseFiListId;
	}
	public void setFieldName(String fieldName){
		this.fieldName=fieldName;
	}
	public String getFieldName(){
		return this.fieldName;
	}
	public void setFieldCode(String fieldCode){
		this.fieldCode=fieldCode;
	}
	public String getFieldCode(){
		return this.fieldCode;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setFieldDesc(String fieldDesc){
		this.fieldDesc=fieldDesc;
	}
	public String getFieldDesc(){
		return this.fieldDesc;
	}
}
