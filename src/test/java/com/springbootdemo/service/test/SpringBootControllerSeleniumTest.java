package com.springbootdemo.service.test;

import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.gargoylesoftware.htmlunit.WebClient;
import com.springbootdemo.controller.SpringBootController;
import com.springbootdemo.service.SpringBootService;

@RunWith(SpringRunner.class)
@WebMvcTest(SpringBootController.class)
public class SpringBootControllerSeleniumTest {

	@Autowired
	private WebClient webClient;

	@MockBean
	private SpringBootService springBootService;


	@Test
	public void exampleTest() throws Exception{
		given(this.springBootService.getHelloWorldMsg()).willReturn("Hello World");
		this.webClient.addRequestHeader("Authorization", "Basic "+"YWRtaW46c2VjcmV0");
		this.webClient.getPage("/SpringBoot/HelloWorld");
		assert(this.webClient.getPage("/SpringBoot/HelloWorld.html").getWebResponse().getContentAsString().contains("Hello World"));

	}

}