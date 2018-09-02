package com.xlfd.user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * EurekaClient
 * @author Allan
 * @date 2018-08-24 19:40
 */
//@EnableDiscoveryClient基于spring-cloud-commons,@EnableEurekaClient基于spring-cloud-netflix
@EnableEurekaClient   //@EnableEurekaClient，不管是消费者还是提供者，对应eureka server来说都是客户端client
@SpringCloudApplication
@EnableHystrix
@EnableCircuitBreaker    //开启 hystrix-dashboard 监控
@EnableHystrixDashboard  //开启 hystrix-dashboard 监控
@EnableFeignClients
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
