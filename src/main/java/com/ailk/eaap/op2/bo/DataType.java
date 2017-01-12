package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class DataType implements Serializable{
private static final long serialVersionUID = 1L;
	private String dataTypeId;
	private String dataTypeName;
	private String dataTypeCode;
	private String dataTypeDesc;
	//数据类型
	public final static String INT = "Integer";
	public final static String SHORT = "Short";
	public final static String LONG = "Long";
	public final static String STRING = "String";
	public final static String LIST_INTEGER = "List<Integer>";
	public final static String LIST_STRING = "List<String>";
	public final static String NULL = "NULL";
	public final static String DATE = "Date";
	public final static String DOUBLE = "Double";
	public final static String BEAN = "Bean";
	public final static String MESSAGE = "Message";
	public final static String JSON = "JSON";
	public final static String XML = "XML";	
	public final static String SOAP = "SOAP";
	public final static String UrlGet = "UrlGet";
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
	public void setDataTypeId(String dataTypeId){
		this.dataTypeId=dataTypeId;
	}
	public String getDataTypeId(){
		return this.dataTypeId;
	}
	public void setDataTypeName(String dataTypeName){
		this.dataTypeName=dataTypeName;
	}
	public String getDataTypeName(){
		return this.dataTypeName;
	}
	public void setDataTypeCode(String dataTypeCode){
		this.dataTypeCode=dataTypeCode;
	}
	public String getDataTypeCode(){
		return this.dataTypeCode;
	}
	public void setDataTypeDesc(String dataTypeDesc){
		this.dataTypeDesc=dataTypeDesc;
	}
	public String getDataTypeDesc(){
		return this.dataTypeDesc;
	}
}
