package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;
public class App implements Serializable,DateConvertBeanImpl{
	private static final long serialVersionUID = -8102241435305431263L;
	
	private Integer appId;
	private String appName;
	private String appSumma ;
	private String appUrl ;
	private Integer appDeve;
	private String componentId;
	private String appType;
	private String appOauthType;
	private String appkey;
	private String appsecure;
	@DateConvertField
	private Date appCreateTime;
	private Integer sfileId ;
	private String audutFlowId ;
	private String appState;
	private String appCallbackUrl;
    private List<AppApiList> appApiList;
    private List<Api> apis = new ArrayList<Api>();
    private String oauthCode;
    private String appDesc ;
    private String fileContent;
    private String[] apiMethod;
    private String phoneNum;
    private List<Api> oauthApiList;
    private Integer tokenEnableTime;
    private String componentCode;
    private String componentName;
    private String systemId; 
    private Integer tenantId; //租户id
    private String packageName;
    private String md5;
    
    

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getSystemId() {
		return systemId;
	}

	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}

	public Integer getTenantId() {
		return tenantId;
	}

	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public List<Api> getOauthApiList() {
		return oauthApiList;
	}

	public void setOauthApiList(List<Api> oauthApiList) {
		this.oauthApiList = oauthApiList;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String[] getApiMethod() {
		return apiMethod;
	}

	public void setApiMethod(String[] apiMethod) {
		this.apiMethod = apiMethod;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAppSumma() {
		return appSumma;
	}

	public String getComponentCode() {
		return componentCode;
	}

	public void setComponentCode(String componentCode) {
		this.componentCode = componentCode;
	}

	public String getFileContent() {
		return fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}
	public void setAppSumma(String appSumma) {
		this.appSumma = appSumma;
	}
	public String getAppDesc() {
		return appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public String getAppUrl() {
		return appUrl;
	}
	public void setAppUrl(String appUrl) {
		this.appUrl = appUrl;
	}
	public void setAppId(Integer appId){
		this.appId=appId;
	}
	public Integer getAppId(){
		return this.appId;
	}
	public void setAppName(String appName){
		this.appName=appName;
	}
	public String getAppName(){
		return this.appName;
	}
	public void setAppDeve(Integer appDeve){
		this.appDeve=appDeve;
	}
	public Integer getAppDeve(){
		return this.appDeve;
	}
	public void setComponentId(String componentId){
		this.componentId=componentId;
	}
	public String getComponentId(){
		return this.componentId;
	}
	public void setAppType(String appType){
		this.appType=appType;
	}
	public String getAppType(){
		return this.appType;
	}
	public void setAppOauthType(String appOauthType){
		this.appOauthType=appOauthType;
	}
	public String getAppOauthType(){
		return this.appOauthType;
	}
	public void setAppkey(String appkey){
		this.appkey=appkey;
	}
	public String getAppkey(){
		return this.appkey;
	}
	public void setAppsecure(String appsecure){
		this.appsecure=appsecure;
	}
	public String getAppsecure(){
		return this.appsecure;
	}
	public void setAppCreateTime(Date appCreateTime){
		this.appCreateTime=appCreateTime;
	}
	public Date getAppCreateTime(){
		return this.appCreateTime;
	}
	 
	public void setAppState(String appState){
		this.appState=appState;
	}
	public String getAppState(){
		return this.appState;
	}
	public void setAppCallbackUrl(String appCallbackUrl){
		this.appCallbackUrl=appCallbackUrl;
	}
	public String getAppCallbackUrl(){
		return this.appCallbackUrl;
	}
	 

	public Integer getSfileId() {
		return sfileId;
	}
	public void setSfileId(Integer sfileId) {
		this.sfileId = sfileId;
	}
	public String getAudutFlowId() {
		return audutFlowId;
	}
	public void setAudutFlowId(String audutFlowId) {
		this.audutFlowId = audutFlowId;
	}
	public List<AppApiList> getAppApiList() {
		return appApiList;
	}
	public void setAppApiList(List<AppApiList> appApiList) {
		this.appApiList = appApiList;
	}
	public List<Api> getApis() {
		return apis;
	}
	public void setApis(List<Api> apis) {
		this.apis = apis;
	}
	public String getOauthCode() {
		return oauthCode;
	}
	public void setOauthCode(String oauthCode) {
		this.oauthCode = oauthCode;
	}

	public Integer getTokenEnableTime() {
		return tokenEnableTime;
	}

	public void setTokenEnableTime(Integer tokenEnableTime) {
		this.tokenEnableTime = tokenEnableTime;
	}
}
