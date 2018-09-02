package com.xlfd.user.controller;

import com.xlfd.user.service.HystrixTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 * @auther Allan
 * @date 2018/7/24 20:16
 */
@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    HystrixTestService hystrixTestService;

    @RequestMapping(value ="/testFeign", method = RequestMethod.POST)
    public String testFeign(){
        logger.info("====>testFeign.............");
        return "testFeign" ;
    }

    /**
     * hystrix test
     * @return
     */
    @RequestMapping(value = "/testHystrix",method = RequestMethod.POST)
    public String testHystrix() throws InterruptedException {

        return hystrixTestService.testHystrix();

    }

    /**
     * 加法  zuul 测试网关及 轮询负载均衡
     * @return
     */
    @RequestMapping(value = "/addition",method = RequestMethod.GET)
    public String addition(){
        return "xlfd-user user-server: 1+2="+(1+2);
    }


}
