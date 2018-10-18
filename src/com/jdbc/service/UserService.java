package com.jdbc.service;

import java.util.List;

import com.jdbc.entity.User;

public interface UserService {
	//查询所有人
	List<User> selectAllUser();

	//添加人物信息
	boolean insertUser(User user);

	//更新人物信息
	boolean updateUser(User user);

	//删除人物信息
	boolean deleteUser(int id);
	
	//查询一个人的信息
	User findUserById(int id);
}
