package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ExprNameSpace implements Serializable{
private static final long serialVersionUID = 1L;
	private int exprId;
	private int nameSpaceId;
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
	public void setExprId(int exprId){
		this.exprId=exprId;
	}
	public int getExprId(){
		return this.exprId;
	}
	public void setNameSpaceId(int nameSpaceId){
		this.nameSpaceId=nameSpaceId;
	}
	public int getNameSpaceId(){
		return this.nameSpaceId;
	}
}
