package com.spring.jdbc.springjdbc.jdbcdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.entity.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setCity(rs.getString(3));
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		
		return student;
	}

}
