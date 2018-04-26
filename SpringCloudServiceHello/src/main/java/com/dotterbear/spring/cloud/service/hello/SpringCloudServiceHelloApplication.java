package com.dotterbear.spring.cloud.service.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceHelloApplication.class, args);
	}
}
