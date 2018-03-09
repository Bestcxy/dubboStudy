package com.bestcxx.stu.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bestcxx.stu.dubbo.model.Model;
import com.bestcxx.stu.dubbo.service.StudyService;

@Controller
@RequestMapping("/")
public class HomeAction {
	@Autowired
	private StudyService studyService;
	
	@GetMapping({"/home"})  
    public ModelAndView shouHomePage(){  
		Map<String,Object> map=new HashMap<String,Object>();
		String name=studyService.sayName("Jecket");//dubbo 传递字符串
		Model m=studyService.getModel();//dubbo 传递对象
		map.put("name", name);
		map.put("model", m);
		
		ModelAndView modelView=new ModelAndView();
		modelView.addObject("map",map);
		modelView.setViewName("home");
        return modelView;  
    }  
}

