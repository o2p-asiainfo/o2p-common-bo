package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 上下文参数
 * @author MAWL
 *
 */
public class ContextParam  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String context_param_id;
	private String end_point_id;
	private String context_type_id;
	private String context_type_name;
	private String purview_id;
	private String pass_method_ex;
	private List<ContextCacheIns> listContextCacheIns;
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
	public String getContext_param_id() {
		return context_param_id;
	}
	public void setContext_param_id(String context_param_id) {
		this.context_param_id = context_param_id;
	}
	public String getEnd_point_id() {
		return end_point_id;
	}
	public void setEnd_point_id(String end_point_id) {
		this.end_point_id = end_point_id;
	}
	public List<ContextCacheIns> getListContextCacheIns() {
		return listContextCacheIns;
	}
	public void setListContextCacheIns(List<ContextCacheIns> listContextCacheIns) {
		this.listContextCacheIns = listContextCacheIns;
	}
	public String getContext_type_id() {
		return context_type_id;
	}
	public void setContext_type_id(String context_type_id) {
		this.context_type_id = context_type_id;
	}
	public String getContext_type_name() {
		return context_type_name;
	}
	public void setContext_type_name(String context_type_name) {
		this.context_type_name = context_type_name;
	}
	public String getPurview_id() {
		return purview_id;
	}
	public void setPurview_id(String purview_id) {
		this.purview_id = purview_id;
	}
	public String getPass_method_ex() {
		return pass_method_ex;
	}
	public void setPass_method_ex(String pass_method_ex) {
		this.pass_method_ex = pass_method_ex;
	}
}
