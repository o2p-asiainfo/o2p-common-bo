package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class AuthObj implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer authObjId;
	private String authPath;
	private String remark;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public void setAuthObjId(Integer authObjId){
		this.authObjId=authObjId;
	}
	public Integer getAuthObjId(){
		return this.authObjId;
	}
	public void setAuthPath(String authPath){
		this.authPath=authPath;
	}
	public String getAuthPath(){
		return this.authPath;
	}
	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return this.remark;
	}
}
