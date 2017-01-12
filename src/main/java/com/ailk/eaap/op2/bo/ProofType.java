package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ProofType implements Serializable{
private static final long serialVersionUID = 1L;
	private int ptCd;
	private String ptName;
	private String ptCode;
	private String ptDesc;

	public static final String password = "password";
	public static final String ipblack = "ipblack";
	public static final String ipwhite = "ipwhite";
	public static final String psdsign = "password sign";
	public static final String token = "token";
	public static final String LDAP = "ldap";
	public static final String macblack = "macblack";
	public static final String macwhite = "macwhite";
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
	public void setPtCd(int ptCd){
		this.ptCd=ptCd;
	}
	public int getPtCd(){
		return this.ptCd;
	}
	public void setPtName(String ptName){
		this.ptName=ptName;
	}
	public String getPtName(){
		return this.ptName;
	}
	public void setPtCode(String ptCode){
		this.ptCode=ptCode;
	}
	public String getPtCode(){
		return this.ptCode;
	}
	public void setPtDesc(String ptDesc){
		this.ptDesc=ptDesc;
	}
	public String getPtDesc(){
		return this.ptDesc;
	}
}
