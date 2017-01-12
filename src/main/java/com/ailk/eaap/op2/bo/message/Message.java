package com.ailk.eaap.op2.bo.message;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.ailk.eaap.op2.bo.BaseClass;
import com.ailk.eaap.op2.bo.DefaultVlueUtils;
import com.ailk.eaap.op2.bo.utc.DateConvertBeanImpl;
import com.ailk.eaap.op2.bo.utc.DateConvertField;

public class Message extends BaseClass implements Serializable, DateConvertBeanImpl, Comparable<Message> {

	private static final long serialVersionUID = 102850946665400307L;

	private BigDecimal msgId;
	private Integer msgType;
	private BigDecimal msgOriginator;
	private String msgWay;
	private String msgTitle;
	private String msgSubtitle;
	private String msgContent;
	private String msgHandleAddress;
	private String msgPriority;
	@DateConvertField
	private Date msgBeginDate;
	@DateConvertField
	private Date msgEndDate;
	private Integer msgRecType ;
	private String formatBeginDate = DefaultVlueUtils.getNowDate(0);
	private String formatEndDate = DefaultVlueUtils.DEFAULT_VALUE_FOR_EXP;
	private String opId;
	private Integer tenantId ;
	
	public BigDecimal getMsgId() {
		return msgId;
	}
	public void setMsgId(BigDecimal msgId) {
		this.msgId = msgId;
	}
	public Integer getMsgType() {
		return msgType;
	}
	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}
	public BigDecimal getMsgOriginator() {
		return msgOriginator;
	}
	public void setMsgOriginator(BigDecimal msgOriginator) {
		this.msgOriginator = msgOriginator;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public String getMsgSubtitle() {
		return msgSubtitle;
	}
	public void setMsgSubtitle(String msgSubtitle) {
		this.msgSubtitle = msgSubtitle;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public String getMsgHandleAddress() {
		return msgHandleAddress;
	}
	public void setMsgHandleAddress(String msgHandleAddress) {
		this.msgHandleAddress = msgHandleAddress;
	}
	public Date getMsgBeginDate() {
		return msgBeginDate;
	}
	public void setMsgBeginDate(Date msgBeginDate) {
		this.msgBeginDate = msgBeginDate;
	}
	public Date getMsgEndDate() {
		return msgEndDate;
	}
	public void setMsgEndDate(Date msgEndDate) {
		this.msgEndDate = msgEndDate;
	}
	public Integer getMsgRecType() {
		return msgRecType;
	}
	public void setMsgRecType(Integer msgRecType) {
		this.msgRecType = msgRecType;
	}
	public String getFormatBeginDate() {
		return formatBeginDate;
	}
	public void setFormatBeginDate(String formatBeginDate) {
		this.formatBeginDate = formatBeginDate;
	}
	public String getFormatEndDate() {
		return formatEndDate;
	}
	public void setFormatEndDate(String formatEndDate) {
		this.formatEndDate = formatEndDate;
	}
	public String getMsgWay() {
		return msgWay;
	}
	public void setMsgWay(String msgWay) {
		this.msgWay = msgWay;
	}
	public String getMsgPriority() {
		return msgPriority;
	}
	public void setMsgPriority(String msgPriority) {
		this.msgPriority = msgPriority;
	}
	public String getOpId() {
		return opId;
	}
	public void setOpId(String opId) {
		this.opId = opId;
	}
	public Integer getTenantId() {
		return tenantId;
	}
	public void setTenantId(Integer tenantId) {
		this.tenantId = tenantId;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(null==obj){
			return Boolean.FALSE;
		}
		if(obj instanceof Message){
			Message msg = (Message)obj;
			if((msg.getMsgId()+"").equals(this.getMsgId()+"")){
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
	
	public int compareTo(Message msg) {
		int flag = this.getMsgPriority().compareTo(msg.getMsgPriority());
		 if(flag==0){
		      return -this.getMsgId().compareTo(msg.getMsgId());
	     }else{
	    	 return flag;
	     }
     }
	
}
