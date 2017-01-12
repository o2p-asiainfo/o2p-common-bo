package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class FileType implements Serializable{
private static final long serialVersionUID = 1L;
	private String fileTypeCd;
	private String fileTypeName;
	private String fileSuffix;
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
	public void setFileTypeCd(String fileTypeCd){
		this.fileTypeCd=fileTypeCd;
	}
	public String getFileTypeCd(){
		return this.fileTypeCd;
	}
	public void setFileTypeName(String fileTypeName){
		this.fileTypeName=fileTypeName;
	}
	public String getFileTypeName(){
		return this.fileTypeName;
	}
	public void setFileSuffix(String fileSuffix){
		this.fileSuffix=fileSuffix;
	}
	public String getFileSuffix(){
		return this.fileSuffix;
	}
}
