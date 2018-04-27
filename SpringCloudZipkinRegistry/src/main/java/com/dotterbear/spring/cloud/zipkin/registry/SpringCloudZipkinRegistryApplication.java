package com.dotterbear.spring.cloud.zipkin.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudZipkinRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZipkinRegistryApplication.class, args);
	}
}
