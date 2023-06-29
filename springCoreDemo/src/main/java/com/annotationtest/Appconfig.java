package com.annotationtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //starts spring container
@ComponentScan(basePackages = "com.annotationtest") //load bean from this package
public class Appconfig {
	
	@Bean//(name = "std") //create bean at method level
	@Scope("prototype") //by default singleton (only one bean). prototype is used to give different object to multiple bean
	public Student getStudentBean() {
		
		return new Student();
	}

}
