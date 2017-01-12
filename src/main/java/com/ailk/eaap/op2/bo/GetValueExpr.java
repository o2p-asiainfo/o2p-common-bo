package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GetValueExpr implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer exprId;
	private int condEvaluatorId;
	private int upExprId;
	private String expr;
	private String condEvaluatorCode;
	private List<XmlNameSpace> xmlNameSpace;
	private Map nameSpaceMap;
	private GetValueExpr childExpr;
	private String reqRsp;
	private String exprType;
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
	public Map getNameSpaceMap() {
		return nameSpaceMap;
	}
	public void setNameSpaceMap(Map nameSpaceMap) {
		this.nameSpaceMap = nameSpaceMap;
	}



	public GetValueExpr getChildExpr() {
		return childExpr;
	}
	public void setChildExpr(GetValueExpr childExpr) {
		this.childExpr = childExpr;
	}
	public Integer getExprId() {
		return exprId;
	}
	public void setExprId(Integer exprId) {
		this.exprId = exprId;
	}
	public void setCondEvaluatorId(int condEvaluatorId){
		this.condEvaluatorId=condEvaluatorId;
	}
	public int getCondEvaluatorId(){
		return this.condEvaluatorId;
	}
	public void setUpExprId(int upExprId){
		this.upExprId=upExprId;
	}
	public int getUpExprId(){
		return this.upExprId;
	}
	public void setExpr(String expr){
		this.expr=expr;
	}
	public String getExpr(){
		return this.expr;
	}
	public String getCondEvaluatorCode() {
		return condEvaluatorCode;
	}
	public void setCondEvaluatorCode(String condEvaluatorCode) {
		this.condEvaluatorCode = condEvaluatorCode;
	}
	public List<XmlNameSpace> getXmlNameSpace() {
		return xmlNameSpace;
	}
	public void setXmlNameSpace(List<XmlNameSpace> xmlNameSpace) {
		this.xmlNameSpace = xmlNameSpace;
	}
	public String getReqRsp() {
		return reqRsp;
	}
	public void setReqRsp(String reqRsp) {
		this.reqRsp = reqRsp;
	}
	public String getExprType() {
		return exprType;
	}
	public void setExprType(String exprType) {
		this.exprType = exprType;
	}

}
