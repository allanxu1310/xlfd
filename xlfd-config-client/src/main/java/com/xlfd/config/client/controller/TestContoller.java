package com.xlfd.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/8/24 14:40
 */
@RefreshScope
@RestController
public class TestContoller {
    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi() {
        return foo;
    }
}
