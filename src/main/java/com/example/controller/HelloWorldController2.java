package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

//Second Way Of Spring MVC Controller
@Controller
public class HelloWorldController2{

	//If you are sending data back to client then there should be @ResponseBody annotation 
	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String printHello2() {
		System.out.println("Inside printHello2()");
		return "Hello2 Spring MVC Framework!"; //"Hello Spring MVC Framework!";
	}

}

/*@Controller
public class HelloWorldController2{

	@RequestMapping(value = "/hello2", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}

}*/