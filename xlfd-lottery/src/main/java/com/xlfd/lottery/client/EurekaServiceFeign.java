package com.xlfd.lottery.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 服务提供者的Feign
 * 这个接口相当于把原来的服务提供者项目当成一个Service类，
 * 我们只需在声明它的Feign-client的名字，会自动去调用注册中心的这个名字的服务
 * 更简单的理解是value相当于MVC中的Controller类的父路径，通过"父路径+子路径和参数来调用服务"
 * @auther Allan
 * @date 2018/7/26 14:47
 */
@FeignClient(value = "user-server")  //其中的value的值为要调用服务的名称
//当我们为Feign接口使用@FeignClient(value="user-server")的时候，不仅为我们创建了Feign客户端，还为我们创建了一个名为“user-server”的Ribbon，客户端。
public interface EurekaServiceFeign {

    @RequestMapping(value = "/testFeign", method= RequestMethod.POST)
    String testFeign();

    @RequestMapping(value = "/testHystrix", method= RequestMethod.POST)
    String testHystrix();

    @RequestMapping(value = "zipkin/info", method = RequestMethod.POST)
    String info();
}
