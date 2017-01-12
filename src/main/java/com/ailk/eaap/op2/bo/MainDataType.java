package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
public class MainDataType implements Serializable{
private static final long serialVersionUID = 1L;
	private String mdtCd;
	private String mdtName;
	private String mdtDesc;
	private Date createTime;
	private String state;
	private Date lastestTime;
    private String mdtSign ;
    private List<MainData> mainDatas;
    private String operateCode;
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
	public String getMdtSign() {
		return mdtSign;
	}
	public void setMdtSign(String mdtSign) {
		this.mdtSign = mdtSign;
	}
	public void setMdtCd(String mdtCd){
		this.mdtCd=mdtCd;
	}
	public String getMdtCd(){
		return this.mdtCd;
	}
	public void setMdtName(String mdtName){
		this.mdtName=mdtName;
	}
	public String getMdtName(){
		return this.mdtName;
	}
	public void setMdtDesc(String mdtDesc){
		this.mdtDesc=mdtDesc;
	}
	public String getMdtDesc(){
		return this.mdtDesc;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public List<MainData> getMainDatas() {
		return mainDatas;
	}
	public void setMainDatas(List<MainData> mainDatas) {
		this.mainDatas = mainDatas;
	}
	public String getOperateCode() {
		return operateCode;
	}
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
	
}
