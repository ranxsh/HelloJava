package com.xsr.sys.dao;

import com.xsr.sys.entity.SysOffice;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SysOfficeDao {

    public int insert(SysOffice entity);

    public int insertBatch(List<SysOffice> entityList);

    public SysOffice selectByPrimaryKey(String id);

    public List<SysOffice> selectByPrimaryKeyList(List<String> idList);

    public List<SysOffice> findListByEntity(SysOffice entity);

    public int updatePrimaryKey(SysOffice entity);

    public int deleteByPrimaryKey(String id);

    public int deleteByEntity(SysOffice entity);

}