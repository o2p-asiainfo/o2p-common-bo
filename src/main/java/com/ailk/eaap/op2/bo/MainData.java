package com.ailk.eaap.op2.bo;
import java.util.Date;
import java.io.Serializable;
public class MainData implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer maindId;
	private String mdtCd;
	private Integer baseMaindId;
	private String cepName;
	private String cepCode;
	private String cepValues;
	private String state;
	private Date createTime;
	private Date lastestTime;
	private String cepDes;
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
	public void setMaindId(Integer maindId){
		this.maindId=maindId;
	}
	public Integer getMaindId(){
		return this.maindId;
	}
	public void setMdtCd(String mdtCd){
		this.mdtCd=mdtCd;
	}
	public String getMdtCd(){
		return this.mdtCd;
	}
	public void setBaseMaindId(Integer baseMaindId){
		this.baseMaindId=baseMaindId;
	}
	public Integer getBaseMaindId(){
		return this.baseMaindId;
	}
	public void setCepName(String cepName){
		this.cepName=cepName;
	}
	public String getCepName(){
		return this.cepName;
	}
	public void setCepCode(String cepCode){
		this.cepCode=cepCode;
	}
	public String getCepCode(){
		return this.cepCode;
	}
	public void setCepValues(String cepValues){
		this.cepValues=cepValues;
	}
	public String getCepValues(){
		return this.cepValues;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return this.state;
	}
	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}
	public Date getCreateTime(){
		return this.createTime;
	}
	public void setLastestTime(Date lastestTime){
		this.lastestTime=lastestTime;
	}
	public Date getLastestTime(){
		return this.lastestTime;
	}
	public void setCepDes(String cepDes){
		this.cepDes=cepDes;
	}
	public String getCepDes(){
		return this.cepDes;
	}
	public String getOperateCode() {
		return operateCode;
	}
	public void setOperateCode(String operateCode) {
		this.operateCode = operateCode;
	}
}
