package com.dss.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/aspect")
public class AspectController {

	@RequestMapping(value = "/hello")
	public String hello() {
		
		System.out.println("执行了hello方法");
		
		return "aspect hello";
		
	}
	
	@RequestMapping(value = "/hello1")
	public String hello1() {
		
		System.out.println("执行了hello1方法");
		
		return "aspect hello1";
		
	}
	
}
