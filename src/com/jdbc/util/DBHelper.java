package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   *        链接数据库
 * @author Administrator
 *
 */
public class DBHelper {
	 private static final String DRIVENAME = "com.mysql.jdbc.Driver";//数据库驱动
	    private static final String URL = "jdbc:mysql://localhost:3306/vipshop";//数据库路径
	    private static final String USERNAME = "root";//数据库用户名
	    private static final String PASSWORD = "root";//数据库密码
	    
	    
	   public static Connection getConnection() {
		   
		   try {
			   //加载驱动
			   Class.forName(DRIVENAME);
			   //返回数据库登录信息
			return  DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	   /*
	    * 
	    *      释放数据库资源
	    */
	   public static void closeConn(ResultSet rs, PreparedStatement ps, Connection conn) {
		   if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (ps !=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
