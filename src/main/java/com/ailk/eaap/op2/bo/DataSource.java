package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class DataSource implements Serializable{
private static final long serialVersionUID = 1L;
	private String dataSourceId;
	private String dataSourceName;
	private String componentId;
	private String tabSuffix;
	private String remarks;
	private String isDefault;
	private String isbegininit;
	
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
	public void setDataSourceId(String dataSourceId){
		this.dataSourceId=dataSourceId;
	}
	public String getDataSourceId(){
		return this.dataSourceId;
	}
	public void setDataSourceName(String dataSourceName){
		this.dataSourceName=dataSourceName;
	}
	public String getDataSourceName(){
		return this.dataSourceName;
	}
	public void setComponentId(String componentId){
		this.componentId=componentId;
	}
	public String getComponentId(){
		return this.componentId;
	}
	public void setTabSuffix(String tabSuffix){
		this.tabSuffix=tabSuffix;
	}
	public String getTabSuffix(){
		return this.tabSuffix;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
	public void setIsDefault(String isDefault){
		this.isDefault=isDefault;
	}
	public String getIsDefault(){
		return this.isDefault;
	}
	public String getIsbegininit() {
		return isbegininit;
	}
	public void setIsbegininit(String isbegininit) {
		this.isbegininit = isbegininit;
	}

	
	
}
