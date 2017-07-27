package com.xsr.sys.dao;

import com.xsr.sys.entity.SysMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysMenuDao {

    public int insert(SysMenu entity);

    public int insertBatch(List<SysMenu> entityList);

    public SysMenu selectByPrimaryKey(String id);

    public List<SysMenu> selectByPrimaryKeyList(List<String> idList);

    public List<SysMenu> findListByEntity(SysMenu entity);

    public int updatePrimaryKey(SysMenu entity);

    public int deleteByPrimaryKey(String id);

    public int deleteByEntity(SysMenu entity);

}