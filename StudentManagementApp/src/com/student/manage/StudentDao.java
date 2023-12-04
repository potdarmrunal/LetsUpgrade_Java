package com.student.manage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) {
		boolean f = false;
		try {
			Connection con = CP.create();
			String q = "insert into students(sname,sphone,scity) values(?,?,?)";

			// PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			// execute
			pstmt.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean deleteStudent(int userId) {
		boolean f = false;
		try {
			Connection con = CP.create();
			String q = "delete from students where sid=?";

			// PreparedStatement
			// PreparedStatement
			PreparedStatement st = con.prepareStatement(q);
			st.setInt(1, userId);
			// execute
			st.executeUpdate();
			f = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static void displayStudent() {

		try {
			Connection con = CP.create();
			String q = "select * from students";

			// PreparedStatement
			Statement st = con.createStatement();
			st.executeQuery(q);
			// execute
			ResultSet set = st.executeQuery(q);
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);

				System.out.println("Id" + id + " Name" + name + " Phone" + phone + " City" + city);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void addImages() {
		try {
			Connection con = CP.create();
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			String path = "G:\\\\amit\\\\7pro\\IMG_20221011_082229.jpg";
//			FileInputStream fis = new FileInputStream(path);
//			pstmt.setBinaryStream(1, fis,fis.available());
//			
//			pstmt.executeUpdate();
			
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File file = jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			
			
			
		} catch(Exception e) {
			System.out.print(e);
		}
	}
	
	public static boolean updateStudent(int id,String name) {
		boolean f = false;
		try {
			Connection con = CP.create();
			String q = "update students set sname=? where sid=?";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			
			
			pstmt.executeUpdate();
			f =true;
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

}
