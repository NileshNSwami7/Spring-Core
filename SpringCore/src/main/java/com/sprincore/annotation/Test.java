package com.sprincore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sprincore/annotation/config.xml");
		Employee em = context.getBean("Emp",Employee.class);
		System.out.println(em);
	}

}
