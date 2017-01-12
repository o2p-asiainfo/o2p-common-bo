package com.asiainfo.integration.o2p.log.common.bo;
import java.io.Serializable;
import java.sql.Timestamp;
public class UseStatCntRecent implements Serializable,Cloneable{
private static final long serialVersionUID = 1L;
	private Long transscrId;
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
	private Timestamp countTime;
	private Long oneServeTime;
	private String dataSourceKey;
	private int tenantId;

	
	public int getTenantId() {
        return tenantId;
    }
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    public String getDataSourceKey() {
		return dataSourceKey;
	}
	public void setDataSourceKey(String dataSourceKey) {
		this.dataSourceKey = dataSourceKey;
	}
	public void setTransscrId(Long transscrId){
		this.transscrId=transscrId;
	}
	public Long getTransscrId(){
		return this.transscrId;
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
	public void setCountTime(Timestamp countTime){
		this.countTime=countTime;
	}
	public Timestamp getCountTime(){
		return this.countTime;
	}
	public Long getOneServeTime() {
		return oneServeTime;
	}
	public void setOneServeTime(Long oneServeTime) {
		this.oneServeTime = oneServeTime;
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
