package com.ailk.eaap.o2p.workflow.task.model;

import java.io.Serializable;
import java.util.Date;

public class WorkflowTaskConf implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer taskId;

    private Integer procMod;

    private Integer actMod;
    
    private String actModName;

    private Integer overTime;
    
    private Integer paramMod;
    
    private Integer taskExpressId;
    
    private String status;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getProcMod() {
        return procMod;
    }

    public void setProcMod(Integer procMod) {
        this.procMod = procMod;
    }

    public Integer getActMod() {
        return actMod;
    }

    public void setActMod(Integer actMod) {
        this.actMod = actMod;
    }

    public Integer getOverTime() {
        return overTime;
    }

    public void setOverTime(Integer overTime) {
        this.overTime = overTime;
    }
    
    public Integer getTaskExpressId() {
		return taskExpressId;
	}

	public void setTaskExpressId(Integer taskExpressId) {
		this.taskExpressId = taskExpressId;
	}

	public Integer getParamMod() {
		return paramMod;
	}

	public void setParamMod(Integer paramMod) {
		this.paramMod = paramMod;
	}

	public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

	public String getActModName() {
		return actModName;
	}

	public void setActModName(String actModName) {
		this.actModName = actModName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
}