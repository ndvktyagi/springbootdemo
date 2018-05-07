package com.springbootdemo.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.springbootdemo.controller.SpringBootController;
import com.springbootdemo.entity.Student;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class SpringBootServiceTest {

   @Autowired
    private SpringBootController controller;


  
    @Test
    public void getControllerCoverage()
            throws Exception {
        String greeting = this.controller.getHelloWorldMsg();
        System.out.println(greeting);
        assert(greeting).equals("Hello World");
        greeting = this.controller.getSpringBootMsg();
        System.out.println(greeting);
        assert(greeting).equals("Hello Spring Boot Demo 1");

    }
    
   
    @Autowired
	private TestRestTemplate restTemplate;
    
  
	@Test
	public void exampleTest() {
		restTemplate = restTemplate.withBasicAuth("admin", "secret");
		String body = this.restTemplate.getForObject("/SpringBoot/HelloWorld", String.class);
		Student student = new Student();
		student.setName("Amit Kumar");
		student.setClassname("HCL Technologies Ltd.");
		ResponseEntity<Student> responseEntity = this.restTemplate.postForEntity("/SpringBoot/addStudent",student, Student.class);
		System.out.println(responseEntity.getBody().getName());
		assert(body).contains("Hello World");

	}
	
}
