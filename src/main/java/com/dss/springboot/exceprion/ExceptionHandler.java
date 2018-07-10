package com.dss.springboot.exceprion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice		//ExceptionHandler专用
public class ExceptionHandler {

	public static final String ERROR_VIEW = "error";			//表示出现异常时，跳转的页面的路径，这里是表示页面直接在templates下面
	
	/**
	 * 这个表示当出现Exception后，会进入这个方法里面
	 * @param reqest
	 * @param response
	 * @param e
	 * @return
	 */
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public Object errorHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e){
		
		//在控制台打印异常
		e.printStackTrace();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url", reqest.getRequestURL());
		mv.setViewName(ERROR_VIEW);
		
		return mv;
		
	}
	
}
