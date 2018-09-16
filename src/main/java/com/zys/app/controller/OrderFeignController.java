package com.zys.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zys.app.service.OrderFeign;

@RestController
public class OrderFeignController {
	
	@Autowired
	private OrderFeign orderFeign;
	
	@RequestMapping("/getUserListByFeign")
	public List<String> getOrderByUserListByFeign(){
		System.err.println("通过Feign客户端调用会员服务。");
		return orderFeign.getOrderByUserList();
	}
	
	@RequestMapping("/getTestFeign")
	public  String testZuul(){
		System.err.println("通过Feign客户端调用会员服务的第二个服务。");
		return orderFeign.testZuul();
	}

}
