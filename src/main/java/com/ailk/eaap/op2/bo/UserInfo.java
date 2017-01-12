package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class UserInfo implements Serializable{
private static final long serialVersionUID = 1L;
	private int userId;
	private String productNbr;
	private String userCustId;
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

	public void setUserId(int userId){
		this.userId=userId;
	}
	public int getUserId(){
		return this.userId;
	}
	public void setProductNbr(String productNbr){
		this.productNbr=productNbr;
	}
	public String getProductNbr(){
		return this.productNbr;
	}
	public void setUserCustId(String userCustId){
		this.userCustId=userCustId;
	}
	public String getUserCustId(){
		return this.userCustId;
	}
}
