package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class ModelTable implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer modelTableId;
	private String tableOwner;
	private String tableCode;
	private String tableName;
	private Date createTime;
	private Date lastestTime;
	private String state;
	private String tableDesc;
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
	public void setModelTableId(Integer modelTableId){
		this.modelTableId=modelTableId;
	}
	public Integer getModelTableId(){
		return this.modelTableId;
	}
	public void setTableOwner(String tableOwner){
		this.tableOwner=tableOwner;
	}
	public String getTableOwner(){
		return this.tableOwner;
	}
	public void setTableCode(String tableCode){
		this.tableCode=tableCode;
	}
	public String getTableCode(){
		return this.tableCode;
	}
	public void setTableName(String tableName){
		this.tableName=tableName;
	}
	public String getTableName(){
		return this.tableName;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setTableDesc(String tableDesc){
		this.tableDesc=tableDesc;
	}
	public String getTableDesc(){
		return this.tableDesc;
	}
}
