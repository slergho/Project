package com.jdbc.service;

import java.util.List;

import com.jdbc.entity.User;

public interface UserService {
	//��ѯ������
	List<User> selectAllUser();

	//���������Ϣ
	boolean insertUser(User user);

	//����������Ϣ
	boolean updateUser(User user);

	//ɾ��������Ϣ
	boolean deleteUser(int id);
	
	//��ѯһ���˵���Ϣ
	User findUserById(int id);
}
