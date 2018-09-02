package com.xlfd.lottery.controller;

import com.xlfd.lottery.client.EurekaServiceFeign;
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
    private EurekaServiceFeign eurekaServiceFeign;

    @RequestMapping(value = "/info", method = RequestMethod.POST)
    @ResponseBody
    public String info(){
        LOG.log(Level.INFO, "user info is being called");
        return eurekaServiceFeign.info();
    }

    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    @ResponseBody
    public String hi(){
        LOG.log(Level.INFO, "lottery hi() is being called");
        return "hi I'm xlfd-lottery!";
    }






}
