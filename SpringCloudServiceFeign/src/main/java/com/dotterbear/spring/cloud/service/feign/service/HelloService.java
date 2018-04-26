package com.dotterbear.spring.cloud.service.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dotterbear.spring.cloud.service.feign.service.hystric.ServiceHelloHystric;

@FeignClient(value = "service-hello", fallback = ServiceHelloHystric.class)
public interface HelloService {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}