package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class ContConverter implements Serializable{
private static final long serialVersionUID = 1L;
	private Long contConverterId;
	private String convertConditionType;
	private String convertContentType;
	private String convertContentCodition;
	private String ignorecapital;
	private String scopeType;
	private String coditionExpression;
	private String contentSeparater;
	private String contentMapRegular;
	private String regularParam;
	private String convertContentMethod;
	private String mapType;
	private String mapSource;
	private Long methodId;
	private String descriptions;
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

	public void setContConverterId(Long contConverterId){
		this.contConverterId=contConverterId;
	}
	public Long getContConverterId(){
		return this.contConverterId;
	}
	public void setConvertConditionType(String convertConditionType){
		this.convertConditionType=convertConditionType;
	}
	public String getConvertConditionType(){
		return this.convertConditionType;
	}
	public void setConvertContentType(String convertContentType){
		this.convertContentType=convertContentType;
	}
	public String getConvertContentType(){
		return this.convertContentType;
	}
	public void setConvertContentCodition(String convertContentCodition){
		this.convertContentCodition=convertContentCodition;
	}
	public String getConvertContentCodition(){
		return this.convertContentCodition;
	}
	public void setIgnorecapital(String ignorecapital){
		this.ignorecapital=ignorecapital;
	}
	public String getIgnorecapital(){
		return this.ignorecapital;
	}
	public void setScopeType(String scopeType){
		this.scopeType=scopeType;
	}
	public String getScopeType(){
		return this.scopeType;
	}
	public void setCoditionExpression(String coditionExpression){
		this.coditionExpression=coditionExpression;
	}
	public String getCoditionExpression(){
		return this.coditionExpression;
	}
	public void setContentSeparater(String contentSeparater){
		this.contentSeparater=contentSeparater;
	}
	public String getContentSeparater(){
		return this.contentSeparater;
	}
	public void setContentMapRegular(String contentMapRegular){
		this.contentMapRegular=contentMapRegular;
	}
	public String getContentMapRegular(){
		return this.contentMapRegular;
	}
	public void setRegularParam(String regularParam){
		this.regularParam=regularParam;
	}
	public String getRegularParam(){
		return this.regularParam;
	}
	public void setConvertContentMethod(String convertContentMethod){
		this.convertContentMethod=convertContentMethod;
	}
	public String getConvertContentMethod(){
		return this.convertContentMethod;
	}
	public void setMapType(String mapType){
		this.mapType=mapType;
	}
	public String getMapType(){
		return this.mapType;
	}
	public void setMapSource(String mapSource){
		this.mapSource=mapSource;
	}
	public String getMapSource(){
		return this.mapSource;
	}
	public void setMethodId(Long methodId){
		this.methodId=methodId;
	}
	public Long getMethodId(){
		return this.methodId;
	}
	public void setDescriptions(String descriptions){
		this.descriptions=descriptions;
	}
	public String getDescriptions(){
		return this.descriptions;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
