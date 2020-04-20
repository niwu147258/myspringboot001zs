package com.woniuxy.myspringboot001;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniuxy.myspringboot001.entity.Student;
import com.woniuxy.myspringboot001.service.SomeService;

import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j//加了这个日志注解,不用创建对象,直接调用API
class Myspringboot001ApplicationTests {

	@Autowired
	Student student;
	
	@Autowired
	ApplicationContext ac;
	
	@Autowired
	SomeService someService;
	
	@Test
	public void contextLoads06() {
		
		log.trace("mytrace");
		log.debug("mytrace");
		log.info("myinfo");
		log.warn("mywarn");
	}
	
	@Test
	public void contextLoads05() {
		
		Logger logger = LoggerFactory.getLogger(this.getClass());
		logger.trace("mytrace");
		logger.debug("mytrace");
		logger.info("myinfo");
		logger.warn("mywarn");
	}
	
	@Test
	public void contextLoads04() {
		System.out.println(someService);
		someService.doSome();
	}
	
	@Test
	public void contextLoads03() {
		
		someService.doSome();
	}
	
	@Test
	public void contextLoads02() {
		ApplicationContext myac=
				new ClassPathXmlApplicationContext("classpath:spring.xml");
		someService = 
				(SomeService) myac.getBean("someService");
		someService.doSome();
	}
	
	@Test
	public void contextLoads01() {
		someService.doSome();
	}
	
	@Test
	public void contextLoads() {
		System.out.println(ac);
		System.out.println(student);
	}
}
