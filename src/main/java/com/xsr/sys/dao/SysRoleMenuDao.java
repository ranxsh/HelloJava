package com.xsr.sys.dao;

import com.xsr.sys.entity.SysRoleMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysRoleMenuDao {

    public int insert(SysRoleMenu entity);

    public int insertBatch(List<SysRoleMenu> entityList);


    public List<SysRoleMenu> findListByEntity(SysRoleMenu entity);


    public int deleteByEntity(SysRoleMenu entity);

}