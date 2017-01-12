package com.ailk.eaap.op2.bo;
/**
 * 上下文参数列表
 * @author MAWL
 *
 */
public enum ContextType{
	/**
	 * 数据源上下文
	 */
	DATA_SOURCE("D"),
	/**
	 * 缓存上下文
	 */
	CACTHE("C"),
	/**
	 * messageBo对象上下文
	 */
	MESSAGEBO("M");
	private String type;
	private ContextType(String type){
		this.type = type;
	}
	public String toString(){
		return this.type;
	}
}