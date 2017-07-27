package com.xsr.sys.service.impl;

import com.xsr.sys.dao.SysUserDao;
import com.xsr.sys.entity.SysUser;
import com.xsr.sys.service.IUserSevice;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 145811 on 2017/7/27.
 */
@Service
public class UserService implements IUserSevice {

    private static Logger logger = Logger.getLogger(UserService.class);
    @Autowired
    SysUserDao sysUserDao;

    public SysUser getById(String id) {
        logger.info("info in UserService.getById");
        logger.debug("debug in UserService.getById");
        return  sysUserDao.selectByPrimaryKey(id);
    }
}
