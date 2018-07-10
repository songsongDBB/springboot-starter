package com.dss.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dss.springboot.pojo.Girl;
import com.dss.springboot.service.GirlService;
import com.dss.springboot.utils.JsonResultUtil;

@RestController
@RequestMapping(value = "/girl")
public class GirlController {

	@Resource(name = "girlService")
	private GirlService girlService;
	
	/**
	 * 保存一个girl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/saveGirl")
	public JsonResultUtil saveGirl() throws Exception{
		
		Girl girl = new Girl();
		girl.setId(19);
		girl.setAge(12);
		girl.setAmount((float) 50);
		girl.setCupsize("F");
		
		girlService.saveGirl(girl);
		
		return JsonResultUtil.ok(girl);
	}
	
	/**
	 * 修改一个girl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateGirl")
	public JsonResultUtil updateGirl() throws Exception{
		
		Girl girl = new Girl();
		girl.setId(19);
		girl.setAge(120);
		girl.setAmount((float) 500);
		girl.setCupsize("FF");
		
		girlService.updateGirl(girl);
		
		return JsonResultUtil.ok(girl);
	}
	
	/**
	 *删除一个girl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deleteGirl")
	public JsonResultUtil deleteGirl() throws Exception{
		
		Girl girl = new Girl();
		girl.setId(19);
		
		girlService.deleteGirlById(girl);
		
		return JsonResultUtil.ok(girl);
	}
	
	/**
	 *查询一个girl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectGirlById")
	public JsonResultUtil selectGirlById() throws Exception{
		
		Girl girl = new Girl();
		girl.setId(19);
		
		girl = girlService.selectGirlById(girl);
		
		return JsonResultUtil.ok(girl);
	}
	
	/**
	 *查询所有的girl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectAllGirl")
	public JsonResultUtil selectAllGirl() throws Exception{
		
		List<Girl> list = girlService.selectAllGilr();
		
		return JsonResultUtil.ok(list);
	}
	
	
}
