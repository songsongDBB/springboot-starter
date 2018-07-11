package com.dss.springboot.service;

import java.util.List;

import com.dss.springboot.pojo.Girl;
import com.github.pagehelper.PageInfo;

public interface GirlService {

	void saveGirl(Girl girl)throws Exception;
	
	void updateGirl(Girl girl)throws Exception;
	
	Girl selectGirlById(Girl girl)throws Exception;
	
	List<Girl> selectAllGilr()throws Exception;
	
	void deleteGirlById(Girl girl)throws Exception;

	PageInfo<Girl> queryGirlListPaged(Girl girl, Integer page, int pageSize)throws Exception;

	void checkTran()throws Exception;
}
