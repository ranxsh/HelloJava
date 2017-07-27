package com.xsr.sys.dao;

import com.xsr.sys.entity.SysUserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysUserRoleDao {

    public int insert(SysUserRole entity);

    public int insertBatch(List<SysUserRole> entityList);


    public List<SysUserRole> findListByEntity(SysUserRole entity);


    public int deleteByEntity(SysUserRole entity);

}