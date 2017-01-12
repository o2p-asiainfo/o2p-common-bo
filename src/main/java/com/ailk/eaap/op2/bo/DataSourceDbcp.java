package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class DataSourceDbcp implements Serializable{
private static final long serialVersionUID = 1L;
	private Long dataSourceId;
	private String driverclassname;
	private String url;
	private String conpooltype;
	private String username;
	private String passwd;
	private String defaultautocommit;
	private String defaultreadonly;
	private String defaulttransactionisolation;
	private String initialsize;
	private String maxactive;
	private String maxidle;
	private String minidle;
	private String maxwait;
	private String validationquery;
	private String testonborrow;
	private String testonreturn;
	private String testwhileidle;
	private String timebetweenevictionrunsmillis;
	private String numtestsperevictionrun;
	private String minevictableidletimemillis;
	private String poolpreparedstatements;
	private String maxopenpreparedstatements;
	private String accesstounderlyingconnectional;
	private String logabandoned;
	private String removeabandoned;
	private String removeabandonedtimeout;
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
	public void setDataSourceId(Long dataSourceId){
		this.dataSourceId=dataSourceId;
	}
	public Long getDataSourceId(){
		return this.dataSourceId;
	}
	public void setDriverclassname(String driverclassname){
		this.driverclassname=driverclassname;
	}
	public String getDriverclassname(){
		return this.driverclassname;
	}
	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setConpooltype(String conpooltype){
		this.conpooltype=conpooltype;
	}
	public String getConpooltype(){
		return this.conpooltype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPasswd(String passwd){
		this.passwd=passwd;
	}
	public String getPasswd(){
		return this.passwd;
	}
	public void setDefaultautocommit(String defaultautocommit){
		this.defaultautocommit=defaultautocommit;
	}
	public String getDefaultautocommit(){
		return this.defaultautocommit;
	}
	public void setDefaultreadonly(String defaultreadonly){
		this.defaultreadonly=defaultreadonly;
	}
	public String getDefaultreadonly(){
		return this.defaultreadonly;
	}
	public void setDefaulttransactionisolation(String defaulttransactionisolation){
		this.defaulttransactionisolation=defaulttransactionisolation;
	}
	public String getDefaulttransactionisolation(){
		return this.defaulttransactionisolation;
	}
	public void setInitialsize(String initialsize){
		this.initialsize=initialsize;
	}
	public String getInitialsize(){
		return this.initialsize;
	}
	public void setMaxactive(String maxactive){
		this.maxactive=maxactive;
	}
	public String getMaxactive(){
		return this.maxactive;
	}
	public void setMaxidle(String maxidle){
		this.maxidle=maxidle;
	}
	public String getMaxidle(){
		return this.maxidle;
	}
	public void setMinidle(String minidle){
		this.minidle=minidle;
	}
	public String getMinidle(){
		return this.minidle;
	}
	public void setMaxwait(String maxwait){
		this.maxwait=maxwait;
	}
	public String getMaxwait(){
		return this.maxwait;
	}
	public void setValidationquery(String validationquery){
		this.validationquery=validationquery;
	}
	public String getValidationquery(){
		return this.validationquery;
	}
	public void setTestonborrow(String testonborrow){
		this.testonborrow=testonborrow;
	}
	public String getTestonborrow(){
		return this.testonborrow;
	}
	public void setTestonreturn(String testonreturn){
		this.testonreturn=testonreturn;
	}
	public String getTestonreturn(){
		return this.testonreturn;
	}
	public void setTestwhileidle(String testwhileidle){
		this.testwhileidle=testwhileidle;
	}
	public String getTestwhileidle(){
		return this.testwhileidle;
	}
	public void setTimebetweenevictionrunsmillis(String timebetweenevictionrunsmillis){
		this.timebetweenevictionrunsmillis=timebetweenevictionrunsmillis;
	}
	public String getTimebetweenevictionrunsmillis(){
		return this.timebetweenevictionrunsmillis;
	}
	public void setNumtestsperevictionrun(String numtestsperevictionrun){
		this.numtestsperevictionrun=numtestsperevictionrun;
	}
	public String getNumtestsperevictionrun(){
		return this.numtestsperevictionrun;
	}
	public void setMinevictableidletimemillis(String minevictableidletimemillis){
		this.minevictableidletimemillis=minevictableidletimemillis;
	}
	public String getMinevictableidletimemillis(){
		return this.minevictableidletimemillis;
	}
	public void setPoolpreparedstatements(String poolpreparedstatements){
		this.poolpreparedstatements=poolpreparedstatements;
	}
	public String getPoolpreparedstatements(){
		return this.poolpreparedstatements;
	}
	public void setMaxopenpreparedstatements(String maxopenpreparedstatements){
		this.maxopenpreparedstatements=maxopenpreparedstatements;
	}
	public String getMaxopenpreparedstatements(){
		return this.maxopenpreparedstatements;
	}
	public void setAccesstounderlyingconnectional(String accesstounderlyingconnectional){
		this.accesstounderlyingconnectional=accesstounderlyingconnectional;
	}
	public String getAccesstounderlyingconnectional(){
		return this.accesstounderlyingconnectional;
	}
	public void setLogabandoned(String logabandoned){
		this.logabandoned=logabandoned;
	}
	public String getLogabandoned(){
		return this.logabandoned;
	}
	public void setRemoveabandoned(String removeabandoned){
		this.removeabandoned=removeabandoned;
	}
	public String getRemoveabandoned(){
		return this.removeabandoned;
	}
	public void setRemoveabandonedtimeout(String removeabandonedtimeout){
		this.removeabandonedtimeout=removeabandonedtimeout;
	}
	public String getRemoveabandonedtimeout(){
		return this.removeabandonedtimeout;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
}
