package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class NodePropertyConfig2 implements Serializable{
private static final long serialVersionUID = 1L;
	private Long propertyId;
	private Long nodeOperId;
	private String operateType;
	private String namespaceflag;
	private String namespaceprefix;
	private String propertyName;
	private String valueGenType;
	private String fixValue;
	private String sortOrder;
	private String srcXmlPath;
	private String srcXmlProperty;
	private String propertyValueSeparator;
	private Long dataSetId;
	private String colName;
	private Integer contConverterId;
	private String contConverterPara;
	private Long methodId;
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
	public void setPropertyId(Long propertyId){
		this.propertyId=propertyId;
	}
	public Long getPropertyId(){
		return this.propertyId;
	}
	public void setNodeOperId(Long nodeOperId){
		this.nodeOperId=nodeOperId;
	}
	public Long getNodeOperId(){
		return this.nodeOperId;
	}
	public void setOperateType(String operateType){
		this.operateType=operateType;
	}
	public String getOperateType(){
		return this.operateType;
	}
	public void setNamespaceflag(String namespaceflag){
		this.namespaceflag=namespaceflag;
	}
	public String getNamespaceflag(){
		return this.namespaceflag;
	}
	public void setNamespaceprefix(String namespaceprefix){
		this.namespaceprefix=namespaceprefix;
	}
	public String getNamespaceprefix(){
		return this.namespaceprefix;
	}
	public void setPropertyName(String propertyName){
		this.propertyName=propertyName;
	}
	public String getPropertyName(){
		return this.propertyName;
	}
	public void setValueGenType(String valueGenType){
		this.valueGenType=valueGenType;
	}
	public String getValueGenType(){
		return this.valueGenType;
	}
	public void setFixValue(String fixValue){
		this.fixValue=fixValue;
	}
	public String getFixValue(){
		return this.fixValue;
	}
	public void setSortOrder(String sortOrder){
		this.sortOrder=sortOrder;
	}
	public String getSortOrder(){
		return this.sortOrder;
	}
	public void setSrcXmlPath(String srcXmlPath){
		this.srcXmlPath=srcXmlPath;
	}
	public String getSrcXmlPath(){
		return this.srcXmlPath;
	}
	public void setSrcXmlProperty(String srcXmlProperty){
		this.srcXmlProperty=srcXmlProperty;
	}
	public String getSrcXmlProperty(){
		return this.srcXmlProperty;
	}
	public void setPropertyValueSeparator(String propertyValueSeparator){
		this.propertyValueSeparator=propertyValueSeparator;
	}
	public String getPropertyValueSeparator(){
		return this.propertyValueSeparator;
	}
	public void setDataSetId(Long dataSetId){
		this.dataSetId=dataSetId;
	}
	public Long getDataSetId(){
		return this.dataSetId;
	}
	public void setColName(String colName){
		this.colName=colName;
	}
	public String getColName(){
		return this.colName;
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
	public void setMethodId(Long methodId){
		this.methodId=methodId;
	}
	public Long getMethodId(){
		return this.methodId;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
