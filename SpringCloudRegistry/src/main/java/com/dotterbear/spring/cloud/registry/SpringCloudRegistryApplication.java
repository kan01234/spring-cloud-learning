package com.dotterbear.spring.cloud.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRegistryApplication.class, args);
	}
}