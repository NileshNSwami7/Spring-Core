package com.springjdbc.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.springcore.entities.Student;

@Component
public interface Studentdao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int delete(Student student);
	
	public Student getstudentinfo(int studentid);
	
	public List<Student> getAllStudentinfo();
}
