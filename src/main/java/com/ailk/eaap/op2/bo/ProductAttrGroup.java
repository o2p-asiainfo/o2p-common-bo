package com.ailk.eaap.op2.bo;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ProductAttrGroup implements Serializable{
private static final long serialVersionUID = 1L;
	private Integer productAttrGroupId;
	private BigDecimal productId;
	private String  groupName;
	private Integer parentGroupId;
	private Integer SeqId;
	private String stateCd;
	private Date  createDate;
	private Date  stateDate ;
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
	public String getStateCd() {
		return stateCd;
	}
	public void setStateCd(String stateCd) {
		this.stateCd = stateCd;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getStateDate() {
		return stateDate;
	}
	public void setStateDate(Date stateDate) {
		this.stateDate = stateDate;
	}
	public Integer getProductAttrGroupId() {
		return productAttrGroupId;
	}
	public void setProductAttrGroupId(Integer productAttrGroupId) {
		this.productAttrGroupId = productAttrGroupId;
	}
	public BigDecimal getProductId() {
		return productId;
	}
	public void setProductId(BigDecimal productId) {
		this.productId = productId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getParentGroupId() {
		return parentGroupId;
	}
	public void setParentGroupId(Integer parentGroupId) {
		this.parentGroupId = parentGroupId;
	}
	public Integer getSeqId() {
		return SeqId;
	}
	public void setSeqId(Integer seqId) {
		SeqId = seqId;
	}
 
}
