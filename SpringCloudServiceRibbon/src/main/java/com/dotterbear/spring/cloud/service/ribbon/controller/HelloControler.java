package com.dotterbear.spring.cloud.service.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dotterbear.spring.cloud.service.ribbon.service.HelloService;

@RestController
public class HelloControler {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hello")
	public String hi(@RequestParam String name) {
		return helloService.helloService(name);
	}

}