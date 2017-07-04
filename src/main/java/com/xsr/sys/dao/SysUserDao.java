package com.xsr.sys.dao;

import com.xsr.sys.entity.SysUser;
import java.util.List;

public interface SysUserDao {

    public int insert(SysUser entity);

    public int insertBatch(List<SysUser> entityList);

    public SysUser selectByPrimaryKey(String id);

    public List<SysUser> selectByPrimaryKeyList(List<String> idList);

    public List<SysUser> findListByEntity(SysUser entity);

    public int updatePrimaryKey(SysUser entity);

    public int deleteByPrimaryKey(String id);

    public int deleteByEntity(SysUser entity);

}