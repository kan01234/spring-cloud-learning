package com.dotterbear.spring.cloud.zipkin.service.bye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudZipkinServiceByeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZipkinServiceByeApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
