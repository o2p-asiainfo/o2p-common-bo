package com.ailk.eaap.op2.bo;

public class PnRangePO {

	private String pnRange ;
	private String pnRangeSize ;
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
	
	public PnRangePO(String pnRange, String pnRangeSize) {
		super();
		this.pnRange = pnRange;
		this.pnRangeSize = pnRangeSize;
	}
	
	public String getPnRange() {
		return pnRange;
	}
	public void setPnRange(String pnRange) {
		this.pnRange = pnRange;
	}
	public String getPnRangeSize() {
		return pnRangeSize;
	}
	public void setPnRangeSize(String pnRangeSize) {
		this.pnRangeSize = pnRangeSize;
	}
	
	
}
