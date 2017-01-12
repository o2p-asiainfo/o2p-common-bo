package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;
public class Endpoint implements Serializable{
private static final long serialVersionUID = 1L;
	private int endpointId;
	private int endpointSpecId;
	private String endpointSpecCode;
	private String endpointSpecEnableLog;
	private int inDataTypeId;
	private int outDataTypeId;
	private String endpointName;
	private String endpointCode;
	private String enableInTrace;
	private String enableOutTrace;
	private String enableInLog;
	private String enableOutLog;
	private Date createDate;
	private String state;
	private Date lastestDate;
	private String endpointDesc;
	private List<EndpointAttr> endpointAttrList;
	private Map<String, Object> attrMap = null;
	private String inDataTypeCode;
	private String outDataTypeCode;
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
	public String getOutDataTypeCode() {
		return outDataTypeCode;
	}
	public void setOutDataTypeCode(String outDataTypeCode) {
		this.outDataTypeCode = outDataTypeCode;
	}
	public String getInDataTypeCode() {
		return inDataTypeCode;
	}
	public void setInDataTypeCode(String inDataTypeCode) {
		this.inDataTypeCode = inDataTypeCode;
	}
	public List<EndpointAttr> getEndpointAttrList() {
		return endpointAttrList;
	}
	public void setEndpointAttrList(List<EndpointAttr> endpointAttrList) {
		this.endpointAttrList = endpointAttrList;
	}
	public Map<String, Object> getAttrMap() {
		return attrMap;
	}
	public void setAttrMap(Map<String, Object> attrMap) {
		this.attrMap = attrMap;
	}
	public String getEndpointSpecCode() {
		return endpointSpecCode;
	}
	public void setEndpointSpecCode(String endpointSpecCode) {
		this.endpointSpecCode = endpointSpecCode;
	}
	public void setEndpointId(int endpointId){
		this.endpointId=endpointId;
	}
	public int getEndpointId(){
		return this.endpointId;
	}
	public void setEndpointSpecId(int endpointSpecId){
		this.endpointSpecId=endpointSpecId;
	}
	public int getEndpointSpecId(){
		return this.endpointSpecId;
	}
	public void setInDataTypeId(int inDataTypeId){
		this.inDataTypeId=inDataTypeId;
	}
	public int getInDataTypeId(){
		return this.inDataTypeId;
	}
	public void setOutDataTypeId(int outDataTypeId){
		this.outDataTypeId=outDataTypeId;
	}
	public int getOutDataTypeId(){
		return this.outDataTypeId;
	}
	public void setEndpointName(String endpointName){
		this.endpointName=endpointName;
	}
	public String getEndpointName(){
		return this.endpointName;
	}
	public void setEndpointCode(String endpointCode){
		this.endpointCode=endpointCode;
	}
	public String getEndpointCode(){
		return this.endpointCode;
	}
	public void setEnableInTrace(String enableInTrace){
		this.enableInTrace=enableInTrace;
	}
	public String getEnableInTrace(){
		return this.enableInTrace;
	}
	public void setEnableOutTrace(String enableOutTrace){
		this.enableOutTrace=enableOutTrace;
	}
	public String getEnableOutTrace(){
		return this.enableOutTrace;
	}
	public void setEnableInLog(String enableInLog){
		this.enableInLog=enableInLog;
	}
	public String getEnableInLog(){
		return this.enableInLog;
	}
	public void setEnableOutLog(String enableOutLog){
		this.enableOutLog=enableOutLog;
	}
	public String getEnableOutLog(){
		return this.enableOutLog;
	}
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	public Date getCreateDate(){
		return this.createDate;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setLastestDate(Date lastestDate){
		this.lastestDate=lastestDate;
	}
	public Date getLastestDate(){
		return this.lastestDate;
	}
	public void setEndpointDesc(String endpointDesc){
		this.endpointDesc=endpointDesc;
	}
	public String getEndpointDesc(){
		return this.endpointDesc;
	}
	public String getEndpointSpecEnableLog() {
		return endpointSpecEnableLog;
	}
	public void setEndpointSpecEnableLog(String endpointSpecEnableLog) {
		this.endpointSpecEnableLog = endpointSpecEnableLog;
	}
}
