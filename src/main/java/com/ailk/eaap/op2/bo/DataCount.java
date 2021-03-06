
package com.ailk.eaap.op2.bo;


public class DataCount {

	private String province;
	private String city;
	private String area;
	private Integer dog;
	private Integer cat;
	private Integer people;
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
	public DataCount(){}
	public DataCount(String province, String city, String area, Integer dog,
			Integer cat, Integer people) {
		super();
		this.province = province;
		this.city = city;
		this.area = area;
		this.dog = dog;
		this.cat = cat;
		this.people = people;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getDog() {
		return dog;
	}
	public void setDog(Integer dog) {
		this.dog = dog;
	}
	public Integer getCat() {
		return cat;
	}
	public void setCat(Integer cat) {
		this.cat = cat;
	}
	public Integer getPeople() {
		return people;
	}
	public void setPeople(Integer people) {
		this.people = people;
	}
}
