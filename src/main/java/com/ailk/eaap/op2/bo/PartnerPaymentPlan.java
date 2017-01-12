package com.ailk.eaap.op2.bo;

import java.util.Date;

/**
 * PartnerPaymentPlan entity. @author MyEclipse Persistence Tools
 * wanglm7
 */

public class PartnerPaymentPlan implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer paymentPlanId; 
	private Integer accountId;//银行帐号
	private String paymentMethodCd;
	private String paymentBankId;
	private String paymentBankName;//开户银行
	private String paymentAccount;
	private String paymentAccountName;//账户名称
	private String paymentAccountType;
	private Integer priority;
	private String statusCd;
	private Date statusDate;
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

	// Constructors

	/** default constructor */
	public PartnerPaymentPlan() {
	}

	/** minimal constructor */
	public PartnerPaymentPlan(Integer paymentPlanId, String paymentMethodCd) {
		this.paymentPlanId = paymentPlanId;
		this.paymentMethodCd = paymentMethodCd;
	}

	/** full constructor */
	public PartnerPaymentPlan(Integer paymentPlanId,
			Integer accountId, String paymentMethodCd,
			String paymentBankId, String paymentBankName,
			String paymentAccount, String paymentAccountName,
			String paymentAccountType, Integer priority, String statusCd,
			Date statusDate) {
		this.paymentPlanId = paymentPlanId;
		this.accountId = accountId;
		this.paymentMethodCd = paymentMethodCd;
		this.paymentBankId = paymentBankId;
		this.paymentBankName = paymentBankName;
		this.paymentAccount = paymentAccount;
		this.paymentAccountName = paymentAccountName;
		this.paymentAccountType = paymentAccountType;
		this.priority = priority;
		this.statusCd = statusCd;
		this.statusDate = statusDate;
	}

	// Property accessors

	public Integer getPaymentPlanId() {
		return this.paymentPlanId;
	}

	public void setPaymentPlanId(Integer paymentPlanId) {
		this.paymentPlanId = paymentPlanId;
	}

	
	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getPaymentMethodCd() {
		return this.paymentMethodCd;
	}

	public void setPaymentMethodCd(String paymentMethodCd) {
		this.paymentMethodCd = paymentMethodCd;
	}

	public String getPaymentBankId() {
		return this.paymentBankId;
	}

	public void setPaymentBankId(String paymentBankId) {
		this.paymentBankId = paymentBankId;
	}

	public String getPaymentBankName() {
		return this.paymentBankName;
	}

	public void setPaymentBankName(String paymentBankName) {
		this.paymentBankName = paymentBankName;
	}

	public String getPaymentAccount() {
		return this.paymentAccount;
	}

	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}

	public String getPaymentAccountName() {
		return this.paymentAccountName;
	}

	public void setPaymentAccountName(String paymentAccountName) {
		this.paymentAccountName = paymentAccountName;
	}

	public String getPaymentAccountType() {
		return this.paymentAccountType;
	}

	public void setPaymentAccountType(String paymentAccountType) {
		this.paymentAccountType = paymentAccountType;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStatusCd() {
		return this.statusCd;
	}

	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

}
