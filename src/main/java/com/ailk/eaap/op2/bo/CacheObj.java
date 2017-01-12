package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CacheObj implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String code;
	private String keyRule;
	private String state;
	private String valuePath;
	private Integer cacheStrategyId;
	private Integer tenantId;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getKeyRule() {
		return keyRule;
	}

	public void setKeyRule(String keyRule) {
		this.keyRule = keyRule;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getValuePath() {
		return valuePath;
	}

	public void setValuePath(String valuePath) {
		this.valuePath = valuePath;
	}

	public Integer getCacheStrategyId() {
		return cacheStrategyId;
	}

	public void setCacheStrategyId(Integer cacheStrategyId) {
		this.cacheStrategyId = cacheStrategyId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

}
