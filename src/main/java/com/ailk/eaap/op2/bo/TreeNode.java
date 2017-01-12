package com.ailk.eaap.op2.bo;

public class TreeNode {

	private String id;

	private String name;

	private String fatherId;

	private String isParent;
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



	public TreeNode() {
		super();
	}

	public TreeNode(String id, String name, String fatherId, String isParent) {
		super();
		this.id = id;
		this.name = name;
		this.fatherId = fatherId;
		this.isParent = isParent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getFatherId() {
		return fatherId;
	}

	public void setFatherId(String fatherId) {
		this.fatherId = fatherId;
	}

	public String getIsParent() {
		return isParent;
	}

	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}

}
