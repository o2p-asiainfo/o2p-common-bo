package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ApapterNodeConfig implements Serializable{
private static final long serialVersionUID = 1L;
	private Long nodeId;
	private Long adapterId;
	private Long parentNodeId;
	private String operateType;
	private String qnameflag;
	private String namespaceprefix;
	private String namespaceuri;
	private String nodeType;
	private String nodeName;
	private String xmlPath;
	private String sortOrder;
	private String conditionalRelation;
	private String limittime;
	private String autoAddFlag;
	private String state;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public void setNodeId(Long nodeId){
		this.nodeId=nodeId;
	}
	public Long getNodeId(){
		return this.nodeId;
	}
	public void setAdapterId(Long adapterId){
		this.adapterId=adapterId;
	}
	public Long getAdapterId(){
		return this.adapterId;
	}
	public void setParentNodeId(Long parentNodeId){
		this.parentNodeId=parentNodeId;
	}
	public Long getParentNodeId(){
		return this.parentNodeId;
	}
	public void setOperateType(String operateType){
		this.operateType=operateType;
	}
	public String getOperateType(){
		return this.operateType;
	}
	public void setQnameflag(String qnameflag){
		this.qnameflag=qnameflag;
	}
	public String getQnameflag(){
		return this.qnameflag;
	}
	public void setNamespaceprefix(String namespaceprefix){
		this.namespaceprefix=namespaceprefix;
	}
	public String getNamespaceprefix(){
		return this.namespaceprefix;
	}
	public void setNamespaceuri(String namespaceuri){
		this.namespaceuri=namespaceuri;
	}
	public String getNamespaceuri(){
		return this.namespaceuri;
	}
	public void setNodeType(String nodeType){
		this.nodeType=nodeType;
	}
	public String getNodeType(){
		return this.nodeType;
	}
	public void setNodeName(String nodeName){
		this.nodeName=nodeName;
	}
	public String getNodeName(){
		return this.nodeName;
	}
	public void setXmlPath(String xmlPath){
		this.xmlPath=xmlPath;
	}
	public String getXmlPath(){
		return this.xmlPath;
	}
	public void setSortOrder(String sortOrder){
		this.sortOrder=sortOrder;
	}
	public String getSortOrder(){
		return this.sortOrder;
	}
	public void setConditionalRelation(String conditionalRelation){
		this.conditionalRelation=conditionalRelation;
	}
	public String getConditionalRelation(){
		return this.conditionalRelation;
	}
	public void setLimittime(String limittime){
		this.limittime=limittime;
	}
	public String getLimittime(){
		return this.limittime;
	}
	public void setAutoAddFlag(String autoAddFlag){
		this.autoAddFlag=autoAddFlag;
	}
	public String getAutoAddFlag(){
		return this.autoAddFlag;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
