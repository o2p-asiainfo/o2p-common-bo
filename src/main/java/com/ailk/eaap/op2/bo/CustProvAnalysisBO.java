package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CustProvAnalysisBO  implements Serializable {
	private static final long serialVersionUID = 1L;
	//省份id
	private String provCode; 
	//省份名称
	private String provName;
	//总客户数
	private int totalCust;
    //新装客户数
	private int increaseCust;
	//销户客户数
	private int closeCust;
	//净增数
	private int growCust;
	//净增同比率
	private Float growTbRate;
	//净增环比率
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
	public int getTotalCust() {
		return totalCust;
	}
	public void setTotalCust(int totalCust) {
		this.totalCust = totalCust;
	}
	public int getIncreaseCust() {
		return increaseCust;
	}
	public void setIncreaseCust(int increaseCust) {
		this.increaseCust = increaseCust;
	}
	public int getCloseCust() {
		return closeCust;
	}
	public void setCloseCust(int closeCust) {
		this.closeCust = closeCust;
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
	public int getGrowCust() {
		return growCust;
	}
	public void setGrowCust(int growCust) {
		this.growCust = growCust;
	}

	
	
}
