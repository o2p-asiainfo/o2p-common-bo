package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

public class CacheStrategy implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String code;
	private String name;
	private String cacheType;
	private String state;
	private String forceRefresh;
	private Integer expireTime;
	private String expireTimePath;
	private Integer tenantId;
	private List cacheObjs;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCacheType() {
		return cacheType;
	}

	public void setCacheType(String cacheType) {
		this.cacheType = cacheType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getForceRefresh() {
		return forceRefresh;
	}

	public void setForceRefresh(String forceRefresh) {
		this.forceRefresh = forceRefresh;
	}


	public Integer getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Integer expireTime) {
		this.expireTime = expireTime;
	}

	public String getExpireTimePath() {
		return expireTimePath;
	}

	public void setExpireTimePath(String expireTimePath) {
		this.expireTimePath = expireTimePath;
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

	public List getCacheObjs() {
		return cacheObjs;
	}

	public void setCacheObjs(List cacheObjs) {
		this.cacheObjs = cacheObjs;
	}


	
}
