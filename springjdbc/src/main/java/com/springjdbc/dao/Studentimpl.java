package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springcore.entities.Rowmapperimpl;
import com.springcore.entities.Student;

@Component("studentdao")
public class Studentimpl implements Studentdao{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		
		String query = "insert into Student (id,name,city) values(?,?,?)";
		
		int result = this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return result;
	}
	
	public int change(Student student) {
		
		String query =  "Update Student set name=? , city=? where id=?";
		int result =this.jdbctemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}
	
	public int delete(Student student) {
		String query = "Delete from Student where id=?";
		int result = this.jdbctemplate.update(query,student.getId());
		return result;
	}

	public Student getstudentinfo(int studentid) {
		String query = "select * from Student where id=?";
		RowMapper<Student>rowmapper = new Rowmapperimpl();
		Student result = this.jdbctemplate.queryForObject(query,rowmapper,studentid);
		return result;
	}
	
	public List<Student> getAllStudentinfo() {
		String query ="select * from Student";
		List<Student> student = this.jdbctemplate.query(query,new Rowmapperimpl());
		return student;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	
	
}
