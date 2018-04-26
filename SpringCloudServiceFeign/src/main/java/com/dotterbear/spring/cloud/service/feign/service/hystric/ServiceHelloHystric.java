package com.dotterbear.spring.cloud.service.feign.service.hystric;

import org.springframework.stereotype.Component;

import com.dotterbear.spring.cloud.service.feign.service.HelloService;

@Component
public class ServiceHelloHystric implements HelloService {
	@Override
	public String sayHelloFromClientOne(String name) {
		return "sorry " + name;
	}
}