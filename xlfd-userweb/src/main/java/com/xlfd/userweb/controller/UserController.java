package com.xlfd.userweb.controller;

import com.xlfd.api.entity.User;
import com.xlfd.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/8/27 18:08
 */
@RestController
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService userService;

    @RequestMapping(value = "/getUser")
    public User getUser(String id){
        User user = null;
        user = userService.getUser("123");
        return user;
    }

}
