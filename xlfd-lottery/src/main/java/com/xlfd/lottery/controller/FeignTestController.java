package com.xlfd.lottery.controller;

import com.xlfd.lottery.client.EurekaServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther Allan
 * @date 2018/7/26 14:53
 */
@RestController
@RequestMapping("/feign")
public class FeignTestController {

    @Autowired
    private EurekaServiceFeign eurekaServiceFeign; //注入Feign

    @GetMapping("/testFeign")
    @ResponseBody
    public String sayTest(){
        //在方法中调用feign的方法
        System.out.println("====>sayTest:" + eurekaServiceFeign.testFeign());
        return eurekaServiceFeign.testFeign();
    }

    @GetMapping("/testHystrix")
    @ResponseBody
    public String testHystrix(){
        //在方法中调用feign的方法
        System.out.println("====>testHystrix:" + eurekaServiceFeign.testHystrix());
        return eurekaServiceFeign.testHystrix();
    }
}
