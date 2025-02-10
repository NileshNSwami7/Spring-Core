package com.springcore.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/scope/config.xml");
		Demo d1=context.getBean("demo",Demo.class);
		Demo d2=context.getBean("demo",Demo.class);
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d1);
	}

}
