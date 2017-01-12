package com.ailk.eaap.o2p.sqllog.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class OperateLog implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long logId;
    private String userName;
    private String userIp;
    private String tableName;
    private String optType;
    private String execClass;
    private String execMethod;
    private long createDate;
    private String sqlLog;
    private Integer tenantId;
    private List<OperateLogData> logDataList; 
    

	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	public String getExecMethod() {
		return execMethod;
	}
	public void setExecMethod(String execMethod) {
		this.execMethod = execMethod;
	}
	public List<OperateLogData> getLogDataList() {
		return logDataList;
	}
	public void setLogDataList(List<OperateLogData> logDataList) {
		this.logDataList = logDataList;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getOptType() {
		return optType;
	}
	public void setOptType(String optType) {
		this.optType = optType;
	}
	public String getExecClass() {
		return execClass;
	}
	public void setExecClass(String execClass) {
		this.execClass = execClass;
	}
	public String getSqlLog() {
		return sqlLog;
	}
	public void setSqlLog(String sqlLog) {
		this.sqlLog = sqlLog;
	}
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	
}