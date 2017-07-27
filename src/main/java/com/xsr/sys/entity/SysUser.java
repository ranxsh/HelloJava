package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysUser {

	private static final long serialVersionUID = 1L;

	/**
     * 
     */
    private String id;

	/**
	 * 
	 */
    private String no;
	/**
	 * 
	 */
    private String delFlag;
	/**
	 * 
	 */
    private String companyId;
	/**
	 * 
	 */
    private String mobile;
	/**
	 * 
	 */
    private String loginFlag;
	/**
	 * 
	 */
    private String updateDate;
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
    private String password;
	/**
	 * 
	 */
    private String loginName;
	/**
	 * 
	 */
    private String userType;
	/**
	 * 
	 */
    private String phone;
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

    public String getNo() {
        return this.no;
    }
    public void setNo(String no) {
        this.no = no;
    }

    public String getDelFlag() {
        return this.delFlag;
    }
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getCompanyId() {
        return this.companyId;
    }
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getMobile() {
        return this.mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLoginFlag() {
        return this.loginFlag;
    }
    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
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

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return this.loginName;
    }
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserType() {
        return this.userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getPhone() {
        return this.phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
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