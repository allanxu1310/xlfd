package com.xlfd.user.controller;

import com.xlfd.user.client.LotteryServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @auther Allan
 * @date 2018/9/1 20:28
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {

    private static final Logger LOG = Logger.getLogger(ZipkinController.class.getName());

    @Autowired
    private LotteryServiceFeign lotteryServiceFeign;

    @RequestMapping(value = "/hi",method = RequestMethod.POST)
    @ResponseBody
    public String hi(){
        LOG.log(Level.INFO, "calling trace lottery-server hi()");
        return lotteryServiceFeign.hi();
    }

    @RequestMapping(value = "/info",method = RequestMethod.POST)
    @ResponseBody
    public String info(){
        LOG.log(Level.INFO, "calling trace user-server ");

        return "I'm xlfd-user";
    }




}
