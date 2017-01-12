package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ComparisonOperator implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer operatorId;
	private String operatorCode;
	private String operatorName;
	private String operatorDesc;
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
	public void setOperatorId(Integer operatorId){
		this.operatorId=operatorId;
	}
	public Integer getOperatorId(){
		return this.operatorId;
	}
	public void setOperatorCode(String operatorCode){
		this.operatorCode=operatorCode;
	}
	public String getOperatorCode(){
		return this.operatorCode;
	}
	public void setOperatorName(String operatorName){
		this.operatorName=operatorName;
	}
	public String getOperatorName(){
		return this.operatorName;
	}
	public void setOperatorDesc(String operatorDesc){
		this.operatorDesc=operatorDesc;
	}
	public String getOperatorDesc(){
		return this.operatorDesc;
	}
}
