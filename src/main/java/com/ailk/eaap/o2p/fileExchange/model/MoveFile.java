package com.ailk.eaap.o2p.fileExchange.model;

import java.io.File;
import java.io.Serializable;

/**
 * 
 * @author 颖勤
 *
 */
public class MoveFile implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Integer CONST_HANDLER_TYPE_ARCHIVE = 0;
	public static Integer CONST_HANDLER_TYPE_BACKUP = 1;
	private File[] file;
	private String archPath;
	private Integer handlerType = CONST_HANDLER_TYPE_BACKUP;
	
	public File[] getFile() {
		return file;
	}
	public void setFile(File[] file) {
		this.file = file;
	}
	public String getArchPath() {
		return archPath;
	}
	public void setArchPath(String archPath) {
		this.archPath = archPath;
	}
	public Integer getHandlerType() {
		return handlerType;
	}
	public void setHandlerType(Integer handlerType) {
		this.handlerType = handlerType;
	}
	
}
