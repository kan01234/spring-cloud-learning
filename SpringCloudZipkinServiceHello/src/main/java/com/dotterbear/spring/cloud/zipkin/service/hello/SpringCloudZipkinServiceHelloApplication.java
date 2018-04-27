package com.dotterbear.spring.cloud.zipkin.service.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudZipkinServiceHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZipkinServiceHelloApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
