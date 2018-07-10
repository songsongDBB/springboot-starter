package com.dss.springboot.exceprion;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.dss.springboot.utils.JsonResultUtil;

@RestControllerAdvice		//ExceptionHandler专用
public class ExceptionHandler {

	public static final String ERROR_VIEW = "error";			//表示出现异常时，跳转的页面的路径，这里是表示页面直接在templates下面
	
	
	/**
	 * 这个表示当出现Exception后，会进入这个方法里面（这个方法用来处理非ajax请求的异常）
	 * @param reqest
	 * @param response
	 * @param e
	 * @return
	 */
	//@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)		//注释掉这个注解之后，再出现异常，也不会进入这个方法
	public Object errorHandler(HttpServletRequest reqest, HttpServletResponse response, Exception e) throws Exception{
		
		//在控制台打印异常
		e.printStackTrace();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("exception", e);
		mv.addObject("url", reqest.getRequestURL());
		mv.setViewName(ERROR_VIEW);
		
		return mv;
		
	}
	
	/**
	 * 这个方法用来处理ajax请求发生的异常
	 * @param reqest
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	public JsonResultUtil ajaxErrorHandler(HttpServletRequest reqest, Exception e) throws Exception{
		
		//在控制台打印异常
		e.printStackTrace();
		
		return JsonResultUtil.errorException(e.getMessage());
		
	}
	
}
