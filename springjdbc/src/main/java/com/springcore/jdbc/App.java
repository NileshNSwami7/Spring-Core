package com.springcore.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.entities.Student;
import com.springjdbc.dao.Studentdao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
    	ApplicationContext context = new AnnotationConfigApplicationContext(Jdbcconfig.class);

    	
    	Studentdao studentdao =  context.getBean("studentdao",Studentdao.class);
    	
    	//insert data into table
    	
//    	Student st = new Student();
//    	st.setId(105);
//    	st.setName("Sakshi");
//    	st.setCity("Pune");
//    	
//    	int result = studentdao.insert(st);
//    	System.out.println("Reacord Added Succefully");
    	
    	//update a particular row in the table
    	
//    	Student student = new Student();
//    	student.setId(103);
//    	student.setName("Shiryash");
//    	student.setCity("Kanur pathar");
//    	
//    	int result = studentdao.change(student);
//    	System.out.println(" Data upadate of " + student.getId() + " "+ result);
    	
    	//Delete record from table
    	
//    	Student student = new Student();
//    	student.setId(104);
//    	
//    	int result = studentdao.delete(student);
//    	System.out.println("Record delete Successfully");
    	
    	//Get data with the help of ID
    	
//    	Student student = studentdao.getstudentinfo(103);
//    	System.out.println("Data on Id:" + student.getId() +" " +student);
//    	
    	//Get All information
    	
    	List<Student>st = studentdao.getAllStudentinfo();
    	System.out.println("All Student details");
    	for(Student s1 : st) {
    		
    		System.out.println(s1);
    	}
    	
    }
}
