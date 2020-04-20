package com.woniuxy.myspringboot001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource("classpath:spring.xml")
@SpringBootApplication
public class Myspringboot001Application {

	public static void main(String[] args) {
		System.out.println("ls---bbb");
		SpringApplication.run(Myspringboot001Application.class, args);
	}

}
