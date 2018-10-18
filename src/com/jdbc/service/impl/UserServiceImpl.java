package com.jdbc.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.jdbc.dao.impl.UserDaoImpl;
import com.jdbc.entity.User;
import com.jdbc.service.UserService;

public class UserServiceImpl implements UserService {

	public Connection conn = null;
	public ResultSet rs = null;
	public PreparedStatement ps = null;
	boolean a = false;

	private UserDaoImpl userDaoImpl;

	@Override
	public List<User> selectAllUser() {
		return userDaoImpl.selectAllUser();
	}

	@Override
	public boolean insertUser(User user) {
		if (user != null) {
			userDaoImpl.insertUser(user);
			a = true;
		}
		return a;
	}

	@Override
	public boolean updateUser(User user) {
		if (user != null) {
			userDaoImpl.updateUser(user);
			a = true;
		}
		return a;
	}

	@Override
	public boolean deleteUser(int id) {
		if (id != 0) {
			userDaoImpl.deleteUserById(id);
			a = true;
		}
		return a;
	}

	@Override
	public User findUserById(int id) {
		if (id != 0) {
			return userDaoImpl.findUserById(id);
		} else {
			return null;
		}

	}

}
