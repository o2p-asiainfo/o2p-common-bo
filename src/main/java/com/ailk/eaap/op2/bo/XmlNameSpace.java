package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class XmlNameSpace implements Serializable{
private static final long serialVersionUID = 1L;
	private int nameSpaceId;
	private String nameSpacePrefix;
	private String nameSpaceUri;
	private String nameSpaceDesc;
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

	public void setNameSpaceId(int nameSpaceId){
		this.nameSpaceId=nameSpaceId;
	}
	public int getNameSpaceId(){
		return this.nameSpaceId;
	}
	public void setNameSpacePrefix(String nameSpacePrefix){
		this.nameSpacePrefix=nameSpacePrefix;
	}
	public String getNameSpacePrefix(){
		return this.nameSpacePrefix;
	}
	public void setNameSpaceUri(String nameSpaceUri){
		this.nameSpaceUri=nameSpaceUri;
	}
	public String getNameSpaceUri(){
		return this.nameSpaceUri;
	}
	public void setNameSpaceDesc(String nameSpaceDesc){
		this.nameSpaceDesc=nameSpaceDesc;
	}
	public String getNameSpaceDesc(){
		return this.nameSpaceDesc;
	}
}
