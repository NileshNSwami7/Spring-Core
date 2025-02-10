package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext Context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");
		Person per=Context.getBean("person",Person.class);
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println("_____*********_____");

		System.out.println(per.getCourse());
		System.out.println("_____*********_____");

		System.out.println(per.getProperties());

	}

}
