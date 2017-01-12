package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.List;


public class RouteEndpoint implements Serializable{

	/**
	* @Fields serialVersionUID : TODO
	*/
	private static final long serialVersionUID = 1L;
	private Endpoint currentEndpoint;
	//private DefaultEndpoint patentEndpoint;
	//private ToRouteEndpoint[] childEndpoints;
	private List<ToRouteEndpoint> childEndpoints;
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
	public List<ToRouteEndpoint> getChildEndpoints() {
		return childEndpoints;
	}
	public void setChildEndpoints(List<ToRouteEndpoint> childEndpoints) {
		this.childEndpoints = childEndpoints;
	}
	public Endpoint getCurrentEndpoint() {
		return currentEndpoint;
	}
	public void setCurrentEndpoint(Endpoint currentEndpoint) {
		this.currentEndpoint = currentEndpoint;
	}
	
}
