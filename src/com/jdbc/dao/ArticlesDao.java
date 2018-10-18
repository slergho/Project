package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.Articles;

public interface ArticlesDao {
	
		//查询所有物品
    	List<Articles> selectAllUser();
		
		//添加物品信息
    	int insertUser(Articles articles);
		
		//更新物品信息
    	int updateUser(Articles articles);
		
		//删除物品信息
    	int deleteUser(int id);
}
