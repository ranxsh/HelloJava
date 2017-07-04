package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysRole {

	private static final long serialVersionUID = 1L;

	/**
     * 编号
     */
    private String id;

	/**
	 * 删除标记
	 */
    private String delFlag;
	/**
	 * 角色类型
	 */
    private String roleType;
	/**
	 * 更新时间
	 */
    private Date updateDate;
	/**
	 * 英文名称
	 */
    private String enname;
	/**
	 * 归属机构
	 */
    private String officeId;
	/**
	 * 创建者
	 */
    private String createBy;
	/**
	 * 是否可用
	 */
    private String useable;
	/**
	 * 是否系统数据
	 */
    private String isSys;
	/**
	 * 角色名称
	 */
    private String name;
	/**
	 * 创建时间
	 */
    private Date createDate;
	/**
	 * 更新者
	 */
    private String updateBy;
	/**
	 * 数据范围
	 */
    private String dataScope;
	/**
	 * 备注信息
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

    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
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

    public String getIsSys() {
        return this.isSys;
    }
    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateDate() {
        return this.createDate;
    }
    public void setCreateDate(Date createDate) {
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