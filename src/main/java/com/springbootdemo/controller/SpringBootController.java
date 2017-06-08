package com.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.entity.Student;
import com.springbootdemo.service.SpringBootService;

@RestController
@RequestMapping("/SpringBoot")
public class SpringBootController {
	
	@Autowired
	private SpringBootService springBootService;
	
	@RequestMapping(value="/GetMsg",method=RequestMethod.GET)
	public String getSpringBootMsg(){
		
		return springBootService.getSpringBootMsg();
	}

	
	@RequestMapping(value="/HelloWorld",method=RequestMethod.GET)
	public String getHelloWorldMsg(){
		
		return springBootService.getHelloWorldMsg();
	}
	
	
	@RequestMapping(value="/addStudent",method=RequestMethod.POST)
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(springBootService.save(student),HttpStatus.CREATED);
	}

}
