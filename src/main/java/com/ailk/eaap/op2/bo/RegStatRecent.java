package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.sql.Timestamp;
public class RegStatRecent implements Serializable,Cloneable {
private static final long serialVersionUID = 1L;
	private Long usingtsrId;
	private String dateTranId;
	private String dateType;
	private String bizCode;
	private String intfCode;
	private String regSerVersion;
	private String dstCode;
	private Integer totalTrans;
	private Integer totalBizErr;
	private Integer totalSysErr;
	private Long avgUsingDst;
	private Integer avgUsing;
	private Object countTime;
	private String dataSourceKey;
	/**
	 * 租户ID
	 */
	

	private int tenantId;
	
	
	public int getTenantId() {
        return tenantId;
    }
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    public void setUsingtsrId(Long usingtsrId){
		this.usingtsrId=usingtsrId;
	}
	public Long getUsingtsrId(){
		return this.usingtsrId;
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
	public void setIntfCode(String intfCode){
		this.intfCode=intfCode;
	}
	public String getIntfCode(){
		return this.intfCode;
	}
	public void setRegSerVersion(String regSerVersion){
		this.regSerVersion=regSerVersion;
	}
	public String getRegSerVersion(){
		return this.regSerVersion;
	}
	public void setDstCode(String dstCode){
		this.dstCode=dstCode;
	}
	public String getDstCode(){
		return this.dstCode;
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
	public void setAvgUsingDst(Long avgUsingDst){
		this.avgUsingDst=avgUsingDst;
	}
	public Long getAvgUsingDst(){
		return this.avgUsingDst;
	}
	public void setAvgUsing(Integer avgUsing){
		this.avgUsing=avgUsing;
	}
	public Integer getAvgUsing(){
		return this.avgUsing;
	}
	public void setCountTime(Object countTime){
		this.countTime=countTime;
	}
	public Object getCountTime(){
		return this.countTime;
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
