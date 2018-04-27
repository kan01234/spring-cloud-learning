package com.dotterbear.spring.cloud.zipkin.service.bye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ByeController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/bye")
	public String callHello() {
		return restTemplate.getForObject("http://localhost:8988/info", String.class);
	}

	@RequestMapping("/info")
	public String home() {
		return "bye, from bye-service";
	}

}
