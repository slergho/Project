package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.User;

public interface UserDao {
		//查询所有人
    	List<User> selectAllUser();
	
    	//添加人物信息
    	int insertUser(User user);
	
    	//更新人物信息
    	int updateUser(User user);
	
    	//删除人物信息
    	int deleteUserById(int id);
    	
    	//查询一个人的信息
    	User findUserById(int id);
}
