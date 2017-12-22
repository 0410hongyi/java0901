package com.chinasofti.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/springmvc")
public class HelloWorld {
@RequestMapping(value="/helloword",method=RequestMethod.POST)
	public String hello(){
		System.out.println("hello word");
		return "success";
	}

}
