package com.dss.springboot.aspect;

import org.aspectj.lang.annotation.Aspect;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//表示这是一个切面
@Aspect
//加上这个注解可以被spring扫描加载
@Component
public class HttpAspect {

	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

	/**
	 * 表示在执行 public * com.dss.springboot.controller.AspectController中的所有方法之前先执行这个方法；
	 * (..)表示传入什么参数都执行这个方法
	 */
	@Pointcut("execution(public * com.dss.springboot.controller.AspectController.*(..)))")
	public void log() {

	}

	/**
	 * 定义一个log方法，这样可以省略切入点的代码量
	 */
	@Before("log()")
	public void doBrfore(JoinPoint joinPoint) {

		logger.info("面向切面变成开始。。。");

		// 获取HttpServletRequest
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes();
		HttpServletRequest request = requestAttributes.getRequest();

		// url
		logger.info("url={}", request.getRequestURL().toString());

		// method
		logger.info("method={}", request.getMethod());

		// ip
		logger.info("ip={}", request.getRemoteAddr());

		// 类方法
		logger.info("class_method={}",
				joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());

		// 参数
		logger.info("method_agrs={}", joinPoint.getArgs());

	}

	@After("log()")
	public void doAfter() {
		logger.info("面向切面编程结束。。。");
	}
}
