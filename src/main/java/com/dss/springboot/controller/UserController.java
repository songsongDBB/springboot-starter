package com.dss.springboot.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dss.springboot.pojo.User;
import com.dss.springboot.utils.JsonResultUtil;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@RequestMapping(value = "/getUserInfo")
	public JsonResultUtil getUserInfo() {
		
		User user = new User();
		user.setName("duanss");
		user.setBirthday(new Date());
		user.setPassword("123");
		user.setAge(24);
		user.setDesc("hello springboot");
		
		return JsonResultUtil.ok(user);
	}
}
