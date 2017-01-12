package com.ailk.eaap.o2p.fileExchange.model;

import java.util.Date;
import java.util.List;

public class FileMoveRule {
	private int fileMoveRuleId;
	private String moveType;//1：本地搬本地；2：本地搬远程；3：远程搬本地；4远程搬远程
	private DirBean srcdirBean;
	private DirBean tarDirBean;
	private List<DirBean> multiDestDir;
	private String moveRule;//
	private String moveExpr;
	private Date createDt;
	private String state;
	private Date stateDt;
	private String desc;
	public int getFileMoveRuleId() {
		return fileMoveRuleId;
	}
	public void setFileMoveRuleId(int fileMoveRuleId) {
		this.fileMoveRuleId = fileMoveRuleId;
	}
	public String getMoveType() {
		return moveType;
	}
	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}
	public DirBean getSrcdirBean() {
		return srcdirBean;
	}
	public void setSrcdirBean(DirBean srcdirBean) {
		this.srcdirBean = srcdirBean;
	}
	public DirBean getTarDirBean() {
		return tarDirBean;
	}
	public void setTarDirBean(DirBean tarDirBean) {
		this.tarDirBean = tarDirBean;
	}
	public String getMoveRule() {
		return moveRule;
	}
	public void setMoveRule(String moveRule) {
		this.moveRule = moveRule;
	}
	public String getMoveExpr() {
		return moveExpr;
	}
	public void setMoveExpr(String moveExpr) {
		this.moveExpr = moveExpr;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getStateDt() {
		return stateDt;
	}
	public void setStateDt(Date stateDt) {
		this.stateDt = stateDt;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<DirBean> getMultiDestDir() {
		return multiDestDir;
	}
	public void setMultiDestDir(List<DirBean> multiDestDir) {
		this.multiDestDir = multiDestDir;
	}
	
}
