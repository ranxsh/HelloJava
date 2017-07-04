package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysUserRole {

	private static final long serialVersionUID = 1L;

	/**
     * 角色编号
     */
    private String roleId;
	/**
     * 用户编号
     */
    private String userId;


    public String getRoleId() {
        return this.roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}