package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

public class ConfProperties implements Serializable
{
    /**
     * serialVersionUID:TODO.
     * 
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;

    private int id;
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
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    private String proKey;

    private String proValue;

    private String proDataType;

    private String moduleName;

    private String groupName;

    private String groupDesc;

    private String effectZone;

    private String proValueBuffer;

    private String proType;

    private int proEncrypt;

    private Date createDt;

    private Date modifyDt;

    public String getProKey()
    {
        return proKey;
    }

    public void setProKey(String proKey)
    {
        this.proKey = proKey;
    }

    public String getProValue()
    {
        return proValue;
    }

    public void setProValue(String proValue)
    {
        this.proValue = proValue;
    }

    public String getProValueBuffer()
    {
        return proValueBuffer;
    }

    public void setProValueBuffer(String proValueBuffer)
    {
        this.proValueBuffer = proValueBuffer;
    }

    public String getProType()
    {
        return proType;
    }

    public void setProType(String proType)
    {
        this.proType = proType;
    }

    public int getProEncrypt()
    {
        return proEncrypt;
    }

    public void setProEncrypt(int proEncrypt)
    {
        this.proEncrypt = proEncrypt;
    }

    public String getProDataType()
    {
        return proDataType;
    }

    public void setProDataType(String proDataType)
    {
        this.proDataType = proDataType;
    }

    public String getModuleName()
    {
        return moduleName;
    }

    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getEffectZone()
    {
        return effectZone;
    }

    public void setEffectZone(String effectZone)
    {
        this.effectZone = effectZone;
    }

    public Date getCreateDt()
    {
        return createDt;
    }

    public void setCreateDt(Date createDt)
    {
        this.createDt = createDt;
    }

    public Date getModifyDt()
    {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt)
    {
        this.modifyDt = modifyDt;
    }

    public String getGroupDesc()
    {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc)
    {
        this.groupDesc = groupDesc;
    }

}
