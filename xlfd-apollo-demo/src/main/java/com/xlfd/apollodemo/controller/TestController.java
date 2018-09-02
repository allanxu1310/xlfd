package com.xlfd.apollodemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/8/31 14:01
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/testApollo",method = RequestMethod.GET)
    public String testApollo(){

        return "apollo.....";
    }
}
