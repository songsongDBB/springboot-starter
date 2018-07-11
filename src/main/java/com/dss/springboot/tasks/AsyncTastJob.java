package com.dss.springboot.tasks;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

//使用	@Component	注解，让spring容器可以扫描，加载这个类
@Component
public class AsyncTastJob {

	//加上这个注解，表示这个方法是要异步执行
	@Async
	public Future<Boolean> doAsyncTask11() throws Exception {

		long start = System.currentTimeMillis();

		Thread.sleep(1000);

		long end = System.currentTimeMillis();

		System.out.println("任务1耗时： " + (end - start) + "毫秒");
		
		return new AsyncResult<>(true);
	}

	@Async
	public Future<Boolean> doAsyncTask22() throws Exception {

		long start = System.currentTimeMillis();

		Thread.sleep(700);

		long end = System.currentTimeMillis();

		System.out.println("任务2耗时： " + (end - start) + "毫秒");
		
		return new AsyncResult<>(true);
	}

	@Async
	public Future<Boolean> doAsyncTask33() throws Exception {

		long start = System.currentTimeMillis();

		Thread.sleep(600);

		long end = System.currentTimeMillis();

		System.out.println("任务3耗时： " + (end - start) + "毫秒");
		
		return new AsyncResult<>(true);
	}

}
