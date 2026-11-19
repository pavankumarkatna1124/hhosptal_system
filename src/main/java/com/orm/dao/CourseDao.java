package com.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.entity.Course;

public class CourseDao {
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void insertCourse(Course course) {
		hibernateTemplate.save(course);
		System.out.println("INSERTED SUCCESSFULLY..");
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}