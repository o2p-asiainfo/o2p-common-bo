package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class ContractVersion implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer contractVersionId;
	private String contractId;
	private String version;
	private Date createTime;
	private String state;
	private Date lastestTime;
	private Date effDate;
	private Date expDate;
	private String descriptor;
	private String isNeedCheck;
	private Contract contract;
	private ContractVersion baseContractVersion;
	private ContractFormat reqContractFormat;
	private ContractFormat rspContractFormat;
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
	public Integer getContractVersionId() {
		return contractVersionId;
	}
	public String getContractId() {
		return contractId;
	}
	public void setContractId(String contractId) {
		this.contractId = contractId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getLastestTime() {
		return lastestTime;
	}
	public void setLastestTime(Date lastestTime) {
		this.lastestTime = lastestTime;
	}
	public Date getEffDate() {
		return effDate;
	}
	public void setEffDate(Date effDate) {
		this.effDate = effDate;
	}
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getDescriptor() {
		return descriptor;
	}
	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}
	public String getIsNeedCheck() {
		return isNeedCheck;
	}
	public void setIsNeedCheck(String isNeedCheck) {
		this.isNeedCheck = isNeedCheck;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public ContractVersion getBaseContractVersion() {
		return baseContractVersion;
	}
	public void setBaseContractVersion(ContractVersion baseContractVersion) {
		this.baseContractVersion = baseContractVersion;
	}
	public ContractFormat getReqContractFormat() {
		return reqContractFormat;
	}
	public void setReqContractFormat(ContractFormat reqContractFormat) {
		this.reqContractFormat = reqContractFormat;
	}
	public ContractFormat getRspContractFormat() {
		return rspContractFormat;
	}
	public void setRspContractFormat(ContractFormat rspContractFormat) {
		this.rspContractFormat = rspContractFormat;
	}
	public void setContractVersionId(Integer contractVersionId) {
		this.contractVersionId = contractVersionId;
	}

	

}
