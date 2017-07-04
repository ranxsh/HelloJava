package com.xsr.sys.dao;

import com.xsr.sys.entity.SysRoleOffice;
import java.util.List;

public interface SysRoleOfficeDao {

    public int insert(SysRoleOffice entity);

    public int insertBatch(List<SysRoleOffice> entityList);

    public SysRoleOffice selectByPrimaryKey(String officeId);

    public List<SysRoleOffice> selectByPrimaryKeyList(List<String> officeIdList);

    public List<SysRoleOffice> findListByEntity(SysRoleOffice entity);

    public int updatePrimaryKey(SysRoleOffice entity);

    public int deleteByPrimaryKey(String officeId);

    public int deleteByEntity(SysRoleOffice entity);

}