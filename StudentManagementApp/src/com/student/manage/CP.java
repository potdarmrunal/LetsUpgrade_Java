package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {

	static Connection con;
	
	public static Connection create() throws SQLException {
		
		try {
			//1.load drivers
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.Create Connection
			String user = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			
			con = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
