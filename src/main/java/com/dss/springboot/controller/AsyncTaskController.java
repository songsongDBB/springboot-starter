package com.dss.springboot.controller;

import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dss.springboot.tasks.AsyncTastJob;

@RestController
@RequestMapping(value = "/async")
public class AsyncTaskController {

	@Autowired
	private AsyncTastJob asyncTastJob;
	
	@RequestMapping(value = "/test")
	public String test() throws Exception{
		
		long start = System.currentTimeMillis();
		
		Future<Boolean> a = asyncTastJob.doAsyncTask11();
    	Future<Boolean> b = asyncTastJob.doAsyncTask22();
    	Future<Boolean> c = asyncTastJob.doAsyncTask33();
    	
    	/**
    	 * 这个循环确保三个方法要都执行完了才能往下运行
    	 */
    	while(!a.isDone() || !b.isDone() || !c.isDone()) {
    		if(a.isDone() && b.isDone() && c.isDone()) {
    			break;
    		}
    	}
    	
    	long end = System.currentTimeMillis();
    	
    	/**
    	 * 如果不使用异步任务，则调用三个方法的时候回顺序执行，则总耗时是三个方法的运行时间的累加
    	 * 如果使用异步任务，则总耗时是三个方法中耗时最长的那个方法的运行时间
    	 */
    	String times = "三个任务全部完成，总耗时： " + (end - start) + "毫秒";
    	System.err.println(times);
    	
    	return times;
	}
}
