package com.annotationtest;

import org.springframework.stereotype.Component;

@Component
public class MathTeacherImpl implements TeacherService {

	@Override
	public void teach() {
		System.out.println("Teaching Math......");
		
	}

}
