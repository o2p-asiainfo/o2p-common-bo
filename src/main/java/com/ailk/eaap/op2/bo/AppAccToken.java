package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.List;
public class AppAccToken implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer appAccTokId;
	private Integer appId;
	private Integer userId;
	private String accToken;
	private String refToken;
	private Object oauthTime;
	private String oauthApiList;
	private Object enableTime;
	private Object disableTime;
	private Object refEnableTime;
	private Object refDisableTime;
	private UserInfo userInfo;
	private List<Api> apis;
	private App app;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	
	public App getApp() {
		return app;
	}
	public void setApp(App app) {
		this.app = app;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public List<Api> getApis() {
		return apis;
	}
	public void setApis(List<Api> apis) {
		this.apis = apis;
	}
	public void setAccToken(String accToken){
		this.accToken=accToken;
	}
	public String getAccToken(){
		return this.accToken;
	}
	public void setRefToken(String refToken){
		this.refToken=refToken;
	}
	public String getRefToken(){
		return this.refToken;
	}
	public void setOauthTime(Object oauthTime){
		this.oauthTime=oauthTime;
	}
	public Object getOauthTime(){
		return this.oauthTime;
	}
	public void setOauthApiList(String oauthApiList){
		this.oauthApiList=oauthApiList;
	}
	public String getOauthApiList(){
		return this.oauthApiList;
	}
	public void setEnableTime(Object enableTime){
		this.enableTime=enableTime;
	}
	public Object getEnableTime(){
		return this.enableTime;
	}
	public void setDisableTime(Object disableTime){
		this.disableTime=disableTime;
	}
	public Object getDisableTime(){
		return this.disableTime;
	}
	public void setRefEnableTime(Object refEnableTime){
		this.refEnableTime=refEnableTime;
	}
	public Object getRefEnableTime(){
		return this.refEnableTime;
	}
	public void setRefDisableTime(Object refDisableTime){
		this.refDisableTime=refDisableTime;
	}
	public Object getRefDisableTime(){
		return this.refDisableTime;
	}
	public Integer getAppAccTokId() {
		return appAccTokId;
	}
	public void setAppAccTokId(Integer appAccTokId) {
		this.appAccTokId = appAccTokId;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
