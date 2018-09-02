package com.xlfd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayApplication {

	/**
	@Bean
	PermisFilter permisFilter() {
		return new PermisFilter();
	} */

	public static void main(String[] args) {

		SpringApplication.run(GatewayApplication.class, args);

	}


}
