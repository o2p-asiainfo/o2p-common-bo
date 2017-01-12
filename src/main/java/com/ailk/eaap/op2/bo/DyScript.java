package com.ailk.eaap.op2.bo;
/**
 * 动态脚本
 * @author MAWL
 *
 */
public class DyScript {

	private String dy_script_id;
	private String end_point_id;
	private String dy_script_content;
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
	public String getDy_script_id() {
		return dy_script_id;
	}
	public void setDy_script_id(String dy_script_id) {
		this.dy_script_id = dy_script_id;
	}
	public String getEnd_point_id() {
		return end_point_id;
	}
	public void setEnd_point_id(String end_point_id) {
		this.end_point_id = end_point_id;
	}
	public String getDy_script_content() {
		return dy_script_content;
	}
	public void setDy_script_content(String dy_script_content) {
		this.dy_script_content = dy_script_content;
	}
}
