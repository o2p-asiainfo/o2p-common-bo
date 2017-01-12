package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;

/**
 * 
 * @author zhuangyq
 *
 */
public class Host implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hostId;
	private String hostName;
	private String hostTypeCd;
	private String ip;
	private String fsType;//文件系统类型(SIMPLE/HADOOP)
	private int port;
	private String hostDesc;
	private String hostHomePath;
	public int getHostId() {
		return hostId;
	}
	public void setHostId(int hostId) {
		this.hostId = hostId;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getFsType() {
		return fsType;
	}
	public void setFsType(String fsType) {
		this.fsType = fsType;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getHostDesc() {
		return hostDesc;
	}
	public void setHostDesc(String hostDesc) {
		this.hostDesc = hostDesc;
	}
	public String getHostHomePath() {
		return hostHomePath;
	}
	public void setHostHomePath(String hostHomePath) {
		this.hostHomePath = hostHomePath;
	}
	public String getHostTypeCd() {
		return hostTypeCd;
	}
	public void setHostTypeCd(String hostTypeCd) {
		this.hostTypeCd = hostTypeCd;
	}
	
}
