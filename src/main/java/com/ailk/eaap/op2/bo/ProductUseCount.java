package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ProductUseCount implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer proUserCountId;
	private String productCode;
	private Integer orgId;
	private Integer usedCount;
	private Date cycleBegTime;
	private Date cycleEndTime;
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

	public void setProUserCountId(Integer proUserCountId){
		this.proUserCountId=proUserCountId;
	}
	public Integer getProUserCountId(){
		return this.proUserCountId;
	}
	public void setProductCode(String productCode){
		this.productCode=productCode;
	}
	public String getProductCode(){
		return this.productCode;
	}
	public void setOrgId(Integer orgId){
		this.orgId=orgId;
	}
	public Integer getOrgId(){
		return this.orgId;
	}
	public void setUsedCount(Integer usedCount){
		this.usedCount=usedCount;
	}
	public Integer getUsedCount(){
		return this.usedCount;
	}
	public void setCycleBegTime(Date cycleBegTime){
		this.cycleBegTime=cycleBegTime;
	}
	public Date getCycleBegTime(){
		return this.cycleBegTime;
	}
	public void setCycleEndTime(Date cycleEndTime){
		this.cycleEndTime=cycleEndTime;
	}
	public Date getCycleEndTime(){
		return this.cycleEndTime;
	}
}
