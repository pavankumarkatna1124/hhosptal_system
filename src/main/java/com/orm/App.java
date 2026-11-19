package com.orm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.CourseDao;
import com.orm.entity.Course;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("config.xml");
		
		Course course = new Course();
		course.setId(101);
		course.setName("mahi");
		course.setFees(23242.324);
		
		CourseDao coursedao = context.getBean("courseDao",CourseDao.class);
		coursedao.insertCourse(course);
	}
}