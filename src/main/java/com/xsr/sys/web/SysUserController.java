package com.xsr.sys.web;

import com.xsr.sys.entity.SysUser;
import com.xsr.sys.service.IUserSevice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 145811 on 2017/7/27.
 */

@Controller
@RequestMapping("/user")
@Api(value="user",description="user")
public class SysUserController {

    @Autowired
    IUserSevice userSevice;

    @ApiOperation(value="getById",notes="getById")
    @ApiModelProperty(name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    @ResponseBody
    private SysUser getById(@RequestParam("id") String id) {
        return userSevice.getById(id);
    }
}
