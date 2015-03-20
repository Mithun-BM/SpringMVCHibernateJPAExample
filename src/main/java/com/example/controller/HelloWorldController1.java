package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//First Way Of Spring MVC Controller
@Controller
@RequestMapping("/hello1")
public class HelloWorldController1{

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String printHello1() {
		System.out.println("Inside printHello1()");
		return "Hello1 Spring MVC Framework!";
	}

}

/*@Controller
@RequestMapping("/hello1")
public class HelloWorldController1{

   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }

}*/