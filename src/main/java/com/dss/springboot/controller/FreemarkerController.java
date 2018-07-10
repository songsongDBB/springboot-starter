package com.dss.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dss.springboot.pojo.Resource;

@Controller
@RequestMapping(value = "/ftl")
public class FreemarkerController {

	@Autowired
	private Resource resource;
	
	/**
	 * ModelMap 相当于 SpringMVC里面的ModelAndView
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String inddex(ModelMap map) {
		map.addAttribute("resource", resource);			//这里是为了在页面使用$符号进行取值
		return "freemarker/index";						//这里页面文件目录已经在配置文件里面说明都是在templates里面，所以可以不用写这个
	}
	
	@RequestMapping("center")
    public String center() {
        return "freemarker/center/center";
    }
}
