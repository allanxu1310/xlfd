package com.xlfd.lottery.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @auther Allan
 * @date 2018/8/23 13:08
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/addition", method = RequestMethod.GET)
    @ResponseBody
    public String addition(){
        return "lottery-server: 3+4="+(3+4);
    }
}
