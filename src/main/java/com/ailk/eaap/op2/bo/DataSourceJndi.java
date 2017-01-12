package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class DataSourceJndi implements Serializable{
private static final long serialVersionUID = 1L;
	private Long dataSourceId;
	private String jndiName;
	private String remarks;
	private String state;
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
	public void setDataSourceId(Long dataSourceId){
		this.dataSourceId=dataSourceId;
	}
	public Long getDataSourceId(){
		return this.dataSourceId;
	}
	public void setJndiName(String jndiName){
		this.jndiName=jndiName;
	}
	public String getJndiName(){
		return this.jndiName;
	}
	public void setRemarks(String remarks){
		this.remarks=remarks;
	}
	public String getRemarks(){
		return this.remarks;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
