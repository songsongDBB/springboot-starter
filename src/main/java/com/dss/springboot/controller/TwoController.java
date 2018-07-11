package com.dss.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/two")
public class TwoController {

	@RequestMapping(value = "/hello")
	public String hello() {
		
		return "two say hello";
		
	}
	
}
