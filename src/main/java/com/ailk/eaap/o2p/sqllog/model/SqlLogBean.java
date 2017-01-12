package com.ailk.eaap.o2p.sqllog.model;

/**
 * @ClassName: SqlLogBean
 * @Description: 
 * @author zhengpeng
 * @date 2015-3-11 下午5:58:57
 *
 */
public class SqlLogBean {
	
	private String sql;
	private Object[] parameters;
	
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	public Object[] getParameters() {
		return parameters;
	}
	public void setParameters(Object[] parameters) {
		this.parameters = parameters;
	} 

}
