package com.dss.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描mybatis mapper 的包路径
@MapperScan(basePackages = "com.dss.springboot.mapper")
//使用注解开启定时任务
@EnableScheduling
//@使用注解开启异步任务（异步任务即类似于多线程操作）
@EnableAsync
public class SpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStarterApplication.class, args);
	}
}
