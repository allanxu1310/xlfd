package com.xlfd.apollodemo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableApolloConfig
@EnableEurekaClient
public class ApolloDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApolloDemoApplication.class, args);
	}
}
