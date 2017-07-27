package com.xsr.sys.web;

import com.xsr.sys.service.IUserSevice;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 145811 on 2017/7/27.
 */
@Controller
@RequestMapping("/hello")
@Api(value="hello",description="hello")
public class HelloController {

    @ApiOperation(value="world",notes="world")
//    @ApiModelProperty(name = "world", value = "用户ID", required = true, dataType = "String")
    @ApiModelProperty(name = "bookId", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value = "/world", method = RequestMethod.GET)
    private String world(@PathVariable("bookId") Long bookId) {
        return "hello world!";// WEB-INF/jsp/"list".jsp
    }
}
