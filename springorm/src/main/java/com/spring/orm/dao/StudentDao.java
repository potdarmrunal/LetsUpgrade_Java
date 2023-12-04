package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
import com.spring.orm.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(Student student) {
		Integer row = (Integer) this.hibernateTemplate.save(student);
		return row;
	}
	
	public Student getSingleStudent(int id) {
		Student stud = this.hibernateTemplate.get(Student.class, id);
		return stud;
	}
	
	public List<Student> getallStudents() {
		List<Student> stud = this.hibernateTemplate.loadAll(Student.class);
		return stud;
	}
	@Transactional
	public void deleteStudent(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
