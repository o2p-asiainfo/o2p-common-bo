package com.ailk.eaap.op2.bo;

import java.util.Date;

/**
 * @author xiaoyuan
 *
 */
public class TokenCache {
	private String key;
	private String token;
	private Date expireTime;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	
}
