package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.User;

public interface UserDao {
		//��ѯ������
    	List<User> selectAllUser();
	
    	//���������Ϣ
    	int insertUser(User user);
	
    	//����������Ϣ
    	int updateUser(User user);
	
    	//ɾ��������Ϣ
    	int deleteUserById(int id);
    	
    	//��ѯһ���˵���Ϣ
    	User findUserById(int id);
}
