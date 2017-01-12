package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class RoutePolicy implements Serializable{
private static final long serialVersionUID = 1L;
	private int routePolicyId;
	private int ruleStrategyId;
	private int routeCondId;
	private String RuleStrategyCode;
	
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
	//直接路由
	public final static String DIRECT = "DIRECT";
	//基于内容路由
	public final static String CONTENT_BASED = "CONTENT_BASED";
	//消息多点分发
	public final static String MULTICAST = "MULTICAST";
	//消息批处理
	public final static String BATCH = "BATCH";
	
	public final static String EVALUATOR_XPATH = "XPATH";
	public final static String EVALUATOR_JXPATH = "JXPATH";
	public final static String EVALUATOR_SIMPLE = "SIMPLE";
	private RouteCondition routeCondition;
	public void setRoutePolicyId(int routePolicyId){
		this.routePolicyId=routePolicyId;
	}
	public int getRoutePolicyId(){
		return this.routePolicyId;
	}
	public void setRuleStrategyId(int ruleStrategyId){
		this.ruleStrategyId=ruleStrategyId;
	}
	public int getRuleStrategyId(){
		return this.ruleStrategyId;
	}
	public void setRouteCondId(int routeCondId){
		this.routeCondId=routeCondId;
	}
	public int getRouteCondId(){
		return this.routeCondId;
	}
	public String getRuleStrategyCode() {
		return RuleStrategyCode;
	}
	public void setRuleStrategyCode(String ruleStrategyCode) {
		RuleStrategyCode = ruleStrategyCode;
	}
	public RouteCondition getRouteCondition() {
		return routeCondition;
	}
	public void setRouteCondition(RouteCondition routeCondition) {
		this.routeCondition = routeCondition;
	}
}
