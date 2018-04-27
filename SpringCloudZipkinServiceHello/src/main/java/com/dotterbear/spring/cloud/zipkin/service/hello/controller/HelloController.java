package com.dotterbear.spring.cloud.zipkin.service.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello")
	public String callBye() {
		return restTemplate.getForObject("http://localhost:8989/info", String.class);
	}

	@RequestMapping("/info")
	public String info() {
		return "hello, from service-hello";
	}
}
