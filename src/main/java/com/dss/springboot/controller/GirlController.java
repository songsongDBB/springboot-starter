package com.dss.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dss.springboot.pojo.Girl;
import com.dss.springboot.service.GirlService;
import com.dss.springboot.utils.JsonResultUtil;
import com.github.pagehelper.PageInfo;

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
	@Transactional(propagation = Propagation.REQUIRED)
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
	@Transactional(propagation = Propagation.REQUIRED)
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
	@Transactional(propagation = Propagation.REQUIRED)
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
	@Transactional(propagation = Propagation.SUPPORTS)
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
	@Transactional(propagation = Propagation.SUPPORTS)
	public JsonResultUtil selectAllGirl() throws Exception{
		
		List<Girl> list = girlService.selectAllGilr();
		
		return JsonResultUtil.ok(list);
	}
	
	/**
	 * 分页查询女生
	 * 	@PathVariable("page") 是从访问地址接收参数的方式，这样地址就可以直接写	/queryGirlListPaged/2 等等，不需要写参数名
	 * 	如果按照以前的写法，则地址写	queryGirlListPaged?page=2	这里使用 @RequestParam("page") Integer page	接收参数
	 * @return
	 */
	@RequestMapping(value = "/queryGirlListPaged")
	/**
	 * Propagation.SUPPORTS	使用与select操作
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation = Propagation.SUPPORTS)
	public JsonResultUtil queryGirlListPaged(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page) throws Exception{
		
		int pageSize = 5;
		
		Girl girl = new Girl();
		//girl.setAge(10);
		
		/**
		 * girlList	里面包含总条数total,当前页数，每页记录数，总页数，参数名list中就是此次的数据
		 */
		PageInfo<Girl> girlList = girlService.queryGirlListPaged(girl, page, pageSize);
		
		return JsonResultUtil.ok(girlList);
	}
	
	/**
	 * 整合事物
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/checkTran")
	/**
	 * propagation = Propagation.REQUIRED	使用与update,insert,delete操作
	 * @return
	 * @throws Exception
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	public JsonResultUtil checkTran() throws Exception {
		
		girlService.checkTran();
		
		return JsonResultUtil.ok();
		
	}
	
}
