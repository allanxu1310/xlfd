package com.xlfd.user.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther Allan
 * @date 2018/9/2 12:30
 */
@FeignClient(value = "lottery-server")  //其中的value的值为要调用服务的名称
public interface LotteryServiceFeign {

    @RequestMapping(value = "zipkin/hi", method= RequestMethod.POST)
    String hi();

}
