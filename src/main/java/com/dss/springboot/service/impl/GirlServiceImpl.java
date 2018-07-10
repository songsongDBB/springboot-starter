package com.dss.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dss.springboot.mapper.GirlMapper;
import com.dss.springboot.pojo.Girl;
import com.dss.springboot.service.GirlService;

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
	public void updateGirl(Girl girl) {
		
		girlMapper.updateGirl(girl);
		
	}

	/**
	 * 通过id查询一个girl
	 */
	@Override
	public Girl selectGirlById(Girl girl) {
		
		return girlMapper.selectGirlById(girl);
	}

	/**
	 * 查询所有的girl
	 */
	@Override
	public List<Girl> selectAllGilr() {

		return girlMapper.selectAllGilr();
	}

	/**
	 * 通过id删除一个girl
	 */
	@Override
	public void deleteGirlById(Girl girl) {

		girlMapper.deleteGirlById(girl);
	}

}
