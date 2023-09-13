package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.StudentBean1;

public class StudMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentCourseConfig.xml");
		StudentBean1 student = (StudentBean1) context.getBean("Student1");
		System.out.println(student);
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}
}
