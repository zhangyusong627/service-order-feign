package com.zys.app.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zys.app.service.OrderFeign;

@Component
public class MyOrderFeign implements OrderFeign {

	public List<String> getOrderByUserList() {
				//服务降级处理
				List<String> list = new ArrayList<String>();
				list.add("服务发生异常...");
				return list;
	}

	public String testZuul() {
		// TODO Auto-generated method stub
		return null;
	}

}
