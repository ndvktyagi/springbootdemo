package com.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdemo.dao.SpringBootDao;
import com.springbootdemo.entity.Student;

@Service
public class SpringBootService {

	@Autowired
	private SpringBootDao springBootDao;

	public String getSpringBootMsg(){

		return springBootDao.getSprintBootMsg();
	}

	public String getHelloWorldMsg(){

		return "Hello World Testing Spring Boot Demo.....";
	}

	public Student  save(Student student){
		return springBootDao.save(student);
	}

}
