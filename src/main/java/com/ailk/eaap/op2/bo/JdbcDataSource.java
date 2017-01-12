package com.ailk.eaap.op2.bo;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import com.ailk.eaap.op2.bo.inter.PartialSerializable;


public class JdbcDataSource extends BasicDataSource implements Serializable, PartialSerializable {
	
	private static final long serialVersionUID = 1L;
	private int dataSourceId;
	private String dataSourceName;
	private String isBeginInit;
	private String dataSourceType;
	private String jndiName;
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
	private static String[] superNeedInitField = {
		"driverClassName",
		"url",
		"username",
		"password",
		"defaultAutoCommit",
		"defaultReadOnly",
		"defaultTransactionIsolation",
		"initialSize",
		"maxActive",
		"maxIdle",
		"minIdle",
		"maxWait",
		"validationQuery",
		"testOnBorrow",
		"testOnReturn",
		"testWhileIdle",
		"timeBetweenEvictionRunsMillis",
		"numTestsPerEvictionRun",
		"minEvictableIdleTimeMillis",
		"poolPreparedStatements",
		"maxOpenPreparedStatements",
		"accessToUnderlyingConnectionAllowed"
	};
	
	private void writeObject(ObjectOutputStream out) throws Exception {
		out.defaultWriteObject();//先序列化对象 
		for(int i=0; i<superNeedInitField.length; i++) {
			Method m = null;
			Object value = null;
			try {
				m = this.getClass().getMethod("get"+superNeedInitField[i].substring(0,1).toUpperCase()+superNeedInitField[i].substring(1));
			} catch(NoSuchMethodException e) {
				m = this.getClass().getMethod("is"+superNeedInitField[i].substring(0,1).toUpperCase()+superNeedInitField[i].substring(1));
			}
			value = m.invoke(this);
			if(value == null) value = "";
			out.writeObject(value);
		}
	}
	
	@SuppressWarnings("rawtypes")
	private void readObject(ObjectInputStream in) throws Exception{ 
		in.defaultReadObject();//先反序列化对象 
		for(int i=0; i<superNeedInitField.length; i++) {
			Class type = BasicDataSource.class.getDeclaredField(superNeedInitField[i]).getType();
			//无奈之举
			if(type == Boolean.class) type = boolean.class;
			Method m = this.getClass().getMethod("set"+superNeedInitField[i].substring(0,1).toUpperCase()+superNeedInitField[i].substring(1), type);
			Object value = in.readObject();
			if(value == null || value.toString().equals("") || value.toString().equals("0")) continue;
			m.invoke(this, value);
		}
	} 

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
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getSerializableAttr() {
		List<String> resultList =  new ArrayList<String>(Arrays.asList(JdbcDataSource.superNeedInitField));
		resultList.add("dataSourceId");
		resultList.add("dataSourceName");
		return resultList;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof JdbcDataSource)){
			return false;
		}
		JdbcDataSource jds = (JdbcDataSource)obj;
		if(!this.url.equals(jds.url) ||
				!this.driverClassName.equals(jds.driverClassName) ||
				!this.username.equals(jds.username) ||
				!this.password.equals(jds.password)){
			return false;
		}
		return true;
	}
	
}
