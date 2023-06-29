package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer c = (Customer) context.getBean("cuts");
		System.out.println(c);
		
		Teacher t = context.getBean("tech", Teacher.class);
		System.out.println(t);
		
	}

}
