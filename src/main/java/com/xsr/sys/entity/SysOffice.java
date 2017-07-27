package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysOffice {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
    private String id;

	/**
	 * 
	 */
    private String delFlag;
	/**
	 * 
	 */
    private String code;
	/**
	 * 
	 */
    private String address;
	/**
	 * 
	 */
    private String sort;
	/**
	 * 
	 */
    private String parentIds;
	/**
	 * 
	 */
    private String areaId;
	/**
	 * 
	 */
    private String type;
	/**
	 * 
	 */
    private String zipCode;
	/**
	 * 
	 */
    private String updateDate;
	/**
	 * 
	 */
    private String master;
	/**
	 * 
	 */
    private String createBy;
	/**
	 * 
	 */
    private String useable;
	/**
	 * 
	 */
    private String phone;
	/**
	 * 
	 */
    private String parentId;
	/**
	 * 
	 */
    private String grade;
	/**
	 * 
	 */
    private String name;
	/**
	 * 
	 */
    private String fax;
	/**
	 * 
	 */
    private String createDate;
	/**
	 * 
	 */
    private String updateBy;
	/**
	 * 
	 */
    private String email;
	/**
	 * 
	 */
    private String remarks;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getDelFlag() {
        return this.delFlag;
    }
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSort() {
        return this.sort;
    }
    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getParentIds() {
        return this.parentIds;
    }
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getAreaId() {
        return this.areaId;
    }
    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getZipCode() {
        return this.zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getMaster() {
        return this.master;
    }
    public void setMaster(String master) {
        this.master = master;
    }

    public String getCreateBy() {
        return this.createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUseable() {
        return this.useable;
    }
    public void setUseable(String useable) {
        this.useable = useable;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParentId() {
        return this.parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getGrade() {
        return this.grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFax() {
        return this.fax;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return this.updateBy;
    }
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemarks() {
        return this.remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}