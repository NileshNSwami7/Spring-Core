package com.springcore.RemovalXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basepackage="com.springcore.RemovalXML")
public class JavaConfig {
	
	@Bean
	public Job getJobs() {
		return new Job();
	}
	@Bean(name= {"college","Naukri","life"})
	public Student getStudent() {
		Student stud = new Student(getJobs());
		return stud;
	}
}
