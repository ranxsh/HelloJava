package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysRoleOffice {

	private static final long serialVersionUID = 1L;


	/**
	 * 
	 */
    private String officeId;
	/**
	 * 
	 */
    private String roleId;


    public String getOfficeId() {
        return this.officeId;
    }
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getRoleId() {
        return this.roleId;
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}