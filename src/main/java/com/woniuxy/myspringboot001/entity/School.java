package com.woniuxy.myspringboot001.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class School {
	private Integer schid;
	private String schname;
}
