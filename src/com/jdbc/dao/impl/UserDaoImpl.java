package com.jdbc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.dao.UserDao;
import com.jdbc.entity.User;
import com.jdbc.util.DBHelper;

public class UserDaoImpl implements UserDao {

	public Connection conn = null;
	public ResultSet rs = null;
	public PreparedStatement ps = null;

	// 查询所有人
	@Override
	public List<User> selectAllUser() {
		conn = DBHelper.getConnection();
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM `user`";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			User user = null;
			while (rs.next()) {
				user = new User();
				user.setUserId(rs.getInt("id"));
				user.setUserName(rs.getString("name"));
				user.setUserPassword(rs.getString("pwd"));
				user.setBirthday(rs.getDate("birthday"));
				user.setDescription(rs.getString("decription"));
				user.setEmail(rs.getString("email"));
				user.setPhone(rs.getString(rs.getString("phone")));
				user.setSex(rs.getString("sex"));
				user.setUserIdentity("identity");
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(rs, ps, conn);
		}
		return list;
	}

	// 新增
	@Override
	public int insertUser(User user) {
		conn = DBHelper.getConnection();
		int i = 0;
		String sql = "INSERT INTO `user`(user_name,user_password,birthday,user_identity,sex,phone,email,description)";
		try {
			ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ps.setDate(3, new java.sql.Date(user.getBirthday().getTime()));
			ps.setString(4, user.getUserIdentity());
			ps.setString(5, user.getSex());
			ps.setString(6, user.getPhone());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getDescription());
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs.next()) {
				i = rs.getInt(1);// 是否存在
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	// 更新人物信息
	@Override
	public int updateUser(User user) {
		conn = DBHelper.getConnection();
		int i = 0;
		String sql = "UPDATE `user` SET user_name=?, user_password=?, birthday=?, sex=?, user_identity=?,phone=?, email=?,\r\n"
				+ "description=? WHERE user_id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ps.setDate(3, new java.sql.Date(user.getBirthday().getTime()));
			ps.setString(4, user.getSex());
			ps.setString(5, user.getUserIdentity());
			ps.setString(6, user.getPhone());
			ps.setString(7, user.getEmail());
			ps.setString(8, user.getDescription());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(rs, ps, conn);
		}

		return i;
	}

	@Override
	public int deleteUserById(int id) {
		conn = DBHelper.getConnection();
		int i = 0;
		String sql = "DELETE FROM 'user' WHERE user_id=?";
		try {
			ps = conn.prepareStatement(sql);
			i = ps.executeUpdate();
			if (i == 1) {
				return i;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(rs, ps, conn);
		}

		return i;
	}

	@Override
	public User findUserById(int id) {
		conn = DBHelper.getConnection();
		User user = null;
		String sql = "select * from user WHERE user_id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				user.setUserId(rs.getInt("userId"));
				user.setUserName(rs.getString("userName"));
				user.setPhone(rs.getString("userPhone"));
				user.setEmail(rs.getString("email"));
				user.setSex(rs.getString("sex"));
				user.setUserIdentity(rs.getString("identity"));
				user.setUserPassword(rs.getString("password"));
				user.setDescription(rs.getString("description"));
				user.setBirthday(rs.getDate("birthday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.closeConn(rs, ps, conn);
		}

		return user;
	}

}
