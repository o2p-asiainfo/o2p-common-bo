package com.ailk.eaap.op2.bo;

import java.io.Serializable;


public class ToRouteEndpoint implements Serializable{
	/**
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 1L;
	private RouteEndpoint toEndpoint;
	private RoutePolicy routePolicy;
	private String toEndpointExcutor;
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
	public RouteEndpoint getToEndpoint() {
		return toEndpoint;
	}
	public void setToEndpoint(RouteEndpoint toEndpoint) {
		this.toEndpoint = toEndpoint;
	}
	public RoutePolicy getRoutePolicy() {
		return routePolicy;
	}
	public void setRoutePolicy(RoutePolicy routePolicy) {
		this.routePolicy = routePolicy;
	}
	public String getToEndpointExcutor() {
		return toEndpointExcutor;
	}
	public void setToEndpointExcutor(String toEndpointExcutor) {
		this.toEndpointExcutor = toEndpointExcutor;
	}
	
}
