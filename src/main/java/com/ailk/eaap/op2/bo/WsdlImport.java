package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class WsdlImport implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer importId;
	private String resourceAlias;
	private String docVersion;
	private String importObjectType;
	private String importFile;
	private String importUrl;
	private String importType;
	private Date   importTime;
	private String fileAttachId;
	private String fileType;
	private Integer contractDocId;
	private String remark;
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
	
	public Integer getImportId() {
		return importId;
	}
	public void setImportId(Integer importId) {
		this.importId = importId;
	}
	public String getResourceAlias() {
		return resourceAlias;
	}
	public void setResourceAlias(String resourceAlias) {
		this.resourceAlias = resourceAlias;
	}
	public String getDocVersion() {
		return docVersion;
	}
	public void setDocVersion(String docVersion) {
		this.docVersion = docVersion;
	}
	public String getImportObjectType() {
		return importObjectType;
	}
	public void setImportObjectType(String importObjectType) {
		this.importObjectType = importObjectType;
	}
	public String getImportFile() {
		return importFile;
	}
	public void setImportFile(String importFile) {
		this.importFile = importFile;
	}
	public String getImportUrl() {
		return importUrl;
	}
	public void setImportUrl(String importUrl) {
		this.importUrl = importUrl;
	}
	public String getImportType() {
		return importType;
	}
	public void setImportType(String importType) {
		this.importType = importType;
	}
	public Date getImportTime() {
		return importTime;
	}
	public void setImportTime(Date importTime) {
		this.importTime = importTime;
	}
	public String getFileAttachId() {
		return fileAttachId;
	}
	public void setFileAttachId(String fileAttachId) {
		this.fileAttachId = fileAttachId;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public Integer getContractDocId() {
		return contractDocId;
	}
	public void setContractDocId(Integer contractDocId) {
		this.contractDocId = contractDocId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
