package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysRoleMenu {

	private static final long serialVersionUID = 1L;

	/**
     * 角色编号
     */
    private String roleId;
	/**
     * 菜单编号
     */
    private String menuId;


    public String getRoleId() {
        return this.roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getMenuId() {
        return this.menuId;
    }
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}