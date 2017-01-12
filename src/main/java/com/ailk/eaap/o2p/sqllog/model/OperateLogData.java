package com.ailk.eaap.o2p.sqllog.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class OperateLogData implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
    private Long logId;
    private long createDate;
    private String dataLog;
    private String dataKey;
    private Integer tenantId;
    
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public String getDataKey() {
		return dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLogId() {
		return logId;
	}
	public void setLogId(Long logId) {
		this.logId = logId;
	}
	public String getDataLog() {
		return dataLog;
	}
	public void setDataLog(String dataLog) {
		this.dataLog = dataLog;
	}
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}

}