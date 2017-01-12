package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 自定义端点上下文参数列表
 * @author MAWL
 *
 */
public class ContextParamList  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String end_point_id;//端点ID
	private List<ContextParam> contextParamList;//上下文参数列表
	private String dy_script_content;//动态脚本内容
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
	public String getEnd_point_id() {
		return end_point_id;
	}
	public void setEnd_point_id(String end_point_id) {
		this.end_point_id = end_point_id;
	}
	public List<ContextParam> getContextParamList() {
		return contextParamList;
	}
	public void setContextParamList(List<ContextParam> contextParamList) {
		this.contextParamList = contextParamList;
	}
	public String getDy_script_content() {
		return dy_script_content;
	}
	public void setDy_script_content(String dy_script_content) {
		this.dy_script_content = dy_script_content;
	}
}
