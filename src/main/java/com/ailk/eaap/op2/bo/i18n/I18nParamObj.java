package com.ailk.eaap.op2.bo.i18n;

/** 
 * @ClassName: I18NParamBean 
 * @Description: 
 * @author zhengpeng
 * @date 2014-11-4 下午2:16:22 
 * @version V1.0  
 */
public class I18nParamObj {
	/**
	 * 表名
	 */
	private String tableName;
	/**
	 * 表字段名
	 */
	private String columnName;
	/**
	 * 对象或Map的属性名
	 */
	private String propertyName;
	
	/**
	 * id的字段名
	 */
	private String idName;
	/**
	 * 获取国际化后的值
	 */
	private String i18nValue;
	

	public String getI18nValue() {
		return i18nValue;
	}
	public void setI18nValue(String i18nValue) {
		this.i18nValue = i18nValue;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getIdName() {
		return idName;
	}
	public void setIdName(String idName) {
		this.idName = idName;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	@Override
	public String toString() {
		return "I18nParamObj [tableName=" + tableName + ", columnName="
				+ columnName + ", mapKey=" + propertyName + ", idName=" + idName
				+ "]";
	}

}
