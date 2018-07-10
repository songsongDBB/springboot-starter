package com.dss.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dss.springboot.utils.JsonResultUtil;

@Controller
@RequestMapping(value = "/err")
public class ErrorController {

	/**
	 * 在这个方法里面会发生异常，然后程序会跳到 ExceptionHandler 的 errorHandler方法
	 * @return
	 */
	@RequestMapping(value = "/error")
	public String error() {
		
		int a = 1/0;
		
		return "thymeleaf/error";
		
	}
	
	@RequestMapping("/ajaxerror")
	public String ajaxerror() {
		
		return "thymeleaf/ajaxerror";
		
	}
	
	@RequestMapping(value = "/getAjaxerror")
	@ResponseBody
	public JsonResultUtil getAjaxerror() {
		
		int a = 1 / 0;
		
		return JsonResultUtil.ok();
	}
	
}
