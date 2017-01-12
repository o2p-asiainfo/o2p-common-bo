package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

public class ParamVarMap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varMapId;	
	private String mapTypeCd;
	private String mapDataSource;
	private String key;
	private String val;
	private Date version;
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
	
	public String getVarMapId() {
		return varMapId;
	}
	public void setVarMapId(String varMapId) {
		this.varMapId = varMapId;
	}
	public String getMapTypeCd() {
		return mapTypeCd;
	}
	public void setMapTypeCd(String mapTypeCd) {
		this.mapTypeCd = mapTypeCd;
	}
	public String getMapDataSource() {
		return mapDataSource;
	}
	public void setMapDataSource(String mapDataSource) {
		this.mapDataSource = mapDataSource;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	public Date getVersion() {
		return version;
	}
	public void setVersion(Date version) {
		this.version = version;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
