package com.ailk.eaap.op2.bo;
import java.io.Serializable;
public class UseStatCntSec implements Serializable,Cloneable{
private static final long serialVersionUID = 1L;
	private Long transsctId;
	private String dateTranId;
	private String dateType;
	private String bizCode;
	private String bizIntfCode;
	private String contractVersion;
	private String sysCode;
	private Integer totalTrans;
	private Integer totalBizErr;
	private Integer totalSysErr;
	private Integer totalNoGrant;
	private Integer qos;
	private Object countTime;
	private Long oneServeTime;
	private String dataSourceKey;
	private String tableId;
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

	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public void setTranssctId(Long transsctId){
		this.transsctId=transsctId;
	}
	public Long getTranssctId(){
		return this.transsctId;
	}
	public void setDateTranId(String dateTranId){
		this.dateTranId=dateTranId;
	}
	public String getDateTranId(){
		return this.dateTranId;
	}
	public void setDateType(String dateType){
		this.dateType=dateType;
	}
	public String getDateType(){
		return this.dateType;
	}
	public void setBizCode(String bizCode){
		this.bizCode=bizCode;
	}
	public String getBizCode(){
		return this.bizCode;
	}
	public void setBizIntfCode(String bizIntfCode){
		this.bizIntfCode=bizIntfCode;
	}
	public String getBizIntfCode(){
		return this.bizIntfCode;
	}
	public void setContractVersion(String contractVersion){
		this.contractVersion=contractVersion;
	}
	public String getContractVersion(){
		return this.contractVersion;
	}
	public void setSysCode(String sysCode){
		this.sysCode=sysCode;
	}
	public String getSysCode(){
		return this.sysCode;
	}
	public void setTotalTrans(Integer totalTrans){
		this.totalTrans=totalTrans;
	}
	public Integer getTotalTrans(){
		return this.totalTrans;
	}
	public void setTotalBizErr(Integer totalBizErr){
		this.totalBizErr=totalBizErr;
	}
	public Integer getTotalBizErr(){
		return this.totalBizErr;
	}
	public void setTotalSysErr(Integer totalSysErr){
		this.totalSysErr=totalSysErr;
	}
	public Integer getTotalSysErr(){
		return this.totalSysErr;
	}
	public void setTotalNoGrant(Integer totalNoGrant){
		this.totalNoGrant=totalNoGrant;
	}
	public Integer getTotalNoGrant(){
		return this.totalNoGrant;
	}
	public void setQos(Integer qos){
		this.qos=qos;
	}
	public Integer getQos(){
		return this.qos;
	}
	public void setCountTime(Object countTime){
		this.countTime=countTime;
	}
	public Object getCountTime(){
		return this.countTime;
	}
	public Long getOneServeTime() {
		return oneServeTime;
	}
	public void setOneServeTime(Long oneServeTime) {
		this.oneServeTime = oneServeTime;
	}
	public String getDataSourceKey() {
		return dataSourceKey;
	}
	public void setDataSourceKey(String dataSourceKey) {
		this.dataSourceKey = dataSourceKey;
	}	
	@Override
	    public Object clone() {
	        try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
	    }
}
