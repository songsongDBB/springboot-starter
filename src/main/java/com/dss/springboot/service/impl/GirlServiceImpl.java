package com.dss.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dss.springboot.mapper.GirlMapper;
import com.dss.springboot.pojo.Girl;
import com.dss.springboot.service.GirlService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("girlService")
public class GirlServiceImpl implements GirlService {

	@Autowired
	private GirlMapper girlMapper;
	
	/**
	 * 保存一个girl
	 */
	@Override
	public void saveGirl(Girl girl) throws Exception {
		
		girlMapper.saveGirl(girl);
		
	}

	/**
	 * 修改一个girl
	 */
	@Override
	public void updateGirl(Girl girl) throws Exception {
		
		girlMapper.updateGirl(girl);
		
	}

	/**
	 * 通过id查询一个girl
	 */
	@Override
	public Girl selectGirlById(Girl girl) throws Exception {
		
		return girlMapper.selectGirlById(girl);
	}

	/**
	 * 查询所有的girl
	 */
	@Override
	public List<Girl> selectAllGilr() throws Exception {

		return girlMapper.selectAllGilr();
	}

	/**
	 * 通过id删除一个girl
	 */
	@Override
	public void deleteGirlById(Girl girl) throws Exception {

		girlMapper.deleteGirlById(girl);
	}

	/**
	 * 分页查询女生
	 */
	@Override
	public PageInfo<Girl> queryGirlListPaged(Girl girl, Integer page, int pageSize) throws Exception {
		
		PageHelper.startPage(page, pageSize);			//开始分页
		
		List<Girl> girlList = girlMapper.selectAllGilr();
		
		PageInfo<Girl> pageInfo = new PageInfo<>(girlList);
		
		return pageInfo;
	}

}
