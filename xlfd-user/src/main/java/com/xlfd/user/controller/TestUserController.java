package com.xlfd.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.xlfd.user.api.TestUserService;
import com.xlfd.user.entity.TestUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @auther Allan
 * @date 2018/8/21 14:03
 */
@RestController
@Api("xlfd-user业务api")
@RequestMapping(value = "/testUser")
public class TestUserController {

    @Autowired
    private TestUserService testUserService;

    @ApiOperation(value = "获取TestUser信息", notes = "根据id获取获取TestUser信息信息")// 使用该注解描述接口方法信息
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
    })// 使用该注解描述方法参数信息，此处需要注意的是paramType参数，需要配置成path，否则在UI中访问接口方法时，会报错
    @RequestMapping(value = "/getTestUser", method = RequestMethod.POST)
    public JSONObject getTestUser(@RequestBody String id){
        JSONObject result = new JSONObject();
        TestUser testUser = testUserService.get(id);
        result.put("testUser",testUser);
        return result;
    }

    @ApiOperation(value="获取所有的TestUser对象信息", notes = "根据id获取所有的TestUser对象信息")
    @RequestMapping(value = "/getTestUserAll", method = RequestMethod.POST)
    public JSONObject getTestUserAll(){
        JSONObject result = new JSONObject();
        List<TestUser> list = testUserService.getAll();
        result.put("list",list);
        return result;
    }
}
