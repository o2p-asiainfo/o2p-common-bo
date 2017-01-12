package com.ailk.eaap.o2p.fileExchange.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.ailk.eaap.op2.bo.NodeDesc;

/**
 * 文件交换协议适配
 * @author zhongming
 *
 */
public class FileExchangeContractAdapter implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int contractAdapterId;
	private int srcCtrFId;
	private FileExchangeContractFormat srcContractFormat;
	private List<NodeDesc> srcNodeDescs;
	private List<FileExchangeContract2AttrSpec> srcContract2AttrSpecs;
	private int tarCtrFId;
	private FileExchangeContractFormat tarContractFormat;
	private List<NodeDesc> tarNodeDescs;
	private List<FileExchangeContract2AttrSpec> tarContract2AttrSpecs;
	private String apapterName;
	private String adapterType;
	private String adapterClass;
	private String srcMsg;
	private String tarMsg;
	private Timestamp createDt;
	private String state;
	
	public int getContractAdapterId() {
		return contractAdapterId;
	}
	public void setContractAdapterId(int contractAdapterId) {
		this.contractAdapterId = contractAdapterId;
	}
	public int getSrcCtrFId() {
		return srcCtrFId;
	}
	public void setSrcCtrFId(int srcCtrFId) {
		this.srcCtrFId = srcCtrFId;
	}
	public int getTarCtrFId() {
		return tarCtrFId;
	}
	public void setTarCtrFId(int tarCtrFId) {
		this.tarCtrFId = tarCtrFId;
	}
	public String getApapterName() {
		return apapterName;
	}
	public void setApapterName(String apapterName) {
		this.apapterName = apapterName;
	}
	public String getSrcMsg() {
		return srcMsg;
	}
	public void setSrcMsg(String srcMsg) {
		this.srcMsg = srcMsg;
	}
	public String getTarMsg() {
		return tarMsg;
	}
	public void setTarMsg(String tarMsg) {
		this.tarMsg = tarMsg;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public FileExchangeContractFormat getSrcContractFormat() {
		return srcContractFormat;
	}
	public void setSrcContractFormat(FileExchangeContractFormat srcContractFormat) {
		this.srcContractFormat = srcContractFormat;
	}
	public FileExchangeContractFormat getTarContractFormat() {
		return tarContractFormat;
	}
	public void setTarContractFormat(FileExchangeContractFormat tarContractFormat) {
		this.tarContractFormat = tarContractFormat;
	}
	public List<NodeDesc> getSrcNodeDescs() {
		return srcNodeDescs;
	}
	public void setSrcNodeDescs(List<NodeDesc> srcNodeDescs) {
		this.srcNodeDescs = srcNodeDescs;
	}
	public List<NodeDesc> getTarNodeDescs() {
		return tarNodeDescs;
	}
	public void setTarNodeDescs(List<NodeDesc> tarNodeDescs) {
		this.tarNodeDescs = tarNodeDescs;
	}
	public String getAdapterType() {
		return adapterType;
	}
	public void setAdapterType(String adapterType) {
		this.adapterType = adapterType;
	}
	public String getAdapterClass() {
		return adapterClass;
	}
	public void setAdapterClass(String adapterClass) {
		this.adapterClass = adapterClass;
	}
	public Timestamp getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Timestamp createDt) {
		this.createDt = createDt;
	}
	public List<FileExchangeContract2AttrSpec> getSrcContract2AttrSpecs() {
		return srcContract2AttrSpecs;
	}
	public void setSrcContract2AttrSpecs(
			List<FileExchangeContract2AttrSpec> srcContract2AttrSpecs) {
		this.srcContract2AttrSpecs = srcContract2AttrSpecs;
	}
	public List<FileExchangeContract2AttrSpec> getTarContract2AttrSpecs() {
		return tarContract2AttrSpecs;
	}
	public void setTarContract2AttrSpecs(
			List<FileExchangeContract2AttrSpec> tarContract2AttrSpecs) {
		this.tarContract2AttrSpecs = tarContract2AttrSpecs;
	}

	
}
