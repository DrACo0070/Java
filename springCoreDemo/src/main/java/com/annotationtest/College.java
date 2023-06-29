package com.annotationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//(value = "clz") //allow to create bean/object of college class to spring container
public class College {
	
	@Value("NCCS")
	private String name;
	@Value("01-4853698")
	private String phone;
	
	@Autowired //bean injection/works as reference or ref (link the bean of student class in college class )
	private Student std;
	
	@Autowired
	@Qualifier(value = "mathTeacherImpl") //to select one from multiple implementation class
	private TeacherService ts;
	
	public void printCollege() {
		
		System.out.println("College Name = "+name);
		System.out.println("College Phone = "+phone);
		
		std.printStudent();
		ts.teach();
	}

}
