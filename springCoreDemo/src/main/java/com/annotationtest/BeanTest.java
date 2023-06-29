package com.annotationtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
		
		College c = context.getBean("college",College.class); //if value is not given in @Component, use name of its respective class
		c.printCollege();
		
		Student s = context.getBean("getStudentBean",Student.class); //if name isn't given in @Bean, use name of its respective method
		//s.printStudent();
		System.out.println(s);
		
		Student s1 = context.getBean("getStudentBean",Student.class);
		//s1.printStudent();
		System.out.println(s1);
	}

}
