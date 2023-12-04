package com.spring.jdbc.springjdbc.jdbcdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springjdbc.entity.Student;

public class studentDaoImpl implements StudentDao{
	
	public JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student (id,name,city) values(?,?,?)";
		int row = this.jdbcTemplate.update(query,student.getId(), student.getName(), student.getCity());
		return row;
	}

	public studentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public studentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int change(Student student) {
		String query = "update student set name=? , city=? where id=?";
		int row = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return row;
	}

	@Override
	public int delete(Student student) {
		String query = "delete from student where id=?";
		int row = this.jdbcTemplate.update(query,student.getId());
		return row;
	}

	@Override
	public Student getStudent(int studId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studId);
		return student;
	}

	@Override
	public List<Student> getallStudents() {
		String query = "select * from student";
		
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
	
	

}
