package com.dotterbear.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RefreshScope
public class SpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

	@Value("${bar}")
	String bar;

	@RequestMapping(value = "/bar")
	public String bar() {
		return bar;
	}
}
