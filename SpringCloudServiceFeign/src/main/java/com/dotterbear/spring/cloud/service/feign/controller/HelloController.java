package com.dotterbear.spring.cloud.service.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dotterbear.spring.cloud.service.feign.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(@RequestParam String name) {
		return helloService.sayHelloFromClientOne(name);
	}
}