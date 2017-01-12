package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
public class Auth implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer authId;
	private Integer authObjId;
	private String state;
	private Date stateTime;
	private Date createTime;
	private String authObjType;
	private String authFormula;
	private String reqOrRsp;
	private String authObjOp;
	private Map<String,Object> attrMap = new Hashtable<String,Object>();
	private AuthObj authObj;
	private Integer tenantId;

	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	public Map<String, Object> getAttrMap() {
		return attrMap;
	}
	public void setAttrMap(Map<String, Object> attrMap) {
		this.attrMap = attrMap;
	}
	public Integer getAuthId() {
		return authId;
	}
	public void setAuthId(Integer authId) {
		this.authId = authId;
	}
	public Integer getAuthObjId() {
		return authObjId;
	}
	public void setAuthObjId(Integer authObjId) {
		this.authObjId = authObjId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getStateTime() {
		return stateTime;
	}
	public void setStateTime(Date stateTime) {
		this.stateTime = stateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getAuthObjType() {
		return authObjType;
	}
	public void setAuthObjType(String authObjType) {
		this.authObjType = authObjType;
	}
	public String getAuthFormula() {
		return authFormula;
	}
	public void setAuthFormula(String authFormula) {
		this.authFormula = authFormula;
	}
	public String getReqOrRsp() {
		return reqOrRsp;
	}
	public void setReqOrRsp(String reqOrRsp) {
		this.reqOrRsp = reqOrRsp;
	}
	public String getAuthObjOp() {
		return authObjOp;
	}
	public void setAuthObjOp(String authObjOp) {
		this.authObjOp = authObjOp;
	}
	public AuthObj getAuthObj() {
		return authObj;
	}
	public void setAuthObj(AuthObj authObj) {
		this.authObj = authObj;
	}
	
}
