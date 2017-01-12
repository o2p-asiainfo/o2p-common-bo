package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class UserProvAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	private String provCode; 
	private String provName;
	private int totalUser;
	private int increaseUser;
	private int closeUser;
	private int growUser;
	private Float growTbRate;
	private Float growHbRate;
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
	public String getProvCode() {
		return provCode;
	}
	public void setProvCode(String provCode) {
		this.provCode = provCode;
	}
	public String getProvName() {
		return provName;
	}
	public void setProvName(String provName) {
		this.provName = provName;
	}
	public int getTotalUser() {
		return totalUser;
	}
	public void setTotalUser(int totalUser) {
		this.totalUser = totalUser;
	}
	public int getIncreaseUser() {
		return increaseUser;
	}
	public void setIncreaseUser(int increaseUser) {
		this.increaseUser = increaseUser;
	}
	public int getCloseUser() {
		return closeUser;
	}
	public void setCloseUser(int closeUser) {
		this.closeUser = closeUser;
	}
	public int getGrowUser() {
		return growUser;
	}
	public void setGrowUser(int growUser) {
		this.growUser = growUser;
	}
	public Float getGrowTbRate() {
		return growTbRate;
	}
	public void setGrowTbRate(Float growTbRate) {
		this.growTbRate = growTbRate;
	}
	public Float getGrowHbRate() {
		return growHbRate;
	}
	public void setGrowHbRate(Float growHbRate) {
		this.growHbRate = growHbRate;
	}
	
	
	
	
}
