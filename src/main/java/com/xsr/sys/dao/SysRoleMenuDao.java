package com.xsr.sys.dao;

import com.xsr.sys.entity.SysRoleMenu;
import java.util.List;

public interface SysRoleMenuDao {

    public int insert(SysRoleMenu entity);

    public int insertBatch(List<SysRoleMenu> entityList);

    public SysRoleMenu selectByPrimaryKey(String roleId);

    public List<SysRoleMenu> selectByPrimaryKeyList(List<String> roleIdList);

    public List<SysRoleMenu> findListByEntity(SysRoleMenu entity);

    public int updatePrimaryKey(SysRoleMenu entity);

    public int deleteByPrimaryKey(String roleId);

    public int deleteByEntity(SysRoleMenu entity);

}