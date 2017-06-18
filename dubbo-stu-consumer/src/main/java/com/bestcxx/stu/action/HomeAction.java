package com.bestcxx.stu.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestcxx.stu.dubbo.service.StudyService;

@Controller
public class HomeAction {
	@Autowired
	private StudyService studyService;
	@RequestMapping({"/","home"})  
    public String shouHomePage(Map<String,String> model,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){  
		for(int i=0;i<10;i++){
			System.out.println("dubbo 客户端调用服务端返回参数："+studyService.sayName("Jecket"));
		}
		httpServletRequest.setAttribute("response", "dubbo 客户端调用服务端返回参数："+studyService.sayName("Jecket"));
        return "home";  
    }  
}

