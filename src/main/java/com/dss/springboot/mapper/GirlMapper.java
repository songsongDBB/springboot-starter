package com.dss.springboot.mapper;

import java.util.List;

import com.dss.springboot.pojo.Girl;

public interface GirlMapper{
	
	void saveGirl(Girl girl);
	
	void updateGirl(Girl girl);
	
	Girl selectGirlById(Girl girl);
	
	List<Girl> selectAllGilr();
	
	void deleteGirlById(Girl girl);
	
}