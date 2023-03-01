package com.springObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		student.assignedUni();
		context.registerShutdownHook();
	}
}
