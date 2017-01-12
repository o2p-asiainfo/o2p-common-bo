/** 
 * Project Name:o2p-common-bo 
 * File Name:FuzzyEncryption.java 
 * Package Name:com.ailk.eaap.op2.bo 
 * Date:2015年3月12日下午4:12:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.ailk.eaap.op2.bo;

import java.io.Serializable;
import java.sql.Date;

/**
 * ClassName:FuzzyEncryption 
 * Function: TODO ADD FUNCTION. 
 * Reason: TODO ADD REASON. 
 * Date: 2015年3月12日 下午4:12:31 
 * 
 * @author zhongming
 * @version
 * @since JDK 1.6
 * 
 */
public class FuzzyEncryption implements Serializable {
	private static final long serialVersionUID = 1L;

	private int fuzzyEncryptionId;
	private String fuzzyEncryptionType;
	private String fuzzyAlternative;
	private int fuzzyStart;
	private int fuzzyEnd;
	private String fuzzySub;
	private String encryptionTypeCode;
	private String state;
	private Date createDate;
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
	public int getFuzzyEncryptionId() {
		return fuzzyEncryptionId;
	}

	public void setFuzzyEncryptionId(int fuzzyEncryptionId) {
		this.fuzzyEncryptionId = fuzzyEncryptionId;
	}

	public String getFuzzyEncryptionType() {
		return fuzzyEncryptionType;
	}

	public void setFuzzyEncryptionType(String fuzzyEncryptionType) {
		this.fuzzyEncryptionType = fuzzyEncryptionType;
	}

	public String getFuzzyAlternative() {
		return fuzzyAlternative;
	}

	public void setFuzzyAlternative(String fuzzyAlternative) {
		this.fuzzyAlternative = fuzzyAlternative;
	}

	public int getFuzzyStart() {
		return fuzzyStart;
	}

	public void setFuzzyStart(int fuzzyStart) {
		this.fuzzyStart = fuzzyStart;
	}

	public int getFuzzyEnd() {
		return fuzzyEnd;
	}

	public void setFuzzyEnd(int fuzzyEnd) {
		this.fuzzyEnd = fuzzyEnd;
	}

	public String getFuzzySub() {
		return fuzzySub;
	}

	public void setFuzzySub(String fuzzySub) {
		this.fuzzySub = fuzzySub;
	}

	public String getEncryptionTypeCode() {
		return encryptionTypeCode;
	}

	public void setEncryptionTypeCode(String encryptionTypeCode) {
		this.encryptionTypeCode = encryptionTypeCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
