package com.zys.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * orderfeign客户端启动类
 * Feign客户端自动集成了Ribbon负载均衡
 * 只需要通过@LoadBalanced开启即可
 * @author ASUS
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //:开启feign客户端调用功能
public class OrderFeignApp {

	public static void main(String[] args) {
		
		SpringApplication.run(OrderFeignApp.class, args);

	}
	
	    //:开启负载均衡
		@Bean
		@LoadBalanced
		RestTemplate restTemplate (){
			return new RestTemplate();
		}

}
