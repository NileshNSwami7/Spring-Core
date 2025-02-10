package com.springcore.RemovalXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RemoveXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student std = context.getBean("Naukri",Student.class);
		System.out.println(std);
		std.getstudy();
	}

}
