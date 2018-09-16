package com.zys.app.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zys.app.fallback.MyOrderFeign;


/**
 * 通过Feign客户端调用会员服务
 * @FeignClient 需要调用服务名称
 * @author ASUS
 *
 */
@FeignClient(value="service-member",fallback=MyOrderFeign.class)
public interface OrderFeign {
	
	@RequestMapping("/getUserList")  //：对应会员服务中controller的映射地址，表明要调用的具体服务
	public List<String> getOrderByUserList();
	
	@RequestMapping("/getTestZuulMember")
	public  String testZuul();

}
