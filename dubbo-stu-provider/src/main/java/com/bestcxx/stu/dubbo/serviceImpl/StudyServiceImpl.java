package com.bestcxx.stu.dubbo.serviceImpl;

import com.bestcxx.stu.dubbo.model.Model;
import com.bestcxx.stu.dubbo.service.StudyService;

public class StudyServiceImpl implements StudyService {

	@Override
	public String sayName(String name) {
		String responseStr="Hello,"+name;
		System.out.println("这里是provider,consumer传递进来的参数为："+name+",返回给调用方的内容为："+responseStr);
		return responseStr;
	}

	@Override
	public Model getModel() {
		Model m=new Model();
		m.setUserName("jecket");
		m.setAge(20);
		return m;
	}

}
