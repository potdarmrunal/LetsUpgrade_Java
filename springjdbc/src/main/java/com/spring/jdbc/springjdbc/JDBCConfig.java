package com.spring.jdbc.springjdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.springjdbc.jdbcdao.StudentDao;
import com.spring.jdbc.springjdbc.jdbcdao.studentDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.spring.jdbc.springjdbc.jdbcdao"})
public class JDBCConfig {
	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		studentDaoImpl impl = new studentDaoImpl();
		impl.setJdbcTemplate(getTemplate());
		return impl;
	}
}
