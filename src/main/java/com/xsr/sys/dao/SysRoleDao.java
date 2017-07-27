package com.xsr.sys.dao;

import com.xsr.sys.entity.SysRole;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysRoleDao {

    public int insert(SysRole entity);

    public int insertBatch(List<SysRole> entityList);

    public SysRole selectByPrimaryKey(String id);

    public List<SysRole> selectByPrimaryKeyList(List<String> idList);

    public List<SysRole> findListByEntity(SysRole entity);

    public int updatePrimaryKey(SysRole entity);

    public int deleteByPrimaryKey(String id);

    public int deleteByEntity(SysRole entity);

}