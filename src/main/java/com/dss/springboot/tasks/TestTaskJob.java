package com.dss.springboot.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//使用	@Component	注解，让spring容器可以扫描，加载这个类
@Component
public class TestTaskJob {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 测试的定时任务
	 */
	//@Scheduled(fixedRate = 3000)			//表示每个3秒执行一次
	//@Scheduled(cron = "*/3 * * * * ?")
	public void testJob() {
		
		System.out.println( "testJob ==== 当前时间是：   " + sdf.format(new Date()) );
		
	}
	
	/**
	 * 测试的定时任务
	 */
	//@Scheduled(fixedRate = 3000)			//表示每个3秒执行一次
	public void testJob1() {
		
		System.out.println( "testJob1 === 当前时间是：   " + sdf.format(new Date()) );
		
	}
	
}
