package com.ailk.eaap.op2.bo;

import java.io.Serializable;

/**
 * 缓存上下文实例
 * @author MAWL
 *
 */
public class ContextCacheIns  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cache_ins_id;
	private String context_param_id;
	private String cache_ploy_id;
	private String ploy_name;
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
	public String getCache_ins_id() {
		return cache_ins_id;
	}
	public void setCache_ins_id(String cache_ins_id) {
		this.cache_ins_id = cache_ins_id;
	}
	public String getContext_param_id() {
		return context_param_id;
	}
	public void setContext_param_id(String context_param_id) {
		this.context_param_id = context_param_id;
	}
	public String getCache_ploy_id() {
		return cache_ploy_id;
	}
	public void setCache_ploy_id(String cache_ploy_id) {
		this.cache_ploy_id = cache_ploy_id;
	}
	public String getPloy_name() {
		return ploy_name;
	}
	public void setPloy_name(String ploy_name) {
		this.ploy_name = ploy_name;
	}
}
