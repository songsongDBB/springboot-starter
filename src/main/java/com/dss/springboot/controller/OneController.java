package com.dss.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/one")
public class OneController {

	@RequestMapping(value = "/hello")
	public String hello() {
		
		return "one say hello";
		
	}
	
}
