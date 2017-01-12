package com.ailk.eaap.op2.bo;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Clob;
import java.util.Date; 
public class FileShare implements Serializable{
private static final long serialVersionUID = 1L;
   private Integer sFileId ;	 
   private String sFileName ;
   private File   sFileContent ;
   private String state;
   private Date createTime;

   private Integer tenantId;
   
public Integer getTenantId() {
	return tenantId;
}
public void setTenantId(Integer tenantId) {
	this.tenantId = tenantId;
}

public Integer getSFileId() {
	return sFileId;
}
public void setSFileId(Integer fileId) {
	sFileId = fileId;
}
public String getSFileName() {
	return sFileName;
}
public void setSFileName(String fileName) {
	sFileName = fileName;
}
 
public File getSFileContent() {
	return sFileContent;
}
public void setSFileContent(File fileContent) {
	sFileContent = fileContent;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
}
