package com.bestcxx.stu.dubbo.service;

import com.bestcxx.stu.dubbo.model.Model;

public interface StudyService {
	String sayName(String name);//dubbo 传递字符串
	Model getModel();//dubbo 传递对象
}
