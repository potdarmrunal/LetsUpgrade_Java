package com.spring.jdbc.springjdbc.jdbcdao;

import com.spring.jdbc.springjdbc.entity.Student;
import java.util.List;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(int studId);
	
	public List<Student> getallStudents();

}
