package com.ailk.eaap.op2.bo;

import java.io.Serializable;

public class CsvTemplate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int csvTemplateId;
	private String csvFileName;
	private String fieldSeparator;
	private int firstLineType;
	private String isFileNameAddDate;
	private String dateFormat;
	private String fileNameAndDateSeparator;
	private String newLineCharacter;
	private String isTextfieldAddQuoteMark;
	private String fileCharset;
	private long allCount = 0;
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
	public int getCsvTemplateId() {
		return csvTemplateId;
	}

	public void setCsvTemplateId(int csvTemplateId) {
		this.csvTemplateId = csvTemplateId;
	}

	public String getCsvFileName() {
		return csvFileName;
	}

	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}

	public String getFieldSeparator() {
		return fieldSeparator;
	}

	public void setFieldSeparator(String fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}

	public int getFirstLineType() {
		return firstLineType;
	}

	public void setFirstLineType(int firstLineType) {
		this.firstLineType = firstLineType;
	}

	public String getIsFileNameAddDate() {
		return isFileNameAddDate;
	}

	public void setIsFileNameAddDate(String isFileNameAddDate) {
		this.isFileNameAddDate = isFileNameAddDate;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getFileNameAndDateSeparator() {
		return fileNameAndDateSeparator;
	}

	public void setFileNameAndDateSeparator(String fileNameAndDateSeparator) {
		this.fileNameAndDateSeparator = fileNameAndDateSeparator;
	}

	public String getNewLineCharacter() {
		return newLineCharacter;
	}

	public void setNewLineCharacter(String newLineCharacter) {
		this.newLineCharacter = newLineCharacter;
	}

	public long getAllCount() {
		return allCount;
	}

	public void setAllCount(long allCount) {
		this.allCount = allCount;
	}

	public String getIsTextfieldAddQuoteMark() {
		return isTextfieldAddQuoteMark;
	}

	public void setIsTextfieldAddQuoteMark(String isTextfieldAddQuoteMark) {
		this.isTextfieldAddQuoteMark = isTextfieldAddQuoteMark;
	}

	public String getFileCharset() {
		return fileCharset;
	}

	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}
	
}