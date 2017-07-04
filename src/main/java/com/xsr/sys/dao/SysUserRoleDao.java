package com.xsr.sys.dao;

import com.xsr.sys.entity.SysUserRole;
import java.util.List;

public interface SysUserRoleDao {

    public int insert(SysUserRole entity);

    public int insertBatch(List<SysUserRole> entityList);

    public SysUserRole selectByPrimaryKey(String roleId);

    public List<SysUserRole> selectByPrimaryKeyList(List<String> roleIdList);

    public List<SysUserRole> findListByEntity(SysUserRole entity);

    public int updatePrimaryKey(SysUserRole entity);

    public int deleteByPrimaryKey(String roleId);

    public int deleteByEntity(SysUserRole entity);

}