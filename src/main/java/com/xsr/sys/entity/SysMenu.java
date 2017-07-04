package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysMenu {

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
	 * 图标
	 */
    private String icon;
	/**
	 * 权限标识
	 */
    private String permission;
	/**
	 * 排序
	 */
    private BigDecimal sort;
	/**
	 * 所有父级编号
	 */
    private String parentIds;
	/**
	 * 是否在菜单中显示
	 */
    private String isShow;
	/**
	 * 更新时间
	 */
    private Date updateDate;
	/**
	 * 目标
	 */
    private String target;
	/**
	 * 创建者
	 */
    private String createBy;
	/**
	 * 父级编号
	 */
    private String parentId;
	/**
	 * 名称
	 */
    private String name;
	/**
	 * 链接
	 */
    private String href;
	/**
	 * 创建时间
	 */
    private Date createDate;
	/**
	 * 更新者
	 */
    private String updateBy;
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

    public BigDecimal getSort() {
        return this.sort;
    }
    public void setSort(BigDecimal sort) {
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

    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
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