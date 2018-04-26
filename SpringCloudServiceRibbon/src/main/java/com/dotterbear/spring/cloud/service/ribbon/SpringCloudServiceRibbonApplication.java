package com.dotterbear.spring.cloud.service.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringCloudServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean(name = "hystrixRegistrationBean")
	public ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean() {
		ServletRegistrationBean<HystrixMetricsStreamServlet> registration = new ServletRegistrationBean<HystrixMetricsStreamServlet>(
				new HystrixMetricsStreamServlet(),
				"/hystrix.stream");
		registration.setName("hystrixServlet");
		registration.setLoadOnStartup(1);
		return registration;
	}

}
