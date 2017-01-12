package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class Directory implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer dirId;
	private Integer faDirId;
	private Integer sFileId;
	private String dirName;
	private Date dirCreateTime;
	private String dirState;
	private String dirType;
	private Date dirLastestTime;
	private String dirCode;
	private Integer tenantId;

	public void setDirId(Integer dirId){
		this.dirId=dirId;
	}
	public Integer getDirId(){
		return this.dirId;
	}
	public void setFaDirId(Integer faDirId){
		this.faDirId=faDirId;
	}
	public Integer getFaDirId(){
		return this.faDirId;
	}
	public void setDirName(String dirName){
		this.dirName=dirName;
	}
	public String getDirName(){
		return this.dirName;
	}
	public void setDirCreateTime(Date dirCreateTime){
		this.dirCreateTime=dirCreateTime;
	}
	public Date getDirCreateTime(){
		return this.dirCreateTime;
	}
	public void setDirState(String dirState){
		this.dirState=dirState;
	}
	public String getDirState(){
		return this.dirState;
	}
	public void setDirLastestTime(Date dirLastestTime){
		this.dirLastestTime=dirLastestTime;
	}
	public Date getDirLastestTime(){
		return this.dirLastestTime;
	}
	public void setSFileId(Integer sFileId) {
		this.sFileId = sFileId;
	}
	public Integer getSFileId() {
		return sFileId;
	}
	
	public void setDirType(String dirType) {
		this.dirType = dirType;
	}
	public String getDirType() {
		return dirType;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Integer getsFileId() {
		return sFileId;
	}
	public void setsFileId(Integer sFileId) {
		this.sFileId = sFileId;
	}
	public String getDirCode() {
		return dirCode;
	}
	public void setDirCode(String dirCode) {
		this.dirCode = dirCode;
	}
	
}
