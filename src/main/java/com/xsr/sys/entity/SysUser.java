package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysUser {

	private static final long serialVersionUID = 1L;

	/**
     * 编号
     */
    private String id;

	/**
	 * 工号
	 */
    private String no;
	/**
	 * 删除标记
	 */
    private String delFlag;
	/**
	 * 归属公司
	 */
    private String companyId;
	/**
	 * 手机
	 */
    private String mobile;
	/**
	 * 用户头像
	 */
    private String photo;
	/**
	 * 最后登陆时间
	 */
    private Date loginDate;
	/**
	 * 最后登陆IP
	 */
    private String loginIp;
	/**
	 * 是否可登录
	 */
    private String loginFlag;
	/**
	 * 更新时间
	 */
    private Date updateDate;
	/**
	 * 归属部门
	 */
    private String officeId;
	/**
	 * 创建者
	 */
    private String createBy;
	/**
	 * 密码
	 */
    private String password;
	/**
	 * 登录名
	 */
    private String loginName;
	/**
	 * 用户类型
	 */
    private String userType;
	/**
	 * 电话
	 */
    private String phone;
	/**
	 * 姓名
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
	 * 邮箱
	 */
    private String email;
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

    public String getPhoto() {
        return this.photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return this.loginIp;
    }
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginFlag() {
        return this.loginFlag;
    }
    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
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