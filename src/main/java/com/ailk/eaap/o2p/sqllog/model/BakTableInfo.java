package com.ailk.eaap.o2p.sqllog.model;

import java.io.Serializable;

/**
 * @ClassName: BakTableInfo
 * @Description: 
 * @author zhengpeng
 * @date 2015-3-24 上午9:42:05
 *
 */
public class BakTableInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String tableName;
	private String columnName;
	private String dataType;
	private Integer tenantId;
	
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
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}


}
