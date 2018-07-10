package com.dss.springboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dss.springboot.pojo.User;

@Controller
@RequestMapping(value = "/th")
public class ThymeleafController {

	@RequestMapping(value = "/index")
	public String index(ModelMap map) {
		
		map.addAttribute("name", "thymeleaf~~duansongsong");
		return "thymeleaf/index";
		
	}
	
	@RequestMapping(value = "/center")
	public String center() {
		return "thymeleaf/center/center";
	}
	
	@RequestMapping(value = "/test")
	public String test(ModelMap map) {
		
		User user = new User();
		user.setName("superadmin");
		user.setAge(24);
		user.setBirthday(new Date());
		user.setPassword("123456");
		user.setDesc("<font color='green'><b>hello world</b></font>");
		map.addAttribute("user", user);
		
		User user1 = new User();
		user1.setName("zcx");
		user1.setAge(17);
		user1.setBirthday(new Date());
		
		User user2 = new User();
		user2.setName("dss-zcx");
		user2.setAge(30);
		user2.setBirthday(new Date());
		
		List<User> userList = new ArrayList<User>();
		userList.add(user);
		userList.add(user1);
		userList.add(user2);
		
		map.addAttribute("userList", userList);
		
		return "thymeleaf/test";
		
	}
	
	@RequestMapping(value = "/postForm")
	public String postForm(User user) {
		
		System.out.println("前台传来的用户名是:       " + user.getName());
		System.out.println("前台传来的年龄是:       " + user.getAge());
		
		return "redirect:/th/test";				//将程序重定向到路径为th/test的方法
	}
}
