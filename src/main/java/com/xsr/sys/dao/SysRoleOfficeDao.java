package com.xsr.sys.dao;

import com.xsr.sys.entity.SysRoleOffice;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysRoleOfficeDao {

    public int insert(SysRoleOffice entity);

    public int insertBatch(List<SysRoleOffice> entityList);


    public List<SysRoleOffice> findListByEntity(SysRoleOffice entity);


    public int deleteByEntity(SysRoleOffice entity);

}