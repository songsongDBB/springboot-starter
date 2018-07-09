package com.dss.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dss.springboot.pojo.Resource;
import com.dss.springboot.utils.JsonResultUtil;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

	@Autowired
	private Resource resource;
	
	@RequestMapping(value = "/getResource")
	public JsonResultUtil getResource() {
		
		Resource bean = new Resource();
		BeanUtils.copyProperties(resource, bean);			//将resource复制到bean中
		
		return JsonResultUtil.ok(bean);
	}
}
