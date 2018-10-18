package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
   *        �������ݿ�
 * @author Administrator
 *
 */
public class DBHelper {
	 private static final String DRIVENAME = "com.mysql.jdbc.Driver";//���ݿ�����
	    private static final String URL = "jdbc:mysql://localhost:3306/vipshop";//���ݿ�·��
	    private static final String USERNAME = "root";//���ݿ��û���
	    private static final String PASSWORD = "root";//���ݿ�����
	    
	    
	   public static Connection getConnection() {
		   
		   try {
			   //��������
			   Class.forName(DRIVENAME);
			   //�������ݿ��¼��Ϣ
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
	    *      �ͷ����ݿ���Դ
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
