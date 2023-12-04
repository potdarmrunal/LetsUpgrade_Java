package com.defaultPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 To Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Add image");
			System.out.println("Press 5 to Update student");
			System.out.println("Press 6 To Exit student");
			int c = Integer.parseInt(br.readLine());
			if(c ==1) {
				System.out.println("Enter user name: ");
				String name = br.readLine();
				
				System.out.println("Enter phone number: ");
				String phone = br.readLine();
				
				System.out.println("Enter city name: ");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);
				System.out.println(st);
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Added successfully");
				} else {
					System.out.println("Something went wrong");
				}
				
			} else if(c==2) {
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
			boolean f = StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("deleted....");
				} else {
					System.out.println("Somthing went wrong");
				}
				
			} else if(c==3) {
				StudentDao.displayStudent();
				
			} 
			else if(c==4) {
				StudentDao.addImages();
				
			} else if(c==5) {
				System.out.println("Updated name of student");
				String updateName = br.readLine();
				System.out.println("Id of student");
				int id = br.read();
				
				
				boolean f = StudentDao.updateStudent(id,updateName);
				if(f) {
					System.out.println("Updated...");
				} else {
					System.out.println("Some error");
				}
				
			}
			else if(c==6) {
				break;
			} else {
				
			}
			
		}
	}

}
