package com.asiainfo.integration.o2p.log.common.bo;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class DataSourceObject  extends BasicDataSource {
	private int dataSourceId;
	private String isBeginInit;
	private String dataSourceType;
	private String jndiName;

	private String dataSourceName;
	
	

	public String getIsBeginInit() {
		return isBeginInit;
	}

	public void setIsBeginInit(String isBeginInit) {
		this.isBeginInit = isBeginInit;
	}

	public String getDataSourceType() {
		return dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public String getJndiName() {
		return jndiName;
	}

	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	public int getDataSourceId() {
		return dataSourceId;
	}

	public void setDataSourceId(int dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	public String getDataSourceName() {
		return dataSourceName;
	}

	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}
	
	
	@Override
	public synchronized void close() throws SQLException {
		DriverManager.deregisterDriver(DriverManager.getDriver(url));
		super.close();
	}
}
