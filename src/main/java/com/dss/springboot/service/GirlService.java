package com.dss.springboot.service;

import java.util.List;

import com.dss.springboot.pojo.Girl;

public interface GirlService {

	void saveGirl(Girl girl)throws Exception;
	
	void updateGirl(Girl girl);
	
	Girl selectGirlById(Girl girl);
	
	List<Girl> selectAllGilr();
	
	void deleteGirlById(Girl girl);
}
