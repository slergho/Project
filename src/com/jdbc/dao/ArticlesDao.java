package com.jdbc.dao;

import java.util.List;

import com.jdbc.entity.Articles;

public interface ArticlesDao {
	
		//��ѯ������Ʒ
    	List<Articles> selectAllUser();
		
		//�����Ʒ��Ϣ
    	int insertUser(Articles articles);
		
		//������Ʒ��Ϣ
    	int updateUser(Articles articles);
		
		//ɾ����Ʒ��Ϣ
    	int deleteUser(int id);
}
