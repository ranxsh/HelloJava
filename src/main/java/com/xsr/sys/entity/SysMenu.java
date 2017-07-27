package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysMenu {

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
    private String icon;
	/**
	 * 
	 */
    private String permission;
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
    private String isShow;
	/**
	 * 
	 */
    private String updateDate;
	/**
	 * 
	 */
    private String target;
	/**
	 * 
	 */
    private String createBy;
	/**
	 * 
	 */
    private String parentId;
	/**
	 * 
	 */
    private String name;
	/**
	 * 
	 */
    private String href;
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

    public String getIcon() {
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPermission() {
        return this.permission;
    }
    public void setPermission(String permission) {
        this.permission = permission;
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

    public String getIsShow() {
        return this.isShow;
    }
    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getTarget() {
        return this.target;
    }
    public void setTarget(String target) {
        this.target = target;
    }

    public String getCreateBy() {
        return this.createBy;
    }
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getParentId() {
        return this.parentId;
    }
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return this.href;
    }
    public void setHref(String href) {
        this.href = href;
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