package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class DataSourceRoute implements Serializable{
private static final long serialVersionUID = 1L;
	private String dataSourceRouteId;
	private String decisionRule;
	private String pri;
	private String dataSourceId;
	private String state;
	private String stateDate;
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
	public void setDataSourceRouteId(String dataSourceRouteId){
		this.dataSourceRouteId=dataSourceRouteId;
	}
	public String getDataSourceRouteId(){
		return this.dataSourceRouteId;
	}
	public void setDecisionRule(String decisionRule){
		this.decisionRule=decisionRule;
	}
	public String getDecisionRule(){
		return this.decisionRule;
	}
	public void setPri(String pri){
		this.pri=pri;
	}
	public String getPri(){
		return this.pri;
	}
	public void setDataSourceId(String dataSourceId){
		this.dataSourceId=dataSourceId;
	}
	public String getDataSourceId(){
		return this.dataSourceId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public String getStateDate() {
		return stateDate;
	}
	public void setStateDate(String stateDate) {
		this.stateDate = stateDate;
	}

}
