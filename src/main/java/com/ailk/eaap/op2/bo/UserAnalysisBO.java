package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class UserAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//查询的时间
	private String queryTime; 
	//总用户数
	private int totalUser;
    //新装用户数
	private int increaseUser;
	//销户用户数
	private int closeUser;
	//净增数
	private int growUser;
	//净增同比率
	private Float growTbUserRate;
	//净增环比率
	private Float growHbUserRate;
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
	public String getQueryTime() {
		return queryTime;
	}
	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
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
	public Float getGrowTbUserRate() {
		return growTbUserRate;
	}
	public void setGrowTbUserRate(Float growTbUserRate) {
		this.growTbUserRate = growTbUserRate;
	}
	public Float getGrowHbUserRate() {
		return growHbUserRate;
	}
	public void setGrowHbUserRate(Float growHbUserRate) {
		this.growHbUserRate = growHbUserRate;
	}

	
	
	
}
