package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class CondEvaluator implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer condEvaluatorId;
	private String condEvaluatorCode;
	private String condEvaluatorName;
	private String condEvaluatorDesc;
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
	public void setCondEvaluatorId(Integer condEvaluatorId){
		this.condEvaluatorId=condEvaluatorId;
	}
	public Integer getCondEvaluatorId(){
		return this.condEvaluatorId;
	}
	public void setCondEvaluatorCode(String condEvaluatorCode){
		this.condEvaluatorCode=condEvaluatorCode;
	}
	public String getCondEvaluatorCode(){
		return this.condEvaluatorCode;
	}
	public void setCondEvaluatorName(String condEvaluatorName){
		this.condEvaluatorName=condEvaluatorName;
	}
	public String getCondEvaluatorName(){
		return this.condEvaluatorName;
	}
	public void setCondEvaluatorDesc(String condEvaluatorDesc){
		this.condEvaluatorDesc=condEvaluatorDesc;
	}
	public String getCondEvaluatorDesc(){
		return this.condEvaluatorDesc;
	}
}
