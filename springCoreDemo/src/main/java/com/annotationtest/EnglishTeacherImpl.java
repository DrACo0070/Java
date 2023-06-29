package com.annotationtest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //by default load in Teacher Service
public class EnglishTeacherImpl implements TeacherService {

	@Override
	public void teach() {
		System.out.println("Teaching English.......");
		
	}

}
