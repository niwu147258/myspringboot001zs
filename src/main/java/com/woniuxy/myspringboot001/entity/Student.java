package com.woniuxy.myspringboot001.entity;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
//这个注解告诉系统创建student的时候, 属性值到默认的配置文件中获取前缀为student的属性
@ConfigurationProperties(prefix="student")
//读取自定义的配置文件
//@PropertySource("classpath:student.properties")
public class Student {

	//@Value("wwww")
	private String sname;
	//@Value("1111")
	private Integer age;
	private List<String> list;
	private Map<String,String> map;
	private School school;
}
