package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class NodeContentConfig implements Serializable{
private static final long serialVersionUID = 1L;
	private Long nodeOperId;
	private Long nodeId;
	private String contentType;
	private String deleteType;
	private String sortOrder;
	private String conditionalRelation;
	private String fixValue;
	private String srcMapType;
	private Long parDataSetId;
	private Long parNodeOperId;
	private String colName;
	private String autoAddFlag;
	private String restrictionIds;
	private String relationCondition;
	private String relationProduceType;
	private Long methodId;
	private Integer contConverterId;
	private String contConverterPara;
	private String state;
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
	public void setNodeOperId(Long nodeOperId){
		this.nodeOperId=nodeOperId;
	}
	public Long getNodeOperId(){
		return this.nodeOperId;
	}
	public void setNodeId(Long nodeId){
		this.nodeId=nodeId;
	}
	public Long getNodeId(){
		return this.nodeId;
	}
	public void setContentType(String contentType){
		this.contentType=contentType;
	}
	public String getContentType(){
		return this.contentType;
	}
	public void setDeleteType(String deleteType){
		this.deleteType=deleteType;
	}
	public String getDeleteType(){
		return this.deleteType;
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
	public void setFixValue(String fixValue){
		this.fixValue=fixValue;
	}
	public String getFixValue(){
		return this.fixValue;
	}
	public void setSrcMapType(String srcMapType){
		this.srcMapType=srcMapType;
	}
	public String getSrcMapType(){
		return this.srcMapType;
	}
	public void setParDataSetId(Long parDataSetId){
		this.parDataSetId=parDataSetId;
	}
	public Long getParDataSetId(){
		return this.parDataSetId;
	}
	public void setParNodeOperId(Long parNodeOperId){
		this.parNodeOperId=parNodeOperId;
	}
	public Long getParNodeOperId(){
		return this.parNodeOperId;
	}
	public void setColName(String colName){
		this.colName=colName;
	}
	public String getColName(){
		return this.colName;
	}
	public void setAutoAddFlag(String autoAddFlag){
		this.autoAddFlag=autoAddFlag;
	}
	public String getAutoAddFlag(){
		return this.autoAddFlag;
	}
	public void setRestrictionIds(String restrictionIds){
		this.restrictionIds=restrictionIds;
	}
	public String getRestrictionIds(){
		return this.restrictionIds;
	}
	public void setRelationCondition(String relationCondition){
		this.relationCondition=relationCondition;
	}
	public String getRelationCondition(){
		return this.relationCondition;
	}
	public void setRelationProduceType(String relationProduceType){
		this.relationProduceType=relationProduceType;
	}
	public String getRelationProduceType(){
		return this.relationProduceType;
	}
	public void setMethodId(Long methodId){
		this.methodId=methodId;
	}
	public Long getMethodId(){
		return this.methodId;
	}
	public void setContConverterId(Integer contConverterId){
		this.contConverterId=contConverterId;
	}
	public Integer getContConverterId(){
		return this.contConverterId;
	}
	public void setContConverterPara(String contConverterPara){
		this.contConverterPara=contConverterPara;
	}
	public String getContConverterPara(){
		return this.contConverterPara;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
