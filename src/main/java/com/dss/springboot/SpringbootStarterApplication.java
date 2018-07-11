package com.dss.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//扫描mybatis mapper 的包路径
@MapperScan(basePackages = "com.dss.springboot.mapper")
//使用注解开启定时任务
@EnableScheduling
public class SpringbootStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStarterApplication.class, args);
	}
}
