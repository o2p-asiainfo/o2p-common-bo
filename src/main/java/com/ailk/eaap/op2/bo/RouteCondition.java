package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.List;
public class RouteCondition implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer routeCondId;
	private int upRouteCondId;
	private Integer getValueExprId;
	private int operatorId;
	private String matchValue;
	private String condRelation;
	private String operatorCode;
	private List<RouteCondition> childRouteConditions;
	private GetValueExpr getValueExpr;
	public final static String AND = "AND";	
	public final static String OR = "OR";	
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
	public List<RouteCondition> getChildRouteConditions() {
		return childRouteConditions;
	}
	public void setChildRouteConditions(List<RouteCondition> childRouteConditions) {
		this.childRouteConditions = childRouteConditions;
	}
	public Integer getRouteCondId() {
		return routeCondId;
	}
	public void setRouteCondId(Integer routeCondId) {
		this.routeCondId = routeCondId;
	}
	public void setUpRouteCondId(int upRouteCondId){
		this.upRouteCondId=upRouteCondId;
	}
	public int getUpRouteCondId(){
		return this.upRouteCondId;
	}


	public Integer getGetValueExprId() {
		return getValueExprId;
	}
	public void setGetValueExprId(Integer getValueExprId) {
		this.getValueExprId = getValueExprId;
	}
	public GetValueExpr getGetValueExpr() {
		return getValueExpr;
	}
	public void setGetValueExpr(GetValueExpr getValueExpr) {
		this.getValueExpr = getValueExpr;
	}
	public void setOperatorId(int operatorId){
		this.operatorId=operatorId;
	}
	public int getOperatorId(){
		return this.operatorId;
	}
	public void setMatchValue(String matchValue){
		this.matchValue=matchValue;
	}
	public String getMatchValue(){
		return this.matchValue;
	}
	public void setCondRelation(String condRelation){
		this.condRelation=condRelation;
	}
	public String getCondRelation(){
		return this.condRelation;
	}
	public String getOperatorCode() {
		return operatorCode;
	}
	public void setOperatorCode(String operatorCode) {
		this.operatorCode = operatorCode;
	}
}
