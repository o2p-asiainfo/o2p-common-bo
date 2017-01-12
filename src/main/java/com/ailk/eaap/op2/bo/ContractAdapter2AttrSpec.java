package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by david on 14-7-28.
 */
public class ContractAdapter2AttrSpec  implements Serializable{
    private static final long serialVersionUID = 1L;

    private int contractAdapter2AttrSpecId;
    private int adapter_id;
    private int attrSpecId;
    private AttrSpec attrSpec;
    private String value;
    private String state;
    private Date create_dt;
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

    public int getContractAdapter2AttrSpecId() {
        return contractAdapter2AttrSpecId;
    }

    public void setContractAdapter2AttrSpecId(int contractAdapter2AttrSpecId) {
        this.contractAdapter2AttrSpecId = contractAdapter2AttrSpecId;
    }

    public int getAdapter_id() {
        return adapter_id;
    }

    public void setAdapter_id(int adapter_id) {
        this.adapter_id = adapter_id;
    }

    public int getAttrSpecId() {
        return attrSpecId;
    }

    public void setAttrSpecId(int attrSpecId) {
        this.attrSpecId = attrSpecId;
    }

    public AttrSpec getAttrSpec() {
        return attrSpec;
    }

    public void setAttrSpec(AttrSpec attrSpec) {
        this.attrSpec = attrSpec;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_dt() {
        return create_dt;
    }

    public void setCreate_dt(Date create_dt) {
        this.create_dt = create_dt;
    }
}
