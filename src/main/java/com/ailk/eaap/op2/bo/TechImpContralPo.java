package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class TechImpContralPo implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer techImpConPoId;
	private String conType;
	private String conState;
	private String conCycle;
	private Integer conCycleValue;
	private Integer conVl;
	private String conAction;
	private Date createTime;
	private String state;
	private List<UsableMonitorConf> usableMonitorConf;
	private Integer techImpl;
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
	public void setTechImpConPoId(Integer techImpConPoId){
		this.techImpConPoId=techImpConPoId;
	}
	public Integer getConCycleValue() {
		return conCycleValue;
	}
	public void setConCycleValue(Integer conCycleValue) {
		this.conCycleValue = conCycleValue;
	}
	public Integer getTechImpConPoId(){
		return this.techImpConPoId;
	}
	public void setConType(String conType){
		this.conType=conType;
	}
	public String getConType(){
		return this.conType;
	}
	public void setConState(String conState){
		this.conState=conState;
	}
	public String getConState(){
		return this.conState;
	}
	public void setConCycle(String conCycle){
		this.conCycle=conCycle;
	}
	public String getConCycle(){
		return this.conCycle;
	}
	public void setConVl(Integer conVl){
		this.conVl=conVl;
	}
	public Integer getConVl(){
		return this.conVl;
	}
	public void setConAction(String conAction){
		this.conAction=conAction;
	}
	public String getConAction(){
		return this.conAction;
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
	public List<UsableMonitorConf> getUsableMonitorConf() {
		return usableMonitorConf;
	}
	public void setUsableMonitorConf(List<UsableMonitorConf> usableMonitorConf) {
		this.usableMonitorConf = usableMonitorConf;
	}
	public Integer getTechImpl() {
		return techImpl;
	}
	public void setTechImpl(Integer techImpl) {
		this.techImpl = techImpl;
	}

}
