package com.xsr.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class SysOffice {

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
	 * 区域编码
	 */
    private String code;
	/**
	 * 联系地址
	 */
    private String address;
	/**
	 * 副负责人
	 */
    private String deputyPerson;
	/**
	 * 排序
	 */
    private BigDecimal sort;
	/**
	 * 主负责人
	 */
    private String primaryPerson;
	/**
	 * 所有父级编号
	 */
    private String parentIds;
	/**
	 * 归属区域
	 */
    private String areaId;
	/**
	 * 机构类型
	 */
    private String type;
	/**
	 * 邮政编码
	 */
    private String zipCode;
	/**
	 * 更新时间
	 */
    private Date updateDate;
	/**
	 * 负责人
	 */
    private String master;
	/**
	 * 创建者
	 */
    private String createBy;
	/**
	 * 电话
	 */
    private String phone;
	/**
	 * 父级编号
	 */
    private String parentId;
	/**
	 * 机构等级
	 */
    private String grade;
	/**
	 * 名称
	 */
    private String name;
	/**
	 * 传真
	 */
    private String fax;
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
	/**
	 * 是否启用
	 */
    private String useable;

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

    public String getDeputyPerson() {
        return this.deputyPerson;
    }
    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson = deputyPerson;
    }

    public BigDecimal getSort() {
        return this.sort;
    }
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    public String getPrimaryPerson() {
        return this.primaryPerson;
    }
    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson = primaryPerson;
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

    public Date getUpdateDate() {
        return this.updateDate;
    }
    public void setUpdateDate(Date updateDate) {
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

    public String getUseable() {
        return this.useable;
    }
    public void setUseable(String useable) {
        this.useable = useable;
    }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}