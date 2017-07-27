package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysRole {

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
    private String roleType;
	/**
	 * 
	 */
    private String updateDate;
	/**
	 * 
	 */
    private String enname;
	/**
	 * 
	 */
    private String officeId;
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
    private String name;
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
    private String dataScope;
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

    public String getRoleType() {
        return this.roleType;
    }
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getEnname() {
        return this.enname;
    }
    public void setEnname(String enname) {
        this.enname = enname;
    }

    public String getOfficeId() {
        return this.officeId;
    }
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
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

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getDataScope() {
        return this.dataScope;
    }
    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
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