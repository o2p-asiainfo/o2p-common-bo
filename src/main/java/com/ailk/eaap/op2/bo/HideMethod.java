package com.ailk.eaap.op2.bo;

import java.io.Serializable;

/**
 * 模糊策略bean
 * @author MAWL
 *
 */
public class HideMethod implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hide_method_id;
	private String hide_field_id;
	private String hide_type_id;
	private String replace_sign;
	private String replace_expression;
	private String is_split;
	private String split_sign;
	private String split_expression;
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
	public String getHide_method_id() {
		return hide_method_id;
	}
	public void setHide_method_id(String hide_method_id) {
		this.hide_method_id = hide_method_id;
	}
	public String getHide_field_id() {
		return hide_field_id;
	}
	public void setHide_field_id(String hide_field_id) {
		this.hide_field_id = hide_field_id;
	}
	public String getHide_type_id() {
		return hide_type_id;
	}
	public void setHide_type_id(String hide_type_id) {
		this.hide_type_id = hide_type_id;
	}
	public String getReplace_sign() {
		return replace_sign;
	}
	public void setReplace_sign(String replace_sign) {
		this.replace_sign = replace_sign;
	}
	public String getReplace_expression() {
		return replace_expression;
	}
	public void setReplace_expression(String replace_expression) {
		this.replace_expression = replace_expression;
	}
	public String getIs_split() {
		return is_split;
	}
	public void setIs_split(String is_split) {
		this.is_split = is_split;
	}
	public String getSplit_sign() {
		return split_sign;
	}
	public void setSplit_sign(String split_sign) {
		this.split_sign = split_sign;
	}
	public String getSplit_expression() {
		return split_expression;
	}
	public void setSplit_expression(String split_expression) {
		this.split_expression = split_expression;
	}
}
